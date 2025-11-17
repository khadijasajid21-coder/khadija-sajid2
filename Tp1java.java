import java.util.Scanner;

public class Tp1java {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double moyenne(int... valeurs) {
        int total = 0;
        for (int v : valeurs) {
            total += v;
        }
        return (double) total / valeurs.length; // correction !
    }

    public static int maximum(int... valeurs) {
        int max = valeurs[0];
        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choix;

        do {

            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Moyenne");
            System.out.println("4. Trouver le plus grand");
            System.out.println("0. Quitter");
            System.out.print("Choisissez une option : ");

            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.println("Entrez deux entiers : ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Résultat : " + addition(a, b));
                    break;

                case 2:
                    System.out.println("Entrez deux entiers : ");
                    int a1 = sc.nextInt();
                    int b1 = sc.nextInt();
                    System.out.println("Résultat : " + multiplication(a1, b1));
                    break;

                case 3:
                    System.out.println("Combien de valeurs ?");
                    int n = sc.nextInt();
                    int[] valeurs = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.print("Valeur " + (i + 1) + ": ");
                        valeurs[i] = sc.nextInt();
                    }
                    System.out.println("Moyenne : " + moyenne(valeurs));
                    break;

                case 4:
                    System.out.println("Combien de nombres ?");
                    int n1 = sc.nextInt();
                    int[] valeurs1 = new int[n1];
                    for (int i = 0; i < n1; i++) {
                        System.out.print("Nombre " + (i + 1) + ": ");
                        valeurs1[i] = sc.nextInt();
                    }
                    System.out.println("Maximum : " + maximum(valeurs1));
                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Option invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
}