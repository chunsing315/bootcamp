public class NBAfinals {
    private String homeTeam;
    private String awayTeam;

    public NBAfinals(String home, String away){
        this.homeTeam = home;
        this.awayTeam = away;
    }

    public void setHomeTeam(String name){
        this.homeTeam = name;
    }

    public String getHomeTeam(){
        return this.homeTeam;
    }
    public String getAwayTeam(){
        return this.awayTeam;
    }
    
    public static void main(String[] args) {
        NBAfinals game1 = new NBAfinals("BOS","DAL");
        System.out.println(game1.getHomeTeam()+" v.s. "+game1.awayTeam);
        
    }
}
    