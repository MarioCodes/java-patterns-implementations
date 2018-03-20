package es.msanchez.patterns.factory.spring;

import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.then;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.msanchez.patterns.config.SpringConfig;
import es.msanchez.patterns.factory.shared.Database;
import es.msanchez.patterns.factory.shared.DatabaseMySQL;
import es.msanchez.patterns.factory.shared.DatabaseOracle;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class DatabaseFactoryTest {

  @Autowired
  private DatabaseFactory factory;

  @Test
  public void givenFactoryWhenRequestOracleThenAssertInstance() {
    // Given
    final String type = "DatabaseOracle";

    // When
    final Database database = this.factory.getDatabase(type);

    // Then
    assertThat(database).isInstanceOf(DatabaseOracle.class);
  }

  @Test
  public void givenFactoryWhenRequestMySQLThenAssertInstance() {
    // Given
    final String type = "DatabaseMySQL";

    // When
    final Database database = this.factory.getDatabase(type);

    // Then
    assertThat(database).isInstanceOf(DatabaseMySQL.class);
  }

  @Test
  public void givenWrongTypeWhenRequestThenIAExceptionThrown() {
    // Given
    final String type = "nope";

    // When
    when(this.factory).getDatabase(type);

    // Then
    then(caughtException()).isInstanceOf(IllegalArgumentException.class);
  }

}
