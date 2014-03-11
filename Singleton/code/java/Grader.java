/**
* Grader.java
*
* Multi-threaded auto-grader that inserts and removes objects from the 
* submission queue
*/

public class Grader implements Runnable{

  private SubmissionQueue submissionQueue = null;

  public Grader(){
    submissionQueue = SubmissionQueue.getSubmissionQueue();
  }

  public void run(){
    for(int i = 0; i < 10; i++){
      submissionQueue.add(new Submission());
      submissionQueue.process();
    }
  }

  public static void main(String[] args){
    for(int i = 0; i < 5; i++){
      Thread grader = new Thread(new Grader());
      grader.start();
    }
  }

}