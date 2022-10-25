package Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComponentExam extends JFrame {

	public ComponentExam() {
		
		setTitle("라벨 예제");
		setSize(new Dimension(300, 350));
		
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("Color Label");
		label1.setFont(new Font("Arial", Font.ITALIC, 20));
		label1.setForeground(Color.yellow); // Font 색 설정
		label1.setText("Yellow Font"); //변경하고 싶은 값을 매개값으로 
		
		
		JLabel label2 = new JLabel("Fone Label");
		label2.setFont(new Font("Arial", Font.BOLD, 15)); // 글꼴설정
		label2.setForeground(Color.green);
		
		JLabel label3 = new JLabel();
		label3.setIcon(new ImageIcon("c:/Temp/cameraman.png")); // 라벨에 이미지 삽입
		
//		ImageIcon icon = new ImageIcon("c:/Temp/cameraman.png");
//		label3.setIcon(icon);
//		label3.setPreferredSize(new Dimension(180, 150)); // 라벨 이미지 크기 조절
		
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		
		add(panel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		new ComponentExam();
	}
}
