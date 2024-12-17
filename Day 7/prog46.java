
class Sum extends Thread
{
	private int start, end;
	private long sum = 0;
	private boolean isOdd;
	public Sum(int start, int end, boolean isOdd)
	{
		this.start = start;
		this.end = end;
		this.isOdd = isOdd;
	}
	public void run()
	{
		for(int i = start; i <= end; i++)
		{
			if (isOdd && i % 2 != 0)
            		{
                		sum = sum + i;
            		}
            		else if (!isOdd && i % 2 == 0)
            		{
                		sum = sum + i;
            		}
		}
	}
	public long getSum()
	{
		return sum;
	}
}
class SSum extends Thread
{
	private int start, end;
	private long sum = 0;
	public SSum(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	public void run()
	{
		for(int i = start; i <= end; i++)
		{
			sum = sum + i;
		}
	}
	public long getSum()
	{
		return sum;
	}
}
class prog46
{
	public static void main(String[] args) throws InterruptedException
	{
		long smt = System.nanoTime();
		Sum t1 = new Sum(1,1000,true);
		Sum t2 = new Sum(1,1000,false);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		long sum = t1.getSum() + t2.getSum();
		long emt = System.nanoTime();
		
		long sst = System.nanoTime();
		SSum t3 = new SSum(1,1000);
		t3.start();
		t3.join();
		long ssum = t3.getSum();
		long est = System.nanoTime();

		System.out.println("Multi Thread Time Requirement : " + (est - sst));
		System.out.println("Single Thread Time Requirement : " + (emt - smt));
	}
}
