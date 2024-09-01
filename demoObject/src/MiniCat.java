package demoObject.src;

import java.util.Objects;

public class MiniCat {
    private String name;
    private String color;
    /* @Override
    public String toString(){
        return "I am a Cat.";
    } */

    public MiniCat(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name,this.color);
    }
}
