import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {
   @Test
   public void circularBufferInitialzedEmpty() {
      CircularBuffer buffer = new CircularBuffer(0);
      assertEquals(0, buffer.getSize());
   }

   @Test
   public void circularBufferInitialzedWith5() {
      CircularBuffer buffer = new CircularBuffer(5);
      assertEquals(5, buffer.getSize());
   }
}
