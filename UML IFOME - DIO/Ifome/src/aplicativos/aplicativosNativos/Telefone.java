package aplicativos.aplicativosNativos;

import aplicativos.Aplicativos;

public class Telefone extends Aplicativos{

	private String nome;
	private int numero;
	
	public void fazerLigacao(String nome, int numero) {
		System.out.println("Ligando para " + nome + " Discando "+ numero);
	}
	
	public void atenderLigacao(String nome, int numero) {
		if(nome == null) {
			System.out.println("Ligação de " + numero);
		}else {
			System.out.println("Ligação de " + nome);
		}
		
	}
	
	public void correiodeVoz(int numero) {
		System.out.println("O número " + numero + " te deixou uma mensagem no correio de voz eletronico");
	}

	public String getNome() {
		return nome;
	}


	public int getNumero() {
		return numero;
	}


	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		super.abrir();
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		super.fechar();
	}

	
	
	
	
	
}
