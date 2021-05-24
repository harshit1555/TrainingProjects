package com.facade;

public class ShapeMaker 
{
	Shape circle;
	Shape square;
	Shape rectangle;
	public ShapeMaker()
	{
		circle=new Circle();
		square=new Square();
		rectangle=new Rectangle();
	}
	public void drawCircle()
	{
		
		circle.draw();
	}
	public void drawSquare()
	{
		
		square.draw();
	}
	public void drawRectancgle()
	{
		
		rectangle.draw();
	}
}
