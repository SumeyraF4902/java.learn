package day15.Day04;

public class Q07_ConvertToNegativeFormString {
    public static void main(String[] args) {
        /*
        girilen array i string cumleye donusturun cümle içinden herhangibir yeri "gel " ile distir
         */ String str="";
        String array[]={"A","g","a","c","l","a","r","ı","k","e","s","m","e","y","i","n"};
         for(int i=0;i<array.length;i++) {// veya for(String w:array)       str+=w;// }
             str+=array[i];
         }
        System.out.println(str);
         String degisim=str.replace("kes","gel");
        System.out.println(degisim);

    }
}
