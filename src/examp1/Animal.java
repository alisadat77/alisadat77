package examp1;

public class Animal {
   private String name;

    public Animal(String name){
        this.name=name;
    }
    public String getName(){

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String greet(){

        return "the animal make a sound";
    }
}
