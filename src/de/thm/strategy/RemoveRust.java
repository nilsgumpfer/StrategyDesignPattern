package de.thm.strategy;

/**
 * Created by Nils on 07.05.2016.
 */
public class RemoveRust implements DisassemblingStrategy {
    @Override
    public void act() {
        System.out.println("Sprayed WD40 to remove rust.");
    }
}
