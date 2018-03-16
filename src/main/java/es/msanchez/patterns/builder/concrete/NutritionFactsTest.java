package es.msanchez.patterns.builder.concrete;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NutritionFactsTest {

  @Test
  public void givenNutritionFactsWhenNewThenContainsCorrectServingSize() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getServingSize()).isEqualTo(120);
  }

  @Test
  public void givenNutritionFactsWhenNewThenContainsCorrectServings() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getServings()).isEqualTo(2);
  }

  @Test
  public void givenNutritionFactsWhenNewThenContainsCorrectCarbohydrates() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getCarbohydrate()).isEqualTo(200);
  }

  @Test
  public void givenNutritionFactsWhenNewThenContainsCorrectCalories() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getCalories()).isEqualTo(50);
  }

  @Test
  public void givenNutritionFactsWhenNewThenContainsCorrectFat() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getFat()).isEqualTo(20);
  }

  @Test
  public void givenNutritionFactsWhenNewThenSodiumIsDefault() {
    // Given
    NutritionFacts facts;

    // When
    facts = new NutritionFacts.Builder(120, 2).calories(50).carbohydrate(200).fat(20).build();

    // Then
    assertThat(facts.getSodium()).isZero();
  }
}
