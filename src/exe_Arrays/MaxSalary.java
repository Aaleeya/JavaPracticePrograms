package exe_Arrays;

public class MaxSalary {
    public static void main(String[] args) {
        int[] salary ={30, 50, 60, 999, 10, 100, 90};
        int maxSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i]>maxSalary){
                maxSalary = salary[i];
            }
        }
        System.out.println("Max salary from the array is -> " +maxSalary);
    }
}
