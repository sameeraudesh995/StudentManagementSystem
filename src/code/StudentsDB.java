/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author samee
 */
public class StudentsDB <T> {
    
    private Node start;
    
     public boolean add(T s){
        Node n1=new Node((Students) s);
        if(start==null){
            start=n1;
            return true;
        }else{
            Node temp=start;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n1;
            return true;
        }
    }
    
    
    
    public int search(String stId){
	int count=0;
	Node temp=start;
	while(temp!=null){
            if(temp.s.equals(stId)){
            } else {
                return count;	
            }
		temp=temp.next;
                    count++;			
	}
        return -1;	
    }
    public T getStudents(int index){
	Node temp=start;
	for(int i=0; i<index; i++){
            temp=temp.next;
	}
	return (T) temp.s;	
    }	
    
    public T getStudent(String id){
        Node temp=start;
        while(temp!=null){
            if(temp.s.equals(id)){
                return (T) temp.s;
            }
            temp=temp.next;
        }
        return null;
    }
    	
 
    
    public T[] toArray(){
	Students[] studentArray=new Students[size()];
	Node temp=start;
	for(int i=0; i<size(); i++){
            studentArray[i]=(Students) temp.s;
            temp=temp.next;
        }
	return (T[]) studentArray;	
    }
    
    public int size(){
	int count=0;
	Node temp=start;
	while(temp!=null){
            count++;
            temp=temp.next;
	}
        return count;	
    }				
    
    
 public boolean add(int index, T s) {
    Node newNode = new Node((Students) s);
    
    if (index < 0 || index > size()) {
        return false; // index is out of bounds
    } 
    
    if (index == 0) {
        newNode.next = start;
        start = newNode;
    } else {
        int i = 0;
        Node temp = start;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    return true;
}

  
   public int getIndex(String id) {
    int index = 0;
    Node current = start;
    while (current != null) {
        if (current.s.equals(id)) { // use equals() method to compare strings
            return index;
        }
        current = current.next;
        index++;
    }
    return -1; // target element not studentsfound
}
public T remove(int index) {
    T removeindex = null;
    if (index == 0) {
        removeindex = (T) start.s;
        start = start.next;
    } else if (index > 0 && index < size()) {
        int i = 0;
        Node previous = null;
        Node current = start;
        while (i < index) {
            previous = current;
            current = current.next;
            i++;
        }
        removeindex = (T) current.s; 
        
        previous.next = current.next; 
    }
    return removeindex;
}

   

class Node<T>{
	private T s;
	private Node next;
	public Node(T s){
            this.s=s;
	}	
    }
}
