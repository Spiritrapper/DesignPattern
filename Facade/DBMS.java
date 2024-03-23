package Facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<String, Row>();

    public DBMS() {
        db.put("jane", new Row("jane","1990-02-14", "jane22@fff.co.kr"));
        db.put("amm", new Row("amm","199711-15", "amm11@faaa.co.kr"));
        db.put("ggg", new Row("ggg","2000-04-24", "ggg11@fff.co.kr"));
    }

    public Row query(String name) {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
