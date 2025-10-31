package SynchronizingThreads;

public class MultiThreads extends Thread{

	Resource r;
	String s;
	
	public MultiThreads(Resource r, String s) {
		// TODO Auto-generated constructor stub
		this.r=r;
		this.s=s;
	}
	public void run() {
		synchronized (r) {
			r.Data(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource r = new Resource();
		MultiThreads t1 = new MultiThreads(r, "Thread 1");
		MultiThreads t2 = new MultiThreads(r, "Thread 2");
		MultiThreads t3 = new MultiThreads(r, "Thread 3");
		MultiThreads t4 = new MultiThreads(r, "Thread 4");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
