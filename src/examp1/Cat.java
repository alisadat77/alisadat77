package examp1;

public class Cat extends Mamal1{
    public Cat(String name) {
        super(name);
    }
    @Override
    public String greet(){

      return "Meow";
    }
}
