package 구조_Adapter;

public class TigerAdapter extends Animal{
    private Tiger tiger;    //타이거 객체를 필드로 가지와서 타이거 클래스를 변경하지 않아도 타이거아탑터클래스를 통해 애니멀 클래스처럼사용

    public TigerAdapter(String name) {
        super(name);
        
        tiger = new Tiger();
        tiger.setName(name);
    }

    @Override
    public void sound() {
        System.out.println(tiger.getName() + "ggggrrr" );
        tiger.roar();
    }
    
}
