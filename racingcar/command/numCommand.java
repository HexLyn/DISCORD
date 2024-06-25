package discord.racingcar.command;

import discord.racingcar.RaceInput;
import discord.racingcar.domain.RaceInfo;

public class numCommand implements Command{
    RaceInfo raceInfo = RaceInfo.getInstance();

    @Override
    public void execute() {
        int racerNum = RaceInput.getInt("경주자 수>");
        RaceInfo.setRacerNum(racerNum);
    }
}
