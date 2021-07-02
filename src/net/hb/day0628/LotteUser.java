package net.hb.day0628;

public class LotteUser {
  public static void main(String[] args) {


    System.out.println("LotteUser.java 10:08");
    //Lotte my= new Lotte();
    //su = my.Lotte
    int[] ret =Lotte.input();
    Lotte.output(ret);

    Lotte LG = new Lotte();
    int value=LG.inputHap();
    System.out.println("숫자합계="+value);
    System.out.println("숫자합계="+LG.inputHap());

    System.out.println();
    System.out.println("LotteUser.10:08 11:01");
  }
}
