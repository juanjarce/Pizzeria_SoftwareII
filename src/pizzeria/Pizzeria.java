package pizzeria;

import pizzeria.pizzas.Pizza;

public abstract class Pizzeria {
    public Pizza ordenarPizza(String tipo) {
        Pizza pizza = crearPizza(tipo);
        pizza.preparar();
        return pizza;
    }

    protected abstract Pizza crearPizza(String tipo);
}

