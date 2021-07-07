package GenericTypesChallenge;


public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> baseballTeam = new Team<>("Chicago CUbs");;
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> banks = new Team<>("Gordon");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremale");

        footballLeague.add(adelaideCrows);
        footballLeague.add(baseballTeam);
        footballLeague.add(melbourne);
        footballLeague.add(banks);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();

        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(beckham);
        rawTeam.addPlayer(pat);

        footballLeague.add(rawTeam);

        League<Team> rawLeauge = new League<>("Raw");
        rawLeauge.add(adelaideCrows);
        rawLeauge.add(baseballTeam);
        rawLeauge.add(rawTeam);

        League rallyRaw = new League("Really raw");
        rallyRaw.add(adelaideCrows);
        rallyRaw.add(baseballTeam);
        rallyRaw.add(rawTeam);
    }

}
