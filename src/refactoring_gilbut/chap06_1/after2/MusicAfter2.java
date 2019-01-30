package refactoring_gilbut.chap06_1.after2;

public class MusicAfter2 extends Media {
	
	public MusicAfter2(String data) {
		super(data);	//ºÎ¸ðÀÎ Media
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "stop");
	}

}
