package Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ComponentExam2 extends JFrame {

	public ComponentExam2() {
		
		setTitle("입력필드 UI");
		setSize(350, 150);
		Dimension lblDim = new Dimension(60, 16);
		
		setLayout(new BorderLayout());
		
		JPanel center = new JPanel(new FlowLayout());
		JPanel bottom = new JPanel();
		
		
		JLabel idLbl = new JLabel("id");
		idLbl.setPreferredSize(lblDim);
		JLabel pwLbl = new JLabel("pw");
		pwLbl.setPreferredSize(lblDim);

		JTextField idTxt = new JTextField(23); // 텍스트삽입(텍스트가 가지는 길이)
		JTextField pwTxt = new JPasswordField(23); // 비밀번호 처럼 안보임
		
		center.add(idLbl);
		center.add(idTxt);
		center.add(pwLbl);
		center.add(pwTxt);
		
		JButton btn = new JButton("확인");
		JButton btn2 = new JButton("취소");

		bottom.add(btn);
		bottom.add(btn2);
		
		add("Center", center);
		add("South", bottom);
				
				
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		
		new ComponentExam2();
		
	}
}
