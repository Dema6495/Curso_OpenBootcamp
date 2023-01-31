public class Main {
    public static void main(String[] args) {
        Persona Hombre = new Persona();
        Hombre.setEdad(27);
        Hombre.setNombre("Daniel");
        Hombre.setNumero("654345654");
        System.out.println(Hombre.getEdad());
        System.out.println(Hombre.getNombre());
        System.out.println(Hombre.getNumero());

        Persona Mujer = new Persona();
        Mujer.setNombre("Maria");
        System.out.println(Mujer.getNombre());


    }

    static class Persona {
        private int edad;
        private String nombre;
        private String numero;

        public void setEdad(int edad) {

            this.edad = edad;
        }

        public int getEdad() {

            return this.edad;
        }

        public void setNombre(String nombre) {

            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }
        public void setNumero(String numero){
            this.numero = numero;
        }
        public String getNumero(){
            return this.numero;
        }
    }
}