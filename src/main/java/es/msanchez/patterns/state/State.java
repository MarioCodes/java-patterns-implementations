package es.msanchez.patterns.state;

/**
 * Base interface. The object context will have it.
 */
public interface State {

  public void action(Bomb bomb);

}
