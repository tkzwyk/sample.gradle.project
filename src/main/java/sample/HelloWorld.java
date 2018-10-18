package sample;

public class HelloWorld {
    public static void main(){
        System.out.println("Hello world");

        Integer num = 3;
        System.out.println("Twice " + num + " is " + twice(num));
    }

    public  static Integer twice(Integer input){
        return input * 2;
    }
}
