package Practice;
public class EvenorOdd {
    public static void main(String[] args) {
        
        // int num=10;
        // if(num%2==0){
        //     System.out.println("Even number");
        // }
        // else{
        //     System.out.println("Odd number");
        // }
        

        //we can use ternary operator to check even or odd number
        int num=10;
        String result = num % 2 == 0 ? "Even number" : "Odd number";
        System.out.println(result);
    }
    
}
