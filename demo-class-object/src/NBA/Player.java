package NBA;

public class Player {
    private String name;
    private int num;

    public Player(String name, int num){
        this.name = name;
        this.num = num;
    }

    public void setPlayerName(String name){
        this.name = name; 
    }
    public void setPlayerNum(int num){
        this.num = num; 
    }

    public String getPlayerName(){
        return this.name;
    }
    public int getPlayerNum(){
        return this.num;
    }


    public static void main(String[] args) {
        Player p1 = new Player("Irving",11);
        Team t1 = new Team("Mav");
        t1.setHeadCoach("Jason Kidd");
        System.out.println(p1.getPlayerName()+' '+p1.getPlayerNum());
        System.out.println(t1.toString());
    }
}
