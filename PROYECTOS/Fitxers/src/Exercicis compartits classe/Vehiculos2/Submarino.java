package vehiculos2;

public class Submarino extends Acuatico {

    private int prof_max;

    public Submarino(String matricula, String modelo, int longitud,int prof_max){
        super(matricula,modelo,longitud);
        this.prof_max=prof_max;
    }

    @Override
    public void imprimir() {

    }
}