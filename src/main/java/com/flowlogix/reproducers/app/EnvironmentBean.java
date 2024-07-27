package com.flowlogix.reproducers.app;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ApplicationScoped
@Getter
@Setter
public class EnvironmentBean {
    private String envVar;
}
