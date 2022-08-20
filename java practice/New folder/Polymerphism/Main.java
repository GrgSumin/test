public class Main {
    // polymerphism is ability of an object to identify as more that one types
    public static void main(String[] args) {
            
        Bicycle Bicycle = new Bicycle();
        Boat boat = new Boat();
        Car car = new Car();
         Vehicle[] racers = {car, boat, Bicycle};
        
         for(Vehicle x : racers){
             x.go();
         }
        }

    
}
