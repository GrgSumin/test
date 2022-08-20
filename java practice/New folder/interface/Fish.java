public class Fish implements Prey , Predator {
    @Override
    public void flee(){
        System.out.println("They are small fish and running away from bigger fish");

    }
    public void hunt(){
        System.out.println("bigger fish hunts the smaller fish");
    }
    
}
