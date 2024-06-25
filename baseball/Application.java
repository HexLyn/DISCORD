package discord.baseball;

import java.util.Random;
import java.util.Scanner;

public class Application {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public static void main(String[] args) {
        // 프로그램 구현
        Application app = new Application();
        app.startGame();
    }

    public void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
//        InputCompare에서 true를 반환하여 종료되는 형식.
        boolean gameEnd = false;
        while (true) {
            InputRandom inputRandom = new InputRandom(random);
            int[] computer = inputRandom.generateRandomNumbers();

            InputAnswer inputAnswer = new InputAnswer(scanner, computer);
            gameEnd = false;

            while (!gameEnd) {
                int[] inputnum = inputAnswer.getInput();
                gameEnd = InputCompare.compareNumbers(computer, inputnum);
            }

            InputEnd inputEnd = new InputEnd(scanner);
            if (!inputEnd.shouldRestart()) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }

        scanner.close();
    }
}