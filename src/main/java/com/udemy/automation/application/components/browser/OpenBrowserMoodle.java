package com.udemy.automation.application.components.browser;

import com.udemy.automation.application.config.ApplicationConfig;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Henry J. Calani A.
 */
public class OpenBrowserMoodle implements Task {

    @Autowired
    private ApplicationConfig config;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(config.getUrlMoodle()));
    }

}
