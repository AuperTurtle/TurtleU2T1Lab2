import java.util.Scanner;
public class ChatBotRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ChatBot chatbot1 = new ChatBot("Turtle", 7);
        System.out.println("Hello, what is your name?");
        String myName = scan.nextLine();
        chatbot1.greeting(myName);
        scan.nextLine();

        System.out.println("My favorite pet is a turtle, what is yours?");
        String favPet = scan.nextLine();
        chatbot1.favoritePet(favPet);
        System.out.println();

        System.out.println("What is the weather like today " + myName + "?");
        String myWeather = scan.nextLine();
        chatbot1.weather();
        System.out.println();


        System.out.println("How tall are you " + myName + "? (in feet) ");
        int height = scan.nextInt();
        double heightInMeters = chatbot1.convertFeetToMeters(height);
        System.out.println("You are " + height + " feet tall which is also " + heightInMeters + " meters tall!");
        System.out.println();

        System.out.println("What is your favorite number?");
        int favNumber = scan.nextInt();
        chatbot1.favoriteNumber(favNumber);
        System.out.println();

        System.out.println("I can also do very quick addition and multiplication!");
        System.out.println("Enter three numbers: ");
        int firstNum = scan.nextInt();
        scan.nextLine();
        int secondNum = scan.nextInt();
        scan.nextLine();
        int thirdNum = scan.nextInt();
        scan.nextLine();
        int addNumberTotal = chatbot1.addNumbers(firstNum, secondNum, thirdNum);
        int multiplyNumberTotal = chatbot1.multiplyNumber(firstNum, secondNum, thirdNum);
        System.out.println("The total of those numbers added is " + addNumberTotal + ".");
        System.out.println("The total of those numbers multiplied is " + multiplyNumberTotal + ".");
        System.out.println();

        System.out.println(chatbot1.goodbye());





    }
}
