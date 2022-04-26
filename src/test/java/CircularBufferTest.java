import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CircularBufferTest {
   @Test
   public void circularBufferInitialzedEmpty() {
      CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(0);
      assertEquals(0, buffer.getSize());
   }

   @Test
   public void circularBufferInitialzedWith5() {
      CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(5);
      assertEquals(5, buffer.getSize());
   }

   public void initializeWithGenericTypeString() {
      //Unsure how to correclty test the generic type of circular buffer
      CircularBuffer<String> buffer = new CircularBuffer<String>(5);
   }
}
