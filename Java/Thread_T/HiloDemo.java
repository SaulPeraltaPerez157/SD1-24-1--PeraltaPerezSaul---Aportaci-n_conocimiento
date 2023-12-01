public class HiloDemo{
	public static void main(String[] args){
		new HiloNuevo();

		try{
			for(int i = 8; i > 0; i--){
				System.out.println("Hilo principal: " + i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Hilo principal interrumpido.");
		}
		System.out.println("Terminando ejecución del hilo principal.");
	}
}

