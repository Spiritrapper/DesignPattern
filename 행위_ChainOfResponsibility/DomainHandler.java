package 행위_ChainOfResponsibility;

public class DomainHandler extends Handler{

    @Override
    protected void process(String url) {
        int startIndex = url.indexOf("://");
        int lastIndex = url.lastIndexOf(":");

        System.out.println("DOMAIN: ");
        if(startIndex == -1) {
            if(lastIndex == -1) {
                System.out.println(url);
            } else {
                System.out.println(url.substring(0, lastIndex));
            }
        } else if(startIndex != lastIndex){
            System.out.println(url.substring(startIndex+3, lastIndex));
        } else if(startIndex == lastIndex) {
            System.out.println(url.substring(startIndex+3));
        } else {
            System.out.println("NONE");
        }
    }

    
    
}
