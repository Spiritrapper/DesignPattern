package 생성_AbstractFactory;

public abstract class ComponentFactory { // 추상대신 인터페이스로도 가능
    public abstract Button createButton(String caption);
    public abstract CheckBox createCheckBox(boolean bChecked);
    public abstract TextEdit createTextEdit(String value);
}
