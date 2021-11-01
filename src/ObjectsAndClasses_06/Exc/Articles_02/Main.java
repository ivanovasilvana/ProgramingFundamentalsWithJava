package ObjectsAndClasses_06.Exc.Articles_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Articles articles = new Articles(title, content, author);
        int commandsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandsCount; i++) {
            String command = scanner.nextLine();
            String commandName = command.split(": ")[0];
            String newValue = command.split(": ")[1];

            switch (commandName){
                case "Edit":
                    articles.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    articles.setAuthor(newValue);
                    break;
                case "Rename":
                    articles.setTitle(newValue);
                    break;
            }
        }
        System.out.println(articles);
    }
}