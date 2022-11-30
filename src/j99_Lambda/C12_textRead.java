package j99_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class C12_textRead {
    public static void main(String[] args) throws IOException {
        //TASK01 --> sumeyra dosyasını okuyunuz( consola print ediniz)
        Path smyra = Path.of("src/j99_Lambda/sumeyra");//erişilebilecek dosyanın pathi tanımlandı.
        // sumeyra s-dosyasının üzeüne git sağa tıkla copy path /reference tıkla oradaki adreslerin birinin üzerine gel tıkla (kopyalanmış olur)
        // sonra yapıştırmak istediğin "" arasına paste et.(yapıştır)
        Stream<String> akıs = Files.lines(smyra);
        Stream<String> akıs1 = Files.lines(Path.of("src/j99_Lambda/sumeyra"));// böylede yazdırabiliriz
        akıs.//erişimi verilen dosyadali line(satırlar) akışa alındı.
                forEach(System.out::println);//akıştaki satırlar (lines) print edildi.


        // Task 02 -->  sumeyra dosyasını büyük harflerle  okuyunuz( consola büyük harfle print ediniz)
        // değişim vardır map kullanırız
        System.out.println("\n TASK 02--> sumeyra dosyasını büyük harflerle  okuyunuz( consola büyük harfle print ediniz)");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra" )).//erişim verilen path deki satırlar akışa alındı.
        map(String::toUpperCase).//akıştaki satırların stringleri büyük harf update edildi
                forEach(System.out::println);

        //Task 03-->sumeyra dosyasını ilk satırını kucuk  harflerle  print ediniz( consola büyük harfle print ediniz)-->basarı gayrete asıktır  !!
        System.out.println("\n TASK 03--> sumeyra dosyasını ilk satırını kucuk  harflerle  print ediniz");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra")).
                map(String::toLowerCase).// akıştaki  satırların Stringleri küçük harf update edildi
                limit(1).//akıştaki ilk eleman alındı(ilk satır)
                // veya findFirst(); kullanılabilir akıştaki ilk satır alındı
                forEach(System.out::println);

        // TASK 04--> sumeyra dosyasının "basarı kelimesinin kac satırda gectigini print ediniz   -->2
        System.out.println("\n TASK 04--> sumeyra dosyasının \"basarı kelimesinin kac satırda gectigini print ediniz");
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/sumeyra")).
                map(String::toLowerCase).// akıştaki  satırların Stringleri küçük harf update edildi
                        filter(t -> t.contains("basarı")).// akıştaki elemanlardan basarı içerenler secildi
                        count());//akıştaki elemanlar saydırıldı---2 bulundu

        //TASK 05 -->sumeyra.txt dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println("\nTASK 05 -->sumeyra.txt dosyasindaki farkli kelimeleri  print ediniz..");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).
                flatMap(Arrays::stream).distinct().forEach(t-> System.out.print(t+ " "));
        //TASK 06 --> sumeyra.txt dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println("\nTASK 06 --> sumeyra.txt dosyasindaki tum kelimeleri natural order  print ediniz..");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).
                flatMap(Arrays::stream).sorted().forEach(t-> System.out.print(t+" "));
        //TASK 07 --> sumeyra.txt dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println("\n   TASK 07 -->");
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("basarı")).count());
        //TASK 08 --> sumeyra.txt dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.
        System.out.println("\n  TASK 08 -->");
        System.out.println(Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).count());
        //TASK 09 --> sumeyra.txt dosyasinda icinde "a" harfi gecen kelimeleri print ediniz.
        System.out.println("\nTASK 09 -->");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).
                flatMap(Arrays::stream).
                filter(t -> t.contains("a")).forEach(System.out::print);
        //TASK 10 --> sumeyra.txt dosyasinda kac /farklı harf kullanildigini print ediniz.
        System.out.println("\nTASK 10 -->");
        System.out.print(Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split("")).flatMap(Arrays::stream).distinct().count());
        //TASK 11 --> sumeyra.txt dosyasinda kac farkli kelime kullanildigini print ediniz.
        System.out.println("\nTASK 11 -->");
        System.out.print(Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(t-> t.split(" ")).flatMap(Arrays::stream).distinct().count());
        //TASK 12 --> sumeyra.txt dosyasinda  farkli kelimeleri print ediniz
        System.out.println("\nTASK 12 -->");
        Files.lines(Paths.get("src/j99_Lambda/sumeyra")).map(String::toLowerCase).map(t-> t.split(" ")).flatMap(Arrays::stream).distinct().forEach(t-> System.out.print(t +" "));
    }
}
