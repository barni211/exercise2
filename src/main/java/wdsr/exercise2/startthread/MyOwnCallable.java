package wdsr.exercise2.startthread;

import java.util.concurrent.Callable;

public class MyOwnCallable implements Callable {
	private long value;
	private NumericHelper helper;
	
	public MyOwnCallable(NumericHelper helper)
	{
		this.helper=helper;
	}

	@Override
	public Object call() throws Exception {
		value=helper.nextRandom();
		return value;
	}
	

}
