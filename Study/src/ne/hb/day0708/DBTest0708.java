package ne.hb.day0708;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest0708 {

  public void data() {
    try {
      msg = "select * from test";
      RS = ST.executeQuery(msg);
      System.out.println("코드\t이름\t제목\t");
      while(RS.next()==true) {
        int ucode = RS.getInt("code");
        String uname =RS.getString("name");
        String utitle=RS.getString("title");
        System.out.println(ucode + "\t" + uname + "\t" + utitle);
      }
    }catch (Exception e) {}
  }

  Connection CN=null;            //DB서버연결정보 서버 ip주소 계정id,pwd
  Statement ST=null;             //ST=CN.createStatement() 명령어 생성
  ResultSet RS=null;             //select조회값을 거억하는 덩어리
  String msg="isud=crud 쿼리문 기술";
  Scanner sc = new Scanner(System.in);

  public void main(String[] args) {


    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 드라이브로드
      String url= "jdbc:oracle:thin@127.0.0.1:1521:XE";
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","1234");
      System.out.println("오라클 드라이브 및 서버연결 성공");

      //첫번째 명령어 생성
      ST=CN.createStatement();
      //두번째 키보드 입력
      System.out.print("\n코드입력(4자리수)>>>");
      int a=Integer.parseInt(sc.nextLine());
      System.out.print("이름입력>>>");
      String b=sc.nextLine();
      System.out.print("제목입력>>>");
      String c=sc.nextLine();
      //세번째 쿼리문 완성
      msg="insert into test(code,name,title,wdate,cnt) values("+a+",'"+b+"','"+c+"', sysdate, 0)";
      System.out.println(msg);
      int OK=ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a+"코드 저장 성공했습니다.");
      }else {
        System.out.println(a+"코드 저장 실패했습니다.");
      }

      System.out.println("프로그램 전체 데이터를 읽어오는중... 잠시 기다려주세요.");
      Thread.sleep(3000);

      data();

    }catch (Exception ex) {System.out.println("에러이유 " + ex);}
    sc.close();
  }//main end
  //신규등록, 전체출력성공후 메소드 생성해서 최대한 메소드 활용
}//class end 