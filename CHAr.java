import java.util.*;
import java.lang.*;
import java.io.*;
class Main{
  char input(){
    char ch;
    Scanner sc = new Scanner(System.in);
    ch = sc.next().charAt(0);
    return ch;
    }
  int check(char ch){
    int x=0,n;
    n =(int)ch;
    if(!((n>=65&&n<=90)||(n>=97&&n<=122))){
      x=-1;
      }
    if(x==0){
      if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
        x=1;
        }
      else{
        x=0;
        }
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
      System.out.println("The character is a vowel.");
      }
    else if(x<0){
      System.out.println("Invalid input.");
      }
    else{
      System.out.println("The charcater is a consonant");
      }
     }
    }
