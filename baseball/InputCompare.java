package discord.baseball;
public class InputCompare {
    public static boolean compareNumbers(int[] computer, int[] inputnum) {
        int strikeCount = 0;
        int ballCount = 0;

        for (int i = 0; i < 3; i++) {
            if (computer[i] == inputnum[i]) {
                strikeCount++;
            } else if (contains(computer, inputnum[i])) {
                ballCount++;
            }
        }

        if (ballCount > 0) {
            System.out.println(ballCount + "볼");
        }
        if (strikeCount > 0) {
            System.out.println(strikeCount + "스트라이크");
        }
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫띵");
        }
        if (strikeCount == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임종료");
            return true;
        }

        return false;
    }

    private static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}