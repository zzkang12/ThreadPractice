package com.ex;



public class ThreadEx08 {

	public static void main(String[] args) {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup(); // currentThread() 지금 움직이고 있는 스레드 getThreadGroup() 스레드 그룹을 가져옴
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		
		ThreadGroup subGrp1 = new ThreadGroup(grp1, "SubGroup1");
		// 스레드 그룹 grp1의 최대 우선순위 3으로 변경
		grp1.setMaxPriority(3);
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
			
				try {
					Thread.sleep(1000);
				}catch (InterruptedException e) {
					// 비워둬도 괜찮음
				}
				
			}
		};
		
		Thread th1 = new Thread(grp1, r, "th1");
		Thread th2 = new Thread(subGrp1, r, "th2");
		Thread th3 = new Thread(grp2, r, "th3"); // main 메소드 내에서 스레드 실행
		// 우선순위는 자동 5가 됨
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println(">> List Group" +main.getName()+
				", Active ThreadGroup : " + main.activeGroupCount()+
				", Active Thread : "+ main.activeCount());
		main.list();
		
		
		
	}
}
