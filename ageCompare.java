import java.util.*;
public class ageCompare{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.print("enter 1st age : ");
int age1 = sc.nextInt();
System.out.print("enter 2nd age : ");
int age2 = sc.nextInt();
if(age1 > age2){
System.out.println("age1 is greater");
}
if(age2>age1){
System.out.println("age2 is greater");
}
if(age1 == age2){
System.out.println("both ages are equal");
}
}
}