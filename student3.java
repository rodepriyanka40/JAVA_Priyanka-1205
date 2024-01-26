import java.util.Scanner;
class student3
{
    int phy, chem, bio, maths;
    int sum, avg;
{
    Scanner s = new Scanner(System.in);
    System.out.println("Enter marks of physics:");
    phy=s.nextInt();
    System.out.println("enter marks of chemistry:");
    chem=s.nextInt();
    System.out.println("enter marks of biology:");
    bio=s.nextInt();
    System.out.println("enter marks of maths:");
    maths=s.nextInt();
}
void display()
 {
    sum=phy+chem+bio+maths;
    System.out.println("total number of marks obtained:"+sum);
    avg=(sum/4);
    System.out.println("total avgerage of marks are:"+avg);
	
 }
 public static void main(String args[])
 {
    student3 t= new student3();
    t.display();
 }
}