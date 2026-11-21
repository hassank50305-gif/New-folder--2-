 public class EmployeeBug {
    public static void main(String[] args) {
        int[] hours = {40, 25, 50};
        int rate = 1000;
        int total = 0;
        for (int i = 0; i <= hours.length; i++) {
            total = total + hours[i] * rate
        }
        int average = total / hours.length;
        System.out.println("Total salary: " + total);
        System.out.println("Average salary: " + average);
    }
}

