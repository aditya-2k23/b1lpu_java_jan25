package Day17;

// this is how inheritance happens in java
class Animal{
    void Speaks(){
        System.out.println("Animal speaks!");
    }
}

class Dog extends Animal{
    // method over riding 
    @Override //annotation
    void Speaks(){
      System.out.println("Dog Barks!");  
    }
}

public class inhert {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.Speaks();
    }
}
