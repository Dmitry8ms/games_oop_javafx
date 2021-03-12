package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1) {
                if (checkVer(board, i) || checkHor(board, i)) {
                    return rsl = true;
                }
            }
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
        for (int j = 0; j < array.length; j++) {
            if (array[i][j] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
