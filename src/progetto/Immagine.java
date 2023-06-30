package progetto;

public class Immagine extends ElementoMultimediale implements Luminosita {
	
	private int luminosita;

	public Immagine(String title, int luminosita) {
		this.title = title;
		this.tipo = Type.IMMAGINE;
		this.luminosita = luminosita;
	}

	public void alzaLuminosita() {
		luminosita++;
	};

	public void abbassaLuminosita() {
		if (luminosita <= 0) {
			luminosita = 0;
		}
		luminosita--;
	};

	public void show() {
		System.out.println("Immagine");
			if (luminosita > 0) {
				System.out.println(title + ": " + "*".repeat(luminosita));
			} else {
				System.out.println(title + ": " + "Immagine scura");
			}
	}
}
