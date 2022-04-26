import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.List;

public class CircularBuffer<T> {

   private int size;
   private List<T> buffer;

   public CircularBuffer(int size) {
      this.size = size;
      buffer = new ArrayList<>();
   }

   public int getSize() {
      return this.size;
   }

   public void add(T element){
      if(buffer.size()>=size){
         remove();
      }
      buffer.add(element);
   }

   public T remove() throws BufferUnderflowException{
      if(buffer.size()>0) {
         return buffer.remove(0);
      }
      throw new BufferUnderflowException();
   }


}
