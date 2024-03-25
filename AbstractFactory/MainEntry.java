package AbstractFactory;

public class MainEntry {
    public static void main(String[] args) {
        ComponentFactory factory = new WindowsFactory();

        Button button = factory.createButton("확인");
        CheckBox CheckBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.createTextEdit("디자인패턴");

        button.render();
        CheckBox.render();
        textEdit.render();
    }
}
