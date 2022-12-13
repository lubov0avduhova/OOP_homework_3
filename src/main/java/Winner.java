

public class Winner {
    public boolean checkWin(String winner, char symbol) {
        Board board = new Board();

        for (int i = 0; i < 3; i++) {
            if ((board.getSymbolBoard(0) == symbol && board.getSymbolBoard(1) == symbol &&
                    board.getSymbolBoard(2) == symbol) ||
                    (board.getSymbolBoard(0 + i) == symbol && board.getSymbolBoard(1 + i) == symbol &&
                            board.getSymbolBoard(2 + i) == symbol))
                return true;
            if ((board.getSymbolBoard(0) == symbol && board.getSymbolBoard(4) == symbol &&
                    board.getSymbolBoard(8) == symbol) ||
                    (board.getSymbolBoard(6) == symbol && board.getSymbolBoard(4) == symbol &&
                            board.getSymbolBoard(2) == symbol))
                return true;

        }
        return false;
    }
}







