package io.microprofile.test;

import org.eclipse.microprofile.config.Config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CDIBean {

    @Inject
    Config config;

}
