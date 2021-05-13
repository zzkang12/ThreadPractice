package com.ex;

import javax.swing.JOptionPane;

class ThreadEx06_1 extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx06 {

	public static void main(String[] args) {
		
		ThreadEx06_1 th = new ThreadEx06_1();
		
		th.start();   
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
	
		
	}

}
