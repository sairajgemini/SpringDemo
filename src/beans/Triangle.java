package beans;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import interfaces.Shape;

public class Triangle implements Shape, InitializingBean, DisposableBean{
	
	private List<Point> points;
	
	@Override
	public void draw() {
		for(Point point : points){
			System.out.println("Point("+point.getX()+", "+point.getY()+")");
		}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside InitializingBean afterPropertiesSet method : Traingle Bean initialized.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside DisposableBean destroy method : Triangle Bean destroyed.");
	}
	
	public void myInit(){
		System.out.println("Traingle Bean initialized.");
	}
	
	public void myDestroy() throws Exception {
		System.out.println("Triangle Bean destroyed.");
	}
}
