package subsistemas.crm;

public class CrmServices {

	private CrmServices() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo com sucesso");
		
		StringBuilder mensagem = new StringBuilder();
		mensagem.append("O cliente " + nome);
		mensagem.append(" mora no " + estado);
		mensagem.append(" e na " + cidade);
		mensagem.append(" de CEP " + cep);
		
		System.out.println(mensagem);
	}
	
}
