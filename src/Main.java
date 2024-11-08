import java.util.Scanner;
import Pokemon.Pokemon;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-------------------------------------");
        System.out.println("-- Bem vindo a Batalha de Pokémons --");
        System.out.println("-------------------------------------\n");

        Scanner sc = new Scanner(System.in);

        // Primeiro Pokémon

        System.out.println("Digite os dados do primeiro pokémon: ");

        System.out.print("Nome do primeiro pokémon: ");
        String nome1 = sc.nextLine();

        System.out.print("Vida Inicial: ");
        int vida1 = sc.nextInt();

        System.out.print("Ataque: ");
        int ataque1 = sc.nextInt();

        System.out.print("Armadura: ");
        int armadura1 = sc.nextInt();

        Pokemon p1 = new Pokemon(nome1, vida1, ataque1, armadura1);

        // Segundo Pokémon

        System.out.println("Digite os dados do segundo pokémon: ");

        System.out.print("Nome do segundo pokémon: ");
        String nome2 = sc.nextLine();

        System.out.print("Vida Inicial: ");
        int vida2 = sc.nextInt();

        System.out.print("Ataque: ");
        int ataque2 = sc.nextInt();

        System.out.print("Armadura: ");
        int armadura2 = sc.nextInt();

        Pokemon p2 = new Pokemon(nome2, vida2, ataque2, armadura2);

        // Turnos

        System.out.print("Quantos turnos você deseja executar: ");
        int turnos = sc.nextInt();

        for (int i = 1; i <= turnos; i++)
        {
            System.out.println("Turno #" + i);

            p1.Atacar(p2.vida + p2.armadura);
            p2.Atacar(p1.vida + p1.armadura);

            System.out.println(p1.nome + ": " + p1.vida + " de vida");
            System.out.println(p2.nome + ": " + p2.vida + " de vida");
        }
    }
}
