package es.msanchez.patterns.state;

/**
 * One of the several status the base object may be at.
 */
public class StateArmed implements State {

  /**
   * {@inheritDoc}
   */
  @Override
  public void action(final Bomb bomb) {
    bomb.setState(this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "armed";
  }

}
