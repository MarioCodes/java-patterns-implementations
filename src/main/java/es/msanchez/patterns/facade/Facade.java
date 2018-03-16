package es.msanchez.patterns.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.msanchez.patterns.utilities.DatabaseImpl;

/**
 * Class which acts as a proxy. It encapsulates and wraps everything from a concrete implementation
 * so the rest of the program does not need to know the details of this implementation.
 */
@Component
public class Facade {

  @Autowired
  private DatabaseImpl database;

  public void insert() {
    this.database.insert();
  }

  public void update() {
    this.database.update();
  }

}
