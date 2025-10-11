package exercices;
import java.util.Scanner;

public class Exercice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez n et k : ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            T[i] = sc.nextInt();
        }

        final int MAXV = 100000;
        int[] freq = new int[MAXV + 1];
        int distinct = 0;

        // Initialiser la première fenêtre
        for (int i = 0; i < k; i++) {
            if (freq[T[i]] == 0) distinct++;
            freq[T[i]]++;
        }
        System.out.print(distinct + " ");

        // Glissement de la fenêtre
        for (int i = k; i < n; i++) {
            int out = T[i - k];
            int in = T[i];

            freq[out]--;
            if (freq[out] == 0) distinct--;

            if (freq[in] == 0) distinct++;
            freq[in]++;

            System.out.print(distinct + " ");
        }

        System.out.println();
        sc.close();
    }
}
