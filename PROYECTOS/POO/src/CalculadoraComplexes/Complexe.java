package CalculadoraComplexes;

public class Complexe {

    double partReal;
    double partImaginaria;

    //creem el constructor per defecte que inicializa els valors en 0
    public Complexe(){
        this.partReal = 0;
        this.partImaginaria = 0;
    }
    //construcctor amb parametres que li tindrem que indicar cuan creem l'objecte
    public Complexe(int partReal, int partImaginaria){

        this.partReal = partReal;
        this.partImaginaria = partImaginaria;
    }

    //getters y setters
    public double getPartImaginaria() {

        return partImaginaria;
    }

    public double getPartReal() {

        return partReal;
    }

    public void setPartReal(double partReal) {

        this.partReal = partReal;
    }

    public void setPartImaginaria(double partImaginaria) {

        this.partImaginaria = partImaginaria;
    }
    //metodo per a imprimir el numero complexe utilitzant toString
    public String toString(){
        return "(" + partReal + "+" + partImaginaria + "i)";
    }

    //metode per a sumar dos nuemros complexes
    public Complexe sumar(Complexe numComplexe){
         /*sumem la part real de el numero
        per al que gastem el metode + la part real del numero que volem sumar */
        double novaPR = this.partReal + numComplexe.getPartReal();
        /*sumemem la part imaginaria de aquest dos numeros*/
        double novaPI = this.partImaginaria + numComplexe.getPartImaginaria();
        /*retornem un nou objecte que se crea de la suma dels anteriors*/
        return new Complexe((int)novaPR, (int)novaPI);
    }

    //metode per a restar dos numeros complexes, igual que el anterior pero restant
    public Complexe restar(Complexe numComplexe){

        double novaPR = this.partReal - numComplexe.getPartReal();

        double novaPI = this.partImaginaria - numComplexe.getPartImaginaria();

        return new Complexe((int)novaPR, (int)novaPI);
    }

    //metode per a multiplicar dos numeros complexos
    public Complexe multiplicar(Complexe numComplexe){

        double novaPR = this.partReal * numComplexe.getPartReal() - this.partImaginaria*numComplexe.getPartImaginaria();

        double novaPI = this.partReal * numComplexe.getPartImaginaria() + this.partImaginaria * numComplexe.getPartReal() ;

        return new Complexe((int)novaPR, (int)novaPI);
    }

    public Complexe dividir(Complexe divisor) {
        //obtenim les parts reals y imaginaries del divisor
        double divisorReal = divisor.getPartReal();
        double divisorImaginario = divisor.getPartImaginaria();

        // calculem les parts reals y imaginares del resultat
        double nuevaPR = (this.partReal * divisorReal + this.partImaginaria * divisorImaginario) / (divisorReal * divisorReal + divisorImaginario * divisorImaginario);
        double nuevaPI = (this.partImaginaria * divisorReal - this.partReal * divisorImaginario) / (divisorReal * divisorReal + divisorImaginario * divisorImaginario);

        // creeem un nou objecte amb els resultat calculats
        return new Complexe((int)nuevaPR, (int)nuevaPI);
    }
}
