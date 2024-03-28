package com.tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerOne {
	static ServerSocket serverSocket = null;
	
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------");
        System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력");
        System.out.println("-------------------------------------------------------------");

        startServer();

        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();

        stopServer();
    }

    static void startServer() {		// 정적멤버 (클래스멤버)로 만든다.
    	Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8080); 			// 포트번호 8080을 사용하는 서버소켓 생성
					System.out.println("서버 소켓 생성");
					
					Socket clntSocket = serverSocket.accept();		// 클라이언트 소켓
					System.out.println("클라이언트 소켓 생성");
					
					// 서버가 클라이언트로 메세지 보내기
					DataOutputStream dos = new DataOutputStream(clntSocket.getOutputStream());
					dos.writeUTF("First my Server!!!");
					dos.flush();
					
					clntSocket.close();
					System.out.println("클라이언트 소켓 종료");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}				// 익명객체 (1. 익명자식객체-상속, 2. 익명구현객체-인터페이스)
    		
    	};
    	thread.start();
    }

    static void stopServer() {
    	try {
    		System.out.println("서버 소켓 종료");
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
