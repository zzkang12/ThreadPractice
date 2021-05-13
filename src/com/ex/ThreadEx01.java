package com.ex;

// 스레드 생성 : 스레드 클래스를 상속 받아서 구현

class ThreadEx extends Thread {
	
	@Override  // shift + space로 run
	public void run() {
		// 스레드로 실행할 내용을 구현
		for(int i =0; i < 5; i++) {
			System.out.println(getName());
			// 조상인 Thread의 getName() 메소드 호출
 		}
	
	}
	
}

class ThreadEx1 implements Runnable{

	@Override
	public void run() {
		// 스레드로 실행할 내용을 구현
		for(int i =0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			// Thread.currentThread() : 현재 실행중인 스레드를 의미함
		}
	}
}

public class ThreadEx01 {

	public static void main(String[] args) {
		ThreadEx t1 = new ThreadEx();
		
		// 인터페이스를 상속해서 스레드 객체 생성
		Runnable r = new ThreadEx1();
		
		// Thread 생성자 Thread(Runnable target)
		Thread t2 = new Thread(r);
		
		t1.start();	// 스레드 실행
		t2.start();
	}

}
