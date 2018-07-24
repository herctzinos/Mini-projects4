package june20;

import java.util.Iterator;

public class Ekloges {

  
    private boolean flag = false;

    public boolean idcheckcands(String username) {

        Iterator<String> itr = Database.candidates.iterator();

        while (itr.hasNext()) {
            if (username.equals(itr.next())) {
                System.out.println("you are not allowed to vote");
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public boolean idcheckvot(String username) {

        Iterator<String> itr2 = Voter.voters.iterator();

        while (itr2.hasNext()) {
            if (username.equals(itr2.next())) {
                System.out.println("you have already voted");
                flag = true;
                this.flag = true;
            } else {
                return false;
            }
        }
        return flag;
    }

    public void psifoforia(String vote, String username) {

        if (vote.equalsIgnoreCase("panagos")) {
            Database.panagos_c.add(username);
        } else if (vote.equalsIgnoreCase("ilias")) {
            Database.ilias_c.add(username);
        } else if (vote.equalsIgnoreCase("iraklis")) {
            Database.iraklis_c.add(username);
        } else if (vote.equalsIgnoreCase("nobody")) {
            System.out.println("I psifos san einai lefki");
        } else {
            System.out.println("Den iparxei aftos o ipopsifios");
        }
    }

}
