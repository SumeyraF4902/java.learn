package day14;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Q06_AddedOrNotTask { public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(3);
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);
    numbers.add(5);
    numbers.add(3);
    int tekrarliElemanSayisi = 0;
    Set<Integer> uniqeNumbers = new HashSet<>();
    List<Integer> duplicatedNumbers = new ArrayList<>();
    for (int i = 0; i < numbers.size(); i++) {
        boolean ekliMi = uniqeNumbers.add(numbers.get(i)); //uniqeNumbersda olma durumu
        if (!ekliMi) {
            tekrarliElemanSayisi++;
            duplicatedNumbers.add(numbers.get(i));
        }
    }
    System.out.println("tekrarliElemanSayisi = " + tekrarliElemanSayisi);
    System.out.println("duplicatedNumbers = " + duplicatedNumbers);
}
}
