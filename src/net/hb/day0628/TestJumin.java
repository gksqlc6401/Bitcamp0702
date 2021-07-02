package net.hb.day0628;

public class TestJumin {

  public static void main(String[] args) {
    String min = "971024-1541965";
    /*char gender = min.charAt(7);
    String message = "성별출력합니다.";
    if (gender=='1') {
      message = "당신의 성별은 남자입니다.";
    }else if(gender=='2') {
      message = "당신의 성별은 여자입니다.";
    }else { message ="성별이 잘못표기 되었습니다.";}*/

    System.out.println(min);
    if (min.charAt(7)=='1' || min.charAt(7)=='3') {
      System.out.println("남자 입니다.");
    }else if (min.charAt(7)=='2' || min.charAt(7)=='4'){
      System.out.println("여자 입니다.");
    }else {System.out.println("잘못표기되었습니다");}
  }
}
