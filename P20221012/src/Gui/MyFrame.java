package Gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		
		setTitle("윈도우 UI");
		setSize(300, 250); //윈도우 사이즈
		
		setLayout(new FlowLayout()); // 배치 관리자
		
		JButton btn = new JButton("확인"); // 버튼 컴포넌트 생성
		JButton btn2 = new JButton("취소"); // 
		btn.addActionListener(new ActionListener() {
			// 확인누르면 확인 되고 취소누르면 취소되고
			// 이벤트가 발생하면 매개값으로 선언되어져있는 인터페이스를 구현해줌 
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인버튼 클릭");
			}
		}); 
		btn2.addActionListener((e) -> { // 람다표현식으로 간단하게 코드 작성 가능
				System.out.println("취소버튼 클릭"); 
				System.exit(0); // 실제로 나가게 해줌
		});
		
		add(btn); // 컨트롤등록.
		add(btn2); 
		
		setVisible(true); // 화면에 출력
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //화면 종료(안하면 콘솔창 빨간박스가 계속 실행중)
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}

}
