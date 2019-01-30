package refactoring_gilbut.chap06_1.after2;

public abstract class Media {
	//���� �޼����� play, loop, stop
	protected String data;

	public Media(String data) {
		this.data = data;
	}
	
	public abstract void play();
	
	public abstract void loop();
	
	public abstract void stop();
}
