package discord.baseball;
import java.util.Scanner;

public class InputEnd {
    private Scanner scanner;

    public InputEnd(Scanner scanner) {
        this.scanner = scanner;
    }

    public boolean shouldRestart() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        while (true) {
            String endNum = scanner.nextLine();
            switch (endNum) {
                case "1":
                    return true;
                case "2":
                    return false;
                default:
                    if (!endNum.equals("1") && !endNum.equals("2")) {
                        System.out.println("1 또는 2를 입력하세요.");
                        break;
                    } else {
                        System.out.println("숫자는 1 또는 2를 입력해주세요.");
                    }
            }
        }
    }
}




