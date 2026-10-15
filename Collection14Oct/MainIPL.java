
package Collection14Oct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MainIPL {

    public static void main(String[] args) {

       
        List<Player> miPlayerList = new ArrayList<>();

        miPlayerList.add(new Player(45, "Rohit Sharma", "Batsman", 120000, 10000, 10, 100));
        miPlayerList.add(new Player(63, "Suryakumar Yadav", "Batsman", 85000, 4500, 5, 90));
        miPlayerList.add(new Player(72, "Tilak Varma", "Batsman", 70000, 3000, 2, 60));
        miPlayerList.add(new Player(33, "Hardik Pandya", "All-Rounder", 95000, 3500, 80, 80));
        miPlayerList.add(new Player(93, "Jasprit Bumrah", "Bowler", 100000, 500, 150, 20));
        miPlayerList.add(new Player(18, "Trent Boult", "Bowler", 80000, 300, 120, 15));
        miPlayerList.add(new Player(1, "Naman Dhir", "All-Rounder", 50000, 1500, 30, 30));
        miPlayerList.add(new Player(2, "Will Jacks", "All-Rounder", 75000, 2000, 50, 40));
        miPlayerList.add(new Player(3, "Mitchell Santner", "All-Rounder", 65000, 800, 70, 25));
        miPlayerList.add(new Player(4, "Deepak Chahar", "Bowler", 70000, 200, 100, 10));
        miPlayerList.add(new Player(5, "Ryan Rickelton", "Wicketkeeper", 75000, 2500, 40, 35));
        miPlayerList.add(new Player(6, "Robin Minz", "Wicketkeeper", 40000, 800, 20, 10));
        miPlayerList.add(new Player(7, "Sherfane Rutherford", "Batsman", 65000, 1800, 35, 20));
        miPlayerList.add(new Player(8, "Shardul Thakur", "All-Rounder", 70000, 1000, 90, 25));
        miPlayerList.add(new Player(9, "Mayank Markande", "Bowler", 45000, 100, 60, 5));

        
        List<Player> rcbPlayerList = new ArrayList<>();

        rcbPlayerList.add(new Player(18, "Virat Kohli", "Batsman", 90000, 5000, 10, 100));
        rcbPlayerList.add(new Player(97, "Phil Salt", "Wicketkeeper", 80000, 3500, 50, 45));
        rcbPlayerList.add(new Player(19, "Rajat Patidar", "Batsman", 75000, 3000, 40, 30));
        rcbPlayerList.add(new Player(32, "Liam Livingstone", "All-Rounder", 85000, 2500, 60, 35));
        rcbPlayerList.add(new Player(11, "Krunal Pandya", "All-Rounder", 70000, 1500, 80, 30));
        rcbPlayerList.add(new Player(21, "Jitesh Sharma", "Wicketkeeper", 65000, 2000, 30, 25));
        rcbPlayerList.add(new Player(73, "Bhuvneshwar Kumar", "Bowler", 75000, 300, 120, 20));
        rcbPlayerList.add(new Player(19, "Josh Hazlewood", "Bowler", 85000, 200, 100, 15));
        rcbPlayerList.add(new Player(24, "Yash Dayal", "Bowler", 60000, 100, 80, 10));
        rcbPlayerList.add(new Player(10, "Suyash Sharma", "Bowler", 50000, 50, 60, 5));
        rcbPlayerList.add(new Player(29, "Tim David", "Batsman", 80000, 2200, 20, 25));

       
        List<Player> cskPlayerList = new ArrayList<>();

        cskPlayerList.add(new Player(7, "MS Dhoni", "Wicketkeeper", 90000, 4000, 50, 150));
        cskPlayerList.add(new Player(31, "Ruturaj Gaikwad", "Batsman", 85000, 4500, 60, 50));
        cskPlayerList.add(new Player(8, "Shivam Dube", "All-Rounder", 80000, 3000, 40, 25));
        cskPlayerList.add(new Player(99, "Dewald Brevis", "Batsman", 70000, 1500, 30, 20));
        cskPlayerList.add(new Player(90, "Ravindra Jadeja", "All-Rounder", 95000, 2500, 150, 100));
        cskPlayerList.add(new Player(25, "Sam Curran", "All-Rounder", 85000, 1800, 100, 40));
        cskPlayerList.add(new Player(23, "Noor Ahmad", "Bowler", 75000, 200, 90, 10));
        cskPlayerList.add(new Player(11, "Khaleel Ahmed", "Bowler", 70000, 100, 80, 5));
        cskPlayerList.add(new Player(55, "Rahul Tripathi", "Batsman", 65000, 2000, 20, 30));
        cskPlayerList.add(new Player(12, "Vijay Shankar", "All-Rounder", 60000, 1200, 50, 20));
        cskPlayerList.add(new Player(17, "Jamie Overton", "All-Rounder", 65000, 500, 80, 15));

     
        Map<String, List<Player>> iplTeams = new HashMap<>();

        iplTeams.put("MI", miPlayerList);
        iplTeams.put("RCB", rcbPlayerList);
        iplTeams.put("CSK", cskPlayerList);

       
        List<Player> allIPLPlayers = new ArrayList<>();

        Set<String> teamNamesKey = iplTeams.keySet();

        for (String tn : teamNamesKey) {

            System.out.println("\n========== " + tn + " ==========");

            List<Player> listPlayer = iplTeams.get(tn);

            System.out.println("\nAll Players:");

            for (Player p : listPlayer) {
                System.out.println(p);
                allIPLPlayers.add(p);
            }
        }

        
        System.out.println("\n== IPL Batsmen:");

        for (Player p : allIPLPlayers) {
            if ("Batsman".equals(p.getRole())) {
                System.out.println(p);
            }
        }

        
        System.out.println("\n== IPL Bowlers:");

        for (Player p : allIPLPlayers) {
            if ("Bowler".equals(p.getRole())) {
                System.out.println(p);
            }
        }

       
        System.out.println("\n== IPL All-Rounders:");

        for (Player p : allIPLPlayers) {
            if ("All-Rounder".equals(p.getRole())) {
                System.out.println(p);
            }
        }

       
        System.out.println("\n== Highest Runs Player Details:");
        int maxscore=0;
        Player maxRunsPlayer = allIPLPlayers.get(0);

        for (Player p : allIPLPlayers) {
            if (p.getRuns() > maxscore) {
            		maxscore=p.getRuns();
                maxRunsPlayer = p;
                
            }
        }

        System.out.println("Highest Runs Player: "+maxRunsPlayer);
System.out.println("Runs: "+ maxscore);
       
        System.out.println("\n== Highest Wickets Player Details:");

        Player maxWicketsPlayer = allIPLPlayers.get(0);

        for (Player p : allIPLPlayers) {
            if (p.getWickets() > maxWicketsPlayer.getWickets()) {
                maxWicketsPlayer = p;
            }
        }

        System.out.println(maxWicketsPlayer);


        System.out.println("\n== Highest Catches Player Details:");

        Player maxCatchesPlayer = allIPLPlayers.get(0);

        for (Player p : allIPLPlayers) {
            if (p.getCatches() > maxCatchesPlayer.getCatches()) {
                maxCatchesPlayer = p;
            }
        }

        System.out.println(maxCatchesPlayer);

        
        System.out.println("\n== Players with More Than 5000 Runs:");

        for (Player p : allIPLPlayers) {
            if (p.getRuns() > 5000) {
                System.out.println(p);
            }
        }


        System.out.println("\n== Players with Less Than 1000 Runs:");

        for (Player p : allIPLPlayers) {
            if (p.getRuns() < 1000) {
                System.out.println(p);
            }
        }

       
        System.out.println("\n== Players with Exactly 5000 Runs:");

        for (Player p : allIPLPlayers) {
            if (p.getRuns() == 5000) {
                System.out.println(p);
            }
        }

                System.out.println("\n==Lowest Runs Player:");

        Player minRunsPlayer = allIPLPlayers.get(0);

        for (Player p : allIPLPlayers) {
            if (p.getRuns() < minRunsPlayer.getRuns()) {
                minRunsPlayer = p;
            }
        }

        System.out.println(minRunsPlayer);

        
        System.out.println("\n== Players with More Than 100 Wickets:");

        for (Player p : allIPLPlayers) {
            if (p.getWickets() > 100) {
                System.out.println(p);
            }
        }

        
        System.out.println("\n== Lowest Wickets Player:");

        Player minWicketsPlayer = allIPLPlayers.get(0);

        for (Player p : allIPLPlayers) {
            if (p.getWickets() < minWicketsPlayer.getWickets()) {
                minWicketsPlayer = p;
            }
        }

        System.out.println(minWicketsPlayer);

        
        System.out.println("\n== Players with More Than 50 Catches:");

        for (Player p : allIPLPlayers) {
            if (p.getCatches() > 50) {
                System.out.println(p);
            }
        }
        System.out.println("\n==Total IPL Players: "
                + allIPLPlayers.size());

        
        int batsmanCount = 0;

        for (Player p : allIPLPlayers) {
            if ("Batsman".equals(p.getRole())) {
                batsmanCount++;
            }
        }

        System.out.println("\n== Total Batsmen: " + batsmanCount);

        
        int bowlerCount = 0;

        for (Player p : allIPLPlayers) {
            if ("Bowler".equals(p.getRole())) {
                bowlerCount++;
            }
        }

        System.out.println("\n== Total Bowlers: " + bowlerCount);

        
        int allRounderCount = 0;

        for (Player p : allIPLPlayers) {
            if ("All-Rounder".equals(p.getRole())) {
                allRounderCount++;
            }
        }

        System.out.println("\n==Total All-Rounders: "
                + allRounderCount);

     
        int wicketkeeperCount = 0;

        for (Player p : allIPLPlayers) {
            if ("Wicketkeeper".equals(p.getRole())) {
                wicketkeeperCount++;
            }
        }

        System.out.println("\n==Total Wicketkeepers: "
                + wicketkeeperCount);

       
        System.out.println("\n==Search Player: Rohit Sharma");

        for (Player p : allIPLPlayers) {
            if (p.getName().equalsIgnoreCase("Rohit Sharma")) {
                System.out.println(p);
            }
        }

        
        System.out.println("\n==Players with Runs Between 2000 and 5000:");

        for (Player p : allIPLPlayers) {
            if (p.getRuns() >= 2000 && p.getRuns() <= 5000) {
                System.out.println(p);
            }
        }

      
        System.out.println("\n.==Players with Wickets Between 50 and 100:");

        for (Player p : allIPLPlayers) {
            if (p.getWickets() >= 50 && p.getWickets() <= 100) {
                System.out.println(p);
            }
        }

        System.out.println("\n== Players Whose Runs Are Greater Than Their Catches:");

        for (Player p : allIPLPlayers) {
            if (p.getRuns() > p.getCatches()) {
                System.out.println(p);
            }
        }

    }
}
