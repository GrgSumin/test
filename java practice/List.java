import java.util.ArrayList;
class List{
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>();
        food.add("momo");
        food.add("fries");
        food.add("burger");
        for(int i=0;i<+food.size();i++){
            System.out.println(food.get(i));
        }
        
        

    }
}