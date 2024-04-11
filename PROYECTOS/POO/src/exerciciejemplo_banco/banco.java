package exerciciejemplo_banco;

public class banco {
    private cliente cliente1, cliente2, cliente3;
    private String nombre;
    public banco(String nombreB){
        this.nombre = nombreB;

        cliente1 = new cliente("Andreu");
        cliente2 = new cliente("Pepe");
        cliente3 = new cliente("Jose");
    }

    public void operar(){
        cliente1.depositar(500);
        cliente2.depositar(1160);
        cliente3.depositar(50);

        double cant = 120;
        if(cant<=cliente2.getMonto()) {
            cliente2.extraer(120);
        }
    }

    public void depositosTotales(){
        double total = cliente1.getMonto()  + cliente2.getMonto() + cliente3.getMonto();
        System.out.println("En el cierrre de caja hay un total de " + total + "€ depositados en " + this.nombre);

        cliente1.imprimir();
        cliente2.imprimir();
        cliente3.imprimir();

    }
    public static void main(String[] args) {

        banco banco = new banco("Caixa Rural");

        banco.operar();

        banco.depositosTotales();

    }
}
