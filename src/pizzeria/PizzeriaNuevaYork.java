package pizzeria;

import pizzeria.pizzas.Pizza;
import pizzeria.pizzas.PizzaNuevaYorkPeperoni;
import pizzeria.pizzas.PizzaNuevaYorkQueso;
import pizzeria.pizzas.PizzaNuevaYorkVegetariana;

public class PizzeriaNuevaYork extends Pizzeria {
    @Override
    protected Pizza crearPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "queso":
                return new PizzaNuevaYorkQueso();
            case "vegetariana":
                return new PizzaNuevaYorkVegetariana();
            case "peperoni":
                return new PizzaNuevaYorkPeperoni();
            default:
                return null;
        }
    }
}
