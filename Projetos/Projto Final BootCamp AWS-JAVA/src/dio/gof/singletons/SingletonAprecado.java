package dio.gof.singletons;

public class SingletonAprecado {

	private static SingletonAprecado instancia = new SingletonAprecado(); 
	
	public SingletonAprecado() {
		// TODO Auto-generated constructor stub
		super();
		
	}

	public static SingletonAprecado getInstancia() {
		return instancia;
	}
	
	
	
	
	
}
