public class Datatype {
    /**
     * @param a
     */
    public static void main(String a[]){


      int num1 = 3; //it is assignment operator it will take value right hand side it will assign the value to left hand side
      int num2 = 3;
      int result1 = num1 + num2;
      int result2 = num1 - num2;
      int result3 = num1 * num2;
      int result4 = num1 / num2;
      System.out.println(result1);
      System.out.println(result2);
      System.out.println(result3);
      System.out.println(result4);
     //Integer 
     //int= 4 byte (2^31-1) can store in memory,byte =1 byte ,long=8 byte ,short=2 byte
     //Float =4 byte and Double is 8 byte by default we are double
     float num =5.6f; // we have to explicitly mention f becuase it is not default value 
     System.out.println(num);
     //char is 2 byte of memory 
     char name ='a';
     System.out.println(name);

     boolean x =true;
     System.out.println(x);
    }
}