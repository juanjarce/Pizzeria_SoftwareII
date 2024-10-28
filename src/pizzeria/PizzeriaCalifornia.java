package pizzeria;

import pizzeria.pizzas.Pizza;
import pizzeria.pizzas.PizzaCaliforniaPeperoni;
import pizzeria.pizzas.PizzaCaliforniaQueso;
import pizzeria.pizzas.PizzaCaliforniaVegetariana;

public class PizzeriaCalifornia extends Pizzeria {
    @Override
    protected Pizza crearPizza(String tipo) {
        switch (tipo.toLowerCase()) {
            case "queso":
                return new PizzaCaliforniaQueso();
            case "vegetariana":
                return new PizzaCaliforniaVegetariana();
            case "peperoni":
                return new PizzaCaliforniaPeperoni();
            default:
                return null;
        }
    }
}
