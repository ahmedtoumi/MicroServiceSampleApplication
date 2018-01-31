package com.atoumi.microservices.cucumber.stepdefs;

import com.atoumi.microservices.MicroServiceSampleApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroServiceSampleApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
