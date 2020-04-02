package javaproject.functionarguments;

public class FunctionArguments {

    public static void main(String[] args) {

        receiveGreeting("Jimmy", "Hi", "You rock!");
        receiveGreeting("Mjello", "you suck!");
        receiveGreeting("You fat bastard!");

    }

    //Default values
    private static void receiveGreeting(String name, String prefix, String postfix) {
        System.out.println(String.format("%s %s %s", prefix, name, postfix));
    }

    private static void receiveGreeting(String prefix, String postfix) {
        receiveGreeting("John", prefix, postfix);
    }

    private static void receiveGreeting(String postfix) {
        receiveGreeting("John", "Hello", postfix);
    }

    //... And so on..
}
