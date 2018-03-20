package es.msanchez.patterns.memento;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MementoParams {

    MAX_MEMENTO_SIZE(5);

  private final int value;

}
