package io.github.futurewl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(
        basePackages = "io.github.futurewl.site",
        excludeFilters = @ComponentScan.Filter(Controller.class)
)
public class RootContextConfiguration {
}
