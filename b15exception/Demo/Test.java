package b15exception.Demo;

public class Test {
   public static void test() {
       try {
           int[] arr = new int[5];
           arr[5] = 30 / 0;
       } catch (ArithmeticException e) {
           System.out.println("Task 1 is completed");
       }
       catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Task 2 is completed");
       }
       catch (Exception e){
           System.out.println("Common task is completed");
       }
   }

    public static void main(String[] args) {
     test();
    }
}