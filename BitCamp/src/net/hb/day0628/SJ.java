package net.hb.day0628;

public class SJ {
  public int getTotal(String name, int kor, int eng) {
    System.out.println(name+"님의 합계처리");
    int hap = kor + eng;
    return hap;
  }

  public double getMean(int value) {
    double avg= (double)value/2;
    return avg;
  }

  public char getGrade(double date) {
    char grade= 'F';
    switch ((int)date) {
      case 100: 
      case 90:  grade='A'; break;
      case 80:  grade='B'; break;
      case 70:  grade='C'; break;
      case 60:  grade='D'; break;
      default:
        grade='F'; break;
    }
    return grade; 
  }//end

  public String result(double date) {
    String msg= "합격여부 안내문";
    if(date>=70) {
      msg = "축합격";
    }else { msg= "재시험"; }
    return msg;
  }

  public String result(double date, int x, int y) {
    String msg= "합격여부 안내문";
    if(date>=70 && x>=60 && y>=60) {
      msg = "축합격";
    }else { msg= "재시험"; }
    return msg;
  }
}