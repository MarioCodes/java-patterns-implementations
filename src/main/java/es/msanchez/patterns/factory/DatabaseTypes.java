package es.msanchez.patterns.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DatabaseTypes {

    MYSQL("DatabaseMySQL"),
    ORACLE("DatabaseOracle");

  private String type;

}
