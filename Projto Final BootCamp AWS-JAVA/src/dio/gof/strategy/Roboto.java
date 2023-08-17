package dio.gof.strategy;

public class Roboto {

	private Comportamentos comportamento;

	public void setComportamento(Comportamentos comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover(){
		comportamento.mover();
	}
	
}
