public class Task1{
public static void main (String[] args)
{
if (args.length == 0) System.out.println("No arguments");
else{
for(int i=args.length-1; i>=0; i-- )
{
System.out.println("Argument "+i+" : "+args[i]);
}
}
}
}
