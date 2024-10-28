import pizzeria.Pizzeria;
import pizzeria.PizzeriaCalifornia;
import pizzeria.PizzeriaNuevaYork;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //Ejercicio realizado por: Juan José Arce Aristizábal
    //(28/10/2024) para la asignatura de Ingenieria de Software II
    //Diseñado en base a la arquitectura Factory Method
    public static void main(String[] args) {
        Pizzeria pizzeriaCalifornia = new PizzeriaCalifornia();
        Pizzeria pizzeriaNuevaYork = new PizzeriaNuevaYork();

        System.out.println("Ordenando en Pizzeria California:");
        pizzeriaCalifornia.ordenarPizza("queso");
        pizzeriaCalifornia.ordenarPizza("vegetariana");
        pizzeriaCalifornia.ordenarPizza("peperoni");

        System.out.println("\nOrdenando en Pizzeria Nueva York:");
        pizzeriaNuevaYork.ordenarPizza("queso");
        pizzeriaNuevaYork.ordenarPizza("vegetariana");
        pizzeriaNuevaYork.ordenarPizza("peperoni");
    }
}