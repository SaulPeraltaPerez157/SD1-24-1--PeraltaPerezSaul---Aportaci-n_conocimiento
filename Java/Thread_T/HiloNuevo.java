public class HiloNuevo extends Thread{

	HiloNuevo(){
		super("Hilo_demo");
		System.out.println("Hilo hijo: " + this);
		start();
	}

	public void run(){
		try{
			for(int i = 8; i > 0; i--){
				System.out.println("Hilo hijo: " + i);
				Thread.sleep(500);
			}
		} catch(InterruptedException e){
			System.out.println("Hilo hijo interrumpido.");
		}
		System.out.println("Terminando ejecución del hilo hijo");
	}
}
