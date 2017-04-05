package cubedb.util;

public class MathHelper {

  private MathHelper() {}

  public static long ceilingPowerOfTwo(long v) {
    v--;
    v |= v >> 1;
    v |= v >> 2;
    v |= v >> 4;
    v |= v >> 8;
    v |= v >> 16;
    v++;
    return v;
  }

  public static int ceilinglog2(int x) {
    return Integer.SIZE - Integer.numberOfLeadingZeros(x - 1);
  }

  public static int ceilinglog2(long x) {
    return Long.SIZE - Long.numberOfLeadingZeros(x - 1);
  }

}
