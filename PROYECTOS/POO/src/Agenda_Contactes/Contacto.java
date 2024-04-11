package Agenda_Contactes;

public class Contacto {

    //Atributos para cada contacto
    private String dni;
    private String nombreCompleto;

    private String telefono;
    private String email;

    //constructor para el contacto
    public Contacto (String dni, String nombre, String telf, String email){

        this.dni = dni;
        this.nombreCompleto = nombre;
        this.telefono = telf;
        this.email = email;

    }

    //getters y setter


    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //añadim un metode toString per a imprimir el contacte en el cas de ser necesari
    public String toString() {
        return "Contacto" +
                "[Nombre: " +nombreCompleto + "]" +
                "[DNI: " + dni + "]" +
                "[Telefono: " + telefono + "]" +
                "[email: " + email + "]";

    }


}

