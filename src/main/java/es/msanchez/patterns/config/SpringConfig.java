package es.msanchez.patterns.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

import es.msanchez.patterns.state.Bomb;
import es.msanchez.patterns.state.StateArmed;

@Configuration
@ComponentScan(basePackages = {
    "es.msanchez.patterns.builder.**",
    "es.msanchez.patterns.state.**" }, excludeFilters = @Filter(Configuration.class))
public class SpringConfig {

  @Bean
  public Bomb bomb() {
    return new Bomb(new StateArmed());
  }

}
