package com.ex;

class MyThread extends Thread{
	private int number = 0;
	
	public MyThread(int n) {
		System.out.println(this.getName()+"스레드 시작");
		this.number=n;
	}
	@Override
	public void run() {

		int i =0;
		while(i < number) {
			System.out.println(this.getName()+":"+i+"\t");
			i++;
		}
		System.out.println(this.getName()+"스레드 종료");

	}
}


public class ThreadEx03 {

	public static void main(String[] args) {
		MyThread t = new MyThread(10);
		t.start();
	}

}
