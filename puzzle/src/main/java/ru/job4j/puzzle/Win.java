package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        int i = 0;
        for (int j = 0; j < board[0].length; j++) {
            if (board[i][j] == 1) {
                if (checkVer(board, j)) {
                    return rsl = true;
                }
                if (checkHor(board, i)) {
                    return rsl = true;
                }
            }
            i++;
        }
        return rsl;
    }

    public static boolean checkVer(int[][] array, int j) {
        boolean rsl = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i][j] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkHor(int[][] array, int i) {
        boolean rsl = true;
        for (int j = 0; j < array[0].length; j++) {
            if (array[i][j] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
