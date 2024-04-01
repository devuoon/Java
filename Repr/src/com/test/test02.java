package com.test;

import java.io.*;
import java.util.Scanner;

public class test02 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 로그인   2. 회원가입   3. 종료  >");
			int num = sc.nextInt();
			sc.nextLine();
			
			if (num == 1) {
				if(login(sc)) {
					member(sc);
				}
			} else if (num == 2) {
				signup(sc);
			} else if (num == 3) {
				System.out.println("프로그램이 종료되었습니다.");
                break;
			} else {
				System.out.println("올바른 번호를 입력해주세요");
			}
		}
		
		sc.close();
	}
	
	public static boolean login(Scanner sc) throws IOException {
		File file = new File("C:/Temp/userInfo.txt");
		if(!file.exists()) {
			System.out.println("회원 정보가 없습니다. 회원가입을 먼저 진행하세요");
			signup(sc);
			return true;
		}
		
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] info = line.split(":");
                if (info.length == 2 && info[0].equals(id) && info[1].equals(pw)) {
                    System.out.println("로그인 성공!");
                    return true;
                }
            }
        }
		System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		return false;
	}
	
	public static void signup(Scanner sc) throws IOException{
		System.out.println("아이디 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 : ");
		String pw = sc.nextLine();
		
		//파일에 저장
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/userInfo.txt", true))) {
			bw.write(id + ":" + pw);
			bw.newLine();
		}
		System.out.println("회원가입이 완료되었습니다.");
	}
	
	public static void member(Scanner sc) throws IOException{
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("전화번호 : ");
		int phone = sc.nextInt();
		sc.nextLine();
		System.out.println("주소 : " );
		String address = sc.nextLine();
		System.out.println("회원 정보가 저장되었습니다.");
		try (BufferedWriter bw1 = new BufferedWriter(new FileWriter("C:/Temp/members.txt", true))) {
			bw1.write("회원 " + name + ":" + phone + ":" + address + ":");
			bw1.newLine();
		}
	}
	
	public static void memberInfo(Scanner sc, String name) throws IOException{
		File file1 = new File("C:/Temp/members.txt");
		
		System.out.println("등록된 회원의 이름을 입력하세요.");
		String nameInput = sc.nextLine();
		
		
		if(name == nameInput) {
			
		}
	}

}
