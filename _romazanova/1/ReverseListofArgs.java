package _romazanova.1;

public class ReverseListofArgs {

	public static void main(String[] args) {
		System.out.print("Command line args in reverse order: ");
		for (int i = args.length-1; i >=0; i--) {
			System.out.print( args [i] + " ");
		}
	}

}
