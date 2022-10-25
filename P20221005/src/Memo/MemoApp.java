package Memo;

//import java.util.Scanner;
//
//public class MemoApp {
//	public static void main(String[] args) {
//		MemoManager manager = MemoManager.getInstance();
//		Scanner scn = new Scanner(System.in);
//		
//		while(true) {
//			try {
//			System.out.println("1.등록 2.검색 3.삭제 4.종료");
//			System.out.println("선택 >> ");
//			
//			int menu =Integer.parseInt(scn.nextLine());
//			
//			if(menu < Menu.INSERT || menu > Menu.EXIT) {
//				throw new MenuException(menu);
//			}
//			
//				switch(menu) {
//				case Menu.INSERT:
//				// 입력작업.
//					manager.inputData();
//					break;
//				case Menu.SEARCH:
//					manager.searchData();
//				// 검색작업.
//					break;
//				case Menu.DELETE:
//					manager.deleteData();
//				// 삭제작업.
//					break;
//				case Menu.EXIT:
//					manager.storeToFile();
//				// 새로운 파일저장.
//					throw new ExitException();
//				}
//			} catch(MenuException e) {
//				e.showErrMessage();
//			} catch(ExitException e) {
//				break;
//			}
//		}
//		System.out.println("프로그램 종료");
//		scn.close();
//	}
//}
