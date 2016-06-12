package de.thm.strategy;

/**
 * Created by Nils on 07.05.2016.
 */
public class TurnPhillipsScrew implements DisassemblingStrategy {
    @Override
    public void act() {
        System.out.println("Turned phillips-screw.");
    }
}
