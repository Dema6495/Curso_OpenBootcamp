//Primera parte:
//
//Crear una función con tres parámetros que sean números que se suman entre sí.
//
//Llamar a la función en el main y darle valores.
//
//Segunda parte:
//
//Crear una clase coche.
//
//Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
//
//Una función que incremente el número de puertas que tiene el coche.
//
//Crear un objeto miCoche en el main y añadirle una puerta.
//
//Mostrar el número de puertas que tiene el objeto.


public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);
        miCoche.sumarpuerta();
        System.out.println(miCoche.puertas);
      }
}
class Coche {
    public int puertas = 3;
    public void sumarpuerta(){
        this.puertas++;
    }

}