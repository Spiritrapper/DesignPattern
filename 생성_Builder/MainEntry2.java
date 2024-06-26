package 생성_Builder;

public class MainEntry2 {
    public static void main(String[] args) {
        Data data = new Data("Jane", 25);
        Builder builder = new PlainTextBuilder(data);
        Director director = new Director(builder);
        String result= director.build();
        System.out.println(result);

        builder = new JSONBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);

        builder = new XMLBuilder(data);
        director = new Director(builder);
        result = director.build();
        System.out.println(result);
    }
}
