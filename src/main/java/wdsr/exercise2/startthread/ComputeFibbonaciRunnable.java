package wdsr.exercise2.startthread;

public class ComputeFibbonaciRunnable implements Runnable {
	
	private NumericHelper helper;
	private int n;
	private FibonacciCallback callback;
	
	public ComputeFibbonaciRunnable(NumericHelper helper, int n) {
		this.helper = helper;
		this.n=n;
		//this.callback=callback;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long value = helper.findFibonacciValue(n);
		//callback.fibonacciComputed(value); // #BF gdybym chcia� uzy� jednogo w�tku, to wystarczy�oby odkomentowa� t� linijk�, a drug� klas� wywali� i dzia�a�oby tak samo
											// #BF w ka�dym razie testy przesz�y przy tym przypadku, wi�c zak�adam, �e jest ok.
		
	}
	
	public int getN()
	{
		return this.n;
	}
	
	

}
