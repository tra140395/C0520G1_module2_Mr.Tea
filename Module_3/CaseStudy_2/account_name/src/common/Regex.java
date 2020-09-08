package common;

import java.util.regex.Pattern;

public class Regex {

  public static boolean regexInputPhone(String phone){
    String regex ="^((090|091)[0-9]{7})$";
      if(!Pattern.matches(regex,phone)) {
          return false;
      }else
          return true;
  }

  public static boolean regexInputId_card(String id_card){
      String regex = "^(([0-9]{9})|([0-9]{11}))$";
          if(!Pattern.matches(regex,id_card)){
              return false;
          }else
              return true;
  }

  public static boolean regexEmail(String email){
      String regex = "^[a-zA-Z0-9]*+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
      if(!Pattern.matches(regex,email)){
          return false;
      }else
          return true;
  }

    public static boolean regexMaKH(String maKH){
        String regex = "^(KH-)[0-9]{4}$";
        if(!Pattern.matches(regex,maKH)){
            return false;
        }else
            return true;
    }

    public static boolean regexMaDV(String maDV){
        String regex = "^(DV-)[0-9]{4}$";
        if(!Pattern.matches(regex,maDV)){
            return false;
        }else
            return true;
    }

}
