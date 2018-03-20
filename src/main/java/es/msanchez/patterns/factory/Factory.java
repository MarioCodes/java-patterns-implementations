package es.msanchez.patterns.factory;

import java.util.ResourceBundle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Factory {

  public static Database create(final String name) {
    try {
      final ResourceBundle rb = ResourceBundle.getBundle("es.msanchez.patterns.factory.factory");
      final String sClassName = rb.getString(name);
      return (Database) Class.forName(sClassName).newInstance();
    } catch (final Exception ex) {
      log.error("Error on Database ini inside factory.");
      throw new RuntimeException();
    }
  }

}
