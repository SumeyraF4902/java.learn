package day08.BarısBey;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner sc=new Scanner(System.in);
    private String ad;
    private String no;

    public Student(){

    }

    public Student( String ad, String no) {
        this.ad = ad;
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }
    ArrayList<Student> student= new ArrayList<Student>();
    public void ogrenciKaydet(){

    }
}
