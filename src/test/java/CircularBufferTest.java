import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.nio.BufferUnderflowException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

   @Test
   public void initializeWithGenericTypeString() {
      //Unsure how to correclty test the generic type of circular buffer
      CircularBuffer<String> buffer = new CircularBuffer<String>(5);
   }

   @Test
   public void readingEmptyBufferThrowsException() {
      assertThrows(BufferUnderflowException.class, new Executable() {
         @Override
         public void execute() throws Throwable {
            CircularBuffer<String> buffer = new CircularBuffer<String>(5);
            buffer.remove();
         }
      });
   }

   @Test
   public void canAddAndRemoveElementX() {
      //Unsure how to correclty test the generic type of circular buffer
      CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(5);
      buffer.add(2);
      assertEquals(2, buffer.remove());
   }

   @Test
   public void writeXYZToBufferWithSize2_ExpectYZInBuffer() {
      CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(2);
      int x = 1;
      int y = 2;
      int z = 3;
      buffer.add(x);
      buffer.add(y);
      buffer.add(z);
      assertEquals(y, buffer.remove());
      assertEquals(z, buffer.remove());
      assertThrows(BufferUnderflowException.class, new Executable() {
         @Override
         public void execute() throws Throwable {
            buffer.remove();
         }
      });
   }

   @Test
   public void writeXYZTToBufferWithSize2_ExpectZTInBuffer() {
      CircularBuffer<Integer> buffer = new CircularBuffer<Integer>(2);
      int x = 1;
      int y = 2;
      int z = 3;
      int t = 4;
      buffer.add(x);
      buffer.add(y);
      buffer.add(z);
      buffer.add(t);

      assertEquals(z, buffer.remove());
      assertEquals(t, buffer.remove());
      assertThrows(BufferUnderflowException.class, new Executable() {
         @Override
         public void execute() throws Throwable {
            buffer.remove();
         }
      });
   }

}
