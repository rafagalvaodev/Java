package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singletons.SingletonAprecado;
import dio.gof.singletons.SingletonPreguicoso;
import dio.gof.singletons.SingletonPreguicosoSeguro;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.ComportamentoNormal;
import dio.gof.strategy.Roboto;

public class TestandoPadroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Testes do padrão Singleton
		
		SingletonPreguicoso preguicoso = SingletonPreguicoso.getInstancia();
		SingletonAprecado aprecado = SingletonAprecado.getInstancia();
		SingletonPreguicosoSeguro segura = SingletonPreguicosoSeguro.getInstancia();
		
		
		System.out.println(preguicoso);
		preguicoso = SingletonPreguicoso.getInstancia();
		System.out.println(preguicoso);
		
		System.out.println(aprecado);
		aprecado = SingletonAprecado.getInstancia();
		System.out.println(aprecado);
		
		System.out.println(segura);
		segura = SingletonPreguicosoSeguro.getInstancia();
		System.out.println(segura);
		
		
		// Testes do padrão strategy
		
		ComportamentoNormal statusNormal = new ComportamentoNormal();
		ComportamentoDefensivo statusDefensivo = new ComportamentoDefensivo();
		ComportamentoAgressivo statusAgressivo = new ComportamentoAgressivo();
		
		Roboto robozin = new Roboto();
		
		robozin.setComportamento(statusNormal);
		
		robozin.mover();
		robozin.mover();
		
		robozin.setComportamento(statusAgressivo);
		robozin.mover();
		
		
		robozin.setComportamento(statusDefensivo);
		robozin.mover();
		
		System.out.println();
		
		// Testando padrão Facade
		
		Facade facade = new Facade();
		facade.mudarCliente("Pedro", "29031-313");
		
		

	}

}
