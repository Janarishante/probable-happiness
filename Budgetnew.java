package com.Janari;

import java.util.Scanner;

class Quiz2Budget {

    static double[] bills = new double[6];
    static double[] pay = new double[4];
    static double billsTotal;
    static double income;
    static double allBills;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        choice = menu(); // Value-returning Method call

        switch (choice) {
            case 1:
                allBills = getBills(bills[0], bills[1], bills[2], bills[3], bills[4], bills[5]); // Method call
                income = getIncome(pay[0]); // Overloaded Method call
                double x = allBills / 4;
                info(); //Void Method call
                System.out.println("Total remaining budget for this week: " + (income - Math.round(x))); //Pre-defined method use
                break;
            case 2:
                allBills = getBills(bills[0], bills[1], bills[2], bills[3], bills[4], bills[5]); // Method call
                income = getIncome(pay[0], pay[1], pay[2], pay[3]); // Overloaded Method call
                double z = income;
                info(); //Void Method call
                System.out.println("Your remaining budget for this month is: " + (z - Math.round(allBills))); //Pre-defined Method call
                break;
            case 3:
                allBills = getBills(bills[0], bills[1], bills[2], bills[3], bills[4], bills[5]); // Method call
                income = getIncome(pay[0], pay[1], pay[2], pay[3]); // Method call
                double y = allBills * 12;
                double a = income * 12;
                info(); //Void Method call
                System.out.println("Your remaining yearly budget based off of your monthly income is: " + (a - Math.round(y)));
                break;
        } //close switch


    }//end of main method


    //Method definitions:
    //Void method,prints info recieved
    private static void info() {
        System.out.println("Rent: "+bills[0]);
        System.out.println("Electric: "+bills[1]);
        System.out.println("Water: "+bills[2]);
        System.out.println("Food: "+bills[3]);
        System.out.println("Gas: "+bills[4]);
        System.out.println("Children: "+bills[5]+"\n");

        System.out.printf("Total Income Entered: %s\n%n",income );
        System.out.printf("Total Monthly Expenses: %s\n%n",allBills);
}
    // Value returning method menu, returns choice made
    private static int menu() {
        int choice;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Your choices are:");
            System.out.println("*****************");
            System.out.println("\t1)Budget for the week");
            System.out.println("\t2)Budget for the month");
            System.out.println("\t3)Budget for the year");
            System.out.println("\t0)EXIT");
            System.out.print("\nPlease select your choice: ");
            choice = input.nextInt();
            System.out.println();
        } while (choice < 0 || choice > 4); //close do-while
        return choice;
    }
    // Overloaded value-returning method to get income, week one, week two, week three, week four
    public static double getIncome(double one, double two, double three, double four) {
        double totalIncome;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter check 1 amount:");
        one = input.nextDouble();
        pay[0]=one;

        System.out.println("Enter check 2 amount:");
        two = input.nextDouble();
        pay[1] = two;

        System.out.println("Enter check 3 amount:");
        three = input.nextDouble();
        pay[2]=three;

        System.out.println("Enter check 4 amount:");
        four = input.nextDouble();
        pay[3] = four;

        totalIncome = pay[0] + pay[1] + pay[2] + pay[3];
        return totalIncome;
    }
    // Overloaded method get income, one income input
    public static double getIncome(double one) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter check amount:");
        one = input.nextDouble();
        pay[0]=one;
        return one;
    }
        // Get bills method
        public static double getBills(double rent, double electric, double water, double food, double gas, double baby){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter monthly rent amount:");
            rent = input.nextDouble();
            bills[0] = rent;

            System.out.println("Enter monthly electric amount:");
            electric = input.nextDouble();
            bills[1] = electric;

            System.out.println("Enter monthly water amount:");
            water = input.nextDouble();
            bills[2] = water;

            System.out.println("Enter monthly food amount:");
            food = input.nextDouble();
            bills[3] = food;

            System.out.println("Enter monthly gas amount:");
            gas = input.nextDouble();
            bills[4] = gas;

            System.out.println("Enter monthly child expenses amount:");
            baby = input.nextDouble();
            bills[5] = baby;

            billsTotal = bills[0] + bills[1] + bills[2] + bills[3] + bills[4] + bills[5];

            return billsTotal;


        }// method getBillInformation

} //close class


