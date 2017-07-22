import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
  char input(){
    char ch;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any character : ");
    ch = sc.next().charAt(0);
    return ch;
  }
  int check(char ch){
    int x,n;
    n = (int)ch;
    if ((n>=65 && n<=90)||(n>=97 && n<=122)){
      x=1;
    }
    else{
      x=-1;
    }
    return x;
  }
  public static void main(String args[])throws java.lang.Exception{
    int x;
    char ch;
    Main ob = new Main();
    ch = ob.input();
    x = ob.check(ch);
    if(x>0){
      System.out.println("The character is an alphabet.");
    }
    else{
      System.out.println("The character is not an alphabet.");
    }
  }
}
