import java.util.*;

class online_reservation_system{

public static void reservations(){
//This function is used to make reservation according to the requirements 

Scanner sc=new Scanner(System.in);
System.out.println("\n\t\t\t\tCHOOSE THE TRAIN:\n\n1.Rajdhani Express(LUCKNOW TO DELHI)\n\n2.Sabarmati Express(AHMEDABAD TO DELHI)\n\n3.SHATABDI EXPRESS(DELHI TO BIHAR)\n");
int choose_train=sc.nextInt();
switch(choose_train){
    case 1:
    {
        System.out.println("\nNUMBER OF SEATS AVAILABLE=10\nNUMBER OF SEATS EMPTY=7\n\n");
        System.out.println("THE MAPPING IS:1 2 3 X X X X X X X\n\nENTER THE SEAT YOU WANT TO RESERVE:");
        int seat_number1=sc.nextInt();
        break;
    }
    case 2:
    {
        System.out.println("\nNUMBER OF SEATS AVAILABLE=10\nNUMBER OF SEATS EMPTY=4\n\n");
        System.out.println("THE MAPPING IS:1 2 3 X X 6 7 X X\n\nENTER THE SEAT YOU WANT TO RESERVE:");
        int seat_number2=sc.nextInt();
        break;
    }
    case 3:
    {
        System.out.println("\nNUMBER OF SEATS AVAILABLE=10\nNUMBER OF SEATS EMPTY=1\n\n");
        System.out.println("THE MAPPING IS:1 2 3 4 5 6 7 8 9 X\n\nENTER THE SEAT YOU WANT TO RESERVE:");
        int seat_number3=sc.nextInt();
        break;
    }
    default:
    {
        System.out.println("INVALID ENTRY");
        reservations();
        break;
    }}
    System.out.println("\nRESERVATION DONE SUCCESSFULLY");

}

public static void train_map(){
//This function keeps the train mapping and shows it tto the user
System.out.println("NAME OF TRAIN\t\t\t\t   NO OF SEATS\tNO OF RESERVE SEATS\tNO OF EMPTY SEATS\n");
System.out.println("1.Rajdhani Express(LUCKNOW TO DELHI)    \t10\t\t3\t\t\t7\n" +"\n" +"2.Sabarmati Express(AHMEDABAD TO DELHI) \t10\t\t6\t\t\t4\n" +"\n" +"3.SHATABDI EXPRESS(DELHI TO BIHAR)      \t10\t\t9\t\t\t1\n");
reservations();
}

public static void cancellation(){
//This function is used to cancel the reservation made by the user

Scanner sc=new Scanner(System.in);
System.out.println("\033cWELCOME TO THE RESERVATION CANCELLATION SECTION\n");
System.out.print("ENTER YOUR PNR NUMBER:");
int pnr=sc.nextInt();
System.out.println("DO YOU WANT TO CANCEL YOUR RESERVATION?\n1.YES\n2.NO");
int yes_or_no=sc.nextInt();
if(yes_or_no==1)
    System.out.println("RESERVATION CANCELLED SUCCESSFULLY");
else if(yes_or_no==2)
    loginpage();
}

public static void after_login(){
    
System.out.println("CHOOSE AN OPTION:\n\n1. MAKE A RESERVATION\n2. CANCEL A RESERVATION\n3. CHECK TRAIN MAP\n4. EXIT");
Scanner sc=new Scanner(System.in);
    int res_choice=sc.nextInt();
    switch(res_choice){
        case 1:
        {   
            reservations();
            break;
        }
        case 2:
        {
            cancellation();
            break;
        }
        case 3:
        {
            train_map();
            break;
        }
        case 4:
        {  
            System.out.print("\033c");//clears the screen
            System.out.println("THANK YOU!!!----GOODBYE!!!----HAVE A SAVE JOURNEY!!!\n");
            System.exit(0);
        }
        default:
        {
            System.out.println("\033cINVALID CHOICE\n");
            after_login();
            break;
        }}
    }
// public static void login(){
// //This function is used to keep login details and login a user the data is stored in sql database

// Scanner scanner = new Scanner(System.in);
// //HERE THE CODE FOR SQL WITH BE PRESENT FOR CHECKING OF DATA I M CONTINUING THE NEXT PART
// System.out.println("ENTER YOUR USERNAME:");
// String login_user=scanner.nextLine();
// System.out.println("ENTER YOUR PASSWORD:");
// String login_password=scanner.nextLine();

// after_login();
// }

public static int c=1;

public static void signup(){
//This function is used to enter the user details in the database for further use in future

Scanner scanner = new Scanner(System.in);
String username,adhar_card_number,phone_number,address,reservation;
int userId=c;
System.out.println("ENTER THE FOLLOWING DETAILS...");



System.out.println("Enter your Name:");
username = scanner.nextLine();
 
System.out.println("Enter Adhar Card Number:");
adhar_card_number = scanner.nextLine();


System.out.println("Enter Phone Number:");
phone_number = scanner.nextLine();

System.out.println("Enter Your Address:");
address = scanner.nextLine();

reservation = "NO RESERVATION";
userId++;
    System.out.print("\033c");//clears the screen
    System.out.println("-------------------------------------------------WELCOME-"+username+"-----------------------------------------------\n");
    after_login();
        }
public static void loginpage(){
    //This function asks if the user want to login or signup
    Scanner sc=new Scanner(System.in);
    // System.out.println("\t1. LOGIN\n\t2. SIGN UP\n\t3. EXIT");
    // // int log_or_sign=sc.nextInt();
    // switch(log_or_sign){
    //     case 1:
    //     {   System.out.println("\033c");
            signup();
        //     break;
        // }
        // case 2:
        // {
        //     s
        //     break;
        // }
        // case 3:
        // {  
            // System.out.print("\033c");//clears the screen
        //     System.out.println("THANK YOU!!!----GOODBYE!!!----HAVE A SAVE JOURNEY!!!\n");
        //     System.exit(0);
        // }
        // default:
        // {
        //     System.out.println("\033cINVALID CHOICE\n");
        //     loginpage();
        //     break;
        // }
    }



public static void main(String[] args) {
        
        
    System.out.print("\033c");//clears the screen
    System.out.println("------------------------------------------------HELLO THERE!!!----------------------------------------------\n");
    System.out.println("---------------------------------WELCOME TO THE ONLINE RESERVATION SYSTEM-----------------------------------\n");
    loginpage();
    
            }}