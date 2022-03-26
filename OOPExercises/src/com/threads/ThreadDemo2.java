package com.threads;

class C implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread-A");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
}

class D implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread-B");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadDemo2 {
	public static void main(String[] args) {	
		C obj1 = new C();
		D obj2 = new D();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();

	}
}
