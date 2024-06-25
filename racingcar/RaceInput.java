package discord.racingcar;

import java.util.Scanner;

public class RaceInput {
    static Scanner sc = new Scanner(System.in);

    public static int getInt(String title) {
        System.out.println(title);
        return Integer.parseInt(sc.nextLine());
    }
}

// 입력 받을 값은
// n대의 (자동차 수)
// 각 자동차의 (이름)
// 몇회 시도할 지 (횟수)
