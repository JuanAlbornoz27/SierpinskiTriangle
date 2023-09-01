package co.edu.uptc.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private Triangle trianglePanel;
	public MyFrame() {
		super("Triangulo de Sierpinski");
		initComponents();
		trianglePanel =new  Triangle();
		add(trianglePanel);

	}
	private void initComponents() {
		setSize(new Dimension(650,550));
		setLocationRelativeTo(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);	
		}


	public void setlevel1(int level) {
		trianglePanel.setlevel1(level); 
	}
    }

