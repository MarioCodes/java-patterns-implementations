package es.msanchez.patterns.factory.manual;

import java.util.ResourceBundle;

import es.msanchez.patterns.factory.shared.Database;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factory {

  public static Database create(final String name) {
    try {
      final ResourceBundle rb = ResourceBundle.getBundle(
          "es.msanchez.patterns.factory.manual.factory");
      final String sClassName = rb.getString(name);
      return (Database) Class.forName(sClassName).newInstance();
    } catch (final Exception ex) {
      log.error("Error on Database ini inside factory.");
      throw new RuntimeException();
    }
  }

}
