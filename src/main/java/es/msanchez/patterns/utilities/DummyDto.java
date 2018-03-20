package es.msanchez.patterns.utilities;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class DummyDto {

  private int id;
  private String description;

}
