import java.util.Random;

public class Point {
    protected int x;
    protected int y;



    public static int DEFAULT_X;
    public static int DEFAULT_Y = 0;


   /* static {
        Random r = new Random(DEFAULT_Y);
        DEFAULT_X = r.nextInt();
    }*/

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = DEFAULT_X;
        y = DEFAULT_Y;
    }


    public static Point of(int x,int y) {
        return new Point(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int sum() {
        return x + y;
    }

    public int sum(int x, int y) {

        System.out.println("Класс:" + (this.x + this.y));
        return x + y;
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 42;
        //System.out.println(p1.x);

     /*   int x = 0;
        int y = x;
        y = 42;*/
       // System.out.println(x);

        //System.out.println(p1.sum());
        System.out.println("Аргументы:"+ p1.sum(0, -1));

    }
}
