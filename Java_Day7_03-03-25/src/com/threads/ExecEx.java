package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableImpl implements Runnable{
	public void run() {
		System.out.println("I am in run() different from main");
	}
}

public class ExecEx {
	
	static ExecutorService exc =  Executors.newFixedThreadPool(2);
	public static void main(String[] args) {
		Runnable tsk = new RunnableImpl();
		Thread th = new Thread(tsk);
		th.start();
		exc.submit(tsk);
		exc.shutdown();
	}
}
