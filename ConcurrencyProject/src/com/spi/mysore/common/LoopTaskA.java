package com.spi.mysore.common;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {
	private static int  count=0;
	
	private int id;
	

	public void run(){
		System.out.println("task <"+ id +">starting");
		for(int i=0;i<10;i++)
		{
			System.out.println("<" +id+ ">Thread Started"+ i);

			try {
				TimeUnit.MILLISECONDS.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("task <"+ id +"> ending");
	}
	public LoopTaskA (){
		this.id=++count;
		
	}

}
