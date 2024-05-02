package 구조_Proxy;

public class ScreenDisplay implements Display{

    @Override
    public void print(String content) {// 가정 데이터를 가져오는데 상당량의 시간 소요
       try {
            Thread.sleep(500); // 출력을 위한 준비 작업
       } catch (InterruptedException e) {
        e.printStackTrace();
       }

       System.out.println(content);
    }
    
}
