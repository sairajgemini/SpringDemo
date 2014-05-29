package main;

import interfaces.Shape;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import util.Drawing;

public class DrawingApplication {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Shape triangle = (Shape) context.getBean("triangle");
		Drawing drawShape = new Drawing();
		drawShape.setShape(triangle);
		drawShape.draw();
	}
}
