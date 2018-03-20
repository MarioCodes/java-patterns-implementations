package es.msanchez.patterns.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "es.msanchez.patterns.builder.**",
    "es.msanchez.patterns.state.**",
    "es.msanchez.patterns.memento.**",
    "es.msanchez.patterns.factory.shared.**",
    "es.msanchez.patterns.factory.spring.**" }, excludeFilters = @Filter(Configuration.class))
public class SpringConfig {

}
