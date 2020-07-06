package b6kethua.baitap;

import java.util.Arrays;

public class Point2d {
    private float x = 1.0f;
    private float y = 1.0f;
    public Point2d(){

    }
    public Point2d(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.y = y;
        this.x = x;
    }
    public float[] getXY(){
        float[] array = new float[2];
        for(int i=0;i<array.length;i++){
            array[0]=getX();
            array[1]=getY();
        }
        return array;

    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y+' ';
    }
}
