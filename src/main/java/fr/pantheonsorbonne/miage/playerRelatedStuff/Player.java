package fr.pantheonsorbonne.miage.playerRelatedStuff;

import java.util.ArrayList;

import fr.pantheonsorbonne.miage.enums.Color;
import fr.pantheonsorbonne.miage.game.Coup;
import fr.pantheonsorbonne.miage.game.Piece;

public abstract class Player{
    private final String nom;
    private int points;
    private Color color;
    public Player (String nom) {
        this.nom = nom;
        this.points = 0;
    }
    public String getNom(){
        return this.nom;
    }
    public int getPoints(){
        return this.points;
    }
    public void setColor (Color color){
        this.color = color;
    }
    public void addPoints(int points){
        this.points+=points;
    }

    public abstract Coup getNextCoup();

    public ArrayList<Coup> getAllPossibleMoves(){
        ArrayList<Coup> coups = new ArrayList<>();
        // Implémenter tout ça
        return coups;
    }

    public ArrayList<Piece> getAllPieces(){
        ArrayList<Piece> pieces = new ArrayList<>();
        return pieces;
    }
}