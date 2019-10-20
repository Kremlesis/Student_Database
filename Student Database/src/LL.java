
import java.util.Iterator;
import java.io.*;


/*
public interface LinkedList_<T> {// Supports any class T
   public Position_<T> add(T e);              // Add element e to this list, returns it position in the list
   public Iterator<Position_<T>>  positions();// Returns an iterator for all positions in the list
   public int  count();                      // Returns the number of elements in the list
}
*/
public class LL<T> implements LinkedList_<T> {
    
       private Node<T> head;
       private int size;
       
       LL(){
    	   size=0;
    	   head=null;
       }
       
       public int count(){ return size; }
       
       public Position_<T> add(T e)
       {
           Node<T> damn = new Node<T> (e,head);
           head = damn;
           size++;
           return head;
       }
       
     
       public Position_<T> head_ret()
       {
    	   return head;
       }
      
       public Iterator<Position_<T>> positions()
       {
    	   iterator<T> it =new iterator<T>(head);
    			   return it;
       }
       
       public void print_list()
       {
    	   iterator<T> it1= new iterator<T> (head);
    	   if(size>0)
    	   {
			   System.out.println((it1.now()).value());
    	   
    		   while(it1.hasNext())
    			   System.out.println((it1.next()).value());
    		   
    	  }
       }
       
}
       
