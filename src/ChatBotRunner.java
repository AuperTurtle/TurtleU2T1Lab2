import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChatBot chatbot1 = new ChatBot("Turtle", 7);
        System.out.println("Hello, what is your name?");
        String myName = scan.nextLine();
        chatbot1.greeting(myName);

        System.out.println("What is the weather like today " + myName + "?");
        String myWeather = scan.nextLine();
        chatbot1.weather();

        System.out.println("How tall are you " + myName + "? (in feet) ");
        int height = scan.nextInt();
        double heightInMeters = chatbot1.convertFeetToMeters(height);
        System.out.println("You are " + height + "feet tall which is also " + heightInMeters + "meters tall!");




    }
}
