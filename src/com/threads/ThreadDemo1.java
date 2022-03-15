package com.threads;

class A extends Thread {
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

class B extends Thread {
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
public class ThreadDemo1 {
	public static void main(String[] args) {	
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();

	}
}
