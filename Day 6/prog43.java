class count implements Runnable 
{
	int c = 0;
	Thread t;
	private volatile boolean running = true;
	public count(int p) 
	{
		t = new Thread(this);
 		t.setPriority(p);
 	}
 	public void run() 
	{
 		while (running) 
		{
 			c++;
 		}
 	}
	public void stop() 
	{
 		running = false;
 	}
 	public void start() 
	{
 		t.start();
	}
}


class prog43
{
	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
 		count hi = new count(Thread.NORM_PRIORITY + 3);
 		count lo = new count(Thread.NORM_PRIORITY - 3);
		hi.start();
 		lo.start();
 		try {
 			Thread.sleep(1000);
 		} catch (InterruptedException e) {
 			System.out.println("Main thread interrupted.");
 		}
		lo.stop();
 		hi.stop();
 		System.out.println("Low-priority thread: " + lo.c); 
 		System.out.println("High-priority thread: " + hi.c);
 	}
}


