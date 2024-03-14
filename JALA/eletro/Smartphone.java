package eletro;

public class Smartphone extends Eletronico{
    private float porcentagemDeBateria;
    private String polegadas;

    private String contato;
    public Smartphone(String voltagem, String cor, String marca, String modelo, String numeroDeSerie, double preco, int id, String nome, String contato) {

        super(voltagem, cor, marca, modelo, numeroDeSerie, preco, id, nome);
        this.contato = contato;
    }

    public float getPorcentagemDeBateria() {
        return porcentagemDeBateria;
    }

    public void setPorcentagemDeBateria(float porcentagemDeBateria) {
        this.porcentagemDeBateria = porcentagemDeBateria;
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }

    public void fazLigacao(String contato){
        System.out.println(getNome()+" Ligando para " + contato);
    }
    @Override
    public void ligar(String nome, float porcentagemDeBateria) {

        System.out.println("Ligando "+ nome+ " Com "+ porcentagemDeBateria+"% de bateria");
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return
                getNome() +
                " cor " + getCor() +
                " polegadas: " + polegadas;
    }


}
