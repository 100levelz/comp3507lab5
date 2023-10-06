/**
 *
 * @author phaedramohammed
 * Question 1: fix the code n agent that keeps track of the number of 
 * requests made for a reference to the agent using the Singleton design pattern.
 * 
 */

public class Agent {

    private static int numRequests;
    private static Agent agentInstance;
    
    private Agent(){
        numRequests = 0;
    }

    public static Agent getAgent(){
        if (agentInstance==null){
            agentInstance = new Agent();
        }
        numRequests++;
        return agentInstance;
    }
    public String toString(){
        return "C'est moi, le singleton agent pour le " +numRequests + " fois!";
    }
}
