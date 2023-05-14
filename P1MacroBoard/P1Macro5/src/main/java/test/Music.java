package test;



import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;
import java.io.*;

public class Music extends Thread{
    Clip clip;
	public Music() {
	
	}
	public void start() {
		
	
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C://git clone//P1MacroBoard//P1MacroBoard//P1Macro4//src//main//java//musicZ//weeknds.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        }
        catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
	
	}
}
