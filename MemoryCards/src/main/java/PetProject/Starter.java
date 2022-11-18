package PetProject;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Starter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 70);
        frame.setResizable(false);

        JButton playerButton = new JButton("Play");
        playerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                QuizCardPlayer body = new QuizCardPlayer();
                body.go();	
            }
        });
        JButton builderButton = new JButton("Build");
        builderButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                QuizCardBuilder builder = new QuizCardBuilder();
		        builder.go();
            }
        });

        panel.add(playerButton);
        panel.add(builderButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
