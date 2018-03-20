package es.msanchez.patterns.factory.manual;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import es.msanchez.patterns.factory.shared.Database;
import es.msanchez.patterns.factory.shared.DatabaseMySQL;
import es.msanchez.patterns.factory.shared.DatabaseOracle;
import es.msanchez.patterns.factory.shared.DatabaseTypes;

public class FactoryTest {

  @Test
  public void givenMySQLWhenCreateThenAssertCorrectInstance() {
    // Given
    Database created;

    // When
    created = Factory.create(DatabaseTypes.MYSQL.getType());

    // Then
    assertThat(created).isInstanceOf(DatabaseMySQL.class);
  }

  @Test
  public void givenOracleWhenCreateThenAssertCorrectInstance() {
    // Given
    Database created;

    // When
    created = Factory.create(DatabaseTypes.ORACLE.getType());

    // Then
    assertThat(created).isInstanceOf(DatabaseOracle.class);
  }

}
