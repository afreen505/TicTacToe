package com.TicTacToeGame;

public class UC1_Tictactoe {
    private static char[] boardArray;

    private static char[] Board() {
        char[] boardArray = new char[10];
        for (char c : boardArray) {
            c = ' ';
        }
        return boardArray;
    }

    public static void main(String[] args) {
        boardArray = Board();
    }
}
