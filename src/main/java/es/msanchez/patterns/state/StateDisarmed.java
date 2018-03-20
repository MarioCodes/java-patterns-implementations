package es.msanchez.patterns.state;

import lombok.extern.slf4j.Slf4j;

/**
 * One of the several status the base object may be at.
 */
@Slf4j
public class StateDisarmed implements State {

  /**
   * {@inheritDoc}
   */
  @Override
  public void action(final Bomb bomb) {
    bomb.setState(new StateArmed());
    log.info("Bomb Armed!");
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return "disarmed";
  }

}
