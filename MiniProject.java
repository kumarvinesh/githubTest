import java.util.*;

public class MiniProject {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print(
                "1.Marksheet\n2.Transport Company\n3.Employee Salary Calculator\n4.ATM\n5.Age Compare\n6.Unit Convertor\n7.Calculator");
                System.out.println();
                  System.out.println("kirpiyaa krke 1 dabaiye marksheet ka program dekhne k liye...!");
                  System.out.println();
                  System.out.print("Enter your choice : ");
        int choice = scanner.nextInt();
        
        if (choice > 7) {
            System.out.println("Invalid choice");
        }
        if (choice <= 0) {
            System.out.println("Invalid choice");
        }
        if (choice == 1) {
            System.out.println("Dhanyawad...!\n");
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Marksheet Program\n");
            int total_marks = 500;
            System.out.print("Enter java marks : ");
            int java = scanner.nextInt();
            System.out.print("Enter database marks : ");
            int database = scanner.nextInt();
            System.out.print("Enter oracle marks : ");
            int oracle = scanner.nextInt();
            System.out.print("Enter networking marks : ");
            int networking = scanner.nextInt();
            System.out.print("Enter c marks : ");
            int c = scanner.nextInt();
            int obtained_marks = (java + database + networking + c + oracle);
            int percentage = (obtained_marks * 100) / total_marks;
            System.out.println("Your total marks are : " + total_marks);
            System.out.println("Your Obtained marks are : " + obtained_marks);
            System.out.println("percentage is : " + percentage + "%");
        }
        if (choice == 2) {
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Transport Company Program");
            System.out.print("enter troly load : ");
            int load = scanner.nextInt();
            int troly_income = 1800 * load;
            int driver_fees = 150 * load;
            int tax = 10 * load;
            int troly_tax = (troly_income * tax) / 100;
            int diesel = 2 * load;
            int troly_diesel = 273 * diesel;
            int profit = troly_income - (driver_fees + troly_tax + troly_diesel);
            System.out.println("Total income per " + load + " load : " + troly_income);
            System.out.println("driver fees per " + load + " load : " + driver_fees);
            System.out.println("troly pay " + tax + "% tax" + " per " + load + " load : " + troly_tax);
            System.out
                    .println("troly consume " + diesel + " litres diesel" + " per " + load + " load : " + troly_diesel);
            System.out.println("profit : " + profit);
        }
        if (choice == 3) {
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Employee Salary Calculator");
            System.out.print("enter employee basic pay : ");
            int basic_pay = scanner.nextInt();
            int house_rent = (basic_pay * 45) / 100;
            int medical_allowance = (basic_pay * 15) / 100;
            int bonus = (basic_pay * 5) / 100;
            int gross_pay = (basic_pay + house_rent + medical_allowance + bonus);
            int income_tax = (basic_pay * 5) / 100;
            float zukwat = (basic_pay * 2.5f) / 100;
            int zukwat1 = (int) zukwat;
            int convance_allowance = (basic_pay * 8) / 100;
            int profit = gross_pay - (income_tax + zukwat1 + convance_allowance);
            System.out.println("house rent 45% of " + basic_pay + " : " + house_rent);
            System.out.println("medical allowance 15% of " + basic_pay + " : " + medical_allowance);
            System.out.println("bonus 5% of " + basic_pay + " : " + bonus);
            System.out.println("gross pay : " + gross_pay);
            System.out.println("income tax 5% of " + basic_pay + " : " + income_tax);
            System.out.println("zukwat 2.5% of " + basic_pay + " : " + zukwat1);
            System.out.println("convance allowance 8% of " + basic_pay + " : " + convance_allowance);
            System.out.println("Net Income : " + profit);
            int profit1 = (house_rent + bonus + medical_allowance) - (zukwat1 + income_tax + convance_allowance);
            System.out.println("total profit : " + profit1);
        }
        if (choice == 4) {
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the ATM Program");
            System.out.print("enter rupees : ");
            int rs = scanner.nextInt();
            System.out.println("5000 : " + rs / 5000);
            rs %= 5000;
            System.out.println("1000 : " + rs / 1000);
            rs %= 1000;
            System.out.println("500  : " + rs / 500);
            rs %= 500;
            System.out.println("100  : " + rs / 100);
            rs %= 100;
            System.out.println("50   : " + rs / 50);
            rs %= 50;
            System.out.println("20   : " + rs / 20);
            rs %= 20;
            System.out.println("10   : " + rs / 10);
            rs %= 10;
            System.out.println("5    : " + rs / 5);
            rs %= 5;
            System.out.println("2    : " + rs / 2);
            rs %= 2;
            System.out.println("1    : " + rs);
        }
        if (choice == 5) {
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Age Compare Program");
            System.out.print("Enter 1st Age : ");
            int age1 = scanner.nextInt();
            System.out.print("Enter 2nd Age : ");
            int age2 = scanner.nextInt();
            if (age1 > age2) {
                System.out.println("1st Age is greater");
            }
            if (age2 > age1) {
                System.out.println("2nd Age is greater");
            }
            if (age1 == age2) {
                System.out.println("both ages are equal");
            }
        }

        if (choice == 6) {
            System.out.println("Hello, Welcome to the Unit Convertor Program");
            System.out.print(
                    "1.Feet to inches\n2.Inches to feet\n3.Kilo grams to grams\n4.Grams to kilo grams\n\nEnter your Selection : ");
            // Scanner obj = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection > 4) {
                System.out.println("Invalid Selection");
            }
            if (selection <= 0) {
                System.out.println("Invalid Selection");
            }
            if (selection == 1) {
                System.out.print("enter feet : ");
                int feet = scanner.nextInt();
                int inches = feet * 12;
                System.out.println("inches in " + feet + " feet : " + inches);
            }
            if (selection == 2) {
                System.out.print("enter inches : ");
                int inches = scanner.nextInt();
                int feet = inches / 12;
                System.out.println("feet in " + inches + " inches : " + feet);
            }
            if (selection == 3) {
                System.out.print("Enter kilo grams : ");
                int kilo_grams = scanner.nextInt();
                int grams = kilo_grams * 1000;
                System.out.println("Grams in " + kilo_grams + " kilo grams : " + grams);
            }
            if (selection == 4) {
                System.out.print("Enter grams : ");
                int grams = scanner.nextInt();
                int kilo_grams = grams / 1000;
                System.out.println("Kilo grams in " + grams + " grams : " + kilo_grams);
            }
            // if (selection > 4) {
            // System.out.println("Invalid Selection");
            // }
            // if (selection <= 0) {
            // System.out.println("Invalid Selection");
            // }
        }
        if (choice == 7) {
            // Scanner sc = new Scanner(System.in);
            System.out.println("Hello, Welcome to the Calculator program");
            System.out.println();
            System.out.print(
                    "1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n\nEnter Selection : ");
            int selection = scanner.nextInt();
            if (selection > 5) {
                System.out.println("Invalid Selection");
            }
            if (selection <= 0) {
                System.out.println("Invalid Selection");
            }
            if (selection == 1) {
                System.out.print("Enter 1st value : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd value : ");
                int num2 = scanner.nextInt();
                System.out.println("Addition is : " + (num1 + num2));
            }
            if (selection == 2) {
                System.out.print("Enter 1st value : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd value : ");
                int num2 = scanner.nextInt();
                System.out.println("Subtraction is : " + (num1 - num2));
            }
            if (selection == 3) {
                System.out.print("Enter 1st value : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd value : ");
                int num2 = scanner.nextInt();
                System.out.println("Multiplication is : " + (num1 * num2));
            }
            if (selection == 4) {
                System.out.print("Enter 1st value : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd value : ");
                int num2 = scanner.nextInt();
                System.out.println("Division is : " + (num1 / num2));
            }
            if (selection == 5) {
                System.out.print("Enter 1st value : ");
                int num1 = scanner.nextInt();
                System.out.print("Enter 2nd value : ");
                int num2 = scanner.nextInt();
                System.out.println("Remainder is : " + (num1 % num2));
            }
            // if (selection > 5) {
            // System.out.println("Invalid Selection");
            // }
            // if (selection <= 0) {
            // System.out.println("Invalid Selection");
            // }
        }
        // if (choice > 7) {
        // System.out.println("Invalid Selection");
        // }
        // if (choice <= 0) {
        // System.out.println("Invalid Selection");
        // }
    }
}
