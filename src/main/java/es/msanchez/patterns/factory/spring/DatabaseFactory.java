package es.msanchez.patterns.factory.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.msanchez.patterns.factory.shared.Database;
import es.msanchez.patterns.factory.shared.DatabaseMySQL;
import es.msanchez.patterns.factory.shared.DatabaseOracle;
import es.msanchez.patterns.factory.shared.DatabaseTypes;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class DatabaseFactory {

  @Autowired
  private DatabaseMySQL mySql;

  @Autowired
  private DatabaseOracle oracle;

  public Database getDatabase(final String type) {
    Database database = null;
    final DatabaseTypes requested = DatabaseTypes.fromString(type);

    switch (requested) {
    case MYSQL:
      log.info("Asked a Database of type '{}'. Given MYSQL back.", requested);
      database = this.mySql;
      break;
    case ORACLE:
      log.info("Asked a Database of type '{}'. Given ORACLE back.", requested);
      database = this.oracle;
      break;
    default:
      log.error("Requested database '{}'. Could not be found.", requested);
      throw new IllegalArgumentException("Not matching database could be found.");
    }

    return database;
  }

}
