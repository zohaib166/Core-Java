package com.threads;
class CountIncrement {
	int count;
	public void increment() {
		count++;
	}
}
public class ThreadDemo5  {
	public static void main(String[] args) throws Exception {
		CountIncrement ci = new CountIncrement();
		Runnable obj1 = new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					//System.out.println(Thread.currentThread().getName());
					
					ci.increment();
				}
			}
		};
		
		Runnable obj2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++) {
					//System.out.println(Thread.currentThread().getName());
					
					ci.increment();
				}
			}
		};
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();

		System.out.println(ci.count);
	}
}
