import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    // excception - an event that occurs during execution of a program
    // that disrupys the normal flow of instruction    
      try {Scanner s = new Scanner(System.in);  
      System.out.println("enter a numerator");
      int x = s.nextInt();
      System.out.println("enter a denominator");
      int y = s.nextInt();

      int z = x/y;
      System.out.println("the answer is:  " + z);
      }
      catch(ArithmeticException e){
        System.out.println("yo cant do it it is impossivele");

      }
}

}