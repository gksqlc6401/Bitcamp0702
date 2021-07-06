package net.hb.day0628;

public class TestLast {

  public static void main(String[] args) {
    int a = 234;
    double b = 78.9;
    String c = "1200";

    //문제1번 b타입으로 int형 변환
    int x = (int)b;
    System.out.println(x+34);

    //문제2번 c타입으로 int형 변환

    int y =  Integer.parseInt(c);
    System.out.println(y+34);

    //문제3번 a타입으로 String형 변환
    String z = Integer.toString(a);
    System.out.println(z+34);

  }

}
