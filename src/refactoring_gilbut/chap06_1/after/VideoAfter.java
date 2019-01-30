package refactoring_gilbut.chap06_1.after;

public class VideoAfter {
	private String videoData;

	public VideoAfter(String videoData) {
		this.videoData = videoData;
	}

	public String getVideoData() {
		return videoData;
	}

	public void setVideoData(String videoData) {
		this.videoData = videoData;
	}
	
	//¸Þ¼­µå
	public void play() {
		System.out.printf("%s %s%n", videoData, "play");
	}
	
	public void loop() {
		System.out.printf("%s %s%n", videoData, "loop");
	}
	
	public void stop() {
		System.out.printf("%s %s%n", videoData, "stop");
	}
}
