package dossier;

/*
 *
 * @author Arul
 */

public class LinkedListVessel extends NodeV {
    NodeV top;
    
    public LinkedListVessel(int x) {
        top = new NodeV(x);
    }
    public LinkedListVessel() {
        
    }
    
    public void addNew(NodeV newnode) {
        NodeV temp = top;
        if (temp == null) {
            top = newnode;
            return;
        }       
        if(temp.VesselID > newnode.VesselID) {                                
            newnode.next = temp;
            top = newnode;
            return;
        }
        while(temp.next!= null){
            if(newnode.VesselID < temp.next.VesselID) {                      
                newnode.next = temp.next;
                temp.next = newnode;
                return;
            }
            temp = temp.next;                                                
        }
        temp.next = newnode;                                                      
    }
    
}