package es.msanchez.patterns.factory.shared;

/**
 * Abstract implementation of a Database. To use ANSI SQL here.
 */
public abstract class Database {

  public abstract void insert(); // Will use proprietary SQL.

  public void update() {
    System.out.println("Doing an update with ANSI SQL");
  }

  public void delete() {
    System.out.println("Doing a delete with ANSI SQL");
  }

}
