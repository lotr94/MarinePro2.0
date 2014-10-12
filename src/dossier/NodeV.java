package dossier;

/*
 *
 * @author Arul
 */

public class NodeV extends javax.swing.JFrame {                                                         
    NodeV next;
    int VesselID;
    String VName;
    String IMNumber;
    String Owner;
    String SNumber;
    String WDLevel;
    String OnCW;
    String VesselG;
    String VesselT;
    String Crane;
    String ManagementS;
    String ManagementE;
    String Status;
    public NodeV() {                                                            //Constructor
        
    }
    
    public NodeV(int x) {                                                       //Constructor
        VesselID = x;
    }
}