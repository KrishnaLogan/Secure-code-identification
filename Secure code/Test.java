public class A{

public String name ; 
private double Phone_No;
 A(String N, double P){
Name = N;
Phone_No= P;

public void display(){
System.out.println(“Name is “ + name);
System.out.println(Name + “ “ + Phone_no);
}
}

public class Test{
public static void main(String args[]){
A obj = new A(“Syam”, 852147521);
A.display();
}
}
