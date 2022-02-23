package examp1;

public class Dog extends Mamal1{
    public Dog(String name) {
        super(name);
    }
    @Override
    public String greet(){
        return "woof";
    }

}
