package es.msanchez.patterns.memento;

import java.util.LinkedList;

import org.springframework.stereotype.Component;

import es.msanchez.patterns.utilities.DummyDto;
import lombok.Getter;

/**
 * Class where we save several Mementos (Snapshots). Limited to save a max. number of simultaneous
 * instances.
 */
@Getter
@Component
public class Caretaker {

  private final LinkedList<Memento> mementos = new LinkedList<>();

  /**
   * Saves a new Memento into the list
   */
  public void saveMemento(final Memento memento) {
    if (this.mementos.size() >= MementoParams.MAX_MEMENTO_SIZE.getValue())
      this.mementos.removeFirst();

    this.mementos.add(memento);
  }

  public Memento getLastMemento() {
    final DummyDto emptyDto = this.dummyDto();
    final Memento emptyMemento = new Memento(emptyDto);
    return this.mementos.isEmpty() ? emptyMemento : this.mementos.getLast();
  }

  private DummyDto dummyDto() {
    final DummyDto dummy = new DummyDto();
    dummy.setDescription("");
    dummy.setId(0);
    return dummy;
  }

  public void clearList() {
    this.mementos.clear();
  }

  public int getListSize() {
    return this.mementos.size();
  }
}
