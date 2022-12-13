import java.util.LinkedList;

class Board {
    private LinkedList<Character> board;
    int i = 0;

    public Character getSymbolBoard(int i) {
        return board.get(i);
    }

    public void setBoard(int i, char symbol) {
        board.set(i, symbol);
    }

    public Board(){
        fillBoard();
    }
    private void fillBoard() {
        board = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            board.add((char)((i * 3)+ '0'));
            board.add((char)((1+ i * 3)+ '0'));
            board.add((char)((2+ i * 3)+ '0'));
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\n_____________");
            System.out.printf("| %2s", board.get(0 + i * 3) + "\t");
            System.out.printf("| %2s", board.get(1 + i * 3) + "\t");
            System.out.printf("| %2s", board.get(2 + i * 3) + "\t");
            System.out.println("|");
        }
        System.out.println("_____________");
    }
}
