package j12_Lopps;

public class C01_ForLoop {
    public static void main(String[] args) {
        //41 kere maaşallah
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        System.out.println("maaşallah");
        /*
        loop-->döngü tekrarlana aksiyonlar için kullanılan code blok larıdır.
         */
           // baş.        bitiş..      değişim
        for (int i=1;      i<41;          i++) {//döngü boyunca tekrarlanacak action
            System.out.println(i + "maaşallah");//1. maaşallah...41.    maaşallah
        }
        System.out.println("selam javacanlar");//döngü dışı 1 kez run olur
        // Task--> iki basamaklı tek sayıları yan yana  print eden  code create ediniz
        for(int i=11; i<=99; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("*****");
        for (int i=10; i<100; i++)
            if (i%2==1){
                System.out.print(i+" ");
            }
//Task
        for (int i=0; i>10;i++){//şart true olmazsa for body run olmaz,kod kırılarak sıradaki satırdan devam eder
            // ör/1 sıfırdan büyük ama 10 dan büyük değil
            System.out.println("selam javacan");
        }

        System.out.println("ağam bu metni okuduysan yukarıdaki döngü çalışmadı");
       /* for (int i=0; i>=0; i++){// sürekli arttığı için sürekli devam eder bu kodun sonu gelmez durmadan çalışır
          System.out.println(i);
}*/




        }
}
