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
		//callback.fibonacciComputed(value); // #BF gdybym chcia³ uzyæ jednogo w¹tku, to wystarczy³oby odkomentowaæ tê linijkê, a drug¹ klasê wywaliæ i dzia³a³oby tak samo
											// #BF w ka¿dym razie testy przesz³y przy tym przypadku, wiêc zak³adam, ¿e jest ok.
		
	}
	
	public int getN()
	{
		return this.n;
	}
	
	

}
