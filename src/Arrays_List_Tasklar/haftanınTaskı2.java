package Arrays_List_Tasklar;

import java.util.Scanner;

public class haftanınTaskı2 {
    public static void main(String[] args) {
         /*  TASK :
		 	Create a method to convert Roman numerals to numbers
		 	Romen rakamlarını sayılara dönüştürmek için bir method create ediniz
		 	Input:
		 		System.out.println(romanNumbers(805));
		   		System.out.println(fromRomans("DCCCV"));
		   	Output: DCCCV   805


		   		M + [C M] + [X L] + V   ---->   1945
		   		The chars in the brackets are in ascending order.
		   		 Parantez içindeki karakterler artan sıradadır (C-100, M-1000) ---> [C M]=900
		*/
        Scanner sc=new Scanner(System.in);
        System.out.println("bir sayı giriniz ");
        int sayi=sc.nextInt();

        System.out.println("lütfen roma rakamları ile bir sayı giyiniz");
        String romaRakamı=sc.next().toUpperCase().trim().replace(" ","");
        fromRomans(romaRakamı);
        romanNumbers(sayi);
    }

    private static void romanNumbers(int sayi) {
        int index=0;
        int []arr={1000,500,100,50,10,5,1};
        while (index<=arr.length-1){
            for (int i=1;i<=(sayi/arr[index]); i++){
    switch (arr[index]){
        case 1000: System.out.println("M");break;
        case 500: System.out.println("D");break;
        case 100: System.out.println("C");break;
        case 50: System.out.println("L");break;
        case 10: System.out.println("X");break;
        case 5: System.out.println("V");break;
        case 1: System.out.println("I");break;
    }
            }
            sayi-=arr[index]*(sayi/arr[index]);
            index++;
        }
    }

    private static void fromRomans(String romaRakamı ) {
        int yil=0;
        for (int i=0;i<=romaRakamı.length()-1; i++){
            switch (romaRakamı.charAt(i)+""){
                case "M":yil+=1000; break;
                case "D":yil+=500; break;
                case "C":yil+=100; break;
                case "L":yil+=50; break;
                case "X":yil+=10; break;
                case "V":yil+=5; break;
                case "I":yil+=1; break;
            }
        }
        System.out.println("roma rakamlarına göre sayı="+yil);
    }
}
