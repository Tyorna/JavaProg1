package progetto;

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

	}

}
