package com.ex;

class MyThread1 extends Thread{
	
	private long toAdd;
	private String name;
	
	public MyThread1(long t, String n) {
		this.toAdd = t;
		this.name = n;
	}
	@Override
	public void run() {
		long all = 0;
		
		for(int i =0; i<= toAdd; i++) {
			try {
				sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			all +=i;
			System.out.println(name+" : "+all);
		}
	}
}

class MyThread2 extends Thread{
	
	private long toAdd;
	private String name;
	
	public MyThread2(long t, String n) {
		toAdd = t;
		name = n;
	}
	@Override
	public void run() {
		long all = 0;
		
		for(int i =0; i<= toAdd; i++) {
			try {
				sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			all +=i;
			System.out.println(name+" : "+all);
		}

		System.out.println("스레드 종료");

	}
	
}

public class ThreadEx05 {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1(5, "첫 번째 스레드");
		MyThread2 t2 = new MyThread2(5, "두 번째 스레드");
		t1.start();
		t2.start();

	}

}
