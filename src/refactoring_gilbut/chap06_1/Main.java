package refactoring_gilbut.chap06_1;

import refactoring_gilbut.chap06_1.after.PlayerAfter;
import refactoring_gilbut.chap06_1.after2.Media;
import refactoring_gilbut.chap06_1.after2.MusicAfter2;
import refactoring_gilbut.chap06_1.after2.PlayerAfter2;
import refactoring_gilbut.chap06_1.after2.VideoAfter2;
import refactoring_gilbut.chap06_1.before.PlayerBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		after();
		after2();
	}


	//After2
	private static void after2() {
		Media music = new MusicAfter2("좋니");
		Media video = new VideoAfter2("효리네 민박");
		
		PlayerAfter2 musicPlayer = new PlayerAfter2();
		musicPlayer.setMedia(music);
		
		PlayerAfter2 videoPlayer = new PlayerAfter2();
		videoPlayer.setMedia(video);
		
		System.out.println("----------------");
		play(musicPlayer);
		System.out.println("----------------");
		play(videoPlayer);
		System.out.println("----------------");
	}

	
	private static void play(PlayerAfter2 player) {
		// TODO Auto-generated method stub
		player.play();
		player.loop();
		player.stop();
	}


	//After
	private static void after() {
		PlayerAfter musicPlayer = new PlayerAfter();
		musicPlayer.setCurrentMedia(true);	//true => Music
		
		PlayerAfter videoPlayer = new PlayerAfter();
		videoPlayer.setCurrentMedia(false);	//false => Video
		
		System.out.println("----------------");
		play(musicPlayer);
		System.out.println("----------------");
		play(videoPlayer);
		System.out.println("----------------");
	}

	
	private static void play(PlayerAfter player) {
		// TODO Auto-generated method stub
		player.play();
		player.loop();
		player.stop();
	}


	//Before
	private static void before() {
		PlayerBefore musicPlayer = new PlayerBefore();
		musicPlayer.setCurrentMedia(true);	//true => Music
		
		PlayerBefore videoPlayer = new PlayerBefore();
		videoPlayer.setCurrentMedia(false);	//false => Video
		
		play(musicPlayer);
		System.out.println("----------------");
		play(videoPlayer);
	}
	
	private static void play(PlayerBefore player) {
		player.play();
		player.loop();
		player.stop();
	}

}
