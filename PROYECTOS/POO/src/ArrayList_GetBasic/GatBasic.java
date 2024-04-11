package ArrayList_GetBasic;

public class GatBasic {

    //atributos de los gatos
    private String color;
    private String raza;
    private int edad;
    private String sexo;
    private double pesoKG;

    //constructor per al un objecte GatBasic al que li pasarem els atributs
    public GatBasic(String color, String raza, int edad, String sexo, double pesoKG){
        this.color = color;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoKG = pesoKG;
    }

    //añadirem getters y setters per si volem modificar algun atribut o accedir a ell
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getRaza() {
        return raza;

    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(double pesoKG) {
        this.pesoKG = pesoKG;
    }

    //metodes per a poder fer proves amb els objectes
    public void miolar() {
        System.out.println("Miaaauu, Miaaaaauu!!");
    }
    public void ronronear(){
        System.out.println("brrrrrrrrrrr, brrrrrrrrrr");
    }
    public void comer(){
        System.out.println("El gato esta comiendo");
    }
    public void pelear(GatBasic gato2){
        if ("macho".equals(this.sexo) && "macho".equals(gato2.getSexo())){
            System.out.println("Los gatos machos se estan peleando");
        }else{
            System.out.println("Los gatos macho y hembra no pueden pelearse");
        }

    }
}
