package es.msanchez.patterns.factory;

import org.springframework.stereotype.Component;

@Component
public class DatabaseOracle extends Database {

  /**
   * {@inheritDoc}
   */
  @Override
  public void insert() {
    System.out.println("Doing an insert with Oracle SQL");
  }

}
