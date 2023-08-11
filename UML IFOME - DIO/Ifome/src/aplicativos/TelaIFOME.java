package aplicativos;
import aplicativos.aplicativosExternos.*;
import aplicativos.aplicativosNativos.*;
public class TelaIFOME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		
		//Testando a classe Reprodutor de Músicas
		ReprodutorMusicas rm = new ReprodutorMusicas();
		rm.abrir();
		rm.reproduzirMusica("Pra quem tem fé");
		rm.pausarMusica();
		rm.desinstalar();
		
		//Testando a classe Relógio
//		Relogio rl = new Relogio();
//		rl.abrir();
//		rl.mostrarHora();
//		rl.fechar();
		
		
		//Testando a classe Browser
//		Browser nave = new Browser();
//		nave.abrir();
//		nave.exibirPagina("youtube.com");
//		nave.atualizar();
//		nave.fechar();
//		nave.desinstalar();
		
		//Testando a classe Telefone
//		Telefone tf = new Telefone();
//		tf.abrir();
//		tf.fazerLigacao("Pedro", 987264378);
//		tf.correiodeVoz(987264378);
//		tf.atenderLigacao(null, 987264378);
//		tf.fechar();
//		tf.desinstalar();
//		
		
		
		
	}

}
