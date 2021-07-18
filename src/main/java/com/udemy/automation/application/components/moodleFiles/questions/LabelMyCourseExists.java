package com.udemy.automation.application.components.moodleFiles.questions;

import com.udemy.automation.application.ActionsUser.UserActions;
import com.udemy.automation.application.components.moodleFiles.ComponentMoodle;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.beans.factory.annotation.Autowired;

public class LabelMyCourseExists implements Question<String> {

    @Autowired
    private ComponentMoodle component;

    @Override
    public String answeredBy(Actor actor) {
        UserActions.isVisible(component.getLabelMyCourse());
        return UserActions.isTextPresent(component.getLabelMyCourse(), actor);
    }
}