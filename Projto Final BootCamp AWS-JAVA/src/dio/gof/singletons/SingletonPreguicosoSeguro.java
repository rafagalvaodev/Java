package dio.gof.singletons;

public class SingletonPreguicosoSeguro {

	private static class Seguro {
		public static SingletonPreguicosoSeguro instancia =  new SingletonPreguicosoSeguro();
	}	
	
	private SingletonPreguicosoSeguro() {
		// TODO Auto-generated constructor stub
		super();
	}


	public static SingletonPreguicosoSeguro getInstancia() {
		return Seguro.instancia;
	}
	
	
	
	
}
