package oop.example.Ex28;

public class CalculateSummation {
    double calculateSum(double first[])
    {
        double sum = 0;
        for(int i = 0; i < 5; i++)
        {
            sum = sum + first[i];
        }

        return sum;
    }


    /*int calculateSum()
    {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Enter a number: ");
            sum = sum + input.nextInt();
        }
        return sum;
    }*/
}
