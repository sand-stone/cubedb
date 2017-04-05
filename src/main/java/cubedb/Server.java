package cubedb;

import org.rocksdb.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import cubedb.util.*;

public class Server {
  private static Logger log = LogManager.getLogger(Server.class);

  public static void main( String[] args ) {
    System.out.println( "Hello Cube Server!" );
    System.out.println(MathHelper.ceilingPowerOfTwo(10));
    System.out.println(MathHelper.ceilingPowerOfTwo(100));
    System.out.println(MathHelper.ceilinglog2(100));
    System.out.println(MathHelper.ceilingPowerOfTwo(1000));
    System.out.println(MathHelper.ceilinglog2(1000));
    System.out.println(MathHelper.ceilinglog2(10000));
  }
}
