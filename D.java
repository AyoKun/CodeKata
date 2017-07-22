import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
  int Input(){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any Number");
    n = sc.nextInt();
    return n;
  }
  int comp(int n){
    int x;
    if(n>0){
      x=1;
    }
    else if(n<0){
      x=-1;
    }
    else 
    {
      x=0;
    }
    return x;
  }
  public static void main(String args[])throws java.lang.Exception{
    int n,x;
    Main ob = new Main();
    n = ob.input();
    x = ob.comp(n);
    if(x>0){
      System.out.println("Number is positive.");
    }
    else if(x<0){
      System.out.println("Number is negative.");
    }
    else{
      System.out.println("Number is zero.");
    }
  }
}
