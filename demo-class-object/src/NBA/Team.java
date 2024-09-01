package NBA;

public class Team {
    private Player player;
    private String name;     
    private String headcoach;

    public Team(String name){
        this.name = name;
    }

    public void setHeadCoach(String headcoach){
        this.headcoach = headcoach;
    }

    public String getHeadCoach(){
        return this.headcoach;
    }
    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return this.name;
    }

    public String toString(){
        return this.name +"'s headcoach is "+headcoach;
    }
}
