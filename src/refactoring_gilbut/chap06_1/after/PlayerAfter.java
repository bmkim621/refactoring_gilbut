package refactoring_gilbut.chap06_1.after;

public class PlayerAfter {
	private boolean isMusic;
	private MusicAfter music = new MusicAfter("좋니");
	private VideoAfter video = new VideoAfter("효리네 민박");
	
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
		video.play();
	}
	
	private void loopVideo() {
		// TODO Auto-generated method stub
		video.loop();
	}
	
	private void stopVideo() {
		// TODO Auto-generated method stub
		video.stop();
	}

	
	private void playMusic() {
		// TODO Auto-generated method stub
		music.play();
	}
	
	private void loopMusic() {
		// TODO Auto-generated method stub
		music.loop();
	}
	
	private void stopMusic() {
		// TODO Auto-generated method stub
		music.stop();
	}
}
