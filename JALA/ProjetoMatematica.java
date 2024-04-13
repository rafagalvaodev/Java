import java.util.List;
import java.util.Scanner;

public class ProjetoMatematica {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.print("Selecione uma semana: 1-Indução, 2-Teoria dos conjuntos, 3-Relações, 4-Funções, 0-Sair: ");
            int opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    break;
                case 2:
                    List<Integer> inteiros = List.of(-6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6);
                    List<Integer> naturais = List.of(0, 1, 2, 3, 4, 5, 6);
                    List<Float> racionais = List.of(0.3f, -1.5f, 0.333333f, 0f, 1f, 2f, 3f, 4.0f, 5.5f);

                    int pontos2 = 0;

                    boolean text01 = false;
                    boolean text02 = false;
                    boolean text03 = false;
                    // Número que queremos verificar
                    Scanner read2 = new Scanner(System.in);
                    while (true) {

                        if (!text01) {
                            System.out.println(inteiros);
                            System.out.print("Qual é o conjuntos dos números acima? 1-Inteiros, 2-Naturais, 3-Racionais: ");
                            int saindo = read2.nextInt();
                            if (saindo == 1) {
                                System.out.println("O Conjunto é Interios");
                                System.out.println("Você acertou");
                                pontos2++;
                            } else {
                                System.out.println("Você Errou");
                                System.out.println("O Conjunto correto é Interios");

                            }
                            text01 = true;
                        }
                        if (!text02) {
                            System.out.println(naturais);
                            System.out.print("Qual é o conjuntos dos números acima? 1-Inteiros, 2-Naturais, 3-Racionais: ");
                            int saindo = read2.nextInt();
                            if (saindo == 2) {
                                System.out.println("O Conjunto é Naturais");
                                System.out.println("Você acertou");
                                pontos2++;
                            } else {
                                System.out.println("Você Errou");
                                System.out.println("O Conjunto correto é Naturais");

                            }
                            text02 = true;
                        }
                        if (!text03) {
                            System.out.println(racionais);
                            System.out.print("Qual é o conjuntos dos números acima? 1-Inteiros, 2-Naturais, 3-Racionais: ");
                            int saindo = read2.nextInt();
                            if (saindo == 3) {
                                System.out.println("O Conjunto é Racionais");
                                System.out.println("Você acertou");
                                pontos2++;
                            } else {
                                System.out.println("Você Errou");
                                System.out.println("O Conjunto correto é Racionais");

                            }
                            text03 = true;
                        }

                        if (text03) {
                            break;
                        }

                    }
                    break;
                case 3:
                    String[] one = {"1. Carro", "a. Sol"};
                    String[] two = {"2. Gato", "b. Chave"};
                    String[] three = {"3. Casa", "c. Programação"};
                    String[] four = {"4. Dev", "d. Gasolina"};
                    String[] five = {"5. Praia", "e. Ração"};

                    boolean texto1 = false;
                    boolean texto2 = false;
                    boolean texto3 = false;
                    boolean texto4 = false;
                    boolean texto5 = false;
                    int pontos3 = 0;
                    Scanner read3 = new Scanner(System.in);

                    System.out.println("\nBem vindo a semana 3 - 'Relações'!");
                    System.out.print("Qual o seu nome? ");
                    String nome = read3.nextLine();

                    System.out.println("\nTEMOS AS SEGUNITES COLUNAS:");
                    System.out.println(" ");
                    System.out.println("PRIMÁRIA     SECUNDÁRIA");
                    for (String o : one) {
                        System.out.print(o + "     ");
                    }
                    System.out.println(" ");
                    for (String t : two) {
                        System.out.print(t + "      ");
                    }
                    System.out.println(" ");
                    for (String tr : three) {
                        System.out.print(tr + "      ");
                    }
                    System.out.println(" ");
                    for (String f : four) {
                        System.out.print(f + "       ");
                    }
                    System.out.println(" ");
                    for (String fi : five) {
                        System.out.print(fi + "     ");
                    }


                    System.out.println("\n\n" + nome + ", quais dessas palavras, possuem relação? Responda na ordem 'PRIMÁRIA' , no formato 'numero e letra' (Ex: 0 e X)");
                    while (true) {
                        if (texto1 == false) {
                            System.out.print("R. ");
                            String opcao1 = read3.nextLine();
                            if (opcao1.equals("1 e d")) {
                                System.out.println("Certo. Vamos ao pŕoximo.");
                                pontos3 += 10;
                            } else {
                                System.out.println("Errado. Vamos ao próximo.");
                            }
                            texto1 = true;
                        }
                        if (texto2 == false) {
                            System.out.print("R. ");
                            String opcao2 = read3.nextLine();
                            if (opcao2.equals("2 e e")) {
                                System.out.println("Certo. Vamos ao pŕoximo.");
                                pontos3 += 10;
                            } else {
                                System.out.println("Errado. Vamos ao próximo.");
                            }
                            texto2 = true;
                        }
                        if (texto3 == false) {
                            System.out.print("R. ");
                            String opcao3 = read3.nextLine();
                            if (opcao3.equals("3 e b")) {
                                System.out.println("Certo. Vamos ao próximo");
                                pontos3 += 10;
                            } else {
                                System.out.println("Errado. Vamos ao próximo.");
                            }
                            texto3 = true;
                        }
                        if (texto4 == false) {
                            System.out.print("R. ");
                            String opcao4 = read3.nextLine();
                            if (opcao4.equals("4 e c")) {
                                System.out.println("Certo. Vamos ao prócimo");
                                pontos3 += 10;
                            } else {
                                System.out.println("Errado. Vamos ao próximo");
                            }
                            texto4 = true;
                        }
                        if (texto5 == false) {
                            System.out.print("R. ");
                            String opcao5 = read3.nextLine();
                            if (opcao5.equals("5 e a")) {
                                System.out.println("Certo");
                                pontos3 += 10;
                            } else {
                                System.out.println("Errado");
                            }
                            texto5 = true;
                        }
                        if (texto5 == true) {
                            System.out.println("\n" + nome + " sua pontuação total foi de " + pontos3 + " pontos!");
                            break;
                        }
                    }
                    System.out.println("\nEste é o gabarito das respostas: \n[1 e d] - [2 e e] - [3 e b] - [4 e c] - [5 e a]");
                    break;
                case 4:
                    int ponto = 0;
                    boolean texto1_impresso = false;
                    boolean texto2_impresso = false;
                    boolean texto3_impresso = false;
                    Scanner read4 = new Scanner(System.in);
                    while (true) {
                        if (!texto1_impresso) {
                            System.out.println("Dada a função f: A → B.");
                            System.out.println(":::::::@@@:::::::::::::::::::::::::@::@:::::::::::\n" + ":::::::::@::::::::::::::::::::@@@::@::@:::::::::::\n" + ":::::::@@@::@@:::::::::::::::::@@::@::@:::::::::::\n" + "::::::@::@::::@@@::::::::::::@@:@::@::@:::::::::::\n" + ":::::::@@@:::::::@@@::::::@@@:::::::@@::::::::::::\n" + "::::::::::::::::::::@:::@@::::::::::::::::::::::::\n" + ":::::::::::::::::::::@@@:@@@::::::::::::::::::::::\n" + ":::::::::::::::::@@@::::::::@@:@:::@:::@::::::::::\n" + ":::::::@@@::::@@@:::::::::::::@@:::::@::::::::::::\n" + "::::::@:::::::::::::::::::::@@@@:::@:::@::::::::::\n" + ":::::::@@@::::::::::::::::::::::::::::::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::@::::::::::::::::::::@::::@:::@::::::::::::\n" + ":::::::@::::::::::::::::::::@@:::@:::@::::::::::::\n" + ":::::::@@@::@@@@@@@@@@@@@@@@@@@::@:@:@::::::::::::\n" + ":::::::@::@:::::::::::::::::@@:::@:@:@::::::::::::\n" + ":::::::@@@::::::::::::::::::@:::::@:@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::::@:::::::::::::::::::::::::::@:::@::::::::\n" + ":::::::@@@::::::::::::::::::::@@::::::@:@:::::::::\n" + "::::::@::@:@@@@@@@@@@@@@@@@@@@@@@@:::::@::::::::::\n" + "::::::@::@::::::::::::::::::::@@:::::::@::::::::::\n" + ":::::::@@@:::::::::::::::::::::::::::::@::::::::::\n");
                            System.out.print("A função é 1-Bijetora, 2-Sobrejetora, 3-Injetora? ");
                            int funcao1 = read4.nextInt();
                            if (funcao1 == 1) {
                                ponto += 10;
                            } else {
                                System.out.println("Você Errou!");
                            }
                            texto1_impresso = true;
                        }
                        if (!texto2_impresso) {
                            System.out.println("Dada a função f: A → B.");
                            System.out.println(":::::::@@@::::::::::::::::::::::::::::::::::::::::\n" + ":::::::::@::::::::::::::::::::@:::::::@::@::::::::\n" + ":::::::@@@::::::::::::::::::::@@::::::@::@::::::::\n" + "::::::@::@:@@@@@@@@@@@@@@@@@@@@@@::::::@@:::::::::\n" + ":::::::@@@::::::::::::::::::::@@::::::@::@::::::::\n" + "::::::::::::::::::::::::::::::@:::::::@::@::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + "::::::@:::::::::::::::::::::::@::::::@:::@::::::::\n" + "::::::@:::::::::::::::::::::::@@::::::@:@:::::::::\n" + "::::::@@@::@@@@@@@@@@@@@@@@@@@@@@::::::@::::::::::\n" + "::::::@::@::::::::::::::::::::@@:::::::@::::::::::\n" + "::::::@@@:::::::::::::::::::::@::::::::@::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::@@@::::::::::::::::::::::::::::::::::::::::\n" + "::::::@::::@@@@@:::::::::::::::::::::@@@@:::::::::\n" + "::::::@:::::::::@@@@@@@@::::::::@:::::::@:::::::::\n" + ":::::::@@@::::::::::::::@@@@@@::@@:::::@::::::::::\n" + ":::::::::::::::::::::::::::::@@@@@@:::@:::::::::::\n" + ":::::::::::::::::::::::::::@@@::@@:::@::::::::::::\n" + "::::::::::::::::::::::::@@@:::::@::::@@@@:::::::::\n" + ":::::::::@::::::::::@@@@::::::::::::::::::::::::::\n" + ":::::::::@:::::::@@@::::::::::::::::::::::::::::::\n" + ":::::::@@@:::@@@@:::::::::::::::::::::::::::::::::\n" + "::::::@::@:@@:::::::::::::::::::::::::::::::::::::\n" + ":::::::@@@::::::::::::::::::::::::::::::::::::::::\n");
                            System.out.print("A função é 1-Bijetora, 2-Sobrejetora, 3-Injetora? ");
                            int funcao2 = read4.nextInt();
                            if (funcao2 == 2) {
                                ponto += 10;
                            } else {
                                System.out.println("Você Errou!");
                            }
                            texto2_impresso = true;

                        }
                        if (!texto3_impresso) {
                            System.out.println("Dada a função f: A → B.");
                            System.out.println(":::::::@@@::::::::::::::::::@:::::@::@::::::::::::\n" + ":::::::::@::::::::::::::::::@@::::@::@::::::::::::\n" + ":::::::@@@::@@@@@@@@@@@@@@@@@@@:::@::@::::::::::::\n" + "::::::@::@::::::::::::::::::@@::::@::@::::::::::::\n" + ":::::::@@@::::::::::::::::::@::::::@@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::@::::::::::::::::::::@::::@:::@::::::::::::\n" + ":::::::@::::::::::::::::::::@@:::@:::@::::::::::::\n" + ":::::::@@@::@@@@@@@@@@@@@@@@@@@::@:@:@::::::::::::\n" + ":::::::@::@:::::::::::::::::@@:::@:@:@::::::::::::\n" + ":::::::@@@::::::::::::::::::@:::::@:@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::::::::::::::::::::::::::::@::@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::@@::::::::::::::\n" + ":::::::::::::::::::::::::::::::::@::@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::@@@::::::::::::::::::::::::@:::@:::::::::::\n" + "::::::@:::::::::::::::::::::@@:::::@:@::::::::::::\n" + "::::::@:::::@@@@@@@@@@@@@@@@@@@@::::@:::::::::::::\n" + ":::::::@@@::::::::::::::::::@@::::::@:::::::::::::\n" + "::::::::::::::::::::::::::::::::::::::::::::::::::\n" + ":::::::::@::::::::::::::::::@:::::::::::::::::::::\n" + ":::::::::@::::::::::::::::::@@::::@@@@::::::::::::\n" + ":::::::@@@::@@@@@@@@@@@@@@@@@@@:::::@:::::::::::::\n" + "::::::@::@::::::::::::::::::@@:::::@::::::::::::::\n" + ":::::::@@@::::::::::::::::::@:::::@@@@@:::::::::::\n");
                            System.out.print("A função é 1-Bijetora, 2-Sobrejetora, 3-Injetora? ");
                            int funcao3 = read4.nextInt();
                            if (funcao3 == 3) {
                                ponto += 10;
                            } else {
                                System.out.println("Você Errou!");
                            }
                            texto3_impresso = true;

                        }

                        if (texto3_impresso == true) {
                            System.out.println("Você fez " + ponto + " Pontos");
                            break;
                        }

                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção Invalida!");
                    break;
            }

            if (opcao == 0) {
                break;
            }

            }
        }
    }
