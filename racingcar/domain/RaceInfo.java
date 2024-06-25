package discord.racingcar.domain;

public class RaceInfo {
    int RacerNum = 0;
    int[] Racers = null;

    private RaceInfo() {}

    private static RaceInfo instance = new RaceInfo();
    public static RaceInfo getInstance() {return instance;}
    public int getRacerNum() {return RacerNum;}
    public void setRacerNum(int RacerNum) {
        this.Racers = new int[RacerNum];
        this.RacerNum = RacerNum;
    }
    public int[] getRacers() {return Racers;}

}
