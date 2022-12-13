import java.util.Random;
import java.util.Scanner;

public class theGame {
    private int result;
    private boolean finalGame = false;
    private int steps;
    private int i;
    Random random;

    public void startGame() {
        Board board = new Board();
        System.out.println("Начнем игру");
        board.printBoard();

        ChoiceofMovement gamers = new ChoiceofMovement();

        Winner winner = new Winner();
        Scanner scanString = new Scanner(System.in);
        random = new Random();
        gamers.whoFirstGo();

        steps = 0;
        while (steps != 9) {

            System.out.println("\nЧеловек ты ходишь. Выбери цифру, куда поставишь: \t");
            i = scanString.nextInt();

            board.setBoard(i, gamers.getHuman_symbol());
            board.printBoard();
            if (winner.checkWin(gamers.getHuman(), gamers.getHuman_symbol())) {
                break;
            }
            steps += 1;

            System.out.println("\nКомпьютер ты ходишь. Выбери цифру, куда поставишь: ");
            result = random.nextInt(0, 9);

            if (steps == 9) {
                System.out.println("Ничья");
                break;
            }

            while (board.getSymbolBoard(result) == 'X' || board.getSymbolBoard(result) == 'O') {
                result = random.nextInt(0, 9);
            }
            board.setBoard(result, gamers.getComputer_symbol());
            System.out.printf("\nКомпьютер поставил в позицию %s", result);

            if (winner.checkWin(gamers.getComputer(), gamers.getComputer_symbol())) {
                break;
            }
            steps += 1;
            board.printBoard();
        }
        if (steps == 9) {
            System.out.println("Ничья");
        }
    }

}



