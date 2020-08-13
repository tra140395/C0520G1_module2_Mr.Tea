package b6kethua.baitap;

public class MovablePoint extends Point{
     private float XSpeed = 0.0f;
     private float YSpeed = 0.0f;
     public MovablePoint(float x, float y, float XSpeed, float YSpeed){
         super(x,y);
         this.XSpeed = XSpeed;
         this.YSpeed = YSpeed;
     }
     public MovablePoint(float XSpeed, float YSpeed){
         this.XSpeed = XSpeed;
         this.YSpeed = YSpeed;
     }
     public MovablePoint(){

     }

    public float getXSpeed() {
        return XSpeed;
    }

    public void setXSpeed(float XSpeed) {
        this.XSpeed = XSpeed;
    }

    public float getYSpeed() {
        return YSpeed;
    }

    public void setYSpeed(float YSpeed) {
        this.YSpeed = YSpeed;
    }
    public void setSpeed(float XSpeed,float YSpeed){
         this.XSpeed = XSpeed;
         this.YSpeed = YSpeed;
    }
    public float[] getSpeed(){
         float[] array = new float[2];
         array[0] = getXSpeed();
         array[1] = getYSpeed();
         return array;
    }

    @Override
    public String toString() {
        return super.toString()+" speed = ( "+getXSpeed()+","+getYSpeed()+" ) ";
    }

    public MovablePoint move(){
         super.setX(getX()+XSpeed);
         super.setY(getY()+YSpeed);
         return this;
    }

    public static void main(String[] args) {
        MovablePoint movablePoint= new MovablePoint(2.0f, 1.0f,3.0f,4.0f);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint);

    }

}
