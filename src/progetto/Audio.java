package progetto;

public class Audio extends ElementoMultimediale implements Volume {

	private int volume;
	private int durata;

	public Audio(String title, int durata, int volume) {
		this.title = title;
		this.tipo = Type.AUDIO;
		this.durata = durata;
		this.volume = volume;
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

	public void play() {
		System.out.println("Audio");
		for (int i = 0; i < durata; i++) {
			if (volume > 0) {
			System.out.println(title + ": " + "!".repeat(volume));
			} else {
				System.out.println(title + ": " + "Muto");
			}
		}
	}

}
