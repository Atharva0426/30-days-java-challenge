//Use of Scanner class 
//Taking input from User

import java.util.Scanner;
class Day2{
public static void main (String args[]){
Scanner scanner =new Scanner (System.in);
System.out.println("Enter any number ");
int n = scanner.nextInt();
if(n%2==0){

System.out.println("Number is Even");
                  }
else{
System.out.println("Number is Odd");
       }
   }
}
