import java.util.Scanner;

public class FirstAssignment {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to proceed");
        System.out.println("Press 2 to exit");
        int choice1 = scan.nextInt();

        while(choice1==1){
            System.out.println("Press 1. for Addition");
            System.out.println("Press 2. for Subtraction");
            System.out.println("Press 3. for Table");
            int choice2 = scan.nextInt();

            switch (choice2)
            {
                case 1:
                {
                    System.out.println("Enter the two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    System.out.println("The sum is: "+ (a+b));
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the two numbers");
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    if(a>b) {
                        System.out.println("The difference is: " + (a - b));
                    }
                    else {
                        System.out.println("The difference is: " + (b - a));
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the number");
                    int a = scan.nextInt();
                    for(int i=1;i<=10;i++)
                    {
                        System.out.println(a + " * " + i + " = " + (a*i));
                    }
                    break;
                }
            }
            System.out.println("Press 1 to proceed");
            System.out.println("Press 2 to exit");
            choice1 = scan.nextInt();

        }
    }
}
