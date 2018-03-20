package es.msanchez.patterns.memento;

import es.msanchez.patterns.utilities.DummyDto;

/**
 * Contains a Snapshot of a Dto in a punctual moment in time.
 */
public class Memento {

  private final DummyDto dto;

  /**
   * @param original
   *          Store a copy of this instance
   */
  public Memento(final DummyDto original) {
    this.dto = this.copy(original);
  }

  /**
   * Does a deep copy so we don't copy only the object reference. Pay attention to this.
   */
  private DummyDto copy(final DummyDto original) {
    final DummyDto copy = new DummyDto();
    copy.setId(original.getId());
    copy.setDescription(original.getDescription());
    return copy;
  }

  public DummyDto getSavedState() {
    return this.dto;
  }

}
