public class Copy {
// ecampuslation - attrivutes of a class wil be hidden or private
// can be accesed only through mehods i.e through get ans set methods
// you should make attrivutes public if you dont have reason to make it public or protected
public static void main(String[] args) {
    Car car1 = new Car("ford","fordgt",2022);
    Car car2 = new Car("bmw","i8",2022);
    car2.copy(car1);
   System.out.println(car1);
   System.out.println(car2);
    System.out.println(car1.getMake());
    System.out.println(car1.getModel());
    System.out.println(car1.getYear());
    System.out.println();
    System.out.println(car2.getMake());
    System.out.println(car2.getModel());
    System.out.println(car2.getYear());
  
}
}
