import java.util.ArrayList;
class twoAlist{
    // a dyanmic list of list elements
    // you can change size of list of thede ;ist during runtime
public static void main(String[] args){
    ArrayList<ArrayList<String>> grocery = new ArrayList();

    ArrayList<String> fruits = new ArrayList();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");
    ArrayList<String> vegetables = new ArrayList<String>();
    vegetables.add("potato");
    vegetables.add("tomato");
    vegetables.add("garlic");
    ArrayList<String> fastfood = new ArrayList<String>();
    fastfood.add("pasta");
    fastfood.add("frozenmomo");
    fastfood.add("frozenfries");
    
    grocery.add(fruits);
    grocery.add(vegetables);
    grocery.add(fastfood);


    System.out.println(grocery.get(1).get(1));


}

    
}
