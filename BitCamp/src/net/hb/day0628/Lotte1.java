package net.hb.day0628;

public class Lotte1 {
  public static int[] input() {
    int[] su = new int[] {12,24,16,35,11,35};
    /*int[] su = new int[6];
    su[0]=12; su[1]=15; su[2]=18;
    su[3]=24; su[4]=34; su[5]=11;*/
    return su;
  }
  public static void output(int[]LT) {
    for (int i=0; i<LT.length; i++) {
      System.out.println(LT[i]);
    }
    System.out.println("로또 배열 출력성공");
  }
  public int outputHap() {
    int hap=0;
    int[] su = new int[] {12,24,16,35,11,35};

    for (int i=0; i<su.length; i++) {
      hap += su[i];
    }
    return hap;
  }
}
