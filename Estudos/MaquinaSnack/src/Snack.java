import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nome;
    private double preco;

    public Snack() {
        this.idSnack = ++Snack.contadorSnacks;
    }

    public Snack(String nome, double preco) {
        this();
        this.nome = nome;
        this.preco = preco;
    }

    public static int getContadorSnacks() {
        return contadorSnacks;
    }

    public int getIdSnack() {
        return idSnack;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("N° %d %s  $ %.2f", this.idSnack, this.nome, this.preco);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(preco, snack.preco) == 0 && Objects.equals(nome, snack.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nome, preco);
    }
}
