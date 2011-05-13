package net.junisphere.eranger.neo4j.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.neo4j.Hello;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/domain-tests-context.xml" })
public class DomainTests {

    @Autowired
    Hello hello;

    @Test
    public void testHello() {
        assertTrue(hello.init());
    }
}
