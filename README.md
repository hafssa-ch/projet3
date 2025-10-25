EXERCICE 1:

Objectif
Calculer la somme des n premiers termes de la série harmonique :
S=1+ 1/2 + 1/3 +...+ 1/n
​
 Fonctionnement
L’utilisateur saisit un entier n.
Le programme calcule et affiche la somme correspondante avec une boucle.

<img width="993" height="214" alt="image" src="https://github.com/user-attachments/assets/84ea48bc-4e6c-4e53-95b0-72b0b4c9f0d8" />

EXERCICE 2:

Objectif
Afficher un triangle isocèle formé d’étoiles (*) aligné à gauche, selon une hauteur donnée.

Fonctionnement

L’utilisateur saisit la hauteur du triangle (n).
Chaque ligne affiche un nombre croissant d’étoiles impaires (1, 3, 5, ...).

<img width="1035" height="273" alt="image" src="https://github.com/user-attachments/assets/2eae7819-7045-45cd-972e-519f09cb285e" />

EXERCICE 3:

Objectif
Créer un tableau contenant les carrés des n premiers nombres impairs et les afficher.

Fonctionnement
L’utilisateur saisit le nombre de valeurs n.
Le programme génère les n premiers impairs et affiche leur carré.

<img width="781" height="294" alt="image" src="https://github.com/user-attachments/assets/d60f6683-25df-476e-8479-838ebae973d9" />

EXERCICE 4:

Objectif
Créer une classe d’outils pour manipuler des tableaux à deux dimensions (double[][]).

Méthodes demandées
affiche(double[][] t) affiche le tableau.
regulier(double[][] t) teste si toutes les lignes ont la même taille.
sommeLignes(double[][] t) renvoie les sommes de chaque ligne.
somme(double[][] t1, double[][] t2) renvoie la somme de deux tableaux réguliers.

<img width="748" height="273" alt="image" src="https://github.com/user-attachments/assets/b63d4f47-d8fb-42e0-b19d-b74f205c1dcb" />

EXERCICE 5:

Objectif
Faire pivoter une matrice carrée d’entiers de 90° dans le sens horaire, sans créer de second tableau.

Étapes principales
Lire la taille N et les éléments de la matrice.
Transposer la matrice (A[i][j]  A[j][i]).
Inverser chaque ligne pour obtenir la rotation de 90°.
Afficher le résultat.

<img width="1005" height="486" alt="image" src="https://github.com/user-attachments/assets/83ae71ff-a21c-4d96-bb43-928860f3b35d" />

EXERCICE 6:

Objectif
Pour un tableau d’entiers T et une fenêtre de taille k, calculer le nombre d’éléments distincts dans chaque fenêtre, en temps O(n).

Principe
Utiliser un tableau freq pour compter les occurrences de chaque valeur.
Maintenir un compteur distinct mis à jour à chaque glissement de la fenêtre.



