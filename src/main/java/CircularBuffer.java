import java.nio.BufferUnderflowException;

public class CircularBuffer<T> {

   private int size;

   public CircularBuffer(int size) {
      this.size = size;
   }

   public int getSize() {
      return this.size;
   }

   public T remove() throws BufferUnderflowException{
      throw new BufferUnderflowException();
   }


}
