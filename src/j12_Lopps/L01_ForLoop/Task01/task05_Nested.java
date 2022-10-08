package j12_Lopps.L01_ForLoop.Task01;

public class task05_Nested {
    public static void main(String[] args) {
        //task -->    şekli print eden code create ediniz
        /*
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
şekli print eden code create ediniz
 */
        for (int apt=1; apt<=6;apt++){//dumy--> hayalet komut : işlevi olmayan satır atlatan komut
            for (int daire=1; daire < 6; daire++){
                System.out.print("#");
            }
            System.out.println();
    }
        for (int apt = 1; apt <= 6; apt++) {//dış döngü
            for (int daire = 1; daire < 6; daire++) {
                System.out.print("# ");
            }
            System.out.println();//dumy->hayalet komut:işlevi olmayan satır atlatan komut
        }


    }}