import java.util.Scanner;
class Day3{
public static void main (String args[]){
// Pelindrom Number : Number whose reverse is equal to its original number.
//e.g 212,252etc.
System.out.println("Enter any number for checking pelindrom");
Scanner sc =new Scanner (System.in);
int n= sc.nextInt();
int m,r;
m=n;
int s=0;

while(n!=0)
{
r=n%10;
s=s*10+r;
n=n/10;
}
if (m==s)
System.out.println("Number is pelindrome");
else
System.out.println("Number is not Pelindrom");
}
}