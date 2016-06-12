package de.thm.strategy;

/**
 * Created by Nils on 07.05.2016.
 */
public class TurnTorxScrew implements DisassemblingStrategy {
    @Override
    public void act() {
        System.out.println("Turned torx-screw.");
    }
}
