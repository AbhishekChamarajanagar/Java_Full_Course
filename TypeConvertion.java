public class TypeConvertion {
    public static void main(String a[]){
        

        // byte b1=127;
        int a1=257;
        // byte k=a1; // we can not assign int to byte because int is 4 byte and byte is 1 byte so we have to explicitly mention the typecasting
        byte b1=(byte)a1; // we have to explicitly mention the typecasting


        System.out.println(b1);
        float x=5.6f;
        // int y =x; // we can not assign float to int because float is 4 byte and int is 4 byte so we have to explicitly mention the typecasting
        int y=(int)x; // explicit type conversion -castong and we lost the value after decimal point because int can not store decimal value
        System.out.println(y);

        //Type promotion 
        byte b=10;
        byte b2=30;
        //byte result=b*b2; // we will get error because value is out of range of byte because byte is 1 byte and int is 4 byte so we have to explicitly mention the typecasting
        int result =b*b2;
        System.out.println(result);
    }
    
}
