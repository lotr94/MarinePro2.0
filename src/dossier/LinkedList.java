package dossier;

/*
 *
 * @author Arul
 */

public class LinkedList extends Node {
    Node top;
    
    public LinkedList(int x) {                                                  //Constructor
        top = new Node(x);
    }
    public LinkedList() {                                                       //Constructor
    }
    
    public void addNew(Node newnode) {
        Node temp = top;
        if (temp == null) {
            top = newnode;
            return;
        }       
        if(temp.EmployeeID > newnode.EmployeeID) {                                
            newnode.next = temp;
            top = newnode;
            return;
        }
        while(temp.next!= null){
            if(newnode.EmployeeID < temp.next.EmployeeID) {                      
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
            temp = temp.next;                                                
        }
        temp.next = newnode;                                                      
    }
    
}