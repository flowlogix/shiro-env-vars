package com.flowlogix.reproducers;

import com.flowlogix.util.ShrinkWrapManipulator;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(ArquillianExtension.class)
public class EnvVarIT {
    @BeforeEach
    void setupEnvironment() {
        System.setProperty("my_variable_xxx", "hello");
    }

    @Test
    void envVar() {
        assertThat(System.getProperty("my_variable_xxx")).isEqualTo("hello");
    }

    @Deployment
    static WebArchive deploy() {
        return ShrinkWrapManipulator.createDeployment(WebArchive.class);
    }
}
