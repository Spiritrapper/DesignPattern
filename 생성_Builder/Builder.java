package 생성_Builder;

public abstract class Builder {
    protected Data data;

    public Builder(Data data) {
        this.data = data;
    }

    public abstract String head();
    public abstract String body();
    public abstract String foot();
}
