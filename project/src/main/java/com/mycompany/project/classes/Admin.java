
package com.mycompany.project.classes; 
import java.util.Scanner;
public class Admin extends Book_Store { 
Scanner input = new Scanner (System.in); 
int ch; 
public Admin() { 
} 
public Admin(int cho) 
{ 
ch =cho; 
} 
public void setCh(int ch) { 
this.ch = ch; 
} 
public boolean getCh() { 
Book_Store b = new Book_Store(); 
do
{ 
System.out.println("1- All Books in Store"); 
System.out.println("2- Update"); 
System.out.println("3- Delete"); 
System.out.println("4- Add"); 
System.out.println("5- Exit"); 
System.out.print("Your Choice: "); 
ch = input.nextInt(); 
switch(ch) 
{ 
case 1 -> b.getBooks();
case 2 -> b.getC(); 
case 3 -> b.getDel(); 
case 4 -> { 
b.addBook(); 
} 
case 5 -> System.exit(0); 
default -> System.out.println("Invalid Input"); 
} 
} 
while (true); 
}
}