package bankSystem.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

import bankSystem.model.vo.Bank;

public class SaveAccount {
	private Properties pr = new Properties();
	private Properties pR = new Properties();
	private static final String fName = "customer.xml";
	Scanner sc = new Scanner(System.in);
	
	public SaveAccount() {
		System.out.println("<< 고객 파일을 불러옵니다. >>\n");
		
		try {
			pr.loadFromXML(new FileInputStream(fName));
			
		} catch (FileNotFoundException e) {
			System.out.println("계좌를 먼저 만들어주시기 바랍니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void saveAcc(Bank b) {
		pr.setProperty(String.valueOf(b.getbNo()), b.toString());
		pR.setProperty(String.valueOf(b.getbNo()), b.toString());
		//pr.list(System.out);
		try {
			pr.storeToXML(new FileOutputStream(fName), "고객정보");
			
			System.out.print("고객 정보를 저장할 파일 이름 : ");
			String fName2 = sc.next();
			pR.storeToXML(new FileOutputStream(fName2 + ".xml"), "통장정보");
			
		} catch (FileNotFoundException e) {
			System.out.println("계좌를 생성해주시기 바랍니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		pR = new Properties();
	}
	
	public Properties allPrint() {
		return pr;
	}
	
	public Properties bankSearch(String fn) {
		try {
			pR.loadFromXML(new FileInputStream(fn+".xml"));
			
		} catch (FileNotFoundException e) {
			System.out.println("계좌를 먼저 만들어주시기 바랍니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pr;
	}
	
	public void bankDeposit(Properties p) {
		System.out.println("=== KH Bank ===");
		try {
			System.out.print("변경사항 저장할 고객의 파일 : ");
			String fn = sc.next();
			if(fn.equals(fn)) {
				p.storeToXML(new FileOutputStream(fn + ".xml"), "통장정보");
				p.storeToXML(new FileOutputStream(fName), "고객정보");
			}
			System.out.println("입금이 정상적으로 처리되었습니다.");
			
		} catch (FileNotFoundException e) {
			System.out.println("고객 정보가 없습니다.");
		} catch (IOException e) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
