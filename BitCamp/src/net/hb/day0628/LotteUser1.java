package net.hb.day0628;

public class LotteUser1 {

  public static void main(String[] args) {
    int[] lot = Lotte1.input();
    Lotte1.output(lot);

    Lotte1 LT = new Lotte1();
    int value=LT.outputHap();
    System.out.println("총합:"+value);
  }
}
