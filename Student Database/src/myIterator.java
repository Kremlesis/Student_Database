import java.util.Iterator;
import java.io.*;


public class myIterator<T> implements Iterator<T> {

	private Position_<T> currData , nextData;
	
	myIterator(Node<T> ni)
	{
		currData = null;
		nextData = ni;
	}
	
	 public boolean hasNext()
	 {
		 return nextData!=null;
	 }
	 
	 public T next()
	 {
		
		  currData= nextData;
		 nextData = (Node<T>)nextData.after();
		 return currData.value();
		 
	 }
	 
	 public Node<T> now() { return (Node<T>)currData;}
}