package exercices;
import java.util.Scanner;

public class Exercice5 {

    // Rotation 90° horaire en place
    public static void rotate90ClockwiseInPlace(int[][] A) {
        int N = A.length;

        // Étape 1 : Transposition
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Étape 2 : Renverser chaque ligne
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][N - 1 - j];
                A[i][N - 1 - j] = temp;
            }
        }
    }

    public static void affiche(int[][] A) {
        for (int[] ligne : A) {
            for (int val : ligne) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez N (taille de la matrice) : ");
        int N = sc.nextInt();
        int[][] A = new int[N][N];

        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        rotate90ClockwiseInPlace(A);
        System.out.println("\nMatrice après rotation de 90° horaire :");
        affiche(A);

        sc.close();
    }
}
