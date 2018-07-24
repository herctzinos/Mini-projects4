package june20;

import java.util.HashSet;
import java.util.Set;

public class Candidate extends Person {

    private static Set<String> psifoi = new HashSet<String>();
    private int max;
    private String winner;

    public String whoisthewinner() {
        max = Database.panagos_c.size();
        winner = "Panagos";
        if (max < Database.ilias_c.size()) {
            max = Database.ilias_c.size();
            winner = "Ilias";
        }
        if (max < Database.iraklis_c.size()) {
            max = Database.iraklis_c.size();
            winner = "Iraklis";
        }
        return winner;
    }
}
