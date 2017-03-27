package wdsr.exercise2.procon;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Task: implement Buffer interface without using any *Queue classes from java.util.concurrent package.
 * Any combination of "synchronized", *Lock, *Semaphore, *Condition, *Barrier, *Latch is allowed.
 */
public class BufferManualImpl implements Buffer {
	private static int size = 100000;
	private ArrayList<Order> queue = new ArrayList<Order>(size);
	
	
	public void submitOrder(Order order) throws InterruptedException {
		synchronized(queue)
		{
			while(queue.size() == size)
			{
				queue.wait();
			}
			queue.add(order);
			queue.notifyAll();
		}
		
		
	}
	
	public Order consumeNextOrder() throws InterruptedException {
		synchronized(queue)
		{
			while(queue.isEmpty())
			{
				queue.wait();
			}
			Order orderToReturn = queue.remove(0);
			queue.notifyAll();
			return orderToReturn;
		}
	}
}
