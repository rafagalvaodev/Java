abstract class FiguraGeometrica {
    public abstract void debug();

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.debug();
        System.out.println();
        Qudrado qudrado = new Qudrado();
        qudrado.debug();
    }
}

class Retangulo extends FiguraGeometrica{

    @Override
    public void debug() {
        System.out.println("Retangulo");
    }
}

class Qudrado extends FiguraGeometrica{
    @Override
    public void debug() {
        System.out.println("Quadrado");
    }
}