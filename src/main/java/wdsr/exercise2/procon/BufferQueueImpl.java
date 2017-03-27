package wdsr.exercise2.procon;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * Task: implement Buffer interface using one of *Queue classes from java.util.concurrent package.
 */
public class BufferQueueImpl implements Buffer {
	private BlockingQueue<Order> orderList = new LinkedBlockingQueue<Order>();
	
	public void submitOrder(Order order) throws InterruptedException {
			orderList.put(order);
	}
	
	public Order consumeNextOrder() throws InterruptedException {
			return orderList.take();
			
	}

	

	
}
