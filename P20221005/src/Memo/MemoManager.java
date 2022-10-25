package Memo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoManager {
	
	
	List<Memo> memoStorage = new ArrayList<>(); //
	File file = new File("c:/Temp/memobook.txt");
	Scanner scn = new Scanner(System.in);
	
	// 싱글톤
	private static MemoManager instance = new MemoManager();
	private MemoManager() {
	}
	public static MemoManager getInstance() {
		return instance;
	}
	
	// 추가
	public void inputData() {
		System.out.print("번호 > ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("날짜 > ");
		String date = scn.nextLine();
		System.out.println("내용 > ");
		String content = scn.nextLine();
		
		memoStorage.add(new Memo(no, date, content));
	}
	
	// 조회(날짜)
	public void searchData() {
		System.out.println("날짜 > ");
		String sDate = scn.nextLine();
		boolean exists = false;
		for(int i = 0; i < memoStorage.size(); i++) {
			if(sDate.equals(memoStorage.get(i).getDate())){
				System.out.println(memoStorage.get(i).toString());
				exists = true;
			}
		}
		if(!exists) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}
	
	// 번호를 입력하면 한건 삭제
	public void deleteData() {
		System.out.println("삭제할 번호 입력 >> ");
		int no = Integer.parseInt(scn.nextLine());
		
		for(int i = 0; i < memoStorage.size(); i++) {
			if(memoStorage != null && memoStorage.get(i).getNo() == no) {
				memoStorage.remove(i);
				
			}
		}
		
		
	}
	
	public void readFromFile() {
		try(FileInputStream fis = new FileInputStream(file); 
			ObjectInputStream ois = new ObjectInputStream(fis);
			) {
			
			memoStorage = (List<Memo>) ois.readObject();
			
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	
	public void storeToFile() {
		try( FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos =new ObjectOutputStream(fos);
		   ){
			
			oos.writeObject(memoStorage); // 파일 저장
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
}
