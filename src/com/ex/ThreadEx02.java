package com.ex;

class ThreadEx2 extends Thread{

	@Override
	public void run() {
		throwException();
	
	}
	
	public void throwException() {
		
		try {
			throw new Exception();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}



public class ThreadEx02 {

	public static void main(String[] args) throws Exception{

		ThreadEx2 t1 = new ThreadEx2();
		t1.start();
	}

}
