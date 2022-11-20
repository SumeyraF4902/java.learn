package j35_Collection.C02_Set;



import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
/*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
        HashSet<String> HashSet=new HashSet<String>(List.of("banana" , "strawberry" , "kiwi" , "pineapple"));
        String s1 = "banana";
        String s2= "peach";
        System.out.println("changeSet(HashSet,s1,s2) = " + changeSet(HashSet, s1, s2));

    }

    private static HashSet<String> changeSet(HashSet<String>HashSet,String s1, String s2) {


        if(HashSet.contains(s1)){
            HashSet.remove(s1);
        HashSet.add(s2);

        }
        return HashSet;
        }

}
