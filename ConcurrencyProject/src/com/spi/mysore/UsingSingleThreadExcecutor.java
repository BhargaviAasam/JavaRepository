package com.spi.mysore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.spi.mysore.common.LoopTaskA;

public class UsingSingleThreadExcecutor {
	
public static void main(String[] args) {
		
		System.out.println("Main thread statrs here");
		
		
		ExecutorService executorservice=Executors.newSingleThreadExecutor();
		executorservice.execute(new LoopTaskA());
		executorservice.execute(new LoopTaskA());
		executorservice.execute(new LoopTaskA());
	
		executorservice.shutdown();
		
		
		
		System.out.println("Main thread ends here");
		
		}
		

}
