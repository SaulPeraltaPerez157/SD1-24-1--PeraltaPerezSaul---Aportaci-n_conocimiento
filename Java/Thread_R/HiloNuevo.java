public class HiloNuevo implements Runnable{
	Thread t;

	HiloNuevo(){
		t=new Thread(this, "Hilo de prueba");
		System.out.println("Hilo hijo: " + t);
		t.start(); //Inicia la ejecución del hilo.
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
		System.out.println("Terminando ejecución del hilo hijo.");
	}

}
