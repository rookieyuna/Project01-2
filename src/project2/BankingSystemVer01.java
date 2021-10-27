package project2;

import java.util.Scanner;

import project2.ver01.Account;
import project2.ver01.MenuChoice;

public class BankingSystemVer01 implements MenuChoice{

	public static void main(String[] args) {
		Account acc = new Account();
		acc.showMenu();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("선택:");
		int choice = scan.nextInt();
		
		switch(choice) {
		case MAKE:
			acc.makeAccount(); break;
		case DEPOSIT:
			acc.depositMoney(); break;
		case WITHDRAW:
			acc.withdrawMoney(); break;
		case INQUIRE:
			acc.showAccInfo(); break;
		case EXIT:
			System.out.println("'프로그램이 종료되었습니다.");
			return;
		}
	}

}
