package com.oneJava.lesson21.OOP.homework.snake;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;

public class SnakeGame {

    /* INI */
    private final String TITLE_OF_PROGRAM = "Счёт"; // завголовок
    private final String GAME_OVER_MSG = "Вы врезались!"; // текст в случае проигрыша
    private final int POINT_RADIUS = 30; // радиус точек
    private final int FIELD_WIDTH = 30; // ширина (в точках)
    private final int FIELD_HEIGHT = 30; // высота (в точках)
    private final int FIELD_DX = 6;
    private final int FIELD_DY = 28;
    private final int START_LOCATION = 200; // стартовая позиция
    private final int START_SNAKE_Y = 10; // стартовые точки (Y)
    private final int SHOW_DELAY = 100;
    private final int LEFT = 37;
    private final int UP = 38;
    private final int RIGHT = 39;
    private final int DOWN = 40;
    private final int START_DIRECTION = RIGHT;
    private final Color DEFAULT_COLOR = Color.gray;
    private final Color FOOD_COLOR = Color.red;
    private final int START_SNAKE_SIZE = 6; // первоначальный размер змейки
    private Snake snake;
    private Food food;
    private JFrame game;
    private JFrame start;
    private Canvas canvasPanel;
    private Random random = new Random();
    private boolean gameOver = false;
    /* INI */

    public static void main(String[] args) {
        new SnakeGame().go();
    }

    void startGame() {
        start = new JFrame("menu");
        start.setSize(400, 400);
        start.setResizable(false);
        start.setBackground(Color.white);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        JButton buttonStart = new JButton();
        JButton buttonExit = new JButton();
        JLabel label = new JLabel("SnakeGame");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        buttonStart.setPreferredSize(new Dimension(100,100));
        buttonStart.addActionListener(new ListenerAction());
        buttonExit.setPreferredSize(new Dimension(100,100));
        buttonExit.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonExit.setText("выйти из игры");
        buttonStart.setText("начать");
        panel.add(label);
        panel.add(buttonStart);
        panel.add(buttonExit);
        start.add(panel);
        start.setVisible(true);
    }

    class ListenerAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            start.setVisible(false);
            start.dispose();
            new SnakeGame().go();
        }
    }

    void go() {
        game = new JFrame(TITLE_OF_PROGRAM + " : " + START_SNAKE_SIZE);
        game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game.setSize(FIELD_WIDTH * POINT_RADIUS + FIELD_DX, FIELD_HEIGHT * POINT_RADIUS + FIELD_DY);
        game.setLocation(START_LOCATION, START_LOCATION);
        game.setResizable(false);

        canvasPanel = new Canvas();
        canvasPanel.setBackground(Color.white);

        game.getContentPane().add(BorderLayout.CENTER, canvasPanel);
        game.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });

        game.setVisible(true);

        // стартовые точки (X)
        int START_SNAKE_X = 10;
        snake = new Snake(START_SNAKE_X, START_SNAKE_Y, START_SNAKE_SIZE, START_DIRECTION);
        food = new Food();

        while (!gameOver) {
            snake.move();
            if (food.isEaten()) {
                food.next();
            }
            canvasPanel.repaint();
            try {
                Thread.sleep(SHOW_DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Snake {
        ArrayList<Point> snake = new ArrayList<Point>();
        int direction;

        public Snake(int x, int y, int length, int direction) {
            for (int i = 0; i < length; i++) {
                Point point = new Point(x - i, y);
                snake.add(point);
            }
            this.direction = direction;
        }

        boolean isInsideSnake(int x, int y) {
            for (Point point : snake) {
                if ((point.getX() == x) && (point.getY() == y)) {
                    return true;
                }
            }
            return false;
        }

        boolean isFood(Point food) {
            return ((snake.get(0).getX() == food.getX()) && (snake.get(0).getY() == food.getY()));
        }

        void move() {
            int x = snake.get(0).getX();
            int y = snake.get(0).getY();
            if (direction == LEFT) {
                x--;
            }
            if (direction == RIGHT) {
                x++;
            }
            if (direction == UP) {
                y--;
            }
            if (direction == DOWN) {
                y++;
            }
            if (x > FIELD_WIDTH - 1) {
                x = 0;
            }
            if (x < 0) {
                x = FIELD_WIDTH - 1;
            }
            if (y > FIELD_HEIGHT - 1) {
                y = 0;
            }
            if (y < 0) {
                y = FIELD_HEIGHT - 1;
            }
            gameOver = isInsideSnake(x, y);
            snake.add(0, new Point(x, y));
            if (isFood(food)) {
                food.eat();
                game.setTitle(TITLE_OF_PROGRAM + " : " + snake.size());
            } else {
                snake.remove(snake.size() - 1);
            }
        }

        void setDirection(int direction) {
            if ((direction >= LEFT) && (direction <= DOWN)) {
                if (Math.abs(this.direction - direction) != 2) {
                    this.direction = direction;
                }
            }
        }

        void paint(Graphics g) {
            for (Point point : snake) {
                point.paint(g);
            }
        }
    }

    class Food extends Point {

        public Food() {
            super(-1, -1);
            this.color = FOOD_COLOR;
        }

        void eat() {
            this.setXY(-1, -1);
        }

        boolean isEaten() {
            return this.getX() == -1;
        }

        void next() {
            int x, y;
            do {
                x = random.nextInt(FIELD_WIDTH);
                y = random.nextInt(FIELD_HEIGHT);
            } while (snake.isInsideSnake(x, y));
            this.setXY(x, y);
        }
    }

    class Point {
        int x, y;
        Color color = DEFAULT_COLOR;

        public Point(int x, int y) {
            this.setXY(x, y);
        }

        void paint(Graphics g) {
            g.setColor(color);
            g.fillRect(x * POINT_RADIUS, y * POINT_RADIUS, POINT_RADIUS - 3, POINT_RADIUS - 3);
        }

        int getX() {
            return x;
        }

        int getY() {
            return y;
        }

        void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            try {
                super.paint(g);
                snake.paint(g);
                food.paint(g);
                if (gameOver) {
                    g.setColor(Color.red);
                    g.setFont(new Font("Italian", Font.BOLD, 40));
                    FontMetrics fm = g.getFontMetrics();
                    g.drawString(GAME_OVER_MSG, (FIELD_WIDTH * POINT_RADIUS + FIELD_DX - fm.stringWidth(GAME_OVER_MSG)) / 2, (FIELD_HEIGHT * POINT_RADIUS + FIELD_DY) / 2);
                }
            } catch (java.lang.NullPointerException e) { /* ¯\_(ツ)_/¯ */ }
        }
    }
}