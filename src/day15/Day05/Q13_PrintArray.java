package day15.Day05;

public class Q13_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element
    public static void main(String[] args) {
        String arabalar[]={"Honda", "Toyota", "Tesla","Fiat","Volvo"};
        printElement(arabalar);
        String renkler[]={"Mavi","Sari","Kirmizi","Yesil","Beyaz","Mor"};
        printElement(renkler);
    }

    private static void printElement(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
