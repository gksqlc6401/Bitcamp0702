package net.hb.day0628;

public class SJUser {

  public static void main(String[] args) {
    SJ sj =new SJ();

    String id ="name";
    int first=100;
    int second=55;
    int total = sj.getTotal("name", first, second);
    double avg  = sj.getMean(total);
    char ret = sj.getGrade(avg);
    String info = sj.result(avg, first, second); 


    System.out.println("합계="+ total);
    System.out.println("평균="+ avg);
    System.out.println("학점="+ ret);
    System.out.println("결과="+ info);



    //합계구하는 함수 hap, sum, total getTotal()
    //평균을 구하는 함수 avg
    //학점구하는 함수 grade
    //합격여부 구하는 함수 pass
  }
}
