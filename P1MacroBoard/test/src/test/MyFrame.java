package test;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyFrame extends JFrame {

    private Clip clip;
    private JButton stopButton;
    public MyFrame() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 배경음악을 로드하고 재생하기
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C://git clone//P1MacroBoard//P1MacroBoard//test//src//music//weeknds.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
        stopButton = new JButton("Stop");
        stopButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				clip.stop();
				
			}

        });

        // 패널에 버튼 추가하기
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(stopButton);

        // 프레임에 패널 추가하기
        add(buttonPanel, BorderLayout.SOUTH);
        setVisible(true);
    }

    

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
    }
}