package day1_basic_syntax;

public class MainBasicSyntax {
    public static void main(String[] args) {

        Message message = new Message();

        message.sayHelloWithoutStatic();

        Message.sayHelloWithStatic();

    }
}
