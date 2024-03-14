package eletro;

public class Televisor extends Eletronico {
    private String polegadas;
    public Televisor(String voltagem, String cor, String marca, String modelo, String numeroDeSerie, double preco, int id, String nome) {
        super(voltagem, cor, marca, modelo, numeroDeSerie, preco, id, nome);
    }
    public String getPolegadas() {
        return polegadas;
    }
    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }
    @Override
    public void ligar(String nome) {
        super.ligar(nome);
    }

    @Override
    public String toString() {
        return "\n"+ getNome() +" " +
               getPolegadas() +  " polegadas " + "Marca "+ getMarca() +"\n";
    }
}
