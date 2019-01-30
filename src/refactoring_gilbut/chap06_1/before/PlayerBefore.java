package refactoring_gilbut.chap06_1.before;

public class PlayerBefore {
	private boolean isMusic;
	private String musicData = "좋니";
	private String videoData = "효리네 민박";
	
	public void setCurrentMedia(boolean isMusic) {
		this.isMusic = isMusic;
	}
	
	public void play() {
		if(isMusic) {
			playMusic();
		} else {
			playVideo();
		}
	}

	public void loop() {
		if(isMusic) {
			loopMusic();
		} else {
			loopVideo();
		}
	}

	public void stop() {
		if(isMusic) {
			stopMusic();
		} else {
			stopVideo();
		}
	}

	private void playVideo() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", videoData, "play");
	}
	
	private void loopVideo() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", videoData, "loop");
	}
	
	private void stopVideo() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", videoData, "stop");
	}

	
	private void playMusic() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", musicData, "play");
	}
	
	private void loopMusic() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", musicData, "loop");
	}
	
	private void stopMusic() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", musicData, "stop");
	}
}
