package shape;
public abstract class Shape {
	public abstract double area();
	public abstract double perimeter();
	
	public double semiperimeter(){
		return perimeter()/2;
	}

}



class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double len,double wid){
		length = len;
		width = wid;
	}
	public double area(){
		return length*width;
	}
	public double perimeter(){
		return 2*(length+width);
	}
	public String toString(){
		return "Rectangle length: "+length+" width: "+width;
		
	}
	public double getLength(){
		return length;
	}
	public double getWidth(){
		return width;
	}

}


class Square extends Rectangle {
	public Square(double side){
		super(side,side);
	}
	public String toString(){
		return"Square length : "+getLength();
	}

}


class Circle extends Shape {
	private double radius;
	public Circle(double rad){
		radius=rad;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double perimeter(){
		return 2*Math.PI*radius;
		
	}
	public String toString(){
		return "Circle radius: "+radius;
	}

}

