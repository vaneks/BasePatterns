package main.java.com.vaneks.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class SaveRepo {
    private Save save;
    private String version;
    private Map<String, Save> saves = new HashMap();

    public Save getSave(String version) {
        return saves.get(version);
    }

    public void setSave(Save save) {
        this.save = save;
        this.saves.put(save.getVersion(),save);

    }
}
