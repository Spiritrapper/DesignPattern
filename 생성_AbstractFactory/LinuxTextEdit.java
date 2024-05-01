package 행위_AbstractFactory;

public class LinuxTextEdit extends TextEdit {

    public LinuxTextEdit(String value) {
        super(value);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void render() {
        System.out.println(
            "Linux 렌더링 API를 이용해"
            + this.value + "값을 가진"
            + " 텍스트에디트를 그립니다."
        );
        
    }
    
}
