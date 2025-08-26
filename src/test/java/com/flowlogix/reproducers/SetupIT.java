package com.flowlogix.reproducers;

import com.flowlogix.testcontainers.PayaraServerLifecycleExtension;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit5.ArquillianExtension;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(PayaraServerLifecycleExtension.class)
@ExtendWith(ArquillianExtension.class)
@SuppressWarnings("HideUtilityClassConstructor")
class SetupIT {
    @Test
    void dummy() {
        // just to have a test class
    }

    @Deployment
    static JavaArchive deploy() {
        return ShrinkWrap.create(JavaArchive.class).addClass(PayaraServerLifecycleExtension.class);
    }
}
