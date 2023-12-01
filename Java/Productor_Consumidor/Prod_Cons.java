public class Prod_Cons{
	public static void main(String[] args){
		Q q = new Q();

		new Productor(q);
		new Consumidor(q);

		System.out.println("Presionar Ctrl + C para detener el programa");
	}
}

