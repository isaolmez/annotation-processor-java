package com.isa.annotation.client;

import java.lang.annotation.Annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.isa.annotation.client.usage.complex.SubClass1;
import com.isa.annotation.client.usage.complex.SubClass2;

public class TestClient {
	private final static Logger LOG = LoggerFactory.getLogger(TestClient.class);

	public static void main(String[] args) {
		LOG.info("===> {}", SubClass1.class);
		Class<SubClass1> subClass1 = SubClass1.class;
		Annotation[] annotations = subClass1.getAnnotations();
		for (Annotation a : annotations) {
			LOG.info("{} => {}", a.annotationType(), a.toString());
		}

		LOG.info("===> {}", SubClass2.class);
		Class<SubClass2> subClass2 = SubClass2.class;
		annotations = subClass2.getAnnotations();
		for (Annotation a : annotations) {
			LOG.info("{} => {}", a.annotationType(), a.toString());
		}
	}
}
