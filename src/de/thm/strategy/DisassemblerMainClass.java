package de.thm.strategy;

import java.util.ArrayList;

/**
 * Created by Nils on 07.05.2016.
 */
public class DisassemblerMainClass {
    private DisassemblingStrategy dsPhillips    = new TurnPhillipsScrew();
    private DisassemblingStrategy dsAllen       = new TurnAllenScrew();
    private DisassemblingStrategy dsHexagon     = new TurnHexagonScrew();
    private DisassemblingStrategy dsTorx        = new TurnTorxScrew();
    private DisassemblingStrategy dsSlotted     = new TurnSlottedScrew();
    private DisassemblingStrategy dsRust        = new RemoveRust();


    public static void main(String[] args) {
        DisassemblerMainClass damcMainClass = new DisassemblerMainClass();
        ArrayList<Part> lPartsToDisassemble = new ArrayList<>();

        lPartsToDisassemble.add(new Screw(false,"Phillips"));
        lPartsToDisassemble.add(new Screw(false,"Torx"));
        lPartsToDisassemble.add(new Screw(false,"Allen"));
        lPartsToDisassemble.add(new Screw(false,"Slotted"));
        lPartsToDisassemble.add(new Screw(false,"Hexagon"));
        lPartsToDisassemble.add(new Screw(true,"Phillips"));
        lPartsToDisassemble.add(new Screw(true,"Torx"));
        lPartsToDisassemble.add(new Screw(true,"Allen"));
        lPartsToDisassemble.add(new Screw(true,"Slotted"));
        lPartsToDisassemble.add(new Screw(true,"Hexagon"));


        for(Part pCurrentPart:lPartsToDisassemble){
            damcMainClass.choseStrategy(pCurrentPart);
        }
    }

    public void choseStrategy(Part pPart){
        if(pPart.isRusty())
            dsRust.act();

        switch(pPart.getType()){
           case "Phillips":
               dsPhillips.act();
               break;
           case "Allen":
               dsAllen.act();
               break;
           case "Slotted":
               dsSlotted.act();
               break;
           case "Hexagon":
               dsHexagon.act();
               break;
            case "Torx":
                dsTorx.act();
                break;
        }
    }
}
