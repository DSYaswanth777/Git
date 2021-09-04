import java.util.Scanner;
class AreaofCircle
{
public static void main(String args[])
{
int r;
final double PI=3.14,area;
System.out.println("Enter radius of circle");
Scanner obj=new Scanner(System.in);
r=obj.nextInt();
area=PI*r*r;
System.out.print(area);
}
}