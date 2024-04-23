package 행위_Builder;

public class JSONBuilder extends Builder{

    public JSONBuilder(Data data) {
        super(data);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String head() {
        // TODO Auto-generated method stub
        return "{";
    }

    @Override
    public String body() {
        StringBuilder sb = new StringBuilder();

        sb.append("\"Name\": ");
        sb.append("\"" + data.getName() + "\"");
        sb.append(", \"Age\": ");
        sb.append(data.getAge());

        return sb.toString();
 
    }

    @Override
    public String foot() {
        // TODO Auto-generated method stub
        return "}";
    }


    
}
