import java.util.*;
class Greatestofthree{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number a:");
       int a=sc.nextInt();
       System.out.println("enter number b:");
       int b=sc.nextInt();
        System.out.println("enter number c:");
       int c=sc.nextInt();

       if(a>b){
        System.out.println("number a is greater:");
       }
        else if(b>c){
             System.out.println("number b is greater:");

        }
        else{
            System.out.println("number c is greater:");

        }
       }
    }
