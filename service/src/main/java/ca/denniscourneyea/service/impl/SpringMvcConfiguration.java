package ca.denniscourneyea.service.impl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({"ca.denniscourneyea.service.impl"})
class SpringMvcConfiguration {
}
