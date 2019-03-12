package ru.mera.pechenkina.task9;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface JsonName {

	String jsonName();

}
