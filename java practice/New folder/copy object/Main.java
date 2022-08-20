public class Main {
// ecampuslation - attrivutes of a class wil be hidden or private
// can be accesed only through mehods i.e through get ans set methods
// you should make attrivutes public if you dont have reason to make it public or protected
public static void main(String[] args) {
    Car car = new Car("ford","fordgt",2022);
    car.setYear(2024);
    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
  
}
}
