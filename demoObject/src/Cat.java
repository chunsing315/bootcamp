package demoObject.src;

import java.util.Objects;

public class Cat {
    private String name;
    private char color;
    /* @Override
    public String toString(){
        return "I am a Cat.";
    } */
    public Cat(){}
    public Cat(String name){
        this.name = name;
    }
    public Cat(char color){
        this.color = color;
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.name);
    }

    public String run(){
        return "Cat is running ...";
    }
}
