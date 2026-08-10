// Outer loop increments → inner loop starts again from its initialized value → inner loop completes → outer loop increments again.
//Keep reading while there is data available.
//  Reading files
//  Processing incoming data
//  Reading network data
//  Processing records from a database
// Outer loop: 1 iteration
//     ↓
//     Inner loop: FULL cycle
//     ↓
// Outer loop: next iteration
//     ↓
//     Inner loop: FULL cycle
//     ↓
// Outer loop: next iteration
//     ↓
//     Inner loop: FULL cycle

public class Whileloop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {  // outer loop
            System.out.println("hi: " + i);
            int j =1;
            while (j <= 3) { // inner loop
                System.out.println("Hello: " + j);
                j++;
            }
            i++;
        }
        System.out.println(" loop exit because condition becomes false and the Value of i becomes : " + i); // here i becomes 6 and the loop will exit because the condition is false
    }
}