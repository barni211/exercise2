package wdsr.exercise2.startthread;

public class ComputeFibbonaciRunnable implements Runnable {
	
	private NumericHelper helper;
	private int n;
	private FibonacciCallback callback;
	
	public ComputeFibbonaciRunnable(NumericHelper helper, int n, FibonacciCallback callback) {
		this.helper = helper;
		this.n=n;
		this.callback=callback;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long value = helper.findFibonacciValue(n);
		callback.fibonacciComputed(value); 
	}
	

}
