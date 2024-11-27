package fr.pantheonsorbonne.miage.game;

import fr.pantheonsorbonne.miage.playerRelatedStuff.Player;

public class Echiquier {
    private Piece[][] plateau;

    private static final int TAILLE = 14;

    public Echiquier(Player joueur1, Player joueur2, Player joueur3, Player joueur4) {
        plateau = new Piece[TAILLE][TAILLE];
        Player[] players = new Player[]{joueur1, joueur2, joueur3, joueur4};
        //maintenant place toutes les pièces sur l'échiquier avec leurs appartennance et tout
    }
    
    public void initialiser(Echiquier plateau, Player[] players) {
        
    }

    public void jouerCoup(Coup coup) {
        // Implémenter la logique pour jouer un coup
    }

    public void movePiece(Piece piece, Case position) {
        plateau[position.getColonne().ordinal()][position.getLigne()-1] = piece;
        piece.setPosition(position);
        //update la pos de la pièce prise si la case est dékja occupée
    }

    public void emptyCell(Case position) {
        plateau[position.getColonne().ordinal()][position.getLigne()-1] = null;
    }

    public Piece getPieceAt(Case position) {
        return this.plateau[position.getColonne().ordinal()][position.getLigne()-1];
    }
}