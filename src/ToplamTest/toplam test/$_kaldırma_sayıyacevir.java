public class $_kaldırma_sayıyacevir {

    // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
    // String  str 1= "$13.99"
    // String str 2= "$10.55"
    // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

     /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey  */
     public static void main(String[] args) {
         String  str="$13.99";
         String str2="$10.55";
         str=str.replaceAll("\\D","");
         str2=str2.replaceAll("\\D","");
         double a=Double.parseDouble(str);
         double b=Double.parseDouble(str2);
         System.out.println("$"+(a+b)/100);
     }

}
