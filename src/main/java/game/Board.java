package game;

public class Board {
    private int[][] board;

    public Board() {
        board = new int[8][8];
    }

    public void printBoard(){
        int boardWidth = board.length;
        int boardHeight = board[0].length;
        System.out.println(boardWidth);
        printBoardHorizontalHeader(boardWidth);
        for(int i = 0; i < boardHeight; i++){
            printBoardRow(board[i]);
        }
        printBoardHorizontalHeader(boardWidth);
    }

    private void printBoardHorizontalHeader(int width){
        int headerSize = (width * 2) + 1;
        for(int i = 0; i < headerSize; i++){
            System.out.print('=');
        }
        System.out.println();
    }

    private void printBoardRow(int[] row){
        int rowLength = row.length;
        System.out.print('|');
        for(int i = 0; i < rowLength - 1; i++){
            System.out.print(row[i]);
            System.out.print('|');
        }
        System.out.print(row[rowLength - 1]);
        System.out.println('|');

    }
}
