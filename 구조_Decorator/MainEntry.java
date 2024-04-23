package Decorator;

public class MainEntry {
    public static void main(String[] args) {
        Strings strings = new Strings();

        strings.add("Hello~");
        strings.add("my name ta~");
        strings.add("developer~");
        strings.add("design pattern tool~");

        strings.print(); //print 상속
        Item decorator = new SideDecorator(strings, '\"');
        decorator.print();
        Item decorator1 = new LineNumberDecorator(decorator);
        decorator1.print();
        Item decorator2 = new BoxDecorator(decorator1);
        decorator2.print();
    }
}
