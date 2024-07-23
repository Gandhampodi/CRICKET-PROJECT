package Cricket;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main1 {
    public static void  main(String agr[]){
        CricketImpl cricketInterf=new CricketImpl();
        System.out.println("Welcome to Cricket management application");
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.create Cricket\n"+"2. Show All Cricket\n"
                    +"3. Show Cricket based on id \n"+"4. update the cricket\n"
                    +"5.Delete the cricket \n");
            System.out.println("Enter Choice:");
            
            int ch =sc.nextInt();
            switch (ch) {
                case 1:
                    Cricketer cricketer=new Cricketer();
                    System.out.println(" Enter ID :");
                    int id=sc.nextInt();
                    System.out.println("Enter name:");
                    String name= sc.next();
                    System.out.println("Enter salary: ");
                    int salary= sc.nextInt();
                    System.out.println("Enter age :");
                    int age=sc.nextInt();
                    cricketer.setId(id);
                    cricketer.setAge(age);
                    cricketer.setName(name);
                    cricketer.setSalary(salary);
                    cricketInterf.createCricketer(cricketer);
                    break;
                case 2:
                    cricketInterf.showAllCricketer();
                    break;
                case 3:
                    System.out.println("Enter id to show the details");
                    int cricketerid=sc.nextInt();
                    cricketInterf.ShowCricketBasedOnId(cricketerid);
                    break;
                case 4:
                    System.out.println("Enter the id to update the datails" );
                    int cricketerid1=sc.nextInt();
                    System.out.println("Enter the new name");
                    name= sc.next();
                    cricketInterf.UpdateCricketer(cricketerid1,name);
                case 5:
                    System.out.println("enter the delete the id");
                    id= sc.nextInt();
                    cricketInterf.deleteCricketer(id);
                case 6:
                    System.out.println("Thank you for using our application");
                    System.exit(1);
                default:
                    System.out.println("Enter a valid choice");
                    break;

            }
        }while (true);
    }


}
