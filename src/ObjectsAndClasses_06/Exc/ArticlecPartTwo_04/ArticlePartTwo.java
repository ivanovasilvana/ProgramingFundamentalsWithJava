package ObjectsAndClasses_06.Exc.ArticlecPartTwo_04;

public class ArticlePartTwo {
    //полета:
    private String title;
    private String content;
    private String author;

    //Конструктор:
    public ArticlePartTwo(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //setters -> променяне на стойността на полетата
    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
      return this.title;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
