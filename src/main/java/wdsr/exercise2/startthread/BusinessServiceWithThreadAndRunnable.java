package wdsr.exercise2.startthread;

public class BusinessServiceWithThreadAndRunnable {
	private NumericHelper helper;
	
	public BusinessServiceWithThreadAndRunnable(NumericHelper helper) {
		this.helper = helper;
	}

	/**
	 * Calculates Fibonacci number asynchronously and invokes the callback when result is available.
	 * This method returns immediately. 
	 * @param n Which Fibonacci number should be computed.
	 * @param callback Callback to be invoked when Fibonacci number is found.
	 */
	public void computeFibonacci(int n, FibonacciCallback callback) {
		// TODO Task: execute the logic below in a new Thread, use Runnable interface.
		//long value = helper.findFibonacciValue(n);
		ComputeFibbonaciRunnable object = new ComputeFibbonaciRunnable(helper, n);
		Thread thread = new Thread(object);
		thread.start();
		
		CallBackFibbonacciRunnable object2 = new CallBackFibbonacciRunnable(object, callback);
		Thread thread2 = new Thread(object2);
		thread2.start();
		//callback.fibonacciComputed(value);
		
	}
}
