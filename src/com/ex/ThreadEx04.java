package com.ex;

class MyThreadEx implements Runnable{

	private int number = 0;
	
	public MyThreadEx(int n) {
		System.out.println("스레드 시작");
		number = n;
	
	}
	
	
	@Override
	public void run() {
		int i = 0;
		while(i < number) {
			
			System.out.print(i+"\t");
			i++;
		}
		
	}
	
}

public class ThreadEx04 {

	public static void main(String[] args) {

		MyThreadEx ob = new MyThreadEx(100);
		Thread th = new Thread(ob);
		th.start();
		
	}

}
