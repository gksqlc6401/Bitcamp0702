package net.hb.day0628;

public class CampTest1 {
  public static void main(String[] args) {
    //배열초기화
    //배열의장단점
    String[] dong = new String[5];
    for(int i=0; i<dong.length;i++) {
      System.out.print( dong[i] + " ");
    }

    System.out.println();
    boolean[] camp = new boolean[5]; //false기본값출력
    for(int i=0; i<camp.length;i++) {
      System.out.print( camp[i] + " ");
    }

    System.out.println();
    double[] pi = new double[5]; 
    for(int i=0; i<pi.length;i++) {
      System.out.print( pi[i] + "  ");
    }

    System.out.println();
    //배열은 같은타입으로만 구성, 크기사이즈 고정
    //채팅구성원정보 닉이름String, 나이int, 성별boolean =>배열구성비권장
    //웹web게시판 글쓴이, 제목, 이미지, 조회수, 날짜
    //채팅, 쇼핑몰, 게시판 구성할때 배열의 한계극복 collection모음 List계열
    //java.util팩키지 List인터페이스 상속 - ArrayList클, Vector클
    //java.util팩키지 Map인터페이스, Set인터페이스, List인터페이스
    //같은타입구성, 크기고정인 배열의 단점을 List인터페이스상속 
    //같은타입구성, 크기고정인 1차원배열  
    //boolean[] camp = new boolean[5]; //false기본값출력
    //배열및 문자열 시작위치 0번째부터입니다 
    //자바에서 표준출력 모니터 System.out ==> PrintStream
    //자바에서 표준입력 키보드 System.in  ==> Scanner클래스생성자  
  }//end
}//class END


