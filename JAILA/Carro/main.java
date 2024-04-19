package Carro;

public class main {
    public static void main(String[] args) {
        Carro chevete = new Carro("Chevette", 1980, "Preto perolado", 123.51);

        System.out.println(chevete);

        System.out.println(chevete.acelerar());
        System.out.println(chevete.buzina());
        System.out.println(chevete.para());
        chevete.ano = 123;
    }
}
