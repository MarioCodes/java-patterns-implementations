package es.msanchez.patterns.factory.shared;

import org.springframework.stereotype.Component;

@Component
public class DatabaseMySQL extends Database {

  /**
   * {@inheritDoc}
   */
  @Override
  public void insert() {
    System.out.println("Doing an insert with MySQL");
  }

}
