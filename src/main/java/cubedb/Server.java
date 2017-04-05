package cubedb;

import org.rocksdb.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Server {
  private static Logger log = LogManager.getLogger(Server.class);

  public static void main( String[] args ) {
    System.out.println( "Hello Cube Server!" );
  }
}
