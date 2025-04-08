package Collections;

public class Q3 {

	public static void main(String[] args) {
		MusicLibrary m1 = new MusicLibrary();
		m1.addSong(new Song("phir mohabat","arijith"));
		m1.addSong(new Song("ae dil mushkil","arijith"));
		m1.addSong(new Song("zalima","arijith"));
		m1.dispayLibrary();
		m1.removeSong("zalima");
		m1.playRandomSong();
		m1.playRandomSong();
		m1.playRandomSong();
		
	}

}
