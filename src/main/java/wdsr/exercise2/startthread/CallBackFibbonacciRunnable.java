package wdsr.exercise2.startthread;

public class CallBackFibbonacciRunnable implements Runnable {
	private ComputeFibbonaciRunnable compute;
	private FibonacciCallback callback;;
	
	public CallBackFibbonacciRunnable(ComputeFibbonaciRunnable compute, FibonacciCallback callback)
	{
		this.compute=compute;
		this.callback=callback;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		callback.fibonacciComputed(compute.getN());
	}

}
