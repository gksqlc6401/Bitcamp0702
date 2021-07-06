package net.commit.bit;

public class CampTest4 {

  public static void main(String[] args) {

    int su1 = 9;
    int su2 = 0;
    int mul=0, mok=0;

    try {
      mul=su1*su2;
      mok=su1/su2;
      System.out.println(su1 + "*" +su2 + "=" + mul);
      System.out.println(su1 + "/" +su2 + "=" + mok);
    }catch(Exception ex) {System.out.println("에러이유"+ex);}

    try {
      boolean[] camp = new boolean[5];
      System.out.println(camp[2]);
      System.out.println(camp[3]);
    }catch(Exception ex) { }
    System.out.println("1학기 점수");
    System.out.println("국어 80점");
    System.out.println("영어 90점");
    System.out.println("총점 170점");

  }//end
}//TestGugudan class END





