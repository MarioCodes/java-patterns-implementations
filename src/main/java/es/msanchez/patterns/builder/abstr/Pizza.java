package es.msanchez.patterns.builder.abstr;

import java.util.EnumSet;
import java.util.Set;

import es.msanchez.patterns.utilities.Topping;
import lombok.Getter;

/**
 * Example for class hierarchies.
 */
@Getter
public abstract class Pizza {

  final Set<Topping> toppings;

  public Pizza(final Builder<?> builder) {
    this.toppings = builder.toppings.clone();
  }

  abstract static class Builder<T extends Builder<T>> {
    EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

    public T addTopping(final Topping topping) {
      this.toppings.add(topping);
      return this.self();
    }

    abstract Pizza build();

    protected abstract T self();
  }

}
