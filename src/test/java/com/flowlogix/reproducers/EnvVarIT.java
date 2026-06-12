package com.flowlogix.reproducers;

import com.flowlogix.reproducers.app.EnvironmentBean;
import com.flowlogix.test.AppServerLifecycle;
import com.flowlogix.util.ShrinkWrapManipulator;
import jakarta.inject.Inject;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

@AppServerLifecycle
class EnvVarIT {
    @Inject
    EnvironmentBean environmentBean;

    @Test
    void envVar() {
        assertThat(System.getenv("my_env_var")).isEqualTo("my_value");
    }

    @Test
    void envVarBean() {
        assertThat(environmentBean.getEnvVar()).isEqualTo("my_value");
    }

    @Deployment
    static WebArchive deploy() {
        return ShrinkWrapManipulator.createDeployment(WebArchive.class);
    }
}
