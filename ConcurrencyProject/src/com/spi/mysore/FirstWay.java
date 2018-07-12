package com.spi.mysore;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		System.out.println(" main thread started");

		new SecondTask();
		Thread t=new SecondTask();
		System.out.println("main thread ended");
	}
}
class FirstTask extends Thread{
	private static int  count=0;
	private int id;
	

	public void run(){
		for(int i=0;i<10;i++)
		{
			System.out.println("<" +id+ ">Thread Started"+ i);

			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public FirstTask(){
		this.id=++count;
		this.start();
	}



}