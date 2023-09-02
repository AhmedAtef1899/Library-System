
package com.mycompany.project.classes; 
import java.util.Scanner;
public class customer extends Book_Store { 
Scanner input = new Scanner(System.in); 
Book_Store b = new Book_Store(); 
int ch; 
public customer() 
{ 
} 
public customer(int cho) 
{ 
ch =cho; 
} 
public void setCh(int ch) { 
this.ch = ch; 
} 
public int getCh() { 
while (true) 
{ 
System.out.println("*_* Welcome *_*"); 
System.out.println("1- Search"); 
System.out.println("2- Exit "); 
ch = input.nextInt(); 
switch(ch) 
{ 
case 1 -> b.getCartName(); 
case 2 -> System.exit(0); 
} 
} 
} 
}
