package dio.gof.facade;

import subsistemas.cep.CepApi;
import subsistemas.crm.CrmServices;

public class Facade {

	public void mudarCliente(String nome, String cep) {
		
		String cidade = CepApi.getInstancia().pegarCidade(cep);
		
		String estado = CepApi.getInstancia().pegarEstado(cep);
		
		CrmServices.gravarCliente(nome, cep, cidade, estado);
	}
}
