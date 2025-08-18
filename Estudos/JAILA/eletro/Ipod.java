package eletro;

public class Ipod extends Eletronico{
    private String polegadas;
    private float porcentagemDeBateria;
    public Ipod(String voltagem, String cor, String marca, String modelo, String numeroDeSerie, double preco, int id, String nome) {
        this.setVoltagem(voltagem);
        this.setCor(cor);
        this.setMarca(marca);
        this.setModelo(modelo);
        this.getNumeroDeSerie(numeroDeSerie);
        this.setPreco(preco);
        this.setId(id);
        this.setNome(nome);
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }

    public float getPorcentagemDeBateria() {
        return porcentagemDeBateria;
    }

    public void setPorcentagemDeBateria(float porcentagemDeBateria) {
        this.porcentagemDeBateria = porcentagemDeBateria;
    }

    @Override
    public void ligar(String nome, float porcentagemDeBateria) {

        System.out.println("Ligando "+ nome+ " Com "+ porcentagemDeBateria+"% de bateria");
    }

    @Override
    public String toString() {
        return getNome() + " Modelo: " + getModelo() + " Cor: " +getCor()+ " Polegadas: "+polegadas+"\n" ;
    }
}
