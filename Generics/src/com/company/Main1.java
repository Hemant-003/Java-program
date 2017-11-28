package com.company;

public class Main1 {
    public static void main(String[] args) {

        FootballPlayer hemant = new FootballPlayer("Hemant");
        FootballPlayer ravi = new FootballPlayer("Ravi");
        FootballPlayer messi =new FootballPlayer("Messi");
        FootballPlayer ronaldo =new FootballPlayer("Ronaldo");
        FootballPlayer rooney = new FootballPlayer("Wayne rooney");
        FootballPlayer neymar = new FootballPlayer("neymar");
        FootballPlayer serigo = new FootballPlayer("Serigo Romero");
        FootballPlayer fernando = new FootballPlayer("Fernando gago");

        Teams<FootballPlayer> realMadrid = new Teams<>("real Madrid");
        realMadrid.addPlayer(ronaldo);
        realMadrid.addPlayer(ravi);

        Teams<FootballPlayer>  barcelona = new Teams<>("Barcelona");
        barcelona.addPlayer(hemant);
        barcelona.addPlayer(messi);

        Teams<FootballPlayer> mu = new Teams<>("Manchester United");
        mu.addPlayer(rooney);
        mu.addPlayer(neymar);

        Teams<FootballPlayer> argentina = new Teams<>("Argentina");
        argentina.addPlayer(serigo);
        argentina.addPlayer(fernando);


        League<Teams<FootballPlayer>> footballLeague = new League<>("COPA");
        footballLeague.addTeamToTheLeage(barcelona);
        footballLeague.addTeamToTheLeage(realMadrid);
        footballLeague.addTeamToTheLeage(mu);
        footballLeague.addTeamToTheLeage(argentina);

        barcelona.matchResults(realMadrid,8,4);
        realMadrid.matchResults(mu,6,4);
        barcelona.matchResults(mu,6,4);
        realMadrid.matchResults(barcelona,10,8);

        footballLeague.showLeagueTable();





    }
}
