/**
 * ---------------------------------Declaration------------------------------------
 * This project is about creating a Web Application using Spring-web-mvc support purely based on Java Configuration
 * That means no xml file will be used.
 * we don't use 'web.xml' and 'Dispatcher-servlet.xml' files
 *
 * -----------------
 *
 * This class is designed to add servlet support in our Spring-Web-MVC application. since we are not using web.xml
 * we mention the servlet configuration class name and Servlet mapping here
 *
 * just for Recap
 * --- web.xml ---
 *
 * <web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
 *          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 *          xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
 *          version="4.0">
 *     <context-param>
 *         <param-name>contextConfigLocation</param-name>
 *         <param-value>/WEB-INF/applicationContext.xml</param-value>
 *     </context-param>
 *     <listener>
 *         <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
 *     </listener>
 *     <servlet>
 *         <servlet-name>dispatcher</servlet-name>
 *         <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
 *         <load-on-startup>1</load-on-startup>
 *     </servlet>
 *     <servlet-mapping>
 *         <servlet-name>dispatcher</servlet-name>
 *         <url-pattern>/</url-pattern>
 *     </servlet-mapping>
 * </web-app>
 *
 */
package com.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //No root config classes in the project
        return null;
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        //This project has Servlet Configuration class only and this method returns that config class
        return new Class[]{

               SpringConfig.class
        };
    }
    @Override
    protected String[] getServletMappings() {
        //returns only "/" which is actually the Servlet root Mapping
        return new String[]{

                "/"
        };
    }
}
