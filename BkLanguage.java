package com.bklanguage;
import java.util.Scanner;

class BkLanguage {
  public static void main(String[] args){
  
    //calling scanner
Scanner in = new Scanner(System.in);

//informations for the user
System.out.println("there is several backend programming languages, but which is your favorite between this languages? \n\n");

System.out.println("1) Java");
System.out.println("2) C#");
System.out.println("3) Ruby");
System.out.println("4) php");
System.out.println("5) other");
int ln = in.nextInt(); //ln: language number

String language = (ln==1) ? "Java":
(ln==2) ? "C#":
(ln==3) ? "Ruby":
(ln==4) ? "php":
          "other";

if(ln != 5){
  System.out.println(language+" is really a good programming language!");
}else{
  if(ln==5){
    System.out.println("which language? ");
    
  }
}
in.close();

  }
}