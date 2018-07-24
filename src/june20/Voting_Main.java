package june20;

import java.util.Scanner;

public class Voting_Main {

    private static boolean flag = true;
    private static String response;
    private static String username;
    private static int id = 0;
    private static String vote;

    public static void main(String[] args) {
        Ekloges e = new Ekloges();
        Database.candidatesinit();
        Database d = new Database();

        while (flag) {
            while (id == 0) {

                Scanner sc3 = new Scanner(System.in);
                System.out.println("Enter your username");
                username = sc3.next();

                if (e.idcheckcands(username)) {
                    id = 0;
                } else if (e.idcheckvot(username)) {
                    id = 0;
                } else {

                    Voter.voters.add(username);
                    id = 1;

                }
            }

            System.out.println("Please choose the person you want to vote from the below:");
            for (String name : Database.candidates) {
                System.out.println(name);
            }
            Scanner sc2 = new Scanner(System.in);

            vote = sc2.next();
            e.psifoforia(vote, username);
            System.out.println("Give your 2nd vote");
            vote = sc2.next();
            e.psifoforia(vote, username);

            System.out.println("New voter?");
            Scanner sc4 = new Scanner(System.in);
            response = sc4.next();
            if (response.equals("yes")) {
                flag = true;
            } else {
                flag = false;
            }
            //sc4.close();
            id = 0;
        }
        System.out.println("O panagos pire " + Database.panagos_c.size() + " psifous apo tous " + Database.panagos_c);
        System.out.println("O ilias pire " + Database.ilias_c.size() + " psifous apo tous " + Database.ilias_c);
        System.out.println("O iraklis pire " + Database.iraklis_c.size() + " psifous apo tous " + Database.iraklis_c);

        System.out.println("O nikitis einai o " +new Candidate().whoisthewinner());
        // System.out.println("O nikitis einai o "+Math.max(Database.panagos_c.size(),Math.max(Database.ilias_c.size(),Database.iraklis_c.size())));
        System.out.println("\nPsifisan sinolika oi " + Voter.voters);

    }
}
