package Bridge;

public class Draft {
    private String title;
    private String author;
    private String[] content;

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String[] getContent() {return content;}
    
    public Draft(String title, String author, String[] content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void print(Display display) { // 순서대로 출력할 수 있는 메서드 구체적 구현은 디스플레이 인터페이스를 사용
        display.title(this);
        display.author(this);
        display.content(this);
    }
}
