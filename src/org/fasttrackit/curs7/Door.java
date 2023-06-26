package org.fasttrackit.curs7;

public class Door {
    private boolean isClosed;
    private boolean isLocked;

    public Door(boolean isClosed, boolean isLocked) {
        this.isClosed = isClosed;
        this.isLocked = isLocked;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        if (!isLocked) {
            isClosed = closed;
            System.out.println("USA A FOST DESCHISA/INCHISA CU SUCCES");
        } else {
            System.out.println("USA ESTE INCUIATA, NU POT FACE ASTA");
        }
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        if (isClosed) {
            isLocked = locked;
            System.out.println("USA A FOST INCUIATA SAU DESCUIATA CU SUCCES");
        } else {
            System.out.println("USA NU ESTE INCHISA");
        }
    }

    public void closeDoor() {
        setClosed(true);
    }

    public void openDoor() {
        setClosed(false);
    }

    public void lockDoor() {
        setLocked(true);
    }

    public void unlockDoor() {
        setLocked(false);
    }


}