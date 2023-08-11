package aplicativos.aplicativosExternos;

import aplicativos.Aplicativos;

public class ReprodutorMusicas extends Aplicativos{

	private String nome;

	public String getNome() {
		return nome;
	}

	
	public void tocarMusica(String nome) {
		System.out.println("Tocando a Música " + nome);
	}
	
	public void pausarMusica() {
		System.out.println("Música Pausada");
	}
	
	public void reproduzirMusica(String nome) {
		System.out.println("Reproduzindo a Música " + nome);
	}

	@Override
	public void abrir() {
		System.out.println("Abrindo o Aplicativo Reprodutor de Músicas");
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		System.out.println("Fechando o Aplicativo Reprodutor de Músicas");
		
	}

	@Override
	public void desinstalar() {
		// TODO Auto-generated method stub
		System.out.println("Desistalando o o Aplicativo Reprodutor de Músicas");
		
	}
	
	
	
	
}
