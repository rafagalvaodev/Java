package aplicativos.aplicativosExternos;

import aplicativos.Aplicativos;

public class Browser extends Aplicativos{

	private String nome;
	
	public void exibirPagina(String nome) {
		System.out.println("Exibindo a página "+ nome);
	}
	
	public void novaAba() {
		System.out.println("Nova aba aberta");
	}
	
	public void atualizar(){
		System.out.println("Atualizando Página");
		System.out.println("Página Atualizada");
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

	@Override
	public void desinstalar() {
		// TODO Auto-generated method stub
		super.desinstalar();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	
	
}
