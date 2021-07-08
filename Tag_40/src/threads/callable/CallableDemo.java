package threads.callable;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		byte[] b = new byte[10000];
		long start = 0l;
		long end = 0l;
		start = System.currentTimeMillis();
		new Random().nextBytes(b);
		
		Callable<byte[]> c = new SorterCallable(b);
		ExecutorService executor = Executors.newCachedThreadPool();
		Future<byte[]> result = executor.submit(c);
		
		System.out.println("Warten");
		byte[] bResult = result.get();
		
		if(result.isDone()) {
			System.out.println(Arrays.toString(bResult));
			end = System.currentTimeMillis();
		}	
		
		System.out.println("Zeit benötigt:" + (end - start));
	}

}
