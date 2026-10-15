
package Collection14Oct;

public class Player {

    private int number;
    private String name;
    private String role;
   
    private int runs;
    private int wickets;
    private int catches;

    public Player() {
    }

    public Player(int number, String name, String role,
                  int salary, int runs, int wickets, int catches) {
        this.number = number;
        this.name = name;
        this.role = role;
       
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public int getCatches() {
        return catches;
    }

    @Override
    public String toString() {
        return "Number: " + number
                + ", Name: " + name
                + ", Role: " + role
                + ", Runs: " + runs
                + ", Wickets: " + wickets
                + ", Catches: " + catches;
    }
}
