public class Consumidor implements Runnable{
	Q q;

	Consumidor(Q q){
		this.q = q;
		new Thread(this, "Consumidor").start();
	}

	public void run(){
		while(true){
			q.get();
		}
	}
}

