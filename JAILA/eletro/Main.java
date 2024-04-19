package eletro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Eletronico> listaEltro = new ArrayList<>();

        Televisor tv = new Televisor("127", "Preto", "Philips", "FLUX TV", "TV1234", 1980, 1, "Tevezinha");

        tv.setPolegadas("32");

        Ipod ipod = new Ipod("127", "Dourado", "Apple", "Touch", "Apple231", 5980, 1, "ipod");

        ipod.setPolegadas("7");

        Smartphone smart = new Smartphone("127", "Aqua", "Motorola", "G120", "1234", 1700, 001, "MotoG120", "0099999999");

        smart.setPolegadas("7.2");


        Bolsa bolsa = new Bolsa(listaEltro);

        tv.ligar("tv");
        ipod.ligar("Ipobre", 89.9f);
        smart.ligar("MotoG120", 90.3f);
        smart.fazLigacao("0099999999");


        bolsa.inserirNaBolsa(ipod);
        bolsa.inserirNaBolsa(smart);

        System.out.println(bolsa);
    }
}
