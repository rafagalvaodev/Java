package exerciciopessoa;
public class ExercicioPessoa {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pessoa person[] = new Pessoa[2];
        Livro book[] = new Livro[3];
        
        person[0] = new Pessoa("Lucas", 16, "Masculino");
        person[1] = new Pessoa("Ingridi", 26, "Feminino");
        
        book[0] = new Livro("O Alquimista", "Paulo Coelho", 225, 0, false, person[0]);
        book[1] = new Livro("Pai rico, Pai pobre", "Robert T. Kiyosaki", 320, 0, false, person[1]);
        book[2] = new Livro("O Mercador de Veneza", "Willian Shakespeare", 135, 0, false, person[1]);
        
        book[0].open();
        book[0].leaf_Through(100);
        book[0].next_Page();
        System.out.println(book[0].details());
    }
    
}
