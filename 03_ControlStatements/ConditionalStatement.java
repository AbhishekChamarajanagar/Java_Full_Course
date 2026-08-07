public class ConditionalStatement {
   public static void main(String[] args) {
    int x =10;
    int y=20;
    int z=30;
    if (x>y && x>z){ // both condition should be true then it will execute the if block
        System.out.println("x is greater than y and z");
    }
    else if (y>x || y>z){ // only one condition should be true then it will execute the else if block
        System.out.println("y is greater than x ");
    }
    else{ //if no codition is true then it will execute the else block
        System.out.println("z is greater than x and y");
    }
   } 
}
