package threads.threadExtends;

import java.util.stream.IntStream;

public class CounterCommand extends Thread{
	
	public CounterCommand() {
		start();
	}
	
	@Override
	public void run() {
		IntStream.range(0, 10000).forEach(System.out::println);
	}
	
}
