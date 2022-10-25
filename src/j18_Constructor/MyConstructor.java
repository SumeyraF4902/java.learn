package j18_Constructor;

public class MyConstructor {
    int x=3;//9 adım x artık 4 oldu   14. adım --> x=7 oldu   17. adım-->7-4=3 oluur
    int y=5;//12 adım--> y=3 oldu

    public  MyConstructor () {//7 adım
        x+=1;// 8 adım.// İNS VARİABLE +1 UPDATE EDİLDİ
        System.out.println("-x"+x);//10 adım-->  -x4 oldu
    }
    public  MyConstructor (int i){//5 adım
        this();//6 adım parametresiz cons call et.
        this.y=i;// 11 adım--> i=3 olduğu için y=3 olur// CON.PARAMETRESİ İ İNS. VARİABLE Y YE ATANDI.YANİ OBJE ATANDI.
        x+=y;//13 adım -->4+3=7 oldu   //İNST. Y DEĞERİ İNST X DEĞERİNE ATANDI.
        System.out.println("-x"+x);//15 adım --> -x7 olur

    }
    public  MyConstructor (int i,int i2){//3
        this(3);// i parametreli cons call eder.//4.adım// İNT P'Lİ CONS. PARAMETRE 3 ATANARAK CALL EDİLDİ.
        this.x-=4;//16.adım-->7-4=3   //İNST. X VARİABLE -4 UPDATE EDİLDİ.
        System.out.println("-x"+x);//18 adım--> -x3 oldu .. BİİİTTTİ
    }
    public static void main(String[] args) {//çalışma sırası--1
          MyConstructor  mc1=new MyConstructor(4,3);//2   // 2 İNT PARAMETRE 4 VE 3 ATANARAK CONS CALL EDİLDİ.


        }
    }



