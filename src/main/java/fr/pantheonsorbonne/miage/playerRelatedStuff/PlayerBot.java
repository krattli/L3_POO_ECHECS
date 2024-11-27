package fr.pantheonsorbonne.miage.playerRelatedStuff;

import fr.pantheonsorbonne.miage.game.Coup;
import java.util.ArrayList;
import java.util.Random;

public class PlayerBot extends Player{

    static Random random = new Random();

    public PlayerBot(String name) {
        super(name);
    }

    public Coup getNextCoup(){
        ArrayList<Coup> allPossibleMoves = getAllPossibleMoves();
        if (allPossibleMoves.size() > 0) {
            int randomIndex = random.nextInt(allPossibleMoves.size());
            return allPossibleMoves.get(randomIndex);
        }
        return null;
    }
}
