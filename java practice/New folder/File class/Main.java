import java.io.File;
public class Main {
    // file is an abstract repreentation of file and directory pathnames
    public static void main(String[] args) {
        File file = new File("Secret_msg.txt");
        if (file.exists()) {
            System.out.println("suprise it exits :0!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else{
            System.out.println("to bad it does not exit :(");
        }

    }
}
