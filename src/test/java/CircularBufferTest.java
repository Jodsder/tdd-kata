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

}
