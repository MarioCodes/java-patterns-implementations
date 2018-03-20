package es.msanchez.patterns.state;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * Context which may have several states.
 */
@Slf4j
@Getter
@Setter
@Component
public class Bomb {

  private State state;

  public Bomb() {
    this.state = new StateDisarmed();
    log.info("Disarmed bomb created.");
  }

  public void action() {
    this.state.action(this);
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    final StringBuilder builder = new StringBuilder();
    builder.append("Bomb status: ");
    builder.append(this.state.toString());
    return builder.toString();
  }

}
