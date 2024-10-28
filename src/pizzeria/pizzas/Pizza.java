package pizzeria.pizzas;

import pizzeria.pizzas.interfaces.PizzaInterface;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements PizzaInterface {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;

    public Pizza() {
        this.ingredientes = new ArrayList<>();
    }

    public void preparar(){
        System.out.println("Preparando: " + nombre);
        System.out.println("Seleccionando la masa: " + masa);
        System.out.println("Agregando salsa: " + salsa);
        System.out.println("Agregando ingredientes: ");
        this.ingredientes.forEach(System.out::println);

        cocinar();
        cortar();
        empaquetar();
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la pizza: " + nombre);
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza: " + nombre);
    }

    @Override
    public void empaquetar() {
        System.out.println("Empaquetando la pizza: " + nombre);
    }
}
