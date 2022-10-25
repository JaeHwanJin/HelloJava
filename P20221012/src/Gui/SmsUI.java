package Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SmsUI extends JFrame{
	

	Dimension lbl1 = new Dimension(65, 15);
	Dimension lbl2 = new Dimension(40, 20);

	JPanel center, bottom; // 컴포넌트를 모아두기 위한 컨테이너 생성
	JLabel fromLbl, toLbl, subjectLbl, contentLbl; // 레이블 생성
	JTextField fromTxt, toTxt, subjectTxt; // 텍스트필드 생성
	JTextArea contentTxt;
	JButton send, cancel;

	SmsSend app = new SmsSend();

	public SmsUI() {
		setTitle("문자 보내기 UI");
		setSize(340, 300);
		setLayout(new BorderLayout());

		// panel
		center = new JPanel();
		bottom = new JPanel();

		// label..
		toLbl = new JLabel("보내는 사람");
		fromLbl = new JLabel("받는 사람");
		contentLbl = new JLabel("내용");
		toLbl.setPreferredSize(lbl1);
		fromLbl.setPreferredSize(lbl1);
		contentLbl.setPreferredSize(lbl2);

		// textfield

		fromTxt = new JTextField(22);
		toTxt = new JTextField(22);
		contentTxt = new JTextArea(20, 25);

		// button

		send = new JButton("보내기");
		send.addActionListener(new MyActionListener()); // ActionListerner 인터페이스
		cancel = new JButton("취소");
		cancel.addActionListener(new MyActionListener());

		// container setting

		center.add(toLbl);
		center.add(toTxt);
		center.add(fromLbl);
		center.add(fromTxt);
		center.add(contentLbl);
		center.add(contentTxt);

		// 컨테이너에 컴포넌트 배치
		bottom.add(send);
		bottom.add(cancel);

		// 윈도우에 컨테이너 배치
		add("Center", center);
		add("South", bottom);

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

	}

//	 기능을 실행하는 구현객체
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			Object src = e.getSource();
			if(src == send) {
				System.out.println("보내기 버튼 actionPerformed.");	
				String from = fromTxt.getText();
				String to = toTxt.getText();
				String content = contentTxt.getText();
				
				if(app.sendSms(from, to, content).equals("Success")){
//					System.out.println("이메일 전송 성공");
					JOptionPane.showMessageDialog(null, "전송 성공", "전송결과"
												  , JOptionPane.DEFAULT_OPTION);
					fromTxt.setText("");
					toTxt.setText("");
					contentTxt.setText("");
					
					// 컨솔에 "성공" 출력 
				}else {
//					System.out.println("이메일 전송 실패");
					JOptionPane.showMessageDialog(null, "전송 실패", "에러"
							  , JOptionPane.WARNING_MESSAGE);
				}
						
						
						
				
			} else if(src == cancel) {
				System.out.println("취소 버튼 actionPerformed.");
			}
			
			
			
		}

	}

	public static void main(String[] args) {
		new SmsUI();
	}

}
