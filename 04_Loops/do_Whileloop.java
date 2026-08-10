
// Even if the condition is false,the do-while loop will execute the code block once before checking the condition.
public class do_Whileloop {
    public static void main(String[] args) {
        int i = 1;
        do { // outer do while loop
            System.out.println("Value of i: " + i);
            int j = 1;
            do { //inner do while loop
                System.out.println("Hello: " + j);
                j++;
            } while (j <= 3);
            i++;
        } while (i <= 5);
    }
}
