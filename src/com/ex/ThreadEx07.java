package com.ex;

class ThreadEx7_1 extends Thread{
	@Override
	public void run() {
		for(int i =0; i< 300; i++) {
			System.out.print("-");
			for(int x =0; x<10000000; x++);
		}
	}
}

class ThreadEx7_2 extends Thread{
	@Override
	public void run() {
		for(int i =0; i< 300; i++) {
			System.out.print("|");
			for(int x =0; x<10000000; x++);
		}
	}
}

public class ThreadEx07 {

	public static void main(String[] args) {
		ThreadEx7_1 t1 = new ThreadEx7_1();//5
		ThreadEx7_2 t2 = new ThreadEx7_2();//5
		
		// 스레드 우선순위 : 최대 우선순위: 10, 보통 순위 : 5, 최소 우선순위 : 1

		t2.setPriority(6);
		System.out.println("Priority of t1(-) : " + t1.getPriority());
		// setPriority로 설정 안할 시 자동으로 5
		System.out.println("Priority of t2(|) : " + t2.getPriority());
		
		t1.start();
		t2.start();
		
	}

}
