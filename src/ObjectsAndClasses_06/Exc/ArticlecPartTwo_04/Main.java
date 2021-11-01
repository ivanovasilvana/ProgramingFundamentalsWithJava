package ObjectsAndClasses_06.Exc.ArticlecPartTwo_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = Integer.parseInt(scanner.nextLine());
        List<ArticlePartTwo> articlesList = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];
            ArticlePartTwo articlesPartTwo = new ArticlePartTwo(title, content, author);
            articlesList.add(articlesPartTwo);
        }
        String orderBy = scanner.nextLine();
        if (orderBy.equals("title")){
            articlesList.sort(Comparator.comparing(ArticlePartTwo::getTitle));
        }else if (orderBy.equals("content")){
            articlesList.sort(Comparator.comparing(ArticlePartTwo::getContent));
        }else if(orderBy.equals("author")){
            articlesList.sort(Comparator.comparing(ArticlePartTwo::getAuthor));
        }
        for (ArticlePartTwo articlePartTwo : articlesList) {
            System.out.println(articlePartTwo);
        }
    }
}
