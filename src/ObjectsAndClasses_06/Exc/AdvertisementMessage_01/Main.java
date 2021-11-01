package ObjectsAndClasses_06.Exc.AdvertisementMessage_01;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int row = Integer.parseInt(scanner.nextLine());
       String[] phrases = {"Excellent product.",
               "Such a great product.",
               "I always use that product.",
               "Best product of its category.",
               "Exceptional product.",
               "I can’t live without this product."};
       String[] events = {"Now I feel good.",
               "I have succeeded with this product.",
               "Makes miracles. I am happy of the results!",
               "I cannot believe but now I feel awesome.",
               "Try it yourself, I am very satisfied.",
               "I feel great!"};
       String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
       String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        for (int i = 0; i < row; i++) {
            System.out.println(phrases[random.nextInt(phrases.length)] + " " +
                    events[random.nextInt(events.length)] + " " +
                    author[random.nextInt(author.length)] + " " +
                    city[random.nextInt(city.length)]);
        }
    }
}
