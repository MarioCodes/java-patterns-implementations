package es.msanchez.patterns.builder.abstr;

import static es.msanchez.patterns.utilities.Size.SMALL;
import static es.msanchez.patterns.utilities.Topping.HAM;
import static es.msanchez.patterns.utilities.Topping.ONION;
import static es.msanchez.patterns.utilities.Topping.SAUSAGE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class PizzaTest {

  @Test
  public void givenNyPizzaWhenBuildThenAssertContainsCorrectToppings() {
    // Given
    Pizza pizza;

    // When
    pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

    // Then
    assertThat(pizza.toppings).contains(SAUSAGE, ONION);
  }

  @Test
  public void givenCalzoneWhenBuildThenAssertToppings() {
    // Given
    Pizza pizza;

    // When
    pizza = new Calzone.Builder().addTopping(HAM).sauceInside().build();

    // Then
    assertThat(pizza.toppings).contains(HAM);
  }

}
