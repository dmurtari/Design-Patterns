/**
* DatabaseInterface.java
*
* Interface used by the proxy design pattern
*/

interface DatabaseInterface{

  public void openDatabase();
  public void executeSQL(String sql);
  public void closeDatabase();
}