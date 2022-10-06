# jeuxVideoGroup

Travail de groupe en Java (Bruno et David).
Prototype de quiz inspiré de l'émission "tout le monde veux prendre sa place".

## Variable du jeu :

### String
Nom des joueurs = String[]
Nom des thèmes = String[]

### int
Nombre de joueurs max = int (4)
Scores = int[]
Nombre de tour = int (3)

### boolean
partieEnCour = false // sert a faire boucler la partie

## Déroulé du jeu :

1- Print d'un message de bienvenue
2- Ask nombre de joueurs
    2-1- 1 joueur
        2-1-1- Entrer nom du joueur
        2-1-2- Lancement de la partie
    2-2- plusieurs joueurs
        2-2-1- Entrer nom des joueurs
        2-2-2- Définition de l'ordre des joueurs
        2-2-3- Lancement de la partie

## déroulé d'une partie

1- Le ou les joueurs se voient poser une question, pendant x tours
2- fin de partie, on présente les résultats et donc le vainqueur
3- menu de fin
    a. recommencer
    b. quitter

## déroulé d'un tour d'un joueur

1- PRINT l'ordinateur choisi un thème aléatoirement
2- ASK En fonction du thème, l'ordinateur demande de choisir la difficulté (duo, carré, cash)
3- PRINT question
4- Le joueur donne une réponse
5- feedback (bonne ou mauvaise réponse)
6- gestion du compteur de points