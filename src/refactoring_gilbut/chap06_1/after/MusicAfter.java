package refactoring_gilbut.chap06_1.after;

public class MusicAfter {
	private String musicData;

	public MusicAfter(String musicData) {
		this.musicData = musicData;
	}

	public String getMusicData() {
		return musicData;
	}

	public void setMusicData(String musicData) {
		this.musicData = musicData;
	}
	
	//¸Þ¼­µå
	public void play() {
		System.out.printf("%s %s%n", musicData, "play");
	}
	
	public void loop() {
		System.out.printf("%s %s%n", musicData, "loop");
	}
	
	public void stop() {
		System.out.printf("%s %s%n", musicData, "stop");
	}
}
