package b2vonglap.baitap;

public class InRaCacSntNhoHon100 {
    public static void main(String[] args) {
        int num;
        for(num=2;num<100;num++){
            boolean check =true;
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    check =false;
                    break;
                }
            }
            if (check){
                System.out.println(num+"");
            }
        }
    }
}
