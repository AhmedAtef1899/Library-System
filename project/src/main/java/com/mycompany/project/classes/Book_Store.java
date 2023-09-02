package com.mycompany.project.classes; 
import java.util.Scanner;
import java.io.FileInputStream;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
public class Book_Store {
ArrayList<String> bookName = new ArrayList<>();
ArrayList<String> bookPrice = new ArrayList<>();
ArrayList<String> cart = new ArrayList<>();
Scanner input = new Scanner(System.in);
int books;  
String newName; 
String newPrice; 
int c; 
int del; 
int cartName; 
public Book_Store() 
{ 
} 
public void setBooks(int books) 
{ 
this.books = books; 
}  
// public String getAddName() { 
// System.out.println("Enter Name Book"); 
// addName = input.next(); 
// bookName.add(0,addName); 
// return addName; 
// } 
public int getBooks() { 
System.out.println("*_* Our All Books *_*"); 
System.out.println("this name book is " + bookName + "\n"
+ " this price book is " + bookPrice); 
return books; 
} 
public void addBook() {
System.out.println("Enter the name of the book: ");
String name = input.nextLine();
System.out.println("Enter the price of the book: ");
String price = input.nextLine();
bookName.add(name);
bookPrice.add(price);
System.out.println("Book added successfully!");
}
// public void getName() { 
// bookName.addAll(Arrays.asList(" Yassin , Ahmed , 
//Bono , Gago")); 
// System.out.println("Name: "+bookName);
// System.out.println("*********************");
// } 
// public void getPrice() { 
// bookPrice.addAll(Arrays.asList("100 , 200 , 300 , 
//400 ")); 
// System.out.println("Price: "+bookPrice); 
// System.out.println("************************");
// } 
// public String getAddPrice() { 
// System.out.println("Enter Price Book"); 
// addPrice = input.next(); 
// bookPrice.add(0,addPrice); 
// System.out.println("*_* Done *_*"); 
// return addPrice; 
// } 
public int getC() { 
System.out.println("The Books: "); 
addBook(); 
System.out.println(" ");
System.out.println("Enter Count Book" + 1); 
c = input.nextInt(); 
switch (c) { 
case 1 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(0, newName);
bookPrice.set(0,newPrice); 
} 
case 2 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(1, newName); 
bookPrice.set(1,newPrice); 
} 
case 3 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(2, newName); 
bookPrice.set(2,newPrice); 
} 
case 4 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(3, newName); 
bookPrice.set(3,newPrice); 
} 
case 5 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(4, newName); 
bookPrice.set(4,newPrice); 
} 
case 6 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(5, newName); 
bookPrice.set(5,newPrice); 
} 
case 7 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(6, newName); 
bookPrice.set(6,newPrice); 
} 
case 8 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(7, newName); 
bookPrice.set(7,newPrice); 
} 
case 9 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(8, newName); 
bookPrice.set(8,newPrice); 
} 
case 10 -> { 
System.out.println("Enter New Name"); 
newName=input.next(); 
System.out.println("Enter New Price"); 
newPrice=input.next(); 
bookName.set(9, newName); 
bookPrice.set(9,newPrice); 
} 
default -> { 
System.out.println("Invalid Input"); 
} 
} 
System.out.println("*_* Done *_*"); 
return c; 
} 
public void setC(int c) { 
this.c = c; 
} 
public void setDel(int del) { 
this.del = del; 
} 
public int getDel() { 
System.out.println("The Books: "); 
addBook(); 
System.out.println(" "); 
System.out.println("Enter Count Book" + 1); 
c= input.nextInt(); 
switch (c) 
{ 
case 1 -> bookName.remove(0); 
case 2 -> bookName.remove(1); 
case 3 -> bookName.remove(2); 
case 4 -> bookName.remove(3); 
case 5 -> bookName.remove(4); 
case 6 -> bookName.remove(5); 
case 7 -> bookName.remove(6); 
case 8 -> bookName.remove(7); 
case 9 -> bookName.remove(8); 
case 10 -> bookName.remove(9); 
default -> { 
System.out.println("Invalid Input"); 
} 
} 
System.out.println("*_* Done *_*"); 
return del; 
} 
public void setCartName(int cartName) { 
this.cartName = cartName; 
} 
public int getCartName() { 
getBooks(); 
System.out.println("Type the code of the book you want to search for: "); 
System.out.print("Your Choice: "); 
cartName = input.nextInt(); 
cart.add(bookName.get(cartName - 1)); 
System.out.println("Your Cart: "+ cart); 
return cartName; 
} 
}