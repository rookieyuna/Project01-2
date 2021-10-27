package project2.ver01;

import java.util.Scanner;

public class Account {

	private String accountNumber; //계좌번호
	private String name;//이름
	private int balance; //잔액
	private Account[] accountArr;
	private int numOfInfo;
	
	public Account() {
		accountArr = new Account[50];
		numOfInfo=0; // 배열저장 카운트용
	}
	public Account(String accountNumber, String name, int balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}
	public void showInfo() {
		System.out.println("계좌번호: "+ accountNumber);
		System.out.println("고객이름: "+ name);
		System.out.println("잔고: "+ balance);
	}

	// 메뉴출력
	public void showMenu() {		
		System.out.println("=============[Menu]=============");
		System.out.print("1. 계좌개설");
		System.out.print(" 2. 입금");
		System.out.println(" 3. 출금");
		System.out.print("4. 전체계좌정보출력");
		System.out.println(" 5. 프로그램종료");
	}
	
	// 1. 계좌개설을 위한 메서드
	public void makeAccount() {
		
		System.out.println("***신규개좌개설***");
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌번호:");
		String accountNumber = scan.nextLine();
		System.out.print("고객이름:");
		String name = scan.nextLine();
		System.out.print("잔고:");
		int balance = scan.nextInt();
		
		accountArr[numOfInfo++] = new Account(accountNumber, name, balance);	
		System.out.println("#계좌개설이 완료되었습니다.");
	}
	
	//입    금
	public void depositMoney() {
		
	}
	
	// 출    금
	public void withdrawMoney() {
		
	}
	
	// 전체계좌정보출력
	public void showAccInfo() {
		
	}

	
}
