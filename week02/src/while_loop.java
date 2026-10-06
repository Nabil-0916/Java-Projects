public class while_loop{
    public static void main(String[] args) {
        int sum = 0;
        int i = 5;
        while(i <= 100) {
            sum = sum + i;
            i = i + 5;
        }

        System.out.println("Sum is: " + sum);
    }
}