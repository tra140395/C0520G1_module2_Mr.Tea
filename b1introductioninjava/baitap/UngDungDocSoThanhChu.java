package b1introductioninjava.baitap;

import java.util.Scanner;

    public class UngDungDocSoThanhChu {
        final static String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        final static String twos[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number:");
            int num = sc.nextInt();
            numberToWord(((num / 100) % 10), " HUNDRED AND");
            numberToWord((num % 100), " ");
            }
        private static void numberToWord(int num1, String val) {
            System.out.print(num1>19?twos[num1/10]+" "+ ones[num1%10]:ones[num1]);
            System.out.print(num1>0?val:"");
        }
        }


