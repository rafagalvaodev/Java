
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    private int matricula;
    private String nome;
    private String email;
    private String curso;
    private String telefone;
    private String endereco;
    private int numeroFaltas;
    private float[] notas;

    public Aluno(int matricula, String nome, String email, String curso, String telefone, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.telefone = telefone;
        this.endereco = endereco;
        this.numeroFaltas = 0;
        this.notas = new float[3];
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroFaltas() {
        return numeroFaltas;
    }

    public void setNumeroFaltas(int numeroFaltas) {
        if (numeroFaltas > 0) {
            this.numeroFaltas = numeroFaltas;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public void lancarNota(int i, float nota) {
        if (i >= 0 && i < 3 && nota >= 0 && nota <= 100) {
            this.notas[i] = nota;
        } else {
            System.out.println("Prova ou nota inválida.");
        }
    }

    public float calcularMedia() {
        float soma = 0;
        for (float nota : notas) {
            soma += nota;
        }

        float media = (soma / notas.length);
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedMedia = df.format(media).replace(',', '.');
        return Float.parseFloat(formattedMedia);
    }

    public float calcularPercentualFaltas() {
        float faltasPossiveis = 15f;
        float percentualFaltas = (numeroFaltas / faltasPossiveis) * 100;
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedPercentualFaltas = df.format(percentualFaltas).replace(',', '.');
        return Float.parseFloat(formattedPercentualFaltas);
    }

    public String situacao() {
        float media = calcularMedia();
        boolean notasLancadas = false;
        for (double nota : notas) {
            if (nota != 0) {
                notasLancadas = true;
                break;
            }
        }
        if (!notasLancadas) {
            return "Notas não lançadas";
        } else if (media >= 70 && numeroFaltas <= 15) {
            return "Aprovado";
        } else if (media < 50 || numeroFaltas > 15) {
            return "Reprovado";
        } else {
            return "Exame";
        }
    }


    public static Aluno buscarPorMatricula(ArrayList<Aluno> estudante, int matricula) {
        for (Aluno aluno : estudante) {
            if (aluno.getMatricula() == matricula) {
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado.");
        return null;
    }


    @Override
    public String toString() {
        return "Aluno "+nome+":"+
                "\nMatricula= " + matricula +
                "\nNome= " + nome +
                "\nE-mail= " + email +
                "\nCurso= " + curso +
                "\nTelefone= " + telefone +
                "\nEndereco= " + endereco +
                "\nNumeroFaltas= " + numeroFaltas +
                "\nPersentual De Faltas= "+ calcularPercentualFaltas() +"% "+
                "\nNota= " + calcularMedia() +
                "\nSituação= " + situacao();
    }
}
