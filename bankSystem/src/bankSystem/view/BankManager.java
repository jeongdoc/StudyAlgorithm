package bankSystem.view;

import java.text.DecimalFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import bankSystem.model.vo.Bank;
import bankSystem.controller.*;

public class BankManager {
	private Bank bStart = new Bank();
	private SaveAccount save = new SaveAccount();
	
	private Scanner sc = new Scanner(System.in);
	private static int bNum = 0; //계좌관리 자동부여
	private static int bNum2 = 0; // 고유번호 자동부여
	private static final String n = "KHbank-";
	
	public void mainMenu() {
		boolean start = true;
		while(start) {
			System.out.println("====== 통장 개설 시스템 ======");
			System.out.println("1. 새 계좌 생성 "
							 + "\n2. 전체 계좌 조회"
							 + "\n3. 특정 계좌 조회"
							 + "\n4. 입금"
							 + "\n5. 출금"
							 + "\n6. 계좌이체"
							 + "\n7. 프로그램 종료");
			
			System.out.print("\n메뉴를 선택하세요 : ");
			int chooseMenu = sc.nextInt();
			
			switch(chooseMenu) {
			case 1 : bankInsert(); 		break; //계좌개설
			case 2 : bankAllPrint(); 	break; //전체조회
			case 3 : bankSearch(); 		break; //부분조회
			case 4 : bankDeposit(); 	break; //입금
			case 5 : bankWithdrawal(); 	break; //출금
			case 6 : bankAccTransfer(); break; //계좌이체
			case 7 : start = false; 	break;
				default : System.out.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	public void bankInsert() {
		//계좌번호 자동할당
		String account = n + String.format(new DecimalFormat("00000").format(++bNum));	
		
		
		System.out.print("고객이름 : ");
		String name = sc.next();
		
		System.out.print("첫 입금액 : ");
		int pr = sc.nextInt();
		
		System.out.print("성별 : ");
		char gd = sc.next().charAt(0);
		
		System.out.print("나이 : ");
		int ag = sc.nextInt();
		
		Date d = new Date();
		
		Bank bank = new Bank(++bNum2, name, gd, ag, account, pr, d);
		
		save.saveAcc(bank);
	}
	
	public void bankSearch () {
		// 통장 검색 조회
		//SaveAccount sa = new SaveAccount();
		System.out.print("검색할 예금주명 : ");
		String cName = sc.next();
		//아래의 코드가 없으면 전체 파일에서 해당 고객의 정보만 출력함.
		System.out.print("검색할 파일명 : ");
		String conName = sc.next();
		Properties p = new SaveAccount().bankSearch(conName);
		//p.list(System.out);
		//자꾸 뒤에 ... 나와서 짜증남 그냥 출력함.
		//개별 출력하는 방법은 두 가지. 전체목록에서 조회 or 해당 고객의 파일 불러오기
		for(Map.Entry<Object, Object> o : p.entrySet()) {
			String value = (String)o.getValue();
			if(value.contains(cName)) {
				System.out.println(o.getKey() + " " + o.getValue());
			}
		}
	}
	
	public void bankAllPrint() {
		// 전체 통장정보 조회
		System.out.println("=== 계좌 전체 목록 ===");
		//SaveAccount sa = new SaveAccount();
		Properties p = new SaveAccount().allPrint();
		//p.list(System.out);
		for(Map.Entry<Object, Object> o : p.entrySet()) {
			System.out.println(o.getKey() + " " + o.getValue() + "\n");
		}
	
	}
	
	public void bankDeposit() {
		//입금
		System.out.print("입금 금액 : ");
		int money = sc.nextInt();
		
		System.out.print("입금고객 고유번호 : ");
		//String absoluteKey = n + sc.next(); 계좌번호가 key일 경우
		String absoluteKey = sc.next();
		
		System.out.print("불러올 파일명 : ");
		String fn = sc.next();
		Properties p = new SaveAccount().bankSearch(fn);

		Map<String, String> map = new HashMap<> ();
		
		for(String key : p.stringPropertyNames()) {
			map.put(key, p.getProperty(key));	
			String []values = (String[]) map.values().toArray(new String[map.size()]);
			String []sar = values[0].split("\\s");
			//if(absoluteKey.equals(sar[2])) { 계좌번호가 key일 경우
			if(absoluteKey.equals(key)) {
				for(String w : sar) {
					System.out.println(money + "원 입금하셨습니다.");
					String str = sar[8].replaceAll(",", "");
					int x = Integer.parseInt(str) + money;
				    
					String totalCash = String.valueOf(x);
					int keyies = Integer.parseInt(absoluteKey);
					
					bStart.setPrice(x);
					bStart = new Bank(keyies, sar[5], bStart.getGender(), bStart.getAge(),sar[2], x, new Date());
					new SaveAccount().saveAcc(bStart);
					break;
				}
			
			}
		}
	}
	
	public void bankWithdrawal() {
		//출금
		System.out.print("출금 금액 : ");
		int money = sc.nextInt();
		
		System.out.print("출금고객 고유번호  : ");
		//String absoluteKey = n + sc.next(); 계좌번호가 key일 경우
		String absoluteKey = sc.next();
		
		System.out.print("불러올 파일명 : ");
		String fn = sc.next();
		Properties p = new SaveAccount().bankSearch(fn);

		Map<String, String> map = new HashMap<> ();
		
		for(String key : p.stringPropertyNames()) {
			map.put(key, p.getProperty(key));	
			String []values = (String[]) map.values().toArray(new String[map.size()]);
			String []sar = values[0].split("\\s");
		
			//if(absoluteKey.equals(sar[2])) { 계좌번호가 key일 경우
			if(absoluteKey.equals(key)) {
				for(String w : sar) {
					System.out.println(money + "원 출금하셨습니다.");
					String str = sar[8].replaceAll(",", "");
					
					int x = Integer.parseInt(str) - money;
					int keyies = Integer.parseInt(absoluteKey);
					
					bStart.setPrice(x);
					bStart = new Bank(keyies, sar[5], bStart.getGender(), bStart.getAge(),sar[2], x, new Date());
					new SaveAccount().saveAcc(bStart);
					break;
				}
			}
		}
	}
	
	public void bankAccTransfer() {
		//계좌이체
	}
}
