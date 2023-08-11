package aplicativos.aplicativosNativos;

import java.util.Calendar;
import java.util.Date;

import aplicativos.Aplicativos;

public class Relogio extends Aplicativos{
	Calendar c;
	String hora;
	
	public void mostrarHora() {
		Calendar relogio = Calendar.getInstance();
		System.out.println("A data hora atual é " + relogio.getTime());
	}
	
	public void despertador(String hora) {
		int horario = Integer.parseInt(hora);
		Calendar relogio = Calendar.getInstance();
		Date horaAtual = relogio.getTime();
		if(horaAtual.equals(horario)) {
			System.out.println("Despertando");
		}else {
			System.out.println("Volte a dormir");
		}
	}

	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo o Relógio");
		
	}

	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		System.out.println("Fechando o Relógio");
	}
	
	
	
	
	
}
