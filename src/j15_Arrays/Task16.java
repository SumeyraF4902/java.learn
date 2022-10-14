package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
        //task--< sayı arry indeki son elemanlarının çarpımını print eden code create ediniz
        int sayi[][]={{1,2,3,},{9,8},{24,0,4}};
        int carpım=1;
        for (int i = 0; i <sayi.length; i++) {//kat kontrolü
            carpım*=sayi[i][sayi[i].length-1];

            }
        System.out.println(carpım);//96-->3*8*4
        }

    }

