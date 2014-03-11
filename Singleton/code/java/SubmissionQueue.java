/**
* SubmissionQueue.java
*
* Maintains a queue of Submission objects. Is a singleton, since we don't
* want multiple instances of the queue to be active at the same time. 
*/

import java.util.*;

public class SubmissionQueue{

  private static SubmissionQueue queue = null;
  private static Queue<Submission> submissionQueue = new LinkedList<Submission>();

  public static synchronized SubmissionQueue getSubmissionQueue(){
    if(queue == null){
      queue = new SubmissionQueue();
    } 
    return queue;
  }

  public synchronized void add(Submission s){
    System.out.println("Adding " + s.getId());
    submissionQueue.add(s);
  }

  public synchronized Submission process(){
    Submission s = submissionQueue.remove();
    System.out.println("Removing " + s.getId());
    return s;
  }

}