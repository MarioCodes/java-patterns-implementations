package es.msanchez.patterns.state;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class BombTest {

  @Autowired
  private Bomb bomb;

  @Test
  public void givenBombWhenIniThenDisarmed() {
    // Given

    // When

    // Then
    assertThat(this.bomb.getState()).isInstanceOf(StateDisarmed.class);
  }

  @Test
  public void givenBombWhenActionThenArm() {
    // Given
    State stateAfter;

    // When
    this.bomb.action();
    stateAfter = this.bomb.getState();

    // Then
    assertThat(stateAfter).isInstanceOf(StateArmed.class);
  }

  @Test
  public void givenArmedBombWhenActionThenExplodes() {
    // Given
    this.bomb.action(); // Arm

    // When
    when(this.bomb).action();

    // Then
    then(caughtException()).isInstanceOf(UnsupportedOperationException.class);
  }

}
