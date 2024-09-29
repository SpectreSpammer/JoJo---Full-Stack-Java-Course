package day2_java_syntax_basics;

public class MainJavaBasics {
    public static void main(String[] args) {
        sayMessage();

        Message message = new Message();
       // message.sayMessageInOtherClass();

        Message.sayMessageInOtherClass();
    }

    public static void sayMessage(){
        System.out.println("Hello World!");
    }

}
