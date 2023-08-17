package subsistemas.cep;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}

	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String pegarCidade(String cep) {
		return "Cidade qualquer";
	}
	
	public String pegarEstado(String cep) {
		return "Estado Qualquer";
	}
	
}
