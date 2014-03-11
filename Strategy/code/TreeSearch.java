/**
 * Created by irakli on 3/11/14.
 */
public class TreeSearch implements Strategy{

    public String strategy;

    public TreeSearch() {
        strategy = "Tree Search";
    }

    public void execute() {
        System.out.println("I'm making a move using " + strategy + " AI");
    }
}
