public class Increment {
    public static void main(String[] args) {
        int num = 5;
        //but when we use assigment operator bfore post increment
        int result = num++; // first it will fetch the value later it increment  
        //int result = ++num; // first it will increment the value later it fetch the value
        System.out.println(result);

        
    }
}
