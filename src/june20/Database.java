package june20;

import java.util.HashSet;
import java.util.Set;

public class Database {

     static Set<String> candidates = new HashSet<String>();
     static Set<String> panagos_c = new HashSet<String>();
     static Set<String> ilias_c = new HashSet<String>();
      static Set<String> iraklis_c = new HashSet<String>();

    public static void candidatesinit() {

        candidates.add("panagos");

        candidates.add("ilias");

        candidates.add("iraklis");

        candidates.add("nobody");

    }
}
