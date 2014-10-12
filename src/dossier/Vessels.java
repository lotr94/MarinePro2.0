package dossier;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arul
 */

public class Vessels extends LinkedListVessel {                                 //The LinkedListVessel class is inherited

    public Vessels() {
        initComponents();
    }
    
    File VS = new File("Vessels.txt");                                          //Creation of File (RandomAccess) GeneralInfo.txt
    File GI = new File("GeneralInfo.txt");                                      //Creation of File (RandomAccess) GeneralInfo.txt
    
    long y = 0;
    int recordlength = 186;
    int recordlengthgi = 920;
    int listcountv = 0;
    int listcountv2 = 0;
    int len = 0;
    int f = 0;
    boolean u = false;
    String [] e = new String [57];
    int g = 0;
    
    int VesselIDLength = 6;
    int NameLength = 30;
    int IMNLength = 8;
    int OwnerLength = 35;
    int ScaleNoLength = 3;
    int WaterDepthLength = 2;
    int OnCallWarningLength = 5;
    int VesselGroupLength = 16;
    int VesselTypeLength = 44;
    int CraneLength = 6;
    int ManagementStartLength = 11;
    int ManagementEndLength = 11;
    int StatusLength = 9;
    
    public int numberofRecords() throws IOException {
        RandomAccessFile Vessels = new RandomAccessFile(VS,"rw");
        int total = (int)VS.length();
        int n = (int)total/recordlength;
        return n;
    }
    //This method calculates the total number of records in the GeneralInformation Class
    public int numberofRecordsGI() throws IOException {
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        int total = (int)GI.length();
        int n = (int)total/recordlengthgi;
        return n;
    }    
    
    //This method is used to validate the data, it checks whether the data that is entered is an integer or not
    public boolean typecheck(String a) {
        boolean v = true;
        try {
            Long.parseLong(a);
        } catch (NumberFormatException b) {
            v = false;
        }
        return v;
    }

    //This method performs the validation on all the data that is entered and returns a value true or false depending on whether the data is valid or not, it performs a range check on all the data that the user enters, some data like the Telephone Number or ZipCode fields needs to be an exact number of characters long while some like the name field just have an upper limit which cannot be exceeded. The method also performs a type check by calling the method typecheck() on the data that needs to be an integer.
    public boolean Validateq() {        
        int a = 0;
        String b = "";
        if (typecheck(this.vesselID.getText()) == true && ((this.vesselID.getText()).length() == 5)) {
            a = a + 1;
        } else {
            b = b + "VesselID, ";
        }        
        if (this.name.getText().length() <= 30) {
            a = a + 1;
        } else {
            b = b + "Vessel Name, ";
        }  
        if (typecheck(this.IMN.getText()) == true && ((this.IMN.getText()).length() == 7)) {
            a = a + 1;
        } else {
            b = b + "IMN, ";
        }  
        if (typecheck(this.scaleNo.getText()) == true && (this.scaleNo.getText().length() <= 2 )) {
            a = a + 1;
        } else {
            b = b + "Scale Number, ";
        }  
        if (typecheck(this.ocWarning.getText()) == true && (this.ocWarning.getText().length() <= 4)) {
            a = a + 1;
        } else {
            b = b + "On Call Warning, ";
        }
        if (this.mngStart.getText().length() == 10) {
            a = a + 1;
        } else {
            b = b + "Management Start, ";
        }  
        if (this.mngEnd.getText().length() == 10) {
            a = a + 1;
        } else {
            b = b + "Management End, ";
        } 
        if (a != 7) {                                                           //If even a single field is invalid the method will return false, and will display and error message for the user to see, the error message will tell the user exactly which fields have invalid data
            JOptionPane.showMessageDialog(this, "Invalid Data entered in fields: "+b);
            return false;
        }         
        return true;                                                            //If every field is valid only then will the method return true
    }
    
    int [][] crewMembers = {                                                    //This 2D array stores data about the relationship between the number of crewmembers of each rank and the type of ship they are on
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {2,3,2,2,3,3,2,2,3,3,3,2,2,2,3,3,2,2,2,1,3,3,3,3,2,2,2,2,2,2,2,2,6,5,2,2,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {0,0,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        {2,3,2,2,3,3,2,2,3,3,3,2,2,2,3,3,2,2,2,1,3,3,3,3,2,2,2,2,2,2,2,2,2,1,1,1,1},
        {1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,2,1,1,2,2,2,3,1,1,1,1,1,2,2,1,1,1,1,3,2,2,2,1,1,1,1,1,1,1,1,1,2,1,1,1,1},
        {2,3,2,2,3,3,3,4,2,2,2,2,2,3,3,2,2,2,2,4,3,3,3,2,2,2,2,2,2,2,2,2,3,2,2,2,2},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
        {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
        {1,1,1,1,1,2,1,1,2,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    //The following method is used to delete records. The parameter is the location of the start of the record that is to be deleted.
    public void deleteRecord (int y) {
        String allData = "";
        try {
            RandomAccessFile Vessels = new RandomAccessFile(VS,"rw");
            Vessels.seek(0);                                                    //First the method seeks to the start of the RandomAccessFile
            for (int x = 0; x < GI.length(); x++) {
                allData = allData + (char)Vessels.readByte();                   //It then ports the entire file into the string AllData
            }   
            int z = y + recordlength;                                           //The variable z is the position of the end of the record that is to be deleted
            allData = allData.substring(0,y)+allData.substring(z,(int)VS.length());//This deletes all data between the start and end of the record
            Vessels.setLength(0);                                               //The entire RandomAccessFile is then wiped and replaced by the data in the string which is devoid of the record that needed to be deleted
            Vessels.seek(0);
            Vessels.writeBytes(allData);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    //This method is used to write the vessel details to the RandomAccessFile Vessels
    public void writeData(int y) {
        try { 
            
            RandomAccessFile GeneralInfo = new RandomAccessFile(VS,"rw");
            GeneralInfo.seek(y);                                                //It first seeks to the start of the record which is to be 
            GeneralInfo.writeBytes(this.vesselID.getText());                    //It then writes the field to the RandomAccessFile
            for(int i = 1; i <= (VesselIDLength-this.vesselID.getText().length()); i++) {
                GeneralInfo.writeBytes("#");                                    //Finally it fills the remaining space in the field with #s
            }
            y = y + VesselIDLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.name.getText());
            for(int i = 1; i <= (NameLength-this.name.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NameLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.IMN.getText());
            for(int i = 1; i <= (IMNLength-this.IMN.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + IMNLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.owner.getSelectedItem());
            for(int i = 1; i <= (OwnerLength-(""+this.owner.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + OwnerLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.waterDepth.getSelectedItem());
            for(int i = 1; i <= (WaterDepthLength-(""+this.waterDepth.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + WaterDepthLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.scaleNo.getText());
            for(int i = 1; i <= (ScaleNoLength-this.scaleNo.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + ScaleNoLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.ocWarning.getText());
            for(int i = 1; i <= (OnCallWarningLength-this.ocWarning.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + OnCallWarningLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.vGroup.getSelectedItem());
            for(int i = 1; i <= (VesselGroupLength-(""+this.vGroup.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + VesselGroupLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.vType.getSelectedItem());
            for(int i = 1; i <= (VesselTypeLength-(""+this.vType.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + VesselTypeLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.crane.isSelected());
            for(int i = 1; i <= (CraneLength-(""+this.crane.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + CraneLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.mngStart.getText());
            for(int i = 1; i <= (ManagementStartLength-this.mngStart.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + ManagementStartLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.mngEnd.getText());
            for(int i = 1; i <= (ManagementEndLength-this.mngEnd.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + ManagementEndLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.status.getSelectedItem());
            for(int i = 1; i <= (StatusLength-(""+this.status.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + StatusLength;
        } catch (Exception w) {}
    }
    
    //This method extracts the VesselID from the RandomAccessFile, it is separate from the retrieveString() method as the Vessel is the field by which the linkedlist is sorted hence it needs to be in the form of an integer not a String
    public int retrieveVesselID(int a, int z, int l) throws FileNotFoundException, IOException {
        int b = ((a*recordlength))+z;
        RandomAccessFile Vessels = new RandomAccessFile(VS,"rw");
        Vessels.seek(b);
        String integer = "";
        for (int x = 0; x < l; x++) {
            integer = integer + (char)Vessels.readByte();
        }                               
        integer = integer.substring(0, integer.indexOf("#"));
        int n = Integer.parseInt(integer);                                      //The obtained string is parsed into an integer
        return n;
    }
    //This performs the same task as the retrieveVesselID() method except for the fact that it does not parse the String value into an integer. It also has 3 parameters as both the field position and the field length that are needed are not the same each time the method is called
    public String retrieveString(int a, int z, int l) throws FileNotFoundException, IOException {
        int b = ((a*recordlength))+z;
        RandomAccessFile Vessels = new RandomAccessFile(VS,"rw");
        Vessels.seek(b);
        String stringv = "";
        for (int x = 0; x < l; x++) {
            stringv = stringv + (char)Vessels.readByte();
        }                               
        stringv = stringv.substring(0, stringv.indexOf("#"));
        return stringv;
    }
    //This retrieves data from the GeneralInfo.txt RandomAccessFile, 
    public String retrieveStringGI(int a, int z, int l) throws FileNotFoundException, IOException {
        int b = ((a*recordlengthgi))+z;
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        GeneralInfo.seek(b);
        String stringv = "";
        for (int x = 0; x < l; x++) {
            stringv = stringv + (char)GeneralInfo.readByte();
        }                               
        stringv = stringv.substring(0, stringv.indexOf("#"));
        return stringv;
    }
    //This method displays to the user the crew memebers that are needed for a particular ship based on the vesselType of said ship
    public int crewneeded() {
        String t = this.vtp.getText();
        int a = 0;
        if ("".equals(t)) {
            a = 42;
        }
        if ("Capesize".equals(t)) {
            a = 0;
        }
        if ("Panamax".equals(t)) {
            a = 1;
        }
        if ("Handymax".equals(t)) {
            a = 2;
        }
        if ("Handysize".equals(t)) {
            a = 3;
        }
        if ("Large Range Tanker".equals(t)) {
            a = 4;
        }
        if ("Suezmax".equals(t)) {
            a = 5;
        }
        if ("Aframax".equals(t)) {
            a = 6;
        }
        if ("Small Tanker".equals(t)) {
            a = 7;
        }
        if ("Ultra Large Container Vessel (ULCV)".equals(t)) {
            a = 8;
        }
        if ("New Panamax".equals(t)) {
            a = 9;
        }
        if ("Post Panamax".equals(t)) {
            a = 10;
        }
        if ("Feedermax".equals(t)) {
            a = 11;
        }
        if ("Feeder".equals(t)) {
            a = 12;
        }
        if ("Small Feeder".equals(t)) {
            a = 13;
        }
        if ("Ocean Liner".equals(t)) {
            a = 14;
        }
        if ("Cargo Liner".equals(t)) {
            a = 15;
        }
        if ("Cruise Ship".equals(t)) {
            a = 16;
        }
        if ("Cruise Ferry".equals(t)) {
            a = 17;
        }
        if ("Ferry".equals(t)) {
            a = 18;
        }
        if ("Narrowboat".equals(t)) {
            a = 19;
        }
        if ("Ultra Large Crude Carrier (ULCC)".equals(t)) {
            a = 20;
        }
        if ("Very Large Crude Carrier (VLCC)".equals(t)) {
            a = 21;
        }
        if ("Large Range 2 (LR2)".equals(t)) {
            a = 22;
        }
        if ("Large Range 1 (LR1)".equals(t)) {
            a = 23;
        }
        if ("Medium Range Tanker".equals(t)) {
            a = 24;
        }
        if ("General Purpose Tanker".equals(t)) {
            a = 25;
        }
        if ("Product Tanker".equals(t)) {
            a = 26;
        }
        if ("Roll On/Roll Off (RoRo)".equals(t)) {
            a = 27;
        }
        if ("Roll On/Roll Off Passenger (ROPAX)".equals(t)) {
            a = 28;
        }
        if ("Roll On/Roll Off Container (ConRO)".equals(t)) {
            a = 29;
        }
        if ("Roll On/Lift Off (RoLo)".equals(t)) {
            a = 30;
        }
        if ("Large, Medium-Speed Roll On/Roll Off (LMSR)".equals(t)) {
            a = 31;
        }
        if ("Barque".equals(t)) {
            a = 32;
        }
        if ("Brig".equals(t)) {
            a = 33;
        }
        if ("Brigantine".equals(t)) {
            a = 34;
        }
        if ("Schooner".equals(t)) {
            a = 35;
        }
        if ("Sloop".equals(t)) {
            a = 36;
        }
        return a;
    }
    
    //This method is used to set the value for the vType combobox, based on what the user has selected in the vGroup combobox
    public void setVtype() {
        if (this.vGroup.getSelectedItem() == "Select:") {
        vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        }  
        if (this.vGroup.getSelectedItem() == "Bulk Carrier") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Capesize", "Panamax", "Handymax", "Handysize" }));
        }  
        if (this.vGroup.getSelectedItem() == "Cargo Ship") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Capesize", "Panamax", "Handymax", "Handysize" }));    
        }
        if (this.vGroup.getSelectedItem() == "Chemical Tanker") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Large Range Tanker", "Suezmax", "Aframax", "Panamax", "Small Tanker" })); 
        }    
        if (this.vGroup.getSelectedItem() == "Container Ship") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Ultra Large Container Vessel (ULCV)", "New Panamax", "Post Panamax", "Panamax", "Feedermax", "Feeder", "Small Feeder" }));
        }  
        if (this.vGroup.getSelectedItem() == "Liner") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Ocean Liner", "Cargo Liner", "Cruise Ship", "CruiseFerry", "Ferry", "Narrowboat" }));    
        }
        if (this.vGroup.getSelectedItem() == "Gas Tanker") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Large Range Tanker", "Suezmax", "Aframax", "Panamax", "Small Tanker" })); 
        }    
        if (this.vGroup.getSelectedItem() == "Oil Tanker") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Ultra Large Crude Carrier (ULCC)", "Very Large Crude Carrier (VLCC)", "Large Range 2 (LR2)", "Suezmax", "Large Range 1 (LR1)", "Aframax", "Medium Range Tanker", "Panamax", "General Purpose Tanker", "Product Tanker" }));
        }  
        if (this.vGroup.getSelectedItem() == "RoRo") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Roll On/Roll Off (RoRo)", "Roll On/Roll Off Passenger (ROPAX)", "Roll On/Roll Off Container (ConRO)", "Roll On/Lift Off (RoLo)", "Large, Medium-Speed Roll On/Roll Off (LMSR)"}));    
        }
        if (this.vGroup.getSelectedItem() == "Sail Ship") {
            vType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Barque", "Brig", "Brigantine", "Schooner", "Sloop" })); 
        }    
    }   
    //Start of Generated Code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Assignments = new javax.swing.JFrame();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        vid = new javax.swing.JLabel();
        vn = new javax.swing.JLabel();
        vgp = new javax.swing.JLabel();
        vtp = new javax.swing.JLabel();
        nextrecord2 = new javax.swing.JButton();
        displaycrewrequired = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        displayeligblecrew = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IMN = new javax.swing.JTextField();
        vesselID = new javax.swing.JTextField();
        scaleNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ocWarning = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mngStart = new javax.swing.JTextField();
        mngEnd = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        crane = new javax.swing.JCheckBox();
        vType = new javax.swing.JComboBox();
        vGroup = new javax.swing.JComboBox();
        owner = new javax.swing.JComboBox();
        saverecord = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox();
        waterDepth = new javax.swing.JComboBox();
        nextrecord = new javax.swing.JButton();
        saveedit = new javax.swing.JButton();
        assignments = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("VesselID");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Vessel Name");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Vessel Group");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Vessel Type");

        nextrecord2.setText("Next Record");
        nextrecord2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextrecord2ActionPerformed(evt);
            }
        });

        displaycrewrequired.setText("Display Crew Required");
        displaycrewrequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaycrewrequiredActionPerformed(evt);
            }
        });

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Master", "Chief Officer", "Second Officer", "Third Officer", "Junior Officer", "Deck Cadet", "Chief Engineer", "Second Engineer", "Third Engineer", "Fourth Engineer", "Junior Engineer", "Trainee Marine Engineer", "Engineer Cadet", "Motorman", "Fitter", "Pumpman", "Electrical Officer", "Able Bodied Seaman", "Ordinary Seaman", "Steward", "Chief Cook", "Messman", "Bosun" }));

        displayeligblecrew.setText("Display Eligible Crew");
        displayeligblecrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayeligblecrewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AssignmentsLayout = new javax.swing.GroupLayout(Assignments.getContentPane());
        Assignments.getContentPane().setLayout(AssignmentsLayout);
        AssignmentsLayout.setHorizontalGroup(
            AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssignmentsLayout.createSequentialGroup()
                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssignmentsLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AssignmentsLayout.createSequentialGroup()
                                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(vgp)
                                    .addComponent(vn)
                                    .addComponent(vtp)
                                    .addComponent(vid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AssignmentsLayout.createSequentialGroup()
                                .addComponent(displayeligblecrew)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(displaycrewrequired, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                    .addComponent(nextrecord2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26))))
                    .addGroup(AssignmentsLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        AssignmentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {vgp, vid, vn, vtp});

        AssignmentsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16, jLabel17});

        AssignmentsLayout.setVerticalGroup(
            AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssignmentsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AssignmentsLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(AssignmentsLayout.createSequentialGroup()
                        .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addGroup(AssignmentsLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(AssignmentsLayout.createSequentialGroup()
                                        .addComponent(vid)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vgp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vtp, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(AssignmentsLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nextrecord2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displaycrewrequired)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(AssignmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(displayeligblecrew))))
                        .addContainerGap())))
        );

        AssignmentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel14, jLabel15, jLabel16, jLabel17, nextrecord2, vgp, vid, vn, vtp});

        AssignmentsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel18, jLabel19});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Owner");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Scale No.");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Crane");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Management Start");

        scaleNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleNoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vessel Group");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("VesselID");

        jLabel8.setText("Management End");

        jLabel9.setText("International Maritime Number");

        jLabel10.setText("On Call Warning");

        jLabel11.setText("Vessel Name");

        jLabel12.setText("Water Depth Level");

        jLabel13.setText("Vessel Type");

        mngStart.setText("mm/dd/yyyy");

        mngEnd.setText("mm/dd/yyyy");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        vGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Bulk Carrier", "Cargo Ship", "Chemical Tanker", "Container Ship", "Liner", "Gas Tanker", "Oil Tanker", "RoRo", "Sail Ship" }));
        vGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vGroupActionPerformed(evt);
            }
        });

        owner.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Avance Gas", "Bluewater", "Chevron", "Concordia Maritime", "Emirates Ship Investment Company", "General Maritime", "IMT", "Marine Outsourcing", "Navigator Gas", "Principal Maritime Management", "Prosafe", "Sodexo", "Stena Bulk", "Stena Drilling", "Stena Line", "Stena RoRo", "Tall Ships Youth Trus", "Technip" }));

        saverecord.setText("Save Record");
        saverecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saverecordActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Vessel Details");

        status.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Active", "Retired", "Archive", "Only OTP" }));

        waterDepth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "1", "2", "3", "4", "5", "6", "7" }));

        nextrecord.setText("Next Record");
        nextrecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextrecordActionPerformed(evt);
            }
        });

        saveedit.setText("Save Edit");
        saveedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveeditActionPerformed(evt);
            }
        });

        assignments.setText("Assignments");
        assignments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignmentsActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Record");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit to Home Screen");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Log Out");
        jMenu1.add(jMenuItem4);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem2.setText("Exit Program");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IMN, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(vType, 0, 249, Short.MAX_VALUE)
                            .addComponent(vGroup, 0, 249, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(crane, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(owner, 0, 249, Short.MAX_VALUE)
                            .addComponent(scaleNo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(vesselID, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waterDepth, 0, 249, Short.MAX_VALUE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ocWarning, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(mngEnd, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                            .addComponent(mngStart, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(assignments)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextrecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(saveedit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saverecord, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(384, 384, 384))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {IMN, crane, mngEnd, mngStart, name, ocWarning, owner, scaleNo, status, vGroup, vType, vesselID, waterDepth});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vesselID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(IMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scaleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(waterDepth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ocWarning, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(vGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(vType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(crane))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(mngStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mngEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextrecord)
                    .addComponent(saverecord)
                    .addComponent(assignments))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveedit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     //Generated Code Ends here
private void scaleNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleNoActionPerformed

}//GEN-LAST:event_scaleNoActionPerformed

private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed

}//GEN-LAST:event_nameActionPerformed

private void vGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vGroupActionPerformed
    setVtype();
}//GEN-LAST:event_vGroupActionPerformed
//This method is called when the Save button is pressed, it calls the writeData() method to save the entered record to the RandomAccessFile if it is valid.
private void saverecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saverecordActionPerformed
    if (VS.isFile()) {
        len = (int)VS.length();
    }
    if (Validateq() == true) {
        writeData(len);
        JOptionPane.showMessageDialog(this, "Record Saved!");
    }   
}//GEN-LAST:event_saverecordActionPerformed
//This method is called when the menubar item, Exit or the ESC key is pressed, it causes the program to terminate
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jMenuItem2ActionPerformed
//This method is called when the user clicks the menubar item New Record, or presses CTRL+N, it clears all the fields on the screen to allow the user to enter a new record
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    this.vesselID.setText("");
    this.name.setText("");
    this.IMN.setText("");
    this.owner.setSelectedItem(0);
    this.scaleNo.setText("");
    this.waterDepth.setSelectedIndex(0);
    this.ocWarning.setText("");
    this.vGroup.setSelectedIndex(0);
    setVtype();
    this.crane.setSelected(false);
    this.mngStart.setText("mm/dd/yyyy");
    this.mngEnd.setText("mm/dd/yyyy");
    this.status.setSelectedIndex(0);
}//GEN-LAST:event_jMenuItem1ActionPerformed
//This method is called when the user clicks the next record button, it cycles through the records
private void nextrecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextrecordActionPerformed
    int a = 0;
        try {
            a = numberofRecords();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    if (listcountv < a) {                                                       //As long as the counter is less than the number of records this will run, if it is not, the counter is reset, so as to return to the first record again
        try {
            LinkedListVessel Vessel = new LinkedListVessel();
            for(int b = 0; b < a; b++){
                NodeV x = new NodeV();                                          //New node created
                x.VesselID = retrieveVesselID(b, 0, VesselIDLength);
                x.VName = retrieveString(b, 6, NameLength);
                x.IMNumber = retrieveString(b, 36, IMNLength);
                x.Owner = retrieveString(b, 44, OwnerLength);   
                x.SNumber = retrieveString(b, 79, ScaleNoLength);
                x.WDLevel = retrieveString(b, 82, WaterDepthLength);
                x.OnCW = retrieveString(b, 84, OnCallWarningLength);
                x.VesselG = retrieveString(b, 89, VesselGroupLength);
                x.VesselT = retrieveString(b, 105, VesselTypeLength);
                x.Crane = retrieveString(b, 149, CraneLength);
                x.ManagementS = retrieveString(b, 155, ManagementStartLength);
                x.ManagementE = retrieveString(b, 166, ManagementEndLength);
                x.Status = retrieveString(b, 177, StatusLength);
                Vessel.addNew(x);
            } 
            NodeV temp = Vessel.top;
            for (int qwe = 0; qwe < listcountv; qwe++) {
                temp = temp.next;
            }
            this.vesselID.setText(""+temp.VesselID);
            this.name.setText(""+temp.VName);
            this.IMN.setText(""+temp.IMNumber);
            this.owner.setSelectedItem(""+temp.Owner);
            this.scaleNo.setText(""+temp.SNumber);
            this.waterDepth.setSelectedItem(""+temp.WDLevel);
            this.ocWarning.setText(""+temp.OnCW);
            this.vGroup.setSelectedItem(""+temp.VesselG);
            this.vType.setSelectedItem(""+temp.VesselT);
            if ("true".equals(""+temp.Crane)) {
                this.crane.setSelected(true);
            }
            this.mngStart.setText(""+temp.ManagementS);
            this.mngEnd.setText(""+temp.ManagementE);
            this.status.setSelectedItem(""+temp.Status);
            listcountv = listcountv + 1;
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        listcountv = 0;
    }
}//GEN-LAST:event_nextrecordActionPerformed
//This method saves any edits that are made to the active record, when the user clicks the save edits button
private void saveeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveeditActionPerformed
    int k = Integer.parseInt(
            this.vesselID.getText());
    int a = 0;
    int ID = 0;
    try {                                                                       //The method searches for the active record in the RandomAccessFile using the displayed VesselID,
        int n = numberofRecords();
        for (int s = 0; s < n; s++) {            
            ID = retrieveVesselID(s, 0, VesselIDLength);
            if (ID == k) {
                a = s;
                break;
            }            
        }
        int s = a*recordlength;
        writeData(s);                                                           //Once the record is found, the writeData() method is called at the start of the record, and so it overwrites the old data with the data present in the fields
        JOptionPane.showMessageDialog(this, "Record Updated!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error!");
        Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_saveeditActionPerformed
//This is called when the user clicks the next record button on the assignments form, it cycles through the records
private void nextrecord2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextrecord2ActionPerformed
    int a = 0;
        try {
            a = numberofRecords();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(Vessels.class.getName()).log(Level.SEVERE, null, ex);
        }
    if (listcountv < a) {
        try {
            LinkedListVessel Vessel = new LinkedListVessel();
            for(int b = 0; b < a; b++){
                NodeV x = new NodeV();
                x.VesselID = retrieveVesselID(b, 0, VesselIDLength);
                x.VName = retrieveString(b, 6, NameLength);                
                x.VesselG = retrieveString(b, 89, VesselGroupLength);
                x.VesselT = retrieveString(b, 105, VesselTypeLength);
                Vessel.addNew(x);
            } 
            NodeV temp = Vessel.top;
            for (int qwe = 0; qwe < listcountv; qwe++) {
                temp = temp.next;
            }
            this.vid.setText(""+temp.VesselID);
            this.vn.setText(""+temp.VName);
            this.vgp.setText(""+temp.VesselG);
            this.vtp.setText(""+temp.VesselT);
            listcountv = listcountv + 1;
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    } else {
        listcountv = 0;
    }
}//GEN-LAST:event_nextrecord2ActionPerformed

//This record displays the crew that is required for the active ship in the record. It will list the number of Engineers and Officers of each rank and the other crew members as well
private void displaycrewrequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaycrewrequiredActionPerformed
    int x = crewneeded();
    if (x != 42) {
        int [] crew = new int [23];
        for(int h = 0; h < 23; h++) {
            crew[h] = crewMembers[h][x];
        }                                                                       //HTML codes are used in the following lines to enable multiple lines to be displayed in a single label. The tag that is used is <BR>, which is the line break tag   
    this.jLabel19.setText("<HTML>"+crew[0]+"<BR>"+crew[1]+"<BR>"+crew[2]+"<BR>"+crew[3]+"<BR>"+crew[4]+"<BR>"+crew[5]+"<BR>"+crew[6]+"<BR>"+crew[7]+"<BR>"+crew[8]+"<BR>"+crew[9]+"<BR>"+crew[10]+"<BR>"+crew[11]+"<BR>"+crew[12]+"<BR>"+crew[13]+"<BR>"+crew[14]+"<BR>"+crew[15]+"<BR>"+crew[16]+"<BR>"+crew[17]+"<BR>"+crew[18]+"<BR>"+crew[19]+"<BR>"+crew[20]+"<BR>"+crew[21]+"<BR>"+crew[22]+"</HTML>");
    this.jLabel18.setText("<HTML>Master:  <BR>Chief Officer:  <BR>Second Officer:  <BR>Third Officer:  <BR>Junior Officer:  <BR>Deck Cadet:  <BR>Chief Engineer:  <BR>Second Engineer:  <BR>Third Engineer:  <BR>Fourth Engineer:  <BR>Junior Engineer:  <BR>Trainee Marine Engineer:  <BR>Engineer Cadet:  <BR>Motorman:  <BR>Fitter:  <BR>Pumpman:  <BR>Electrical Officer:  <BR>Able Bodied Seaman:  <BR>Ordinary Seaman:  <BR>Steward:  <BR>Chief Cook:  <BR>Messman:  <BR>Bosun:  </HTML>");
    }
}//GEN-LAST:event_displaycrewrequiredActionPerformed

private void assignmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignmentsActionPerformed
    this.Assignments.setVisible(true);
}//GEN-LAST:event_assignmentsActionPerformed
//This method is used to display the sailors who fullfill the needed criteria to join a particular ship. The method is called when the user clicks the Display Eligible Crew button
private void displayeligblecrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayeligblecrewActionPerformed
    int a = 0;    
    String c = this.vgp.getText();
    String d = ""+this.jComboBox1.getSelectedIndex();    
    String [] abd = new String [57];
    try {
        f = numberofRecordsGI();
    } catch (IOException ex) {}
    
    String [][] ships = {
        {"true","f","true","true","f","true","f","true","true","f","true","true","f","true","f","f","f","f","f","f","f","f","f","true","f","f","f","f","f","true","true","true","f","true","true","true","true","f","true","true","f","true","f","f","f","f","f","f","f","f"},
        {"f","true","true","f","true","true","f","f","f","true","true","f","f","true","f","f","true","true","f","true","f","true","f","true","f","fe","f","true","true","f","true","true","f","f","true","true","true","true","true","f","true","f","f","f","true","true","f","f","f","f","f",},
        {"f","true","true","f","true","true","true","f","f","true","true","f","true","true","f","true","f","true","true","f","true","f","f","f","true","true","true","true","true","f","true","true","true","f","true","true","true","true","true","f","true","true","true","true","f","true","true","f","true","true"},
        {"f","f","true","f","true","true","f","true","f","true","true","f","f","true","f","f","f","true","f","f","f","f","f","f","f","f","f","true","true","f","true","true","f","f","true","true","true","true","true","f","true","true","f","true","f","f","f","true","f","f",},
        {"f","f","true","f","true","true","f","f","f","true","true","f","f","true","true","f","f","true","f","f","f","f","f","true","f","f","f","true","true","f","true","true","f","f","true","true","true","true","true","f","f","true","f","f","f","f","f","f","f","f",},
        {"f","true","true","f","true","true","f","f","f","true","true","f","f","true","f","f","f","f","f","true","f","true","true","true","f","f","f","true","true","f","true","true","f","f","true","true","true","true","true","f","f","true","f","f","f","f","f","f","f","f",},
        {"f","true","true","f","true","f","f","f","f","f","true","true","f","true","f","f","true","f","f","f","f","true","f","f","f","f","f","true","true","true","true","true","f","true","true","true","f","true","f","f","f","f","f","f","f","f","f","f","f",}
    };
    
    while (g < f) {    
        try {
            abd[0] = retrieveStringGI(g, 620, 6);
            abd[1] = retrieveStringGI(g, 626, 6);           
            abd[2] = retrieveStringGI(g, 632, 6);
            abd[3] = retrieveStringGI(g, 638, 6);
            abd[4] = retrieveStringGI(g, 644, 6);
            abd[5] = retrieveStringGI(g, 650, 6);
            abd[6] = retrieveStringGI(g, 656, 6);
            abd[7] = retrieveStringGI(g, 662, 6);
            abd[8] = retrieveStringGI(g, 668, 6);
            abd[9] = retrieveStringGI(g, 674, 6);
            abd[10] = retrieveStringGI(g, 680, 6);
            abd[11] = retrieveStringGI(g, 686, 6);
            abd[12] = retrieveStringGI(g, 692, 6);
            abd[13] = retrieveStringGI(g, 698, 6);
            abd[14] = retrieveStringGI(g, 704, 6);
            abd[15] = retrieveStringGI(g, 710, 6);
            abd[16] = retrieveStringGI(g, 716, 6);
            abd[17] = retrieveStringGI(g, 722, 6);
            abd[18] = retrieveStringGI(g, 728, 6);
            abd[19] = retrieveStringGI(g, 734, 6);
            abd[20] = retrieveStringGI(g, 740, 6);
            abd[21] = retrieveStringGI(g, 746, 6);
            abd[22] = retrieveStringGI(g, 752, 6);
            abd[23] = retrieveStringGI(g, 758, 6);
            abd[24] = retrieveStringGI(g, 764, 6);
            abd[25] = retrieveStringGI(g, 770, 6);
            abd[26] = retrieveStringGI(g, 776, 6);
            abd[27] = retrieveStringGI(g, 782, 6);
            abd[28] = retrieveStringGI(g, 788, 6);
            abd[29] = retrieveStringGI(g, 794, 6);
            abd[30] = retrieveStringGI(g, 800, 6);
            abd[31] = retrieveStringGI(g, 806, 6);
            abd[32] = retrieveStringGI(g, 812, 6);
            abd[33] = retrieveStringGI(g, 818, 6);
            abd[34] = retrieveStringGI(g, 824, 6);
            abd[35] = retrieveStringGI(g, 830, 6);
            abd[36] = retrieveStringGI(g, 836, 6);
            abd[37] = retrieveStringGI(g, 842, 6);
            abd[38] = retrieveStringGI(g, 848, 6);
            abd[39] = retrieveStringGI(g, 854, 6);
            abd[40] = retrieveStringGI(g, 860, 6);
            abd[41] = retrieveStringGI(g, 866, 6);
            abd[42] = retrieveStringGI(g, 872, 6);
            abd[43] = retrieveStringGI(g, 878, 6);
            abd[44] = retrieveStringGI(g, 884, 6);
            abd[45] = retrieveStringGI(g, 890, 6);
            abd[46] = retrieveStringGI(g, 896, 6);
            abd[47] = retrieveStringGI(g, 902, 6);
            abd[48] = retrieveStringGI(g, 908, 6);
            abd[49] = retrieveStringGI(g, 914, 6);

            abd[50] = retrieveStringGI(g, 6, 15);                
            abd[51] = retrieveStringGI(g, 21, 20);
            abd[52] = retrieveStringGI(g, 193, 11);
            abd[53] = retrieveStringGI(g, 204, 11);
            abd[54] = retrieveStringGI(g, 215, 11);
            abd[55] = retrieveStringGI(g, 288, 21);
            
            
        if ("Liner".equals(c)) { 
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[0][i])) {  
                    a = a++;
                }
            }
            if (a == 20) {
                u = true;
            }                  
        }
        if ("Gas Tanker".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[1][i])) {  
                    a = a++;
                }
            }
            if (a == 34) {
                u = true;
            }                
        }
        if ("Oil Tanker".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[2][i])) {  
                    a = a+1;
                }
            }
            if (a == 21) {
                u = true;
            }                
        }       
        if ("RoRo".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[4][i])) {  
                    a = a++;
                }
            }
            if (a == 19) {
                u = true;
            }                
        }
        if ("Container Ship".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[5][i])) {  
                    a = a++;
                }
            }
            if (a == 21) {
                u = true;
            }                
        }
        if ("Bulk Carrier".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[5][i])) {  
                    a = a++;
                }
            }
            if (a == 21) {
                u = true;
            }                
        }
        if ("Cargo Ship".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[5][i])) {  
                    a = a++;
                }
            }
            if (a == 21) {
                u = true;
            }                
        }
        if ("Sail Ship".equals(c)) {                
            for (int i = 0; i < 50; i++) {
                if(abd[i].equals(ships[6][i])) {  
                    a = a++;
                }
            }
            if (a == 18) {
                u = true;
            }                
        }
        u = true;
        if (u == true) {            
            this.jLabel20.setText("<HTML>"+abd[50]+"<BR>"+abd[51]+"<BR>"+abd[52]+"<BR>"+abd[53]+"<BR>"+abd[54]+"<BR>"+abd[55]+"<HTML>");
            break;
        } else {
            g = g + 1;   
        }        

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(Vessels.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//GEN-LAST:event_displayeligblecrewActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vessels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vessels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vessels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vessels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Vessels().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame Assignments;
    private javax.swing.JTextField IMN;
    private javax.swing.JButton assignments;
    private javax.swing.JCheckBox crane;
    private javax.swing.JButton displaycrewrequired;
    private javax.swing.JButton displayeligblecrew;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JTextField mngEnd;
    private javax.swing.JTextField mngStart;
    private javax.swing.JTextField name;
    private javax.swing.JButton nextrecord;
    private javax.swing.JButton nextrecord2;
    private javax.swing.JTextField ocWarning;
    private javax.swing.JComboBox owner;
    private javax.swing.JButton saveedit;
    private javax.swing.JButton saverecord;
    private javax.swing.JTextField scaleNo;
    private javax.swing.JComboBox status;
    private javax.swing.JComboBox vGroup;
    private javax.swing.JComboBox vType;
    private javax.swing.JTextField vesselID;
    private javax.swing.JLabel vgp;
    private javax.swing.JLabel vid;
    private javax.swing.JLabel vn;
    private javax.swing.JLabel vtp;
    private javax.swing.JComboBox waterDepth;
    // End of variables declaration//GEN-END:variables
}
