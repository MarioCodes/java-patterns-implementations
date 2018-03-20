package es.msanchez.patterns.memento;

import static com.googlecode.catchexception.apis.BDDCatchException.caughtException;
import static com.googlecode.catchexception.apis.BDDCatchException.then;
import static com.googlecode.catchexception.apis.BDDCatchException.when;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.msanchez.patterns.config.SpringConfig;
import es.msanchez.patterns.utilities.DummyDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class CaretakerTest {

  @Autowired
  private Caretaker caretaker;

  @Test
  public void givenCaretakerWhenGetLastMementoThenNoException() {
    // Given

    // When
    when(this.caretaker).getLastMemento();

    // Then
    then(caughtException()).isNull();
  }

  @Test
  public void givenCaretakerWhenGetLastMementoThenDefaultValues() {
    // Given
    final Memento output = this.caretaker.getLastMemento();

    // When
    final DummyDto saved = output.getSavedState();

    // Then
    assertThat(saved.getId()).isZero();
    assertThat(saved.getDescription()).isEmpty();
  }

  @Test
  public void givenCaretakerWhenGetListSizeThenZero() {
    // Given

    // When
    final int size = this.caretaker.getListSize();

    // Then
    assertThat(size).isZero();
  }

  @Test
  public void givenDtoWhenSaveThenListSizeIsOne() {
    // Given
    final Memento memento = new Memento(new DummyDto());
    this.caretaker.saveMemento(memento);

    // When
    final int size = this.caretaker.getListSize();

    // Then
    assertThat(size).isEqualTo(1);
  }

  @Test
  public void givenSavedDtoWhenGetThenHasSameProperties() {
    // Given
    final Memento input = new Memento(new DummyDto());
    this.caretaker.saveMemento(input);

    // When
    final Memento output = this.caretaker.getLastMemento();

    // Then
    assertThat(output).isEqualToComparingFieldByField(input);
  }

}
