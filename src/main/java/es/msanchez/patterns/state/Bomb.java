package es.msanchez.patterns.state;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Class which may have several states.
 */
@Getter
@Setter
@Component
@AllArgsConstructor
public class Bomb {

  private State state;

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
