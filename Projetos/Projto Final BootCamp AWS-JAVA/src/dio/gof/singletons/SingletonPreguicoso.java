package dio.gof.singletons;

public class SingletonPreguicoso {

	private static SingletonPreguicoso instancia;
	
	
	private SingletonPreguicoso() {
		// TODO Auto-generated constructor stub
		super();
	}


	public static SingletonPreguicoso getInstancia() {
		if(instancia == null) {
			instancia = new SingletonPreguicoso();
		}
		return instancia;
	}
	
	
	
	
}
