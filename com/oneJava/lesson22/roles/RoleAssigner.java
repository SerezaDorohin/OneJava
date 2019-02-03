package com.oneJava.lesson22.roles;

public class RoleAssigner {
    String printTextPerRole(String[] roles, String[] textLines) {
        String[] authors = new String[textLines.length];
        StringBuilder end = new StringBuilder();
        int[] pos = new int[textLines.length];
        for(int i = 0; i < textLines.length; i++) {
            authors[i] = textLines[i].split(":")[0];
            pos[i] = i + 1;
        }
        for(int i = 0; i < roles.length; i++) {
            for (int n = 0; n < authors.length; n++) {
                if (roles[i].equals(authors[n])) {
                    end.append(roles[i] + ":\n");
                    for (int l = 0; l < textLines.length; l++) {
                        if (textLines[l].startsWith(authors[n] + ":")) {
                            end.append(pos[l] + ")" + textLines[l].substring(roles[i].length() + 1) + "\n");
                        }
                    }
                    if(!((i + 1) == roles.length)) {
                        end.append("\n");
                    }
                    break;
                }
            }
        }
        return end.toString();
    }
}