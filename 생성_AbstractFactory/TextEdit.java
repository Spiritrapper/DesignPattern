package 생성_AbstractFactory;

public abstract class TextEdit {
    protected String value;

    public TextEdit(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
        render();
    }

    public abstract void render();
}
