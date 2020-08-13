package b4oop.baitap;

import java.util.Arrays;

public class StopWatch {
    private double startTime;
    private double endTime;

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public StopWatch(){
          this.startTime = System.nanoTime();
    }
    public void start(){
         this.startTime = System.nanoTime();
    }
    public void stop(){
         this.endTime = System.nanoTime();
    }
    public double getElapsedTime(){
        return  this.getEndTime()- this.getStartTime();
    }
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        int[] array = {49, 38, 65, 97, 76, 13, 27, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18, 23, 34, 15, 35, 25, 53, 51};
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j ];
                    array[j ] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }

}
