package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {
    public static void main(String[] args) {
        try {
            FileInputStream fis =new FileInputStream("C:\\Users\\Musin\\IdeaProjects\\java.learn\\src\\j29_Exceptions\\ebikGabıK");
            int k;

                try {//ulaşılan dosyadaki dataları oku
                    if (!((k = fis.read()) != -1)){// hiçlik karakter bulana kadar oku yani en son harfe kadar oku demek
                        System.out.print((char)k);}
                    System.out.println("Agam içteki try block'tan selamlar :)");
                } catch (IOException e) {// dosyaya ulaşılır ama dosya okunamıyorsa çalışır
                    System.out.println("Agam dosya okunamıyor");
                    System.out.println("Agam içteki catch block'tan selamlar :)");
                }
                System.out.println("Agam dıştaki try block'tan selamlar :)");


        } catch (FileNotFoundException e) {//dosyaya erişemiyorsa, ulaşılamıyorsa bu catch çalışır
            System.out.println("Agam dediğin dosyaya ulaşılamıyor...");
            System.out.println("Agam dıştaki catch block'tan selamlar :)");
        }
        System.out.println("Agam sorun handle edildi DEVAMKEE :)");
    }
}
