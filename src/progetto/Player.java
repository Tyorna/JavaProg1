package progetto;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Audio audio1 = new Audio("Traccia1", 2, 2);
		audio1.alzaVolume();
		audio1.play();

		Video video1 = new Video("Video1", 6, 3, 2);
		video1.alzaVolume();
		video1.alzaLuminosita();
		video1.play();

		Immagine img1 = new Immagine("Img1", 2);
		img1.abbassaLuminosita();
		img1.show();
		Immagine[] maledetto = new Immagine[5];
		maledetto[0] = new Immagine("Img1", 2);
		prova();
	}

	public static void prova() {
			Scanner playlist = new Scanner(System.in);
			System.out.println("Inserisci quale traccia far partire, da 1 a 5, altrimenti scrivi 0 per finire");
			String inizio = playlist.nextLine();
			riproduci(Integer.parseInt(inizio));
			playlist.close();
		}

		public static void riproduci(int num) {
			switch (num) {
			case 0: {
				System.out.println("Hai finito di riprodurre!");
				break;
	}
			case 1: {
				System.out.println("Hai scelto la prima traccia");
				prova();
				break;
			}
			case 2: {
				System.out.println("Hai scelto la seconda traccia");
				prova();
				break;
		}
			case 3: {
				System.out.println("Hai scelto la terza tracciae");
				prova();
				break;
			}
			case 4: {
				System.out.println("Hai scelto la quarta tracciae");
				prova();
				break;
			}
			case 5: {
				System.out.println("Hai scelto la quinta tracciae");
				prova();
				break;
			}
			default:
				System.out.println("Errore, traccia non riconosciuta");
				prova();
			}
		}

	}