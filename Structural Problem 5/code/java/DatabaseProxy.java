/**
* DatabaseProxy.java
*
* Proxy used by the proxy design pattern to control access to the real database
*/

import java.util.*;

public class DatabaseProxy implements DatabaseInterface {

  private Database realDatabase = new Database();
  private Queue<String> commandQueue = new LinkedList<String>();

  public void openDatabase(){
    realDatabase.openDatabase();
  }

  public void executeSQL(String sql){
    commandQueue.add(sql);
  }

  public void closeDatabase(){
    realDatabase.closeDatabase();

    // Database has been closed, so go though queue and execute commands
    while(!commandQueue.isEmpty()){
      realDatabase.executeSQL(commandQueue.remove());
    }
  }

}