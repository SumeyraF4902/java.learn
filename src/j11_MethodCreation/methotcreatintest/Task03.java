package J11_MethodCreation.methotcreatintest;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

int y=7;

		int x = (y > 7) ? (y<10 ? 4+y : 3*y) : (y>10 ? 2*5 : 3+y);

		System.out.println(x);
		int yil = 2022;

		boolean artik = false;

		if(yil % 4 == 0){

			if( yil % 100 == 0)

			{

				if ( yil % 400 == 0)

					artik = true;

				else

					artik = false;

			} else

				artik = true;

		}

		else

			artik = false;



		if(artik)

			System.out.println(yil + " artık yıldır.");

		else

			System.out.println(yil + " artık yıl değildir.");
		char  krk = 'B';

		switch (krk) {

			case 'a':

			case 'A':

				System.out.print(krk);

				break;

			case 'b':

			case 'B':

				System.out.print(krk);

				break;

			case 'c':

			case 'C':

				System.out.print(krk);

				break;

		}





	}

}
