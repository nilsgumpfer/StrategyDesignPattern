package de.thm.strategy;

/**
 * Created by Nils on 08.05.2016.
 */
public class Screw implements Part {
    boolean bRusty;
    String sType;

    public Screw(boolean bRusty, String sType){
        this.bRusty = bRusty;
        this.sType = sType;
    }

    public void setbRusty(boolean bRusty) {
        this.bRusty = bRusty;
    }

    @Override
    public boolean isRusty() {
        return bRusty;
    }

    public void setsType(String sType) {
        this.sType = sType;
    }

    @Override
    public String getType() {
        return sType;
    }
}
