/** 
 * This application prints arguments of command line in reverse order
*/
public class task1 {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No argument was passed to the application");
		}
		else {
			System.out.println("Arguments of command line in reverse order:");
			for (int i = (args.length - 1); i >= 0; i--) {
				System.out.println(args[i]);
			}
		}
	}
  
}
