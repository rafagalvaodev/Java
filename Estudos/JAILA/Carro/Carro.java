package Carro;

public class Carro {
    String cor = "Preto perolado";
    double quilometrosRodados = 2345678.3;
    byte quantidadePortas = 4;
    int ano = 1979;
    String modelo = "Chevette classico";
    String marca = "Chervrolet";

    public Carro(String modelo, int ano, String cor, double quilometrosRodados){
        this.setModelo(modelo);
        this.setAno(ano);
        this.setCor(cor);
        this.setQuilometrosRodados(quilometrosRodados);

    }

    public String toString(){
        return "Vendo Carro modelo " +modelo+" Ano " +ano+ " Cor " + cor+" "+ quilometrosRodados+"Km rodados" ;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public double getQuilometrosRodados() {
        return quilometrosRodados;
    }

    public void setQuilometrosRodados(double quilometrosRodados) {
        this.quilometrosRodados = quilometrosRodados;
    }

    public static String buzina(){
        return "BiBi";
    }

    public static String acelerar(){return "Acelerando";}
    public static String para(){return "Freiando... Parou";}

}
