package day10_MahtRandom.random;

public class Yıldız {
    public static void main(String[] args) {
        /*


             * 0/4    yıldız 4 indexte oluşmuş      0--> kat / 4 daire
           * * 1/3    yıldız 3 ü indexte oluşmaya başlamış   1--> kat / 3 daire
         * * * 2/2    yıldız 2 ü indexte oluşmaya başlamış   2--> kat / 2 daire
       * * * * 3/1    yıldız 1 ü indexte oluşmaya başlamış    3--> kat / 3 daire
     * * * * * 4/0    yıldız 0 ü indexte oluşmaya başlamış   4--> kat /0 daire
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j <= 4) // Mantık i+j >=4    eğer <= dersek
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }// if (i + j <= 4) // Mantık i+j >=4    eğer <= dersek aşağıdaki gibi oluyor
        /*
         *****
         ****
         ***
         **
         *
         */




    }
}
