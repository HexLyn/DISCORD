package discord.racingcar;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }
}

//주어진 횟수동안 n대의 자동차가 자기맘대로 전진/멈춤 가능.
//(각 자동차에 고유 이름 부여 가능.) 전진하는 자동차 출력할 때 이름을 같이 출력.
//자동차 이름은 쉼표로 구분, 5자 이하로 구성.
//사용자가 몇 번의 이동을 할 지 입력.
//전진 조건은 0~9사이 무작위 값 구한 뒤 해당 랜덤값이 4이상일 때만 전진.
//본 게임이 끝난 뒤 누가 우승했는지 출력. 우승자는 한 명 이상 가능(=공동 우승 인정)
//우승자가 여럿일 경우 쉼표(,)로 구분
//사용자가 값 이상하게 입력하면 IllegalArgumentException 발생, 어플 종료 시켜버림.

// 구성
// 시작하면 안내 창 > 선수 입력(5명까지) > (반복문)각 선수마다 랜덤값을 생성해서 4이상이면 전진.
// 아니면 정지(변함없음) > 어느 누가(복수 가능) 결승선 통과하면 게임 종료 > 우승자 출력 후 종료.
// +) 선수 입력단계에서 오류값 입력하면 그대로 종료.