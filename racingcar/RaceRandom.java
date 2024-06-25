package discord.racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RaceRandom {
    private Random random;

    public InputRandom(Random random) {
        this.random = random;
    }

    public int[] generateRandomNumbers() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = random.nextInt(9) + 1; // 1부터 9까지의 숫자
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

        int[] computerArray = new int[3];
        for (int i = 0; i < 3; i++) {
            computerArray[i] = computer.get(i);
        }
        return computerArray;
    }
}