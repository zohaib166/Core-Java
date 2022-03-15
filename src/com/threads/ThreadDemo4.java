package com.threads;
public class ThreadDemo4 {
	public static void main(String[] args) throws InterruptedException {
		Runnable obj1 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()+": Hello");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};

		Runnable obj2 = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println(Thread.currentThread().getName()+": Hello");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		};
		
		Thread t1 = new Thread(obj1,"First Thread");
		Thread t2 = new Thread(obj2);
		t2.setName("Second Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		long start = System.currentTimeMillis();
		t1.start();
		t2.start();
		
		//System.out.println(t1.getId()+"->"+t1.getPriority());
		//System.out.println(t2.getId()+"->"+t2.getPriority());
		
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		long stop = System.currentTimeMillis();
		System.out.println(t1.isAlive());
		long duration = stop - start;
		System.out.println(duration/1000.0);

	}
}
