import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        int console_args = Array.getLength(args);
        //System.out.println(console_args);
        for (int i = console_args - 1; i >= 0; i--) {
          System.out.println(args[i]);
        }
        
    }
    
}
