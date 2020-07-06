package b6kethua.baitap;

public class Point3d extends Point2d {
    private float z = 1.0f;
    public Point3d(){

    }
    public Point3d(float x,float y,float z){
        super(x,y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }

    @Override
    public String toString() {
        return super.toString()+"z= "+getZ();
    }

    public static void main(String[] args) {
        Point3d point3d = new Point3d(1.3f,2.3f,3.3f);
        System.out.println(point3d.toString());
    }
}
