package common;

import java.util.regex.Pattern;

public class Regex {

  public static boolean regexInputPhone(String phone){
    String regex ="^((090|091)[0-9]{7})$";
      return Pattern.matches(regex, phone);
  }

  public static boolean regexInputId_card(String id_card){
      String regex = "^(([0-9]{9})|([0-9]{11}))$";
      return Pattern.matches(regex, id_card);
  }

  public static boolean regexEmail(String email){
      String regex = "^[a-zA-Z0-9]*+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
      return Pattern.matches(regex, email);
  }

    public static boolean regexMaKH(String maKH){
        String regex = "^(KH-)[0-9]{4}$";
        return Pattern.matches(regex, maKH);
    }

    public static boolean regexMaDV(String maDV){
        String regex = "^(DV-)[0-9]{4}$";
        return Pattern.matches(regex, maDV);
    }

    public static boolean regexNumberOfFloors(String floors){
      String regex = "^(([0-9])|([0-9]{2}))$";
        return Pattern.matches(regex, floors);
    }

    public static boolean checkSalary(double salary){
        return salary > 0;
    }

    public static boolean checkDeposit(double deposit){
      return deposit > 0;
    }

    public static boolean checkTotalMoney(double total_money){
      return total_money > 0;
    }

    public static boolean checkCost(double cost){
      return cost > 0;
    }


}
