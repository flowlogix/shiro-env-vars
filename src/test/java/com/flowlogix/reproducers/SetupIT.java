package com.flowlogix.reproducers;

import com.flowlogix.test.AppServerLifecycle;
import com.flowlogix.testcontainers.AppServerLifecycleExtension;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;

@AppServerLifecycle
@SuppressWarnings("HideUtilityClassConstructor")
class SetupIT {
    @Test
    void dummy() {
        // just to have a test class
    }

    @Deployment
    static JavaArchive deploy() {
        return ShrinkWrap.create(JavaArchive.class).addClasses(AppServerLifecycleExtension.class, AppServerLifecycle.class);
    }
}
