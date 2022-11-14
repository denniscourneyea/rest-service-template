package ca.denniscourneyea.service.impl;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/*
Code based servlet initialization requires Tomcat 7 or another container that supports Servlet 3.0 or later. The
abstract super class is provided by Spring to facilitate integrating a Spring MVC dispatcher servlet initialized in code
and Spring Java configuration.
*/
public class SpringMvcServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringMvcConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/rest/*" };
    }

}
