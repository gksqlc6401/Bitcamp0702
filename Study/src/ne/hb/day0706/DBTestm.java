package ne.hb.day0706;

import java.sql.DriverManager;

public class DBTestm {

  public void code() {
    try {
      msg = "select * from test";
      RS = ST.executeQuery(msg);
      System.out.println("코드\t");
      while(RS.next()==true) {
        int ucode = RS.getInt("code");
        System.out.println(ucode + "\t");
      }
    }catch (Exception e) {}
  }

  public void name() {
    try {
      msg = "select * from test";
      RS = ST.executeQuery(msg);
      System.out.println("이름\t");
      while(RS.next()==true) {
        String uname =RS.getString("name");

        System.out.println(uname + "\t");
      }
    }catch (Exception e) {}
  }

  public void title() {
    try {
      msg = "select * from test";
      RS = ST.executeQuery(msg);
      System.out.println("제목\t");
      while(RS.next()==true) {
        String utitle=RS.getString("title");
        System.out.println(utitle + "\t");
      }
    }catch (Exception e) {}
  }

  public void input( ) {
    try {
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
    }catch (Exception e) { }
  }

  public void sql() {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클 드라이브로드
      String url= "jdbc:oracle:thin@127.0.0.1:1521:XE";
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","system","1234");
      System.out.println("오라클 드라이브 및 서버연결 성공");

      //첫번째 명령어 생성
      ST=CN.createStatement();
      //두번째 키보드 입력

    }catch (Exception ex) {System.out.println("에러이유 " + ex);}
  }
}
