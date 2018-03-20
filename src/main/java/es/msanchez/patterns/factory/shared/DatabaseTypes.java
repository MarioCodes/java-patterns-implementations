package es.msanchez.patterns.factory.shared;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public enum DatabaseTypes {

    MYSQL("DatabaseMySQL"),
    ORACLE("DatabaseOracle");

  private String type;

  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    return this.type;
  }

  public static DatabaseTypes fromString(final String typeName) {
    for (final DatabaseTypes type : values()) {
      if (type.toString().equalsIgnoreCase(typeName))
        return type;
    }

    log.error("Tried to obtain a database of type '{}'. It does not exist.", typeName);
    throw new IllegalArgumentException("Couldn't find a database with this name.");
  }

}
