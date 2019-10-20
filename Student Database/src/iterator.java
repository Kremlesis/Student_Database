
import java.util.Iterator;
import java.io.*;


public class iterator<T> implements Iterator<Position_<T>> {

	private Position_<T> currData , nextData;
	
	iterator(Node<T> ni)
	{
		currData = null;
		nextData = ni;
	}
	
	 public boolean hasNext()
	 {
		 return nextData!=null;
	 }
	 
	 public Position_<T> next()
	 {
		  currData= nextData;
		 nextData = (Node<T>)nextData.after();
		 return currData;
		 
	 }
	 
	 public Node<T> now() { return (Node<T>)currData;}
}