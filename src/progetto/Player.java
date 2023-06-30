package progetto;

import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ElementoMultimediale[] tentativo = new ElementoMultimediale[5];

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < tentativo.length; i++) {
			System.out.println("Scegli il tuo titolo");
			String titolo = scanner.nextLine();
			System.out.println("Scegli la durata");
			String durata = scanner.nextLine();
			int durata1 = Integer.parseInt(durata);
			if (durata1 == 0) {
				System.out.println("Scegli la luminosita per l'immagine");
				String luminosita = scanner.nextLine();
				int luminosita1 = Integer.parseInt(luminosita);
				tentativo[i] = new Immagine(titolo, luminosita1);
			} else if (durata1 < 0) {
				System.out.println("Errore questo oggetto non sarà creato correttamente");
			} else {
				System.out.println("Scegli il volume");
				String volume = scanner.nextLine();
				int volume1 = Integer.parseInt(volume);
				System.out.println("Scegli la luminosita 0 se vuoi un audio, un altro numero se vuoi un video");
				String luminosita = scanner.nextLine();
				int luminosita1 = Integer.parseInt(luminosita);
				if (luminosita1 == 0) {
					tentativo[i] = new Audio(titolo, durata1, volume1);
				} else if (luminosita1 < 0) {
					System.out.println("Errore questo oggetto non sarà creato correttamente");
				} else {
					tentativo[i] = new Video(titolo, durata1, volume1, luminosita1);
				}
			}
		}
		int selezione;

		do {
			System.out.println("Scelgi la traccia con i numero da 1 a 5, 0 per concludere");
			String sel = scanner.nextLine();
			selezione = Integer.parseInt(sel);
			if (selezione < 0 || selezione > 5) {
				System.out.println("Seleziona un numero tra 0 e 5");
				continue;
			} else if (selezione == 0) {
				System.out.println("Hai finito la riproduzione!");
				break;
			}

			ElementoMultimediale traccia = tentativo[selezione - 1];
			if (traccia instanceof Immagine) {
				Immagine immagine = (Immagine) traccia;
				immagine.show();
			} else if (traccia instanceof Audio) {
				Audio audio = (Audio) traccia;
				audio.play();
			} else if (traccia instanceof Video) {
				Video video = (Video) traccia;
				video.play();
			} else {
				System.out.println("L'oggetto è stato creato male");
				}
			} while (selezione != 0);

		}

	}