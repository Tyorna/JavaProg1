package progetto;

public class Video extends ElementoMultimediale implements Volume, Luminosita {

	private int volume;
	private int durata;
	private int luminosita;

	public Video(String title, int durata, int volume, int luminosita) {
		this.title = title;
		this.tipo = Type.VIDEO;
		this.durata = durata;
		this.volume = volume;
		this.luminosita = luminosita;
	}

	public void alzaVolume() {
		volume++;
	};

	public void abbassaVolume() {
		if (volume <= 0) {
			volume = 0;
		}
		volume--;
	};

	public void alzaLuminosita() {
		luminosita++;
	};

	public void abbassaLuminosita() {
		if (luminosita <= 0) {
			luminosita = 0;
		}
		luminosita--;
	};

	public void play() {
		System.out.println("Video");
		for (int i = durata; i >= 0; i--) {
			if (volume > 0) {
			System.out.println(title + ": " + "!".repeat(volume) + " *".repeat(luminosita));
			} else {
				System.out.println(title + ": " + "Muto");
			}
		}
	}
}
