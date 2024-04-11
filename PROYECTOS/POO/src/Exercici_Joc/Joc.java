package Exercici_Joc;

public abstract class Joc {
    protected int vides;
    protected int videsInicials;
    private static int record = 0;

    public Joc(int videsInicials) {
        this.videsInicials = videsInicials;
        this.vides = videsInicials;
    }

    public void reiniciarPartida() {
        this.vides = this.videsInicials;
    }

    public boolean llevarVida() {
        this.vides--;
        if (this.vides <= 0) {
            System.out.println("Joc Acabat");
            return false;
        }
        return true;
    }

    public abstract void jugar();

    protected static void actualitzarRecord(int vides) {
        if (vides > record) {
            record = vides;
            System.out.println("Nou rècord! Vides restants: " + vides);
        } else if (vides == record) {
            System.out.println("Has igualat el rècord amb " + vides + " vides restants.");
        }
    }

   /* public static void main(String[] args) {
        Joc joc1 = new Joc(5);
        joc1.mostraVidesRestants();
        joc1.vides--;
        joc1.mostraVidesRestants();

        Joc joc2 = new Joc(5);
        joc2.mostraVidesRestants();
        joc1.mostraVidesRestants();
    }*/
}

