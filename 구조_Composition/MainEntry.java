package 구조_Composition;

public class MainEntry {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        root.add(new File("a.txt", 1000));
        root.add(new File("b.txt", 2000));

        Folder sub1 = new Folder("sub1");
        root.add(sub1);
        sub1.add(new File("sa.txt", 100));
        sub1.add(new File("sa.txt", 4000));
        
        Folder sub2 = new Folder("sub2");
        root.add(sub2);
        sub2.add(new File("sA.txt", 300));
        sub2.add(new File("sB.txt", 400));


    }
}
