import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnackMachine {

    public static void snackMachine(){
        boolean quit = false;
        Scanner read = new Scanner(System.in);
        List<Snack> produtos = new ArrayList<>();
        System.out.println("$-$ Bem vindo a maquina de vendas de snacks $-$");
        Snacks.mostrarSnacks();
        while (!quit){
            try {
                String opcao = mostrarMenu(read);
               quit = execultaOpcoes(opcao, read, produtos);
            }catch (Exception ex){
                System.out.printf("Erro: ", ex.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    public static String mostrarMenu(Scanner reads){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Menu");
        stringBuilder.append("\n");
        stringBuilder.append("Escolha uma opção");
        stringBuilder.append("\n1. Comprar snacks");
        stringBuilder.append("\n2. Mostrar ticket");
        stringBuilder.append("\n3. Adicionar snack");
        stringBuilder.append("\n4. Encerrar operação");
        stringBuilder.append("\nSua opção = ");
        System.out.println(stringBuilder);
        return reads.nextLine();

    }

    public static void comprarSnack(Scanner scanner, List<Snack> produtos){
        System.out.print("Digite qual snack deseja N°: ");
        int idSnack = Integer.parseInt(scanner.nextLine());
        boolean snackEncontrado = false;
        for(Snack snack: Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                produtos.add(snack);
                System.out.printf("Snack adicionado %s", snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.printf("Snack não encontrado N° %d", idSnack);
        }
    }

   public static void mostrarTicket(List<Snack> produtos){
        StringBuilder ticket = new StringBuilder();
        double totalCompra = 0.0;
        ticket.append("$-$ Sua Compra $-$");
        for(Snack snacks: produtos){
            ticket.append("\n\t");
            ticket.append(snacks.getNome());
            ticket.append(" $ ");
            ticket.append(snacks.getPreco());
            totalCompra += snacks.getPreco();
        }
        ticket.append( String.format("\nTotal a pagar $%.2f" , totalCompra));
        System.out.println(ticket);
   }

   private static void adicionarSnack(Scanner scanner){
       System.out.print("Digite o nome do Snack: ");
       String nomeNovoSnack = scanner.nextLine();
       System.out.print("Digite o preço: ");
       double precoNoveSnack = Double.parseDouble(scanner.nextLine());
       Snacks.adicionarSnack(new Snack(nomeNovoSnack, precoNoveSnack));
       System.out.println("Novo snack adicionado!");
       Snacks.mostrarSnacks();
   }


    private static boolean execultaOpcoes(String opcao, Scanner reads, List<Snack> produtos){
        boolean quit = false;

        switch (opcao){
            case "1" -> comprarSnack(reads, produtos);
            case "2" -> mostrarTicket(produtos);
            case "3" -> adicionarSnack(reads);
            case "4" -> {
                System.out.println("Volte sempre!");
                quit = true;
            }
            default -> System.out.printf("%s é uma opção invalida ", opcao);
        }
        return quit;
    }

    public static void main(String[] args) {
        snackMachine();
    }
}
