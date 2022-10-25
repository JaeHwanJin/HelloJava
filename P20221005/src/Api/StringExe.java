package Api;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StringExe {
	public static void main(String[] args) {
		
		String Birth = "src/co/edu/api/Birth.txt";
		File file = new File(Birth);

		Scanner scn = null;
		try {
			scn = new Scanner(file);
			while (true) {
				String str = scn.nextLine();
				char sex = str.charAt(7);
				switch (sex) {

				case '1':
				case '3':
					System.out.println("남자입니다.");
					break;
					
				case '2':
				case '4':
					System.out.println("여자입니다.");
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchElementException e) {

		}
		String fileName = "src/co/edu/api/Data";
		File filee = new File(fileName);

		String searchKey = "자바";
		searchKey = searchKey.replace(" ", " ");
		
		Scanner scne = null;
		try {
			scne = new Scanner(filee);
			while(true) {
				String str = scn.nextLine();
				if(str == null)
					break;
				if(str.indexOf(searchKey) != -1)
				
				System.out.println(str);	
				
				// 남자입니다. 여자입니다.
			}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(NoSuchElementException e) {
			
		}
		
		System.out.println("end of prog");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
