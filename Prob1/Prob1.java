public class Prob1{
    public static void main(String[] args)
    {
        int basicSalary = 105000;
        int dearnessAllowance = ((40*basicSalary)/100);
        int houseRentAllowance = ((20*basicSalary) / 100);
        System.out.println("Gross salary is: " + (basicSalary + dearnessAllowance + houseRentAllowance));
    }
}