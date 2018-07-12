package com.spi.mysore;

import java.util.concurrent.TimeUnit;

public class FifthWay {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
	   Thread t=new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Thread Started"+ i);

					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
			  t.start();
		
		System.out.println("main method ended");
		
	}
}

//To handle UI eventsS