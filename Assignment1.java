package test.app;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* Basic Java Assignment by ITVORKS  */
/* Write a program to check if given
 * number is positive , negative, or zero using if statement */
/* Dated : December , 7 2020, Monday */
/* Author : Anjali Singh */

import java.util.Scanner;
public class Assignment1 {
	public void Question1(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = input.nextInt();
		if(num>0)	
			System.out.println(num + " is positive");
		else if (num<0)
			System.out.println(num + " is negative");
		else
			System.out.println(num+ " is zero");
		}
	public void Question2(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
			int num = input.nextInt();
			if(num%2==0)
				System.out.println(num + " is even");
			else
				System.out.println(num + " is odd");
	}
	public void Question3(){
		int limit = 100;
		System.out.println("Prime numbers between 10 and " + limit);
		for(int i=10; i <= 100; i++){
		boolean isPrime = true;
			for(int j=2; j < i ; j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i + " ");
		}
	}
	public void Question4(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = input.nextInt();
		int i,m=0,flag=0;      
		  m=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(num+" is prime number"); }  
		  }//end of else  
	}	
	public void Question5(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number :");
		int num = input.nextInt();
		int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
	}
	public void Question6(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = input.nextInt();
		int r,sum=0,temp;    
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}
	public void Question7(){
		char ch1,ch2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  character : ");
		ch1 = input.next(".").charAt(0);
		
		if(Character.isLowerCase(ch1)) {    

			ch2 = Character.toUpperCase(ch1);
			System.out.println(ch1+" -> "+ch2);
			}    
        //Checks for upper case character    
        else if(Character.isUpperCase(ch1)) {    
        	ch2 = Character.toLowerCase(ch1);
        	System.out.println(ch1+" -> "+ch2);
        } 
        else
        {
        	System.out.println("Invalid character!");
        }
		
	}
	public void Question8(){
		 
		 Scanner cmd = new Scanner(System.in);
		 
	        System.out.println("Enter the number of rows of Floyd's triangle?");
	        int rows = cmd.nextInt();
	        System.out.printf("Floyd's triangle of %d rows is : ", rows);
	         System.out.println();
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*" + " ");
	         
	            }
	 
	            System.out.println();
	        }
	    }

	public void Question9(){
		long n,sum;
 	    Scanner sc=new Scanner(System.in);
System.out.println("Enter a number ");
       n=sc.nextLong();
for(sum=0 ;n!=0 ;n/=10)
{
sum+=n%10;
}
System.out.println("Sum of digits of a number is "+sum);   
	}
	 public void Question10(){
		 int i;
		 for(i=23;i<57;i++)
			 if(i%2==0)
				 System.out.println(i);
	 }
	public void Question11(){
		for(int i=1;i<=10;i++){
			System.out.print(i+"\t");
		}
		System.out.println();
		}
	public void Question12(){
		int i=0,j=0;
	    while(j<5){
	    	while(i<=120){
		if(i%2==0 && i%3==0 && i%5==0)
		{
					System.out.print(i+" ");
			
				}
			i++;
			}
	   j++;
	   }
	    System.out.println();
	    }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		Assignment1 assign = new Assignment1();
		do{
			System.out.println("* * * * * BASIC JAVA ASSIGNMENT MENU * * * * *");
			   System.out.println("1. Q#1 - Find positive or negative number   ");
			   System.out.println("2. Q#2 - Find even or odd number ");
			   System.out.println("3. Q#3 - Display Prime numbers between 10 and 99");
			   System.out.println("4. Q#4 - Find prime number or not");
			   System.out.println("5. Q#5 - Display reverse number");
			   System.out.println("6. Q#6 - Find Palimdrome or not");
			   System.out.println("7. Q#7 - Convert UpperCase & LowerCase character");
			   System.out.println("8. Q#8 - Floyd's Triangle");
			   System.out.println("9. Q#9 - Sum of digits of a number");
			   System.out.println("10. Q#10 - Print Even number between 23 and 57");
			   System.out.println("11. Q#11 - Print number between 1 and 10");
			   System.out.println("12. Q#12 - Print first 5 numbers divisible by 2, 3 and 5");
			   System.out.println("13. EXIT");
			   System.out.println("ENTER YOUR CHOICE?");
			   BufferedReader object2 = new BufferedReader(new InputStreamReader(System.in));
			   int b= Integer.parseInt(object2.readLine());
			 switch(b)
			   {
			   	case 1:
			   		assign.Question1();
			   		System.out.println("Question 1 is solved....");
			   		break;
			   	case 2:
			   		assign.Question2();
			   		System.out.println("Question 2 is solved....");
			   		break;
			   	case 3:
			   		assign.Question3();
			   		System.out.println("\nQuestion 3 is solved....");
			   		break;
			   	case 4:
			   		assign.Question4();
			   		System.out.println("Question 4 is solved....");
			   		break;
			   	case 5 : 
			   		assign.Question5();
			   		System.out.println("Question 5 is solved....");
			   		break;
			   	case 6:
			   		assign.Question6();
			   		System.out.println("Question 6 is solved....");
			   		break;
			   	case 7:
			   		assign.Question7();
			   		System.out.println("Question 7 is solved....");
			   		break;
			 	case 8:
			   		assign.Question8();
			   		System.out.println("Question 8 is solved....");
			   		break;
			 	case 9:
			   		assign.Question9();
			   		System.out.println("Question 9 is solved....");
			   		break;
			 	case 10:
			   		assign.Question10();
			   		System.out.println("Question 10 is solved....");
			   		break;
			 	case 11:
			   		assign.Question11();
			   		System.out.println("Question 11 is solved....");
			   		break;
			 	case 12:
			   		assign.Question12();
			   		System.out.println("Question 12 is solved....");
			   		break;
			   	case 13: 
			   		System.out.println("GOOD BYE !");
			   		System.exit(0);
			   		break;
		   		default: 
		   			System.out.println("Invalid Entry!");
		   }//end switch()
	   }while(true);// end do while loop


	}
}
