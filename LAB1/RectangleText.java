public class RectangleText
{
public static void main(String args[])
{
Rectangle r3=new Rectangle();
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
r1.length=5.0;
r2.width=8.0;
r3.length=7.0;
r3.width=7.0;
double area=r3.calArea();
double perimeter=r3.calPerimeter();
System.out.println("Length = " + r1.length );
System.out.println("Width = " + r2.width);
System.out.println("Area of Rectangle " + r3 + " is " + area);
System.out.println("Perimeter of Rectangle " + r3 + " is " + perimeter );
}
}