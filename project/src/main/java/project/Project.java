
    package Project; 
    import com.mycompany.project.classes.Admin;
    import com.mycompany.project.classes.customer;
    import java.util.Scanner;
    public class Project { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    Admin a = new Admin(); 
    customer c = new customer(); 
    do
    { 
    System.out.println("*_* Welcome To Our Store *_*"); 
    System.out.println("1- Administrator 2- Customer "); 
    System.out.print("Your Choice 1 or 2: "); 
    int ch; 
    ch = input.nextInt(); 
    switch (ch) 
    { 
    case 1 -> System.out.println(a.getCh()); 
    case 2 -> System.out.println(c.getCh()); 
    default -> System.out.println("Invalid Input"); 
    } 
    } 
        while(true); 
    }
    }
