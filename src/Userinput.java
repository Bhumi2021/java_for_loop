import com.sun.java.swing.plaf.windows.WindowsToggleButtonUI;

import java.util.Locale;
import java.util.Scanner;

public class Userinput{
    //Q:1
    //Print number between any range
    public  void number(){
        System.out.println("Ans 1");
        Scanner scanner=new Scanner(System.in);// making scanner class
        System.out.println("Enter first number");
        int a=scanner.nextInt();//scanner object
        System.out.println("Enter second number");
        int b=scanner.nextInt();

        int count = 1;
        //using for loop condition
        for (int i = a; i <= b; i++) {
            if (count <= 10) {
                System.out.println("Number is " + i);
                count++;
            }
        }
    }
    //Q:2
    //Fibonacci number
    public static void fibonacci(){
        System.out.println("Ans 2");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int c=scanner.nextInt();//scanner object
        int num1 = 1;//declaring variable
        int num2 = 1;
        //by using for loop finding fibonacci number
        for (int i = 1; i <= c; i++) {
           System.out.println(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }
    //Q:3
    //Prime number
    public static void prime(){
        System.out.println("Ans:3");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int c=scanner.nextInt();//scanner object
        //using for loop and if condition
        for (int i =2; i<c; i++) {
            if(c%i==0){//if number is equal to 0 then it is not prime number
                System.out.println(c+ " is not prime number");
                break;
            }
            if (c%i>1){//if number is not equal to 0 then it is prime number
                System.out.println(c + " is prime number");
                break;
            }

        }
    }
    //Q:4
    //reverse number
    public static void reverse(){
        System.out.println("Ans:4");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int d=scanner.nextInt();//scanner object
        int reverse=0;//declared the variable
        //using for loop condition finding reverse number
        for (;d !=0;d/=10) {
            int digit=d %10;
            reverse= reverse * 10+digit;
        }
        System.out.println("Reverse Number "+ reverse);
    }
    //Q:5
    //Factorial number
    public static void factorial(){
        System.out.println("Ans:5");
        Scanner scanner=new Scanner(System.in);//creating the scanner class
        System.out.println("Enter the number");
        int e=scanner.nextInt();//scanner object
        long factorial=1;//declare the variable
        //by using for loop condition finding factorial of number
        for (int i = 1; i <=e ; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number = "+ factorial);
    }
    //Q:6
    //Sum of number
    public static void sumofnum(){
        System.out.println("Ans:6");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int num=scanner.nextInt();//scanner object
        int sum =0;//declare the variable
        //by using for loop condition finding sum of number
        for (int i = 1; i <=num; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of natural number = " + sum);
    }
    //Q:7
    //Calculate two number and one operator by using switch
    public static void calculator(){
        System.out.println("Ans:7");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter first number");
        double first=scanner.nextDouble();//scanner object
        System.out.println("Enter second number");
        double second=scanner.nextDouble();//scanner object
        System.out.println("Enter operator(+,-,*,/)");
        char operator=scanner.next().charAt(0);//scanner object
        double result = 0.0;//declare the variable
        //using switch condition
        switch (operator){
            case '+':
                result = first + second;
                System.out.println("Addition is = " + result);//addition of numbers
                break;
            case '-':
                result = first - second;
                System.out.println("Subtraction is = "+ result);//subtraction of numbers
                break;
            case '*':
                result = first * second;
                System.out.println("Multiplication is = "+ result);//multiplication of numbers
                break;
            case '/':
                result = first / second;
                System.out.println("Division is = "+ result);//division of numbers
                break;

            default:
                System.out.println("Error operator is not match");
        }
    }
    //Q:8
    //Sum of x ranging 1 to 20
    public static void sumofrange(){
        System.out.println("Ans:8");
        Scanner scanner = new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int num=scanner.nextInt();//scanner object
        int sum =0;//declare the variable
        //using for loop condition
        for (int i = 1; i <=20 ; i++) {
            sum = sum + i;
            System.out.println(" Sum after adding "+ i + " is :" + sum);
        }
        System.out.println();
        System.out.println("Sum of number till "+ 20 + " is " + sum);
    }
    //Q:9
    //Number between 1 to 100 divided by 3 and 5
    public static void dividednum(){
        System.out.println("Ans:9");
        System.out.println("Divided by 3");
        //using for loop condition finding numbers which divided by 3
        for (int i = 1; i <=100; i++) {
            if (i%3 ==0 ){
                System.out.print( i +" ");
            }
        }
        System.out.println();
        System.out.println("Divided by 5");
        //using for loop condition finding numbers divided by 5
        for (int j = 1; j <=100 ; j++){
        //using if condition
            if (j%5 == 0){
                System.out.print( j +" ");
            }
        }
        System.out.println();
    }
    //Q:10
    //Multiplication table for any number
    public static void multiplicationtable(){
        System.out.println("Ans:10");
        Scanner scanner= new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int num=scanner.nextInt();//scanner object
        //using for loop condition to find the multiplication table for any number
        for (int i = 1; i <=10 ; i++) {

                System.out.println( num + " x " + i + " = "+ num *i);
        }

    }
    //Q;11
    //Enter any string and count total number of 'a'
    public static void stringnumber(){
        System.out.println("Ans:11");
        Scanner scanner=new Scanner(System.in);//creating the scanner class
        System.out.println("Count of 'a' in a string ");
        System.out.println("Enter a sentence");
        String b =scanner.nextLine();//scanner object
        b = b.toLowerCase();
        System.out.println("Character\tFrequency");
        //using for loop condition
        for( char ch= 'a';ch<='a';ch++){
        int count=0;//declare the variable
        for (int i = 0; i <b.length() ; i++) {
            //using if condition
                if (ch ==b.charAt(i))
                    count++;
                }
            System.out.println(ch + "\t"+ count);
        }
    }
    //Q:12
    //Sum of numbers between a & b which are divided by 9
    public static void numberdividedby(){
        System.out.println("Ans:12");
        Scanner scanner=new Scanner(System.in);//creating the scanner class
        System.out.println("Enter start number");
        int a=scanner.nextInt();//scanner object
        System.out.println("Enter end number");
        int b=scanner.nextInt();//scanner object
        int sum=0;//declare the variable
        //using for loop condition
        for (int i = a; i <=b; i++) {
            if (i%9==0){
                System.out.println(i+" ");
                sum = sum+i;
            }
        }
        System.out.println("Sum of number divided by 9 is "+ sum);
    }
    //Q:13
    //minimum and maximum number from 3 number
    public  void maximumnum(){
        System.out.println("Ans:13");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the first number");
        int num1=scanner.nextInt();//scanner object
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();//scanner object
        System.out.println("Enter the third number");
        int num3=scanner.nextInt();//scanner object
        int min=(num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3));//finding min number by using ternary operator
        System.out.println("minimum number is : " + min);
        int max=(num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3));//finding max number by using ternary operator
        System.out.println("Maximum number is : " + max);
    }
    //Q:14
    //Find average & sum between two number
    public void averagenum(){
        System.out.println("Ans:14");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the start number");
        int num1=scanner.nextInt();//scanner object
        System.out.println("Enter the end number");
        int num2=scanner.nextInt();//scanner object
        double sum=0;//declaring the variables
        double average=0.0;
        int count=0;
        //using for loop condition
        for (int i = num1; i <=num2; i++) {
            sum=sum+i;//finding sum of number
            count=count+1;
        }
        average=sum/count;//finding average number
        System.out.println("Sum of number is : "+ sum);
        System.out.println("Average of number is : "+ average);
    }
    //Q:15
    //Print triangular pattern by input one number
    public void pattern(){
        System.out.println("Ans:15");
        Scanner scanner=new Scanner(System.in);//creating scanner class
        System.out.println("Enter the number");
        int num=scanner.nextInt();//scanner object
        //by using for loop condition drawing the triangular pattern
        for (int i = 1; i <num ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }
    }
    public static void main (String[]args){
        //calling all static and instance method in main method
         Userinput userinput=new Userinput();//creating the object for instance method
         userinput.number();//Q:1
         fibonacci();//Q:2
         prime();//Q:3
         reverse();//Q:4
         factorial();//Q:5
         sumofnum();//Q:6
         calculator();//Q:7
         sumofrange();//Q:8
         dividednum();//Q:9
         multiplicationtable();//Q:10
         stringnumber();//Q:11
         numberdividedby();//Q:12
         userinput.maximumnum();//Q:13
         userinput.averagenum();//Q:14
         userinput.pattern();//Q:15
        }
    }



