package eletro;

import eletro.Eletronico;

import java.util.ArrayList;

public class Bolsa{
    ArrayList<Eletronico> eletronicos = new ArrayList<>();

    public Bolsa(ArrayList<Eletronico> eletronicos) {
        this.eletronicos = eletronicos;
    }

    public void inserirNaBolsa(Eletronico eletronico){

        eletronicos.add(eletronico);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conteúdo da bolsa:\n");
        int i = 0;
        for (Eletronico v : eletronicos) {
            sb.append(i+1+": "+v.toString().trim()+"\n").append("\n");
            i++;
        }
        return sb.toString().trim();
    }
}
