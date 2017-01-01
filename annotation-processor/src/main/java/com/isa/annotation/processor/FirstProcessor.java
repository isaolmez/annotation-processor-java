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

import com.isa.annotation.Meal;
import com.isa.annotation.Meals;

@SupportedAnnotationTypes({ "com.isa.annotation.Meal", "com.isa.annotation.Meals" })
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class FirstProcessor extends AbstractProcessor {
	public FirstProcessor() {
		super();
	}

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (Element element : roundEnv.getElementsAnnotatedWith(Meal.class)) {
			Meal annotationMeal = element.getAnnotation(Meal.class);
			String message = String.format("Annotation found on %s with the value of %s", element.getSimpleName(),
					annotationMeal.value());
			processingEnv.getMessager().printMessage(Diagnostic.Kind.MANDATORY_WARNING, message);
		}

		for (Element element : roundEnv.getElementsAnnotatedWith(Meals.class)) {
			Meals mealsAnnotation = element.getAnnotation(Meals.class);
			String message = String.format("Annotation found on %s with the value of %s", element.getSimpleName(),
					mealsAnnotation.value());
			processingEnv.getMessager().printMessage(Diagnostic.Kind.MANDATORY_WARNING, message);
			for(Meal meal : mealsAnnotation.value()){
				String subMessage = String.format("%10s", meal.value());
				processingEnv.getMessager().printMessage(Diagnostic.Kind.MANDATORY_WARNING, subMessage);	
			}
		}
		
		return false;
	}
}
