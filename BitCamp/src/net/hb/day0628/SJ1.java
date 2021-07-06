package net.hb.day0628;

public class SJ1 {
  public int getTotal(String name, int eng, int kor) {
    int hap = kor+eng;
    return hap;
  }

  public double getPg(double value) {
    double pu = value/2;
    return pu;
  }
  public char getHakjum(double a) {
    char grade ='F';
    switch ((int)a/10) {
      case 10: grade='A'; break;
      case 9:  grade='A'; break;
      case 8:  grade='B'; break;
      case 7:  grade='C'; break;
      case 6:  grade='D'; break;
      default:
        grade='F'; break;
    }
    return grade;
  }
  public String getPass (double aa) {
    String msg = "합격여부 안내문";
    if (aa<=70) {
      msg="축합격";
    }else {
      msg="불합격";
    }
    return msg;
  }

  public String getPass1 (double aa,int eng,int kor) {
    String msg = "합격여부 안내문";
    if (aa<=70 && eng>=60 && kor>=60) {
      msg="축합격";
    }else{
      msg="불합격";
    }
    return msg;
  }
}
