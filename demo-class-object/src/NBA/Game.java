package NBA;
import java.rmi.registry.LocateRegistry;
import java.time.LocalDate;

public class Game {
    private int gameNum;
    private String gameType;
    private Team home;
    private Team away;
    private int homeScore;
    private int awayScore;
    private LocalDate playDate;


    public void setLocalDate(LocalDate date){
        this.playDate = date;
    }
    public LocalDate getPlayDate (){
        return this.playDate;
    }

    public Game(int game, String type){
        this.gameNum = game;
        this.gameType = type;
    }
    public Game(Team home, Team away){
        this.home = home;
        this.away = away;
    }
    public Game(int game){
        this.gameNum = game;
    }

    //game num;
    public void setGameNum(int num){
        this.gameNum = num;
    }
    public int getGameNum (){
        return this.gameNum;
    }
    //home score;
    public void setHomeScore(int num){
        this.homeScore = num;
    }
    public int getHomeScore (){
        return this.homeScore;
    }
    //away score
    public void setAwayScore(int num){
        this.awayScore = num;
    }
    public int getAwayScore (){
        return this.awayScore;
    }
    //home/away
    public void setHomeTeam(Team team){
        this.home = team;
    }
    public void setAwayTeam(Team team){
        this.away = team;
    }
   
    public Team getAway (){
        return this.away;
    }
    public void setAway(Team away){
        this.away= away;
    }

    public void setGameType(String type){
        this.gameType = type;
    }
    public String getGameType (){
        return this.gameType;
    }

    public static String NumOrder(int num){
        switch (num%10) {
            case 1:
                if (num%100==11){
                    return num+"th";
                } else {
                    return num+"st";
                }
            case 2: 
                if (num%100==12){
                    return num+"th";
                } else {
                    return num+"nd";
                } 
            case 3:
                if (num%100==13){
                    return num+"th";
                } else {
                    return num+"rd";
                } 
            default:
                return num+"th";
                    
        }
    }

    public static String winner(Game x){
        if (x.awayScore-x.homeScore == 0)  {
            return "N/A";
        } else {
            if (x.awayScore-x.homeScore >0){
                return x.away.getName();
            } else {
                return x.home.getName();
            }
        }
    }


    public static void main(String[] args) {
        Game ps1= new Game(1,"Finals");
        Team teamBoston = new Team("BOS");
        Team teamDallas= new Team("DAL");

        System.out.println("This is the "+NumOrder(ps1.getGameNum())+" game of the NBA "+ps1.getGameType());
        ps1.setLocalDate(LocalDate.of(2024,6,7));
        System.out.println("The game was scheduled on "+ps1.getPlayDate());
        ps1.setAwayTeam(teamDallas);
        ps1.setHomeTeam(teamBoston);
        ps1.setHomeScore(107);
        ps1.setAwayScore(89);
        ps1.home.setname("BOS");
        ps1.away.setname("DAL");
        System.out.println("The winner of the game is : "+ winner(ps1));
    }
};

