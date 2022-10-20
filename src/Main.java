package com.open_bootcamp;

//Las clases se construyen. Cuando no creamos un constructor, Java automaticamente lo crea. Cuando uno crea el
//constructor, java nunca lo creara por mi.

//Un constructor es una forma de inicializar las propiedades de una clase cuando la instanciamos.
//Reglas de un Constructor en java:
//El Constructor, no devuelve ningun tipo de dato. Por lo tanto se puede poner public sin void
//Los Constructores son publicos.
//El nombre del Constructor, tiene que ser identico al nombre de la clase.
//Puede tener opcionalmente parametros.
//Cuando se ejecuta el Constructor? Cuando se lee el new Coche

public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche(2, 90); //Cuando se lee esta linea, se invoca el constructor
        System.out.println(coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);
    }
}
class Coche {
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(int puertas, int velocidad) { //Con parametros
        numeroDePuertas = puertas;
        velocidadMaxima = velocidad;
        System.out.println("Estoy en el Constructor");
    }
}