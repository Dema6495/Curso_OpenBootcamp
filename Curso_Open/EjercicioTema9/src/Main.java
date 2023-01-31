public class Main {
    public static void main(String[] args) {
        Cliente Cliente = new Cliente();
        Cliente.edad = 27;
        Cliente.nombre = "Daniel";
        Cliente.telefono = "654456654";
        Cliente.credito = 10000;

        Trabajador Trabajador = new Trabajador();
        Trabajador.edad = 30;
        Trabajador.nombre = "Fernando";
        Trabajador.telefono= "654321123";
        Trabajador.salario = 24000;



        System.out.println(Cliente.nombre + " " + Cliente.edad + " " + Cliente.telefono);
        System.out.println("Tiene de credito: " + Cliente.credito);

        System.out.println(Trabajador.nombre + " " + Trabajador.edad + " " + Trabajador.telefono);
        System.out.println("Cobra al año: " + Trabajador.salario);
    }

    static class Persona{
        int edad;
        String nombre;
        String telefono;
    }
    static class Cliente extends Persona{
        int credito;
    }
    static class Trabajador extends Persona{
        int salario;
    }
}