package services;

import dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiceSnackArquivo implements IServiceSnaks{

    private final String NOME_ARQUIVO = "snacks.txt";

    private List<Snack> snacks = new ArrayList<>();

    public ServiceSnackArquivo() {
        File arquivo = new File(NOME_ARQUIVO);
        boolean arquivoExiste = false;
        try {
            arquivoExiste = arquivo.exists();
            if (arquivoExiste){
              this.snacks = obterSnacks();
            }else {
                PrintWriter saida = new PrintWriter(new FileWriter(arquivo));
                saida.close();
                System.out.println("Arquivo criado");
            }
        }catch (Exception e){
            System.out.printf("Erro ao criar o arquivo: %s", e.getMessage());
        }

        if (!arquivoExiste){
            carregarSnacks();
        }
    }

    private void carregarSnacks(){
        this.adicionarSnack(new Snack("Tubaina", 13.50));
        this.adicionarSnack(new Snack("Biscoito", 3.99));
        this.adicionarSnack(new Snack("Gostositos", 23.70));
    }



    private void adicionarSnackArquivo(Snack snack){
        boolean adicionar = false;
        File arquivo = new File(NOME_ARQUIVO);

        try {
            adicionar = arquivo.exists();

            PrintWriter saida = new PrintWriter(new FileWriter(arquivo, adicionar));

            saida.println(snack.toString());
            saida.close();

        }catch (Exception e){
            System.out.printf("Erro ao adicionar snakc: %s", e.getMessage());
        }
    }

    private List<Snack> obterSnacks(){
        var snacks = new ArrayList<Snack>();

        try {
            List<String> linhas = Files.readAllLines(Paths.get(NOME_ARQUIVO));
            for (String linha : linhas){
                String[] linhaSnack = linha.split(",");
                String nameSnack = linhaSnack[1];
                Double priceSnack = Double.parseDouble(linhaSnack[2]);
                Snack snack = new Snack(nameSnack, priceSnack);
                snacks.add(snack);
            }
        }catch (Exception e){
            System.out.printf("Erro ao ler o arquivo: %s", e.getMessage());
        }
        return snacks;
    }

    @Override
    public void adicionarSnack(Snack snack) {
        this.snacks.add(snack);

        this.adicionarSnackArquivo(snack);


    }

    @Override
    public void mostrarSnacks() {
        String inventario = "";
        for (var snack : this.snacks){
            inventario += snack.toString() + "\n";
        }
        System.out.println(inventario);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
