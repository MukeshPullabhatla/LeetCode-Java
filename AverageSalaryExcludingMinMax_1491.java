import java.util.Arrays;

public class AverageSalaryExcludingMinMax_1491 {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int sum = 0;
        int count = 0;
        for(int i = 1; i < salary.length - 1; i++) {
            sum += salary[i];
            count++;
        }
        return (double) sum / count;
    }
    public static double average_optimum(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        int sum = 0;

        for(int sal: salary) {
            sum += sal;
            minSalary = Math.min(minSalary, sal);
            maxSalary = Math.max(maxSalary, sal);
        }
        return (double)(sum - minSalary - maxSalary)/(salary.length - 2);
    }
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        int[] salary1 = {1000,2000,3000};
        System.out.println(average(salary));
        System.out.println(average(salary1));
        System.out.println(average_optimum(salary));
        System.out.println(average_optimum(salary1));
    }
}
