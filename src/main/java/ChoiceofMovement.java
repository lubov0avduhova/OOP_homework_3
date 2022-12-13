import java.util.Random;
import java.util.Scanner;

class Gamers {
    private char human_symbol, computer_symbol;
    private String human = "человек";
    private String computer = "компьютер";

    public void setHuman_symbol(char human_symbol) {
        this.human_symbol = human_symbol;
    }

    public void setComputer_symbol(char computer_symbol) {
        this.computer_symbol = computer_symbol;
    }

    public char getHuman_symbol() {
        return human_symbol;
    }

    public String getHuman() {
        return human;
    }

    public char getComputer_symbol() {
        return computer_symbol;
    }

    public String getComputer() {
        return computer;
    }
}

class ChoiceofMovement extends Gamers {
    Random random;

    private char choose_symbol() {
        if (random.nextBoolean()) {
            return 'X';
        } else
            return 'O';
    }

    public void whoFirstGo() {
        Scanner scanString = new Scanner(System.in);
        random = new Random();
        switch (random.nextInt(1, 3)) {
            case 1:
                System.out.printf("Первым ходит %s. Выбери О или Х \t", getComputer());
                setComputer_symbol(choose_symbol());
                System.out.printf("Компьютер выбрал %s \t", getComputer_symbol());
                if (getComputer_symbol() == 'X') {
                    setHuman_symbol('O');
                } else setHuman_symbol('X');
                break;

            case 2:
                System.out.printf("Первым ходит %s. Напиши О или Х (английская раскадка) \t ", getHuman());
                setHuman_symbol(scanString.next().charAt(0));

                if (getHuman_symbol() == 'x') {
                    setHuman_symbol('X');
                } else if (getHuman_symbol() == 'o') {
                    setHuman_symbol('O');
                }

                if (getHuman_symbol() == 'X') {
                    setComputer_symbol('O');
                } else setComputer_symbol('X');
        }
    }

}

