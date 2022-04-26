import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {
   @Test
   public void circularBufferInitialzedEmpty() {
      CircularBuffer buffer = new CircularBuffer(0);
      assertEquals(0, buffer.getSize());
   }
}
