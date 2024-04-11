package vehiculos2;
public  class Aereo extends Vehiculo{

        private final int numeroSeients;

        public aereo(String matricula, String model, int numeroSeients) {
            super(matricula, model);
            if (!validarMatricula(matricula)) {
                System.out.println("Matrícula inválida");
            }
            this.numeroSeients = numeroSeients;
        }

        @Override
        public void imprimir() {
            System.out.println("El vehículo aéreo con matrícula: " + getMatricula() + " de modelo: " + getModelo() + " con número de asientos: " + getNumeroSeients());
        }

        @Override
        public String getMatricula() {
            return super.getMatricula();
        }

        public int getNumeroSeients() {
            return numeroSeients;
        }

        @Override
        public String getModelo() {
            return super.getModelo();
        }

        private boolean validarMatricula(String matricula) {
          
            return matricula.matches("[A-Z]{4}\\d{6}");
        }
    }

