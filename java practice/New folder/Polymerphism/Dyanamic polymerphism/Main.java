import java.util.Scanner;
public class Main {
    // dyanmic polymerphism - it is a ability that takes many sha[es and sizes after prgramis areday running
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("WHat do you want");
        System.out.println("Enter a number 1 for dog and 2 for Cat");
        int choice = scanner.nextInt();
        if(choice==1) {
          Dog dog = new Dog();
          dog.speak();

        }
        else if(choice==2) {
            animal = new Dog();
            animal.speak();
        }
        else{
           animal = new Animal();
           System.out.println("You have chosen wrong value");
            animal.speak(); 
        }

    }
}
