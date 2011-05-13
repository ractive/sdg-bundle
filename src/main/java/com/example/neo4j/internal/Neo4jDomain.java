package com.example.neo4j.internal;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.neo4j.Hello;

/**
 * Hello world(s)!
 * <p/>
 * An example application for exploring Spring Data Graph.
 */
public class Neo4jDomain {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("/META-INF/spring/neo4j-context.xml");

        Hello h = ctx.getBean(Hello.class);
        h.init();

        ctx.close();
    }

}
