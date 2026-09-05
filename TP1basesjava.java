package TP1basesjava;
import java.util.Scanner;

public class TP1basesjava {

	public TP1basesjava() {
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Moyenne");
            System.out.println("4. Trouver le plus grand");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");
            
            choix = scanner.nextInt();

            if (choix >= 1 && choix <= 4) {
                System.out.print("Entrez deux entiers : ");
                int nbr1 = scanner.nextInt();
                int nbr2 = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Résultat : " + (nbr1 + nbr2));
                        break;
                    case 2:
                        System.out.println("Résultat : " + (nbr1 * nbr2));
                        break;
                    case 3:
                        System.out.println("Résultat : " + ((nbr1 + nbr2) / 2.0));
                        break;
                    case 4:
                        if (nbr1 > nbr2) {
                            System.out.println("Résultat : " + nbr1);
                        } else {
                            System.out.println("Résultat : " + nbr2);
                        }
                        break;
                }
                System.out.println();
            } else if (choix != 0) {
                System.out.println("Option invalide.\n");
            }

        } while (choix != 0);

        System.out.println("Au revoir !");
        scanner.close();
    }
	

}
