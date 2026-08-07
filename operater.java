public class operater {
    public static void main(String[] args) {
        //Comparison operator=<,>,==,!=,<=,>= //output in the form of boolean true or false
        int a=10;
        int b=20;
        System.out.println(a>b); //output will be false because 10 is not greater than 20
        System.out.println(a<b); //output will be true because 10 is less than 20
        System.out.println(a==b); //it is used to compare the two values if both are equal then it will return true otherwise false
        System.out.println(a!=b); //output will be true because 10 is not equal to 20
        System.out.println(a>=b); //output will be false because 10 is not greater than or equal to 20
        System.out.println(a<=b); //output will be true because 10 is less than or equal to 20
        

        //logical Operators= &&,||,!
        System.out.println(a>b && a<b); //output will be false because both conditions are not true
        System.out.println(a>b || a<b); //output will be true because one condition is true
        System.out.println(!(a>b)); //output will be true because a is not greater than b 
        System.out.println(!(a<b)); //output will be false because a is less than b 
    }
}
