public class StartPoint {
    public static void main(String[] args) {
        StartPoint startPoint = new StartPoint();

        Point p = new Point(42, 15);
        //System.out.println(p.getX());
        String one = "123";
        one = one.concat("321");


        int i = 0;
        i = i +1;
        Integer I = 0;
        Integer integer = Integer.valueOf("42");
        long l1 = 42L;
        Long l2 = 42L;
        //System.out.println(one);

        int i1 = 42;
        //startPoint.printInt(i1);

        Integer i2 = 42;
        //startPoint.printInt(i2);





        Point p1 = new Point();
        Point.DEFAULT_X = 42;
        Point p2 = new Point();
        //System.out.println(p1.getX() + " " + p2.getX());

        Point p3 = Point.of(Point.DEFAULT_X, 38);

      //  System.out.println(p3.getX() + " " + p3.getY());

        Point3D p4 = new Point3D(1, 2, 3);
        System.out.println(p4.getX() + " " + p4.getY() + " " + p4.getZ());

    }





    public void printInt(int i) {
        System.out.println(i);
    }

    public void printInt(Integer i) {
        System.out.println(38);
    }
}
