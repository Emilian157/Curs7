package org.fasttrackit.curs7;

public class Lamp {
    public boolean isTurnedOn;

    public Lamp(boolean isTurnedOn) {
        this.isTurnedOn = isTurnedOn;
    }

    public Lamp() {
        isTurnedOn = false;
    }

    public void turnLampOn() {
        isTurnedOn = true;
    }

    public void turnLampOff() {
        isTurnedOn = false;
    }

    public boolean getIsTurnedOn() {
        return this.isTurnedOn;
    }

    public void setIsTurnedOn(String parola, boolean stareaDorita) {
        if (parola.equals("lectia7")) {
            isTurnedOn = stareaDorita;
        }
    }
}