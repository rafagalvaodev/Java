package eletro;

abstract class Eletronico{
    private String voltagem;
    private String cor;
    private String marca;
    private String modelo;
    private String numeroDeSerie;
    private double preco;
    private int id;
    private String nome;

    public Eletronico() {
    }

    public Eletronico(String voltagem, String cor, String marca, String modelo, String numeroDeSerie, double preco, int id, String nome) {
        this.voltagem = voltagem;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
        this.preco = preco;
        this.id = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(String voltagem) {
        this.voltagem = voltagem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumeroDeSerie(String numeroDeSerie) {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void ligar(String nome){
        System.out.println("Ligando "+ nome);
    }
    public void ligar(String nome, float bateria){
        System.out.println("Ligando "+ nome + " Com "+ bateria +"% de bateria");
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "voltagem='" + voltagem + '\'' +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                ", preco=" + preco +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}

