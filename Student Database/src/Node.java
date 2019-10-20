
import java.util.Iterator;
import java.io.*;



public class Node<T> implements Position_<T>{
        private T data;
        private Node<T> next;
        Node() {next=null;}
        Node(T cla){ data= cla;}
        Node(T cla, Node<T> nex) { data = cla; next = nex;}
        
        public T value(){ return data; }
        
        public Position_<T> after() { return next;}
        public void change_next( Node<T> val) { next = val; }
        
    }
