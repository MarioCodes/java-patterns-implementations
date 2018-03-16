package es.msanchez.patterns.singleton;

import org.junit.Test;

public class ElvisTest {

  @Test
  public void givenClassSingletonWhenLeaveThenCheckSystemOut() {
    // Given
    final ElvisClassSingl elvis = ElvisClassSingl.getInstance();

    // When
    elvis.leaveTheBuilding();

    // Then
  }

  @Test
  public void givenEnumSingletonWhenLeaveThenCheckSystemOut() {
    // Given
    final ElvisEnumSingl elvis = ElvisEnumSingl.INSTANCE;

    // When
    elvis.leaveTheBuilding();

    // Then

  }

}
