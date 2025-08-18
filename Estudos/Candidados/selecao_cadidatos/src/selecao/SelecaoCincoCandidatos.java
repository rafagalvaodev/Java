package selecao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SelecaoCincoCandidatos {

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	public void selecionaCinco() {
		String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela","João"};
		
		int candidatoSelecionado = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		List <String> candidatosSelecionados = new ArrayList<>();
		while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
		
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			StringBuilder menssagem = new StringBuilder();
			menssagem.append("O Candidato ");
			menssagem.append(candidato);
			menssagem.append(" Solicitou o salario de ");
			menssagem.append(salarioPretendido);
			
			
			System.out.println(menssagem);
			if(salarioBase >= salarioPretendido) {
				StringBuilder texto = new StringBuilder();
				texto.append("O Candidato ");
				texto.append(candidato);
				texto.append(" Selecionado para entrevista ");
				candidatoSelecionado += 1;
				System.out.println();
				System.out.println(texto);
				
				candidatosSelecionados.add(candidato);
				
			}
			candidatoAtual += 1;
			
		}
		
	
		
		System.out.println();
		Contatos contatos = new Contatos();
		for(String candidatosC : candidatosSelecionados) {
			System.out.println(candidatosC + " foi Selecionado(a)\n");
			contatos.tentativaDeContato(candidatosC);
			System.out.println();
		}
		
		
	}

	
	
}
