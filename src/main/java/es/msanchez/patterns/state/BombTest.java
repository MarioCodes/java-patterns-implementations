package es.msanchez.patterns.state;

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
  public void givenBombWhenIniThenIsArmed() {
    // Given

    // When

    // Then
    assertThat(this.bomb.getState()).isInstanceOf(StateArmed.class);
  }

  @Test
  public void givenArmedBombWhenActionThenDisarm() {
    // Given
    final State disarmed = new StateDisarmed();

    // When
    disarmed.action(this.bomb);

    // Then
    assertThat(this.bomb.getState()).isInstanceOf(StateDisarmed.class);
  }

  @Test
  public void givenDisarmedBombWhenActionThenArm() {
    // Given
    final State armed = new StateArmed();
    final State disarmed = new StateDisarmed();

    // When
    disarmed.action(this.bomb);
    armed.action(this.bomb);

    // Then
    assertThat(this.bomb.getState()).isInstanceOf(StateArmed.class);
  }

}
