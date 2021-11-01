package ObjectsAndClasses_06.Exc.Articles_02;

public class Articles {
    //полета:
    private String title;
    private String content;
    private String author;

    //Конструктор:
    public Articles(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //setters -> променяне на стойността на полетата
    public void setContent (String newContent){
        this.content = newContent;
    }

    public void setAuthor(String newAuthor){
        this.author = newAuthor;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }
}
