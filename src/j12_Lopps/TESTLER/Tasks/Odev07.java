package j12_Lopps.TESTLER.Tasks;

public class Odev07 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15



        for (int i = 1; i <= 5; i++) {
            int num = i;
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print(num + " ");
                    num += 4 - j;

                }

            }
            System.out.println();


        }
    }




    }
