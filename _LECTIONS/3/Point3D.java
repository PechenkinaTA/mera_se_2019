public class Point3D extends Point {
    int z;

    public Point3D(int z) {
        this.z = z;
    }

    public Point3D(int x,int y, int z) {
        super(x,y);
        super.setX(x);
        super.setY(y);

        super.x = x;
        super.y = y;

        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}
