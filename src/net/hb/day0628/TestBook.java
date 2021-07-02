package net.hb.day0628;

public class TestBook {
  public int m = 78;

  public static void main(String[] args) {
    char a ='A', b='1', c=90;//c='9'  48~59  65~90   97~122 (아스키코드)
    System.out.println(a+"\t"+b+"\t"+ c);
    System.out.println();

    int x = a;
    int y = b;
    int z = c;
    System.out.println(x+"\t"+y+"\t"+ z);
    System.out.println();
  }//main end
  public void note() {

    int m = 24;
    System.out.println("지역변수 책가격:" +m);
    System.out.println("전역변수 책가격:" +this.m );
  }//end
}
