package discord.baseball;

import java.util.Scanner;

public class InputAnswer {
    private Scanner scanner;
    private int[] computer;

    public InputAnswer(Scanner scanner, int[] computer) {
        this.scanner = scanner; // 매개변수로 받은 scanner를 멤버 변수에 할당
        this.computer = computer;
    }

    public int[] getInput() {
        int[] inputnum = new int[3];

        while (true) {
            System.out.println("숫자를 입력해주세요 (세 자리 숫자를 공백 없이 연속으로 입력하세요): " + computer[0] + computer[1] + computer[2]);
            String input = scanner.next();
            if (input.length() == 3) {
                for (int i = 0; i < 3; i++) {
                    inputnum[i] = Character.getNumericValue(input.charAt(i));
                }
                break;
            } else {
                System.out.println("숫자는 세자리 숫자로 입력해 주세요.");
            }
        }

        return inputnum;
    }
}
