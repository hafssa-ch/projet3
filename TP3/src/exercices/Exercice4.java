package exercices;

public class Exercice4 {
    public static void main(String[] args) {
        double[][] t1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] t2 = {{7, 8, 9}, {10, 11, 12}};

        System.out.println("Tableau t1 :");
        TableauUtils.affiche(t1);

        System.out.println("\nSommes des lignes de t1 :");
        double[] s = TableauUtils.sommeLignes(t1);
        for (double v : s) System.out.print(v + " ");
        System.out.println();

        System.out.println("\nSomme t1 + t2 :");
        double[][] somme = TableauUtils.somme(t1, t2);
        if (somme != null) TableauUtils.affiche(somme);
        else System.out.println("Erreur : tableaux non réguliers ou dimensions différentes.");
    }
}
