package com.isa.annotation.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

import com.isa.annotations.Meal;

@SupportedAnnotationTypes("com.isa.annotation.starter.annotations.Meal")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class FirstProcessor extends AbstractProcessor {
	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (Element element : roundEnv.getElementsAnnotatedWith(Meal.class)) {
			Meal annotationMeal = element.getAnnotation(Meal.class);
			String message = String.format("Annotation found on %s with the value of %s", element.getSimpleName(),
					annotationMeal.value());
			processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
		}

		return false;
	}
}
