public class HiloPrincipal{
	public static void main(String[] args){
		Thread t = Thread.currentThread();

		System.out.println("Hilo actual: " + t);
		t.setName("Mi hilo"); //Cambiando el nombre al hilo principal.
		System.out.println("Despues del cambio de nombre: " + t);

		try{
			for(int n = 5; n > 0; n--){
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println("Hilo principal detenido.");
		}
	}
}

