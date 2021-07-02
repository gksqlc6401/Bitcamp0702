package net.commit.bit;

public class TestJumin12 {

  public static void main(String[] args) {
    String min = "871024-1541965";
    String min1 = "871024";
    String min2 = "1541965";
    //문제1  총자릿수 6 - 7  13자릿수,  14자릿수
    //문제2  ******-1541965
    //문제3  1/3남자 2/4여자  
    /*문제1*/
    System.out.println(min.length());
    System.out.println(min1.length()+"-"+min2.length());
    System.out.println("******-"+min.substring(7));
    System.out.println("******-"+min.substring(7, 14));
    switch (min.charAt(7)) {
      case '1':
      case '3': System.out.println("남자입니다"); break;
      case '2': 
      case '4': System.out.println("여자입니다"); break;
      default :
        System.out.println("성별을 알수 없습니다."); 
        break;
    }
  }
}
