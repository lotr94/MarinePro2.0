package dossier;

import java.util.logging.Level;                                                 
import java.util.logging.Logger;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Arul
 */

public class GeneralInfo extends LinkedList {                                   //The LinkedList class is inherited

    public GeneralInfo() {
        initComponents();
        licence.setEnabled(false);
        rank.setEnabled(false);
    }
    
    int EmployeeIDLength = 6;                                                   //Variables declaration (Field lengths in the RandomAccessFile)
    int FirstNameLength = 15;
    int LastNameLength = 20;
    int Address1Length = 40;
    int Address2Length = 40;
    int Address3Length = 40;
    int CityLength = 25;
    int ZipLength = 7;
    int TelHomeLength = 11;
    int TelWorkLength = 11;
    int TelMobLength = 11;
    int FaxLength = 11;
    int EmailLength = 30;
    int FieldLength = 21;
    int RankLength = 21;
    int SexLength = 7;
    int AgeLength = 3;
    int NationalityLength = 20;
    int MaritalStatusLength = 9;
    int CarDriverLength = 6;
    int LicenceNoLength = 15;
    int BirthPlaceLength = 15;
    int NoChildrenLength = 3;    
    int AirportLength = 4;    
    int NoKNameLength = 35;    
    int NoKAddress1Length = 60;    
    int NoKAddress2Length = 60;    
    int NoKCityLength = 15;    
    int NoKZipLength = 7;    
    int NoKTelLength = 11;    
    int NoKTelAltLength = 11;    
    int NoKEmailLength = 30;
    int Check1Length = 6;
    int Check2Length = 6;
    int Check3Length = 6;
    int Check4Length = 6;
    int Check5Length = 6;
    int Check6Length = 6;
    int Check7Length = 6;
    int Check8Length = 6;
    int Check9Length = 6;
    int Check10Length = 6;
    int Check11Length = 6;
    int Check12Length = 6;
    int Check13Length = 6;
    int Check14Length = 6;
    int Check15Length = 6;
    int Check16Length = 6;
    int Check17Length = 6;
    int Check18Length = 6;
    int Check19Length = 6;
    int Check20Length = 6;
    int Check21Length = 6;
    int Check22Length = 6;
    int Check23Length = 6;
    int Check24Length = 6;
    int Check25Length = 6;
    int Check26Length = 6;
    int Check27Length = 6;
    int Check28Length = 6;
    int Check29Length = 6;
    int Check30Length = 6;
    int Check31Length = 6;
    int Check32Length = 6;
    int Check33Length = 6;
    int Check34Length = 6;
    int Check35Length = 6;
    int Check36Length = 6;
    int Check37Length = 6;
    int Check38Length = 6;
    int Check39Length = 6;
    int Check40Length = 6;
    int Check41Length = 6;
    int Check42Length = 6;
    int Check43Length = 6;
    int Check44Length = 6;
    int Check45Length = 6;
    int Check46Length = 6;
    int Check47Length = 6;
    int Check48Length = 6;
    int Check49Length = 6;
    int Check50Length = 6;
    
    
    String empid = "";
    String firstn = "";
    String lastn = "";
    String add1 = "";
    String add2 = "";
    String add3 = "";
    String cty = "";
    String zp = "";
    String thome = "";
    String twork = "";
    String tmob = "";
    String fx = "";
    String eml = "";
    String fld = "";
    String rnk = "";
    String sx = "";
    String ag = "";
    String nat = "";
    String maritals = "";
    String gaddi = "";
    String licenceno = "";
    String birthplace = "";
    String nochildren = "";
    String air = "";
    String name2 = "";
    String nokadd1 = "";
    String nokadd2 = "";
    String city2 = "";
    String zip2 = "";
    String tel2 = "";
    String telalt = "";
    String email2 = "";
    String Chk1 = "";
    String Chk2 = "";
    String Chk3 = "";
    String Chk4 = "";
    String Chk5 = "";
    String Chk6 = "";
    String Chk7 = "";
    String Chk8 = "";
    String Chk9 = "";
    String Chk10 = "";
    String Chk11 = "";
    String Chk12 = "";
    String Chk13 = "";
    String Chk14 = "";
    String Chk15 = "";
    String Chk16 = "";
    String Chk17 = "";
    String Chk18 = "";
    String Chk19 = "";
    String Chk20 = "";
    String Chk21 = "";
    String Chk22 = "";
    String Chk23 = "";
    String Chk24 = "";
    String Chk25 = "";
    String Chk26 = "";
    String Chk27 = "";
    String Chk28 = "";
    String Chk29 = "";
    String Chk30 = "";
    String Chk31 = "";
    String Chk32 = "";
    String Chk33 = "";
    String Chk34 = "";
    String Chk35 = "";
    String Chk36 = "";
    String Chk37 = "";
    String Chk38 = "";
    String Chk39 = "";
    String Chk40 = "";
    String Chk41 = "";
    String Chk42 = "";
    String Chk43 = "";
    String Chk44 = "";
    String Chk45 = "";
    String Chk46 = "";
    String Chk47 = "";
    String Chk48 = "";
    String Chk49 = "";
    String Chk50 = "";

    public void clearstorage() {
        empid = "";
        firstn = "";
        lastn = "";
        add1 = "";
        add2 = "";
        add3 = "";
        cty = "";
        zp = "";
        thome = "";
        twork = "";
        tmob = "";
        fx = "";
        eml = "";
        fld = "";
        rnk = "";
        sx = "";
        ag = "";
        nat = "";
        maritals = "";
        gaddi = "";
        licenceno = "";
        birthplace = "";
        nochildren = "";
        air = "";
        name2 = "";
        nokadd1 = "";
        nokadd2 = "";
        city2 = "";
        zip2 = "";
        tel2 = "";
        telalt = "";
        email2 = "";
        Chk1 = "";
        Chk2 = "";
        Chk3 = "";
        Chk4 = "";
        Chk5 = "";
        Chk6 = "";
        Chk7 = "";
        Chk8 = "";
        Chk9 = "";
        Chk10 = "";
        Chk11 = "";
        Chk12 = "";
        Chk13 = "";
        Chk14 = "";
        Chk15 = "";
        Chk16 = "";
        Chk17 = "";
        Chk18 = "";
        Chk19 = "";
        Chk20 = "";
        Chk21 = "";
        Chk22 = "";
        Chk23 = "";
        Chk24 = "";
        Chk25 = "";
        Chk26 = "";
        Chk27 = "";
        Chk28 = "";
        Chk29 = "";
        Chk30 = "";
        Chk31 = "";
        Chk32 = "";
        Chk33 = "";
        Chk34 = "";
        Chk35 = "";
        Chk36 = "";
        Chk37 = "";
        Chk38 = "";
        Chk39 = "";
        Chk40 = "";
        Chk41 = "";
        Chk42 = "";
        Chk43 = "";
        Chk44 = "";
        Chk45 = "";
        Chk46 = "";
        Chk47 = "";
        Chk48 = "";
        Chk49 = "";
        Chk50 = "";
    }
    int listcount = 0;
    int listcount2 = 0;
    File GI = new File("GeneralInfo.txt");                                      //Creation of RandomAccessFile GeneralInfo.txt
    int len = 0;
    int recordlength = 920;                                                     //Total number of bytes in each record within the RandomAccessFile
     
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
        if (typecheck(this.EmpID.getText()) == true && ((this.EmpID.getText()).length() == 5)) {
            a = a + 1;
        } else {
            b = b + "EmployeeID, ";
        }        
        if (this.fname.getText().length() <= 15) {
            a = a + 1;
        } else {
            b = b + "First Name, ";
        }        
        if (this.lname.getText().length() <= 20) {
            a = a + 1;
        } else {
            b = b + "Last Name, ";
        }        
        if (this.addline1.getText().length() <= 40) {
            a = a + 1;
        } else {
            b = b + "Address Line 1, ";
        }        
        if (this.addline2.getText().length() <= 40) {
            a = a + 1;
        } else {
            b = b + "Address Line 2, ";
        }        
        if (this.addline3.getText().length() <= 40) {
            a = a + 1;
        } else {
            b = b + "Address Line 3, ";
        }    
        if (this.city.getText().length() <= 25) {
            a = a + 1;
        } else {
            b = b + "City, ";
        }  
        if (typecheck(this.zip.getText()) == true && ((this.zip.getText()).length() == 6)) {
            a = a + 1;
        } else {
            b = b + "Zip Code, ";
        }  
        if (typecheck(this.htel.getText()) == true && (this.htel.getText().length() == 10)) {
            a = a + 1;
        } else {
            b = b + "Telephone (Home), ";
        }  
        if (typecheck(this.wtel.getText()) == true && (this.wtel.getText().length() == 10)) {
            a = a + 1;
        } else {
            b = b + "Telephone (Work), ";
        }  
        if (typecheck(this.mtel.getText()) == true && (this.mtel.getText().length()) == 10) {
            a = a + 1;
        } else {
            b = b + "Telephone (Mobile), ";
        }  
        if (typecheck(this.fax.getText()) == true && (this.fax.getText().length()) == 10) {
            a = a + 1;
        } else {
            b = b + "Fax, ";
        }  
        if (this.email.getText().length() <= 30) {
            a = a + 1;
        } else {
            b = b + "EmailID, ";
        }  
        if (typecheck(this.age.getText()) == true && (this.age.getText().length()) <= 3) {
            a = a + 1;
        } else {
            b = b + "Age, ";
        }  
        if (this.nationality.getText().length() <= 20) {
            a = a + 1;
        } else {
            b = b + "Nationality, ";
        }  
        if (car.isSelected() == true) {
            if (typecheck(this.licence.getText()) == true && (this.licence.getText().length()) == 14) {
                a = a + 1;
            } else {
                b = b + "Licence Number, ";
            }  
        } else {
            a = a + 1;
        }
        System.out.println(a);
        if (this.birth.getText().length() <= 15) {
            a = a + 1;
        } else {
            b = b + "Birth Place, ";
        }  
        if (typecheck(this.children.getText()) == true && (this.children.getText().length()) <= 2) {
            a = a + 1;
        } else {
            b = b + "Number of Children, ";
        }  
        if (this.airport.getText().length() == 3) {
            a = a + 1;
        } else {
            b = b + "Airport, ";
        }  
        if (this.nokname.getText().length() <= 35) {
            a = a + 1;
        } else {
            b = b + "Name (NoK), ";
        }  
        if (this.nokaddline1.getText().length() <= 60) {
            a = a + 1;
        } else {
            b = b + "Address Line 1 (NoK), ";
        }  
        if (this.nokaddline2.getText().length() <= 60) {
            a = a + 1;
        } else {
            b = b + "Address Line 2 (NoK), ";
        }  
        if (this.nokcity.getText().length() <= 15) {
            a = a + 1;
        } else {
            b = b + "City (NoK), ";
        }  
        if (typecheck(this.nokzip.getText()) == true && (this.nokzip.getText().length()) == 6) {
            a = a + 1;
        } else {
            b = b + "Zip (NoK), ";
        }  
        if (typecheck(this.noktel.getText()) == true && (this.noktel.getText().length()) == 10) {
            a = a + 1;
        } else {
            b = b + "Telephone (NoK), ";
        }  
        if (typecheck(this.nokatel.getText()) == true && (this.nokatel.getText().length()) == 10) {
            a = a + 1;
        } else {
            b = b + "Alternate Telephone (NoK), ";
        }  
        if (this.nokemail.getText().length() <= 30) {
            a = a + 1;
        } else {
            b = b + "Email (NoK), ";
        }  
        if (a != 27) {                                                          //If even a single field is invalid the method will return false, and will display and error message for the user to see
            JOptionPane.showMessageDialog(this, "Invalid Data entered in fields: "+b);
            return false;
        }         
        return true;                                                            //If every field is valid only then will the method return true
    }

    //The following method is used to delete records. The parameter is the location of the start of the record that is to be deleted.
    public void deleteRecord (int y) {
        String allData = "";
        try {
            RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
            GeneralInfo.seek(0);                                                //First the method seeks to the start of the RandomAccessFile
            for (int x = 0; x < GI.length(); x++) {
                allData = allData + (char)GeneralInfo.readByte();               //It then ports the entire file into the string AllData
            }   
            int z = y + recordlength;                                           //The variable z is the position of the end of the record that is to be deleted
            allData = allData.substring(0,y)+allData.substring(z,(int)GI.length());//This deletes all data between the start and end of the record
            GeneralInfo.setLength(0);                                           //The entire RandomAccessFile is then wiped and replaced by the data in the string which is devoid of the record that needed to be deleted
            GeneralInfo.seek(0);
            GeneralInfo.writeBytes(allData);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void newrecord() {
        this.EmpID.setText("");
        this.fname.setText("");
        this.lname.setText("");
        this.addline1.setText("");
        this.addline2.setText("");
        this.addline3.setText("");
        this.city.setText("");
        this.zip.setText("");
        this.htel.setText("");
        this.wtel.setText("");
        this.mtel.setText("");
        this.fax.setText("");
        this.email.setText("");
        this.field.setSelectedIndex(0);
        displayRank();
        this.sex.setSelectedIndex(0);
        this.age.setText("");
        this.nationality.setText("");
        this.marital.setSelectedIndex(0);
        this.car.setSelected(false);        
        this.licence.setText("");
        this.licence.setEnabled(false);
        this.birth.setText("");
        this.children.setText("");
        this.airport.setText("");
        this.nokname.setText("");
        this.nokaddline1.setText("");
        this.nokaddline2.setText("");
        this.nokcity.setText("");
        this.nokzip.setText("");
        this.noktel.setText("");
        this.nokatel.setText("");
        this.nokemail.setText("");
    }
    
    public void resetChecks() {                                                 //This is used to reset all the checkboxes to false so that a new record can be entered
        this.jCheckBox17.setSelected(false);
        this.jCheckBox1.setSelected(false);
        this.jCheckBox2.setSelected(false);
        this.jCheckBox18.setSelected(false);
        this.jCheckBox3.setSelected(false);
        this.jCheckBox19.setSelected(false);
        this.jCheckBox36.setSelected(false);
        this.jCheckBox20.setSelected(false);
        this.jCheckBox21.setSelected(false);
        this.jCheckBox4.setSelected(false);
        this.jCheckBox5.setSelected(false);
        this.jCheckBox22.setSelected(false);
        this.jCheckBox37.setSelected(false);
        this.jCheckBox6.setSelected(false);
        this.jCheckBox50.setSelected(false);
        this.jCheckBox38.setSelected(false);
        this.jCheckBox30.setSelected(false);
        this.jCheckBox51.setSelected(false);
        this.jCheckBox39.setSelected(false);
        this.jCheckBox31.setSelected(false);
        this.jCheckBox40.setSelected(false);
        this.jCheckBox8.setSelected(false);
        this.jCheckBox7.setSelected(false);
        this.jCheckBox9.setSelected(false);
        this.jCheckBox41.setSelected(false);
        this.jCheckBox42.setSelected(false);
        this.jCheckBox43.setSelected(false);
        this.jCheckBox10.setSelected(false);
        this.jCheckBox11.setSelected(false);
        this.jCheckBox23.setSelected(false);
        this.jCheckBox12.setSelected(false);
        this.jCheckBox13.setSelected(false);
        this.jCheckBox44.setSelected(false);
        this.jCheckBox26.setSelected(false);
        this.jCheckBox14.setSelected(false);
        this.jCheckBox15.setSelected(false);
        this.jCheckBox16.setSelected(false);
        this.jCheckBox32.setSelected(false);
        this.jCheckBox27.setSelected(false);
        this.jCheckBox28.setSelected(false);
        this.jCheckBox29.setSelected(false);
        this.jCheckBox24.setSelected(false);
        this.jCheckBox45.setSelected(false);
        this.jCheckBox33.setSelected(false);
        this.jCheckBox35.setSelected(false);
        this.jCheckBox46.setSelected(false);
        this.jCheckBox47.setSelected(false);
        this.jCheckBox34.setSelected(false);
        this.jCheckBox48.setSelected(false);
        this.jCheckBox49.setSelected(false);
    }
    
    //writedata is the method that is used to write all the Employee details to the RandomAccessFile for storage     
    public void writedata(int y) {      
        try { 
            RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.EmpID.getText());
            for(int i = 1; i <= (EmployeeIDLength-this.EmpID.getText().length()); i++) {
                GeneralInfo.writeBytes("#");                                    //The for loop is used to fill the remaining space in the field with #s
            }
            y = y + EmployeeIDLength;                                           //The method now seeks to the new end of the file

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.fname.getText());
            for(int i = 1; i <= (FirstNameLength-this.fname.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + FirstNameLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.lname.getText());
            for(int i = 1; i <= (LastNameLength-this.lname.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + LastNameLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.addline1.getText());
            for(int i = 1; i <= (Address1Length-this.addline1.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + Address1Length;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.addline2.getText());
            for(int i = 1; i <= (Address2Length-this.addline2.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + Address2Length;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.addline3.getText());
            for(int i = 1; i <= (Address3Length-this.addline3.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + Address3Length;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.city.getText());
            for(int i = 1; i <= (CityLength-this.city.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + CityLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.zip.getText());
            for(int i = 1; i <= (ZipLength-this.zip.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + ZipLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.htel.getText());
            for(int i = 1; i <= (TelHomeLength-this.htel.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + TelHomeLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.wtel.getText());
            for(int i = 1; i <= (TelWorkLength-this.wtel.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + TelWorkLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.mtel.getText());
            for(int i = 1; i <= (TelMobLength-this.mtel.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + TelMobLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.fax.getText());
            for(int i = 1; i <= (FaxLength-this.fax.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + FaxLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.email.getText());
            for(int i = 1; i <= (EmailLength-this.email.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + EmailLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.field.getSelectedItem());
            for(int i = 1; i <= (FieldLength-(""+this.field.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + FieldLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.rank.getSelectedItem());
            for(int i = 1; i <= (RankLength-(""+this.rank.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + RankLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.sex.getSelectedItem());
            for(int i = 1; i <= (SexLength-(""+this.sex.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + SexLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.age.getText());
            for(int i = 1; i <= (AgeLength-this.age.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + AgeLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nationality.getText());
            for(int i = 1; i <= (NationalityLength-this.nationality.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NationalityLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.marital.getSelectedItem());
            for(int i = 1; i <= (MaritalStatusLength-(""+this.marital.getSelectedItem()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + MaritalStatusLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(""+this.car.isSelected());
            for(int i = 1; i <= (CarDriverLength-(""+this.car.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + CarDriverLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.licence.getText());       
            for(int i = 1; i <= (LicenceNoLength-this.licence.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + LicenceNoLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.birth.getText());
            for(int i = 1; i <= (BirthPlaceLength-this.birth.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + BirthPlaceLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.children.getText());
            for(int i = 1; i <= (NoChildrenLength-this.children.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoChildrenLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.airport.getText());
            for(int i = 1; i <= (AirportLength-this.airport.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + AirportLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokname.getText());
            for(int i = 1; i <= (NoKNameLength-this.nokname.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKNameLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokaddline1.getText());
            for(int i = 1; i <= (NoKAddress1Length-this.nokaddline1.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKAddress1Length;
            
            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokaddline2.getText());
            for(int i = 1; i <= (NoKAddress2Length-this.nokaddline2.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKAddress2Length;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokcity.getText());
            for(int i = 1; i <= (NoKCityLength-this.nokcity.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKCityLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokzip.getText());
            for(int i = 1; i <= (NoKZipLength-this.nokzip.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKZipLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.noktel.getText());
            for(int i = 1; i <= (NoKTelLength-this.noktel.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKTelLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokatel.getText());
            for(int i = 1; i <= (NoKTelAltLength-this.nokatel.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKTelAltLength;

            GeneralInfo.seek(y);
            GeneralInfo.writeBytes(this.nokemail.getText());
            for(int i = 1; i <= (NoKEmailLength-this.nokemail.getText().length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            y = y + NoKEmailLength;
            writeCert(y);                                                       //The certifications section of the form is written to the RandomAccessFile with this
        } catch (Exception w) {
            JOptionPane.showMessageDialog(this, "Error!");
        }
    }
    
    
    //The following method is used to write the certifications section of the form to the RandomAccessFile
    public void writeCert(int a) {
        try {
            RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox17.isSelected());           //As the checkbox returns a boolean value the (""+) part of the line is used so that the system accepts it as a string and is able to print to the RandomAccessFile 
            for(int i = 1; i <= (Check1Length-(""+this.jCheckBox17.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");                                    //The for loop is used to fill the remaining space in the field with #s
            }
            a = a + Check1Length;                                               
            GeneralInfo.seek(a);                                                //The method now seeks to the new end of the file
            GeneralInfo.writeBytes(""+this.jCheckBox1.isSelected());
            for(int i = 1; i <= (Check2Length-(""+this.jCheckBox1.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check2Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox2.isSelected());
            for(int i = 1; i <= (Check3Length-(""+this.jCheckBox2.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check3Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox18.isSelected());
            for(int i = 1; i <= (Check4Length-(""+this.jCheckBox18.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check4Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox3.isSelected());
            for(int i = 1; i <= (Check5Length-(""+this.jCheckBox3.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check5Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox19.isSelected());
            for(int i = 1; i <= (Check6Length-(""+this.jCheckBox19.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check6Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox36.isSelected());
            for(int i = 1; i <= (Check7Length-(""+this.jCheckBox36.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check7Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox20.isSelected());
            for(int i = 1; i <= (Check8Length-(""+this.jCheckBox20.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check8Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox21.isSelected());
            for(int i = 1; i <= (Check9Length-(""+this.jCheckBox21.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check9Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox4.isSelected());
            for(int i = 1; i <= (Check10Length-(""+this.jCheckBox4.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check10Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox5.isSelected());
            for(int i = 1; i <= (Check11Length-(""+this.jCheckBox5.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check11Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox22.isSelected());
            for(int i = 1; i <= (Check12Length-(""+this.jCheckBox22.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check12Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox37.isSelected());
            for(int i = 1; i <= (Check13Length-(""+this.jCheckBox37.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check13Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox6.isSelected());
            for(int i = 1; i <= (Check14Length-(""+this.jCheckBox6.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check14Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox50.isSelected());
            for(int i = 1; i <= (Check15Length-(""+this.jCheckBox50.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check15Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox38.isSelected());
            for(int i = 1; i <= (Check16Length-(""+this.jCheckBox38.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check16Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox30.isSelected());
            for(int i = 1; i <= (Check17Length-(""+this.jCheckBox30.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check17Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox51.isSelected());
            for(int i = 1; i <= (Check18Length-(""+this.jCheckBox51.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check18Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox39.isSelected());
            for(int i = 1; i <= (Check19Length-(""+this.jCheckBox39.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check19Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox31.isSelected());
            for(int i = 1; i <= (Check20Length-(""+this.jCheckBox31.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check20Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox40.isSelected());
            for(int i = 1; i <= (Check21Length-(""+this.jCheckBox40.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check21Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox8.isSelected());
            for(int i = 1; i <= (Check22Length-(""+this.jCheckBox8.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check22Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox7.isSelected());
            for(int i = 1; i <= (Check23Length-(""+this.jCheckBox7.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check23Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox9.isSelected());
            for(int i = 1; i <= (Check24Length-(""+this.jCheckBox9.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check24Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox41.isSelected());
            for(int i = 1; i <= (Check25Length-(""+this.jCheckBox41.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check25Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox42.isSelected());
            for(int i = 1; i <= (Check26Length-(""+this.jCheckBox42.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check26Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox43.isSelected());
            for(int i = 1; i <= (Check27Length-(""+this.jCheckBox43.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check27Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox10.isSelected());
            for(int i = 1; i <= (Check28Length-(""+this.jCheckBox10.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check28Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox11.isSelected());
            for(int i = 1; i <= (Check29Length-(""+this.jCheckBox11.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check29Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox23.isSelected());
            for(int i = 1; i <= (Check30Length-(""+this.jCheckBox23.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check30Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox12.isSelected());
            for(int i = 1; i <= (Check31Length-(""+this.jCheckBox12.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check31Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox13.isSelected());
            for(int i = 1; i <= (Check32Length-(""+this.jCheckBox13.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check32Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox44.isSelected());
            for(int i = 1; i <= (Check33Length-(""+this.jCheckBox44.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check33Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox26.isSelected());
            for(int i = 1; i <= (Check34Length-(""+this.jCheckBox26.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check34Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox14.isSelected());
            for(int i = 1; i <= (Check35Length-(""+this.jCheckBox14.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check35Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox15.isSelected());
            for(int i = 1; i <= (Check36Length-(""+this.jCheckBox15.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check36Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox16.isSelected());
            for(int i = 1; i <= (Check37Length-(""+this.jCheckBox16.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check37Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox32.isSelected());
            for(int i = 1; i <= (Check38Length-(""+this.jCheckBox32.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check38Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox27.isSelected());
            for(int i = 1; i <= (Check39Length-(""+this.jCheckBox27.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check39Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox28.isSelected());
            for(int i = 1; i <= (Check40Length-(""+this.jCheckBox28.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check40Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox29.isSelected());
            for(int i = 1; i <= (Check41Length-(""+this.jCheckBox29.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check41Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox24.isSelected());
            for(int i = 1; i <= (Check42Length-(""+this.jCheckBox24.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check42Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox45.isSelected());
            for(int i = 1; i <= (Check43Length-(""+this.jCheckBox45.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check43Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox33.isSelected());
            for(int i = 1; i <= (Check44Length-(""+this.jCheckBox33.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check44Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox35.isSelected());
            for(int i = 1; i <= (Check45Length-(""+this.jCheckBox35.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check45Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox46.isSelected());
            for(int i = 1; i <= (Check46Length-(""+this.jCheckBox46.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check46Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox47.isSelected());
            for(int i = 1; i <= (Check47Length-(""+this.jCheckBox47.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check47Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox34.isSelected());
            for(int i = 1; i <= (Check48Length-(""+this.jCheckBox34.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check48Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox48.isSelected());
            for(int i = 1; i <= (Check49Length-(""+this.jCheckBox48.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check49Length;
            GeneralInfo.seek(a);
            GeneralInfo.writeBytes(""+this.jCheckBox49.isSelected());
            for(int i = 1; i <= (Check50Length-(""+this.jCheckBox49.isSelected()).length()); i++) {
                GeneralInfo.writeBytes("#");
            }
            a = a + Check50Length;
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    //The following method is used to read the RandomAccessFile. It extracts the record number (int a)
    public void displayrecordsat(int a) throws IOException {
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        int s = a*recordlength;                                                 //The record number is multiplied by the record size to get the exact position at which the record begins in the file
        GeneralInfo.seek(s);                
        for (int x = 0; x < EmployeeIDLength; x++) {
            empid = empid + (char)GeneralInfo.readByte();                       //Each byte in the field is extracted individually and then compiled into a string
        }
        empid = empid.substring(0, empid.indexOf("#"));                         //The excess bytes in the field are truncated
        s = s + EmployeeIDLength;                                               //The pointer moves to the start of the next field
        for (int x = 0; x < FirstNameLength; x++) {
             firstn = firstn + (char)GeneralInfo.readByte();
        }
        firstn = firstn.substring(0, firstn.indexOf("#")); 
        s = s + FirstNameLength;
        for (int x = 0; x < LastNameLength; x++) {
            lastn = lastn + (char)GeneralInfo.readByte();
        }
        lastn = lastn.substring(0, lastn.indexOf("#")); 
        s = s + LastNameLength;
        GeneralInfo.seek(s);                
        for (int x = 0; x < Address1Length; x++) {
            add1 = add1 + (char)GeneralInfo.readByte();
        }
        add1 = add1.substring(0, add1.indexOf("#")); 
        s = s + Address1Length;
        GeneralInfo.seek(s);
        for (int x = 0; x < Address2Length; x++) {
            add2 = add2 + (char)GeneralInfo.readByte();
        }
        add2 = add2.substring(0, add2.indexOf("#")); 
        s = s + Address2Length;
        GeneralInfo.seek(s);
        for (int x = 0; x < Address3Length; x++) {
            add3 = add3 + (char)GeneralInfo.readByte();
        }
        add3 = add3.substring(0, add3.indexOf("#")); 
        s = s + Address3Length;
        GeneralInfo.seek(s);
        for (int x = 0; x < CityLength; x++) {
            cty = cty + (char)GeneralInfo.readByte();
        }
        cty = cty.substring(0, cty.indexOf("#")); 
        s = s + CityLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < ZipLength; x++) {
            zp = zp + (char)GeneralInfo.readByte();
        }
        zp = zp.substring(0, zp.indexOf("#")); 
        s = s + ZipLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < TelHomeLength; x++) {
            thome = thome + (char)GeneralInfo.readByte();
        }
        thome = thome.substring(0, thome.indexOf("#")); 
        s = s + TelHomeLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < TelWorkLength; x++) {
            twork = twork + (char)GeneralInfo.readByte();
        }
        twork = twork.substring(0, twork.indexOf("#")); 
        s = s + TelWorkLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < TelMobLength; x++) {
            tmob = tmob + (char)GeneralInfo.readByte();
        }
        tmob = tmob.substring(0, tmob.indexOf("#")); 
        s = s + TelMobLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < FaxLength; x++) {
            fx = fx + (char)GeneralInfo.readByte();
        }
        fx = fx.substring(0, fx.indexOf("#")); 
        s = s + FaxLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < EmailLength; x++) {
            eml = eml + (char)GeneralInfo.readByte();
        }
        eml = eml.substring(0, eml.indexOf("#")); 
        s = s + EmailLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < FieldLength; x++) {
            fld = fld + (char)GeneralInfo.readByte();
        }
        fld = fld.substring(0, fld.indexOf("#")); 
        s = s + FieldLength + RankLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < SexLength; x++) {
            sx = sx + (char)GeneralInfo.readByte();
        }
        sx = sx.substring(0, sx.indexOf("#")); 
        s = s + SexLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < AgeLength; x++) {
            ag = ag + (char)GeneralInfo.readByte();
        }
        ag = ag.substring(0, ag.indexOf("#")); 
        s = s + AgeLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NationalityLength; x++) {
            nat = nat + (char)GeneralInfo.readByte();
        }
        nat = nat.substring(0, nat.indexOf("#")); 
        s = s + NationalityLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < MaritalStatusLength; x++) {
            maritals = maritals + (char)GeneralInfo.readByte();
        }
        maritals = maritals.substring(0, maritals.indexOf("#")); 
        s = s + MaritalStatusLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < CarDriverLength; x++) {
            gaddi = gaddi + (char)GeneralInfo.readByte();
        }
        gaddi = gaddi.substring(0, gaddi.indexOf("#")); 
        s = s + CarDriverLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < LicenceNoLength; x++) {
            licenceno = licenceno + (char)GeneralInfo.readByte();
        }
        licenceno = licenceno.substring(0, licenceno.indexOf("#")); 
        s = s + LicenceNoLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < BirthPlaceLength; x++) {
            birthplace = birthplace + (char)GeneralInfo.readByte();
        }
        birthplace = birthplace.substring(0, birthplace.indexOf("#")); 
        s = s + BirthPlaceLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoChildrenLength; x++) {
            nochildren = nochildren + (char)GeneralInfo.readByte();
        }
        nochildren = nochildren.substring(0, nochildren.indexOf("#")); 
        s = s + NoChildrenLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < AirportLength; x++) {
            air = air + (char)GeneralInfo.readByte();
        }
        air = air.substring(0, air.indexOf("#")); 
        s = s + AirportLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKNameLength; x++) {
            name2 = name2 + (char)GeneralInfo.readByte();
        }
        name2 = name2.substring(0, name2.indexOf("#")); 
        s = s + NoKNameLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKAddress1Length; x++) {
            nokadd1 = nokadd1 + (char)GeneralInfo.readByte();
        }
        nokadd1 = nokadd1.substring(0, nokadd1.indexOf("#")); 
        s = s + NoKAddress1Length;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKAddress2Length; x++) {
            nokadd2 = nokadd2 + (char)GeneralInfo.readByte();
        }
        nokadd2 = nokadd2.substring(0, nokadd2.indexOf("#")); 
        s = s + NoKAddress2Length;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKCityLength; x++) {
            city2 = city2 + (char)GeneralInfo.readByte();
        }
        city2 = city2.substring(0, city2.indexOf("#")); 
        s = s + NoKCityLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKZipLength; x++) {
            zip2 = zip2 + (char)GeneralInfo.readByte();
        }
        zip2 = zip2.substring(0, zip2.indexOf("#")); 
        s = s + NoKZipLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKTelLength; x++) {
            tel2 = tel2 + (char)GeneralInfo.readByte();
        }
        tel2 = tel2.substring(0, tel2.indexOf("#")); 
        s = s + NoKTelLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKTelAltLength; x++) {
            telalt = telalt + (char)GeneralInfo.readByte();
        }
        telalt = telalt.substring(0, telalt.indexOf("#")); 
        s = s + NoKTelAltLength;
        GeneralInfo.seek(s);
        for (int x = 0; x < NoKEmailLength; x++) {
            email2 = email2 + (char)GeneralInfo.readByte();
        }
        email2 = email2.substring(0, email2.indexOf("#")); 
        s = s + NoKEmailLength;             

        this.EmpID.setText(empid);                                              //Now that the data has been extracted from the RandomAccessFile it is displayed through the textboxes on the form to allow the user to view, edit or delete the record
        this.fname.setText(firstn);
        this.lname.setText(lastn);
        this.addline1.setText(add1);
        this.addline2.setText(add2);
        this.addline3.setText(add3);
        this.city.setText(cty);
        this.zip.setText(zp);
        this.htel.setText(thome);
        this.wtel.setText(twork);
        this.mtel.setText(tmob);
        this.fax.setText(fx);
        this.email.setText(eml);
        this.field.setSelectedItem(fld);
        this.sex.setSelectedItem(sx);
        this.age.setText(ag);
        this.nationality.setText(nat);
        this.marital.setSelectedItem(maritals);
        if ("true".equals(gaddi)) {                                             //Since the Licence field is only active if the CarDriver checkbox is ticked, the system first checks if this is true before it displays the licence, so that it can enable the textbox for editing if there is indeed a licence number for that particular record
                this.car.setSelected(true);
                this.licence.setEnabled(true);
        } else {
            this.car.setSelected(false);
            this.licence.setEnabled(false);
        }
        this.licence.setText(licenceno);
        this.birth.setText(birthplace);
        this.children.setText(nochildren);
        this.airport.setText(air);
        this.nokname.setText(name2);
        this.nokaddline1.setText(nokadd1);
        this.nokaddline2.setText(nokadd2);
        this.nokcity.setText(city2);
        this.nokzip.setText(zip2);
        this.noktel.setText(tel2);
        this.nokatel.setText(telalt);
        this.nokemail.setText(email2);
        clearstorage();
    }
    //This method is used to search the RandomAccessFile for the EmployeeID that is entered
    public void search(int i) throws IOException {        
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        int n = numberofRecords();
        for (int s = 0; s < n; s++) {
            GeneralInfo.seek(s*recordlength);
            String ID = "";
            for (int x = 0; x < EmployeeIDLength; x++) {
                ID = ID + (char)GeneralInfo.readByte();
            }
            ID = ID.substring(0, ID.indexOf("#"));                                  
            int t = Integer.parseInt(ID);
            if (i == t) {
                displayrecordsat(s);
                break;
            }
            if (s == n - 1) {
                newrecord();
                JOptionPane.showMessageDialog(this, "Record doesn't exist");
            }
        }
    }
    
    public void search(String i) throws IOException {
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        int n = numberofRecords();
        for (int s = 0; s < n; s++) {
            GeneralInfo.seek((s*recordlength)+21);
            String LN = "";
            for (int x = 0; x < LastNameLength; x++) {
                LN = LN + (char)GeneralInfo.readByte();
            }
            LN = LN.substring(0, LN.indexOf("#"));
            if (i == null ? LN == null : i.equalsIgnoreCase(LN)) {
                displayrecordsat(s);
                break;
            }
            if (s == n - 1) {
                newrecord();
                JOptionPane.showMessageDialog(this, "Record doesn't exist");                
            }
        }

    }
    //This method is used to calculate the total number of records that are stored within the RandomAccessFile GeneralInfo at any given point
    public int numberofRecords() throws IOException {
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        int total = (int)GI.length();
        int n = (int)total/recordlength;
        return n;
    }
    //Since the Ranks that can be chosen by the user are dependant on the Field that is selected for the particular employee, the list within the combobox cannot be set using the GUI Builder, instead this method is used to set the list within the Rank combobox based on what the user has selected in the Field combobox
    public void displayRank() {
        rank.setEnabled(true);
        if (this.field.getSelectedItem() == "Select:") {
            rank.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
            rank.setEnabled(false);
        }  
        if (this.field.getSelectedItem() == "Deck") {
            rank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Master", "Chief Officer", "Second Officer", "Third Officer", "Junior Officer", "Deck Cadet" }));
        }  
        if (this.field.getSelectedItem() == "Engine") {
            rank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Chief Engineer", "Second Engineer", "Third Engineer", "Fourth Engineer", "Junior Engineer", "Trainee Marine Engineer", "Engineer Cadet", "MotorMan", "Fitter", "PumpMan", "Electrical Officer"}));    
        }
        if (this.field.getSelectedItem() == "Saloon") {
            rank.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Able Bodied Seaman", "Ordinary Seaman", "Steward", "Chief Cook", "MessMan", "Bosun" })); 
        }    
    }
    //This method extracts the EmployeeID from the RandomAccessFile, it is separate from the retrieveString() method as the EmployeeID is the field by which the linkedlist is sorted hence it needs to be in the form of an integer not a String
    public int retrieveEmpID(int a) throws FileNotFoundException, IOException {
        int b = ((a*recordlength));
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        GeneralInfo.seek(b);
        String employ = "";
        for (int x = 0; x < EmployeeIDLength; x++) {
            employ = employ + (char)GeneralInfo.readByte();
        }                               
        employ = employ.substring(0, employ.indexOf("#"));
        int n = Integer.parseInt(employ);                                       //The String is parsed into an integer
        return n;
    }
    //This performs the same task as the retrieveEmpID() method except for the fact that it does not parse the String value into an integer. It also has 3 parameters as both the field position and the field length that are needed are not the same each time the method is called
    public String retrieveString(int a, int z, int l) throws FileNotFoundException, IOException {
        int b = ((a*recordlength)+z);
        RandomAccessFile GeneralInfo = new RandomAccessFile(GI,"rw");
        GeneralInfo.seek(b);
        String string = "";
        for (int x = 0; x < l; x++) {
            string = string + (char)GeneralInfo.readByte();
        }
        string = string.substring(0, string.indexOf("#"));                                  
        return string;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    // This is where the generated code that creates the GUI is contained. It is not displayed here in the documentation
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Certifications = new javax.swing.JFrame();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox50 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox30 = new javax.swing.JCheckBox();
        namef1 = new javax.swing.JLabel();
        jCheckBox37 = new javax.swing.JCheckBox();
        jCheckBox36 = new javax.swing.JCheckBox();
        namel1 = new javax.swing.JLabel();
        eID = new javax.swing.JLabel();
        jCheckBox38 = new javax.swing.JCheckBox();
        specialty = new javax.swing.JComboBox();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jCheckBox17 = new javax.swing.JCheckBox();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox51 = new javax.swing.JCheckBox();
        jCheckBox49 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox41 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox42 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox44 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox45 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jLabel38 = new javax.swing.JLabel();
        jCheckBox43 = new javax.swing.JCheckBox();
        jCheckBox47 = new javax.swing.JCheckBox();
        jCheckBox46 = new javax.swing.JCheckBox();
        jCheckBox34 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox48 = new javax.swing.JCheckBox();
        jCheckBox31 = new javax.swing.JCheckBox();
        jCheckBox32 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jCheckBox35 = new javax.swing.JCheckBox();
        jCheckBox33 = new javax.swing.JCheckBox();
        jCheckBox40 = new javax.swing.JCheckBox();
        jCheckBox39 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        EmpID = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        addline1 = new javax.swing.JTextField();
        addline2 = new javax.swing.JTextField();
        addline3 = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        zip = new javax.swing.JTextField();
        htel = new javax.swing.JTextField();
        wtel = new javax.swing.JTextField();
        mtel = new javax.swing.JTextField();
        fax = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        field = new javax.swing.JComboBox();
        rank = new javax.swing.JComboBox();
        sex = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        marital = new javax.swing.JComboBox();
        licence = new javax.swing.JTextField();
        birth = new javax.swing.JTextField();
        children = new javax.swing.JTextField();
        airport = new javax.swing.JTextField();
        nokname = new javax.swing.JTextField();
        nokaddline1 = new javax.swing.JTextField();
        nokaddline2 = new javax.swing.JTextField();
        nokcity = new javax.swing.JTextField();
        nokzip = new javax.swing.JTextField();
        noktel = new javax.swing.JTextField();
        nokatel = new javax.swing.JTextField();
        nokemail = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        SaveRecord = new javax.swing.JButton();
        car = new javax.swing.JCheckBox();
        DeleteRecord = new javax.swing.JButton();
        SaveEdits = new javax.swing.JButton();
        NextRecord = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        SearchB = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        AddCertifications = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jCheckBox5.setText("Elementary First Aid");
        jCheckBox5.setEnabled(false);

        jCheckBox6.setText("Fire Prevention Fire Fighting");
        jCheckBox6.setEnabled(false);

        jCheckBox50.setText("Forklift Operator");
        jCheckBox50.setEnabled(false);

        jCheckBox3.setText("Behavior Based Safety Observer");
        jCheckBox3.setEnabled(false);

        jCheckBox4.setText("ECDIS");
        jCheckBox4.setEnabled(false);

        jCheckBox1.setText("Accident Investigation");
        jCheckBox1.setEnabled(false);

        jCheckBox2.setText("Advanced MN Fire Fighting");
        jCheckBox2.setEnabled(false);

        jCheckBox30.setText("Good Hygiene Practices");
        jCheckBox30.setEnabled(false);

        jCheckBox37.setText("Engineering Watch Rating Certification");
        jCheckBox37.setEnabled(false);

        jCheckBox36.setText("Converteam Diesel Propulsion Drive");
        jCheckBox36.setEnabled(false);

        jCheckBox38.setText("Fundamentals of Ice Navigation");
        jCheckBox38.setEnabled(false);

        specialty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Cargo/Bulk", "Ferry", "RoRo", "Chemical Tanker", "Gas Tanker", "Oil Tanker", "Custom" }));
        specialty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialtyActionPerformed(evt);
            }
        });

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Specialty");

        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Last Name");

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("First Name");

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("EmployeeID");

        jCheckBox17.setText("Abrasive Wheels");
        jCheckBox17.setEnabled(false);

        jCheckBox18.setText("BA Servicing");
        jCheckBox18.setEnabled(false);

        jCheckBox20.setText("Crisis Management, Human Behavior");
        jCheckBox20.setEnabled(false);

        jCheckBox19.setText("Bridge Team Management");
        jCheckBox19.setEnabled(false);

        jCheckBox22.setText("Emergency Procedures");
        jCheckBox22.setEnabled(false);

        jCheckBox21.setText("Crowd Management");
        jCheckBox21.setEnabled(false);

        jCheckBox51.setText("Hazardous Goods By Sea (Videotel)");
        jCheckBox51.setEnabled(false);

        jCheckBox49.setText("Wartsila DF50 Maintenance");
        jCheckBox49.setEnabled(false);

        jCheckBox24.setText("Shipboard Safety Officer");
        jCheckBox24.setEnabled(false);

        jCheckBox16.setText("Proficiency in Survival Craft");
        jCheckBox16.setEnabled(false);

        jCheckBox41.setText("Kongsberg K Chief 700 Step 1 (Operator)");
        jCheckBox41.setEnabled(false);

        jCheckBox8.setText("International Culinary Course");
        jCheckBox8.setEnabled(false);

        jCheckBox42.setText("Kongsberg K Chief 700 Step 2 (Maintenance)");
        jCheckBox42.setEnabled(false);

        jCheckBox9.setText("ISM Induct/Internal Auditor");
        jCheckBox9.setEnabled(false);

        jCheckBox44.setText("Navigation Watch Rating Certification");
        jCheckBox44.setEnabled(false);

        jCheckBox10.setText("Management Skills");
        jCheckBox10.setEnabled(false);

        jCheckBox45.setText("SIGTTO LNG Training Course");
        jCheckBox45.setEnabled(false);

        jCheckBox11.setText("Manned Model Ship Handling");
        jCheckBox11.setEnabled(false);

        jCheckBox12.setText("Medical Care");
        jCheckBox12.setEnabled(false);

        jCheckBox13.setText("Medical First Aid");
        jCheckBox13.setEnabled(false);

        jCheckBox14.setText("Personal Safety and Social Responsibilities");
        jCheckBox14.setEnabled(false);

        jCheckBox15.setText("Personal Survival Techniques");
        jCheckBox15.setEnabled(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Employee Certifications");

        jCheckBox43.setText("Liquid Cargo Handling Simulator");
        jCheckBox43.setEnabled(false);

        jCheckBox47.setText("Tanker Safety (LPG)");
        jCheckBox47.setEnabled(false);

        jCheckBox46.setText("Tanker Safety (Gas)");
        jCheckBox46.setEnabled(false);

        jCheckBox34.setText("Tanker Safety (Petroleum)");
        jCheckBox34.setEnabled(false);

        jCheckBox7.setText("International Fire Fighting");
        jCheckBox7.setEnabled(false);

        jCheckBox48.setText("Wartsila DF50 Control and Instrumentation");
        jCheckBox48.setEnabled(false);

        jCheckBox31.setText("Indian Cuisine Program");
        jCheckBox31.setEnabled(false);

        jCheckBox32.setText("Risk Assessment");
        jCheckBox32.setEnabled(false);

        jCheckBox29.setText("Shipboard Security Officer");
        jCheckBox29.setEnabled(false);

        jCheckBox35.setText("Tanker Safety (Chemical)");
        jCheckBox35.setEnabled(false);

        jCheckBox33.setText("Tanker Familiarisation");
        jCheckBox33.setEnabled(false);

        jCheckBox40.setText("Integrated Automation Systems (IAS) Kongsberg");
        jCheckBox40.setEnabled(false);

        jCheckBox39.setText("High Voltage");
        jCheckBox39.setEnabled(false);

        jCheckBox26.setText("Passenger/Cargo Safe Hull Int");
        jCheckBox26.setEnabled(false);

        jCheckBox23.setText("Marine Evacuation Systems");
        jCheckBox23.setEnabled(false);

        jCheckBox28.setText("SAR (Passenger and Ferry)");
        jCheckBox28.setEnabled(false);

        jCheckBox27.setText("Safety Officer");
        jCheckBox27.setEnabled(false);

        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Next Record");
        jButton9.setNextFocusableComponent(search);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CertificationsLayout = new javax.swing.GroupLayout(Certifications.getContentPane());
        Certifications.getContentPane().setLayout(CertificationsLayout);
        CertificationsLayout.setHorizontalGroup(
            CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CertificationsLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(18, 18, 18)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namef1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(eID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(specialty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox30)
                    .addComponent(jCheckBox38)
                    .addComponent(jCheckBox50)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox37)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox36)
                    .addComponent(jCheckBox19)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox1))
                .addGap(38, 38, 38)
                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox31)
                            .addComponent(jCheckBox8)
                            .addComponent(jCheckBox40)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox9)
                            .addComponent(jCheckBox41)
                            .addComponent(jCheckBox51)
                            .addComponent(jCheckBox39)
                            .addComponent(jCheckBox42)
                            .addComponent(jCheckBox43)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox23)
                            .addComponent(jCheckBox12)
                            .addComponent(jCheckBox13)
                            .addComponent(jCheckBox44))
                        .addGap(18, 18, 18)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox27)
                            .addComponent(jCheckBox28)
                            .addComponent(jCheckBox29)
                            .addComponent(jCheckBox14)
                            .addComponent(jCheckBox15)
                            .addComponent(jCheckBox16)
                            .addComponent(jCheckBox32)
                            .addComponent(jCheckBox35)
                            .addComponent(jCheckBox33)
                            .addComponent(jCheckBox45)
                            .addComponent(jCheckBox47)
                            .addComponent(jCheckBox46)
                            .addComponent(jCheckBox34)
                            .addComponent(jCheckBox48)
                            .addComponent(jCheckBox49)
                            .addComponent(jCheckBox24)))
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel38))
                    .addComponent(jCheckBox26)
                    .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        CertificationsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eID, namef1, namel1, specialty});

        CertificationsLayout.setVerticalGroup(
            CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CertificationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(30, 30, 30)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(CertificationsLayout.createSequentialGroup()
                                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CertificationsLayout.createSequentialGroup()
                                        .addComponent(jCheckBox51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox39)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox41))
                                    .addGroup(CertificationsLayout.createSequentialGroup()
                                        .addComponent(jCheckBox14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CertificationsLayout.createSequentialGroup()
                                        .addComponent(jCheckBox42)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox11))
                                    .addGroup(CertificationsLayout.createSequentialGroup()
                                        .addComponent(jCheckBox45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox33)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox46)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox47)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox34)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox48)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCheckBox49)))
                                .addGap(23, 23, 23))
                            .addGroup(CertificationsLayout.createSequentialGroup()
                                .addComponent(jCheckBox23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox26))))
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addComponent(jCheckBox17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox30)))
                .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(eID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(namef1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(namel1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CertificationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(specialty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34))
                        .addGap(50, 50, 50))
                    .addGroup(CertificationsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        CertificationsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eID, namef1, namel1, specialty});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EmpID.setNextFocusableComponent(fname);

        fname.setNextFocusableComponent(lname);

        lname.setNextFocusableComponent(addline1);

        addline1.setNextFocusableComponent(addline2);
        addline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addline1ActionPerformed(evt);
            }
        });

        addline2.setNextFocusableComponent(addline3);

        addline3.setNextFocusableComponent(city);

        city.setNextFocusableComponent(zip);

        zip.setNextFocusableComponent(htel);

        htel.setNextFocusableComponent(wtel);

        wtel.setNextFocusableComponent(mtel);

        mtel.setNextFocusableComponent(fax);

        fax.setNextFocusableComponent(email);

        email.setNextFocusableComponent(field);

        age.setNextFocusableComponent(nationality);

        nationality.setNextFocusableComponent(marital);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("EmployeeID");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("First Name");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Last Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("City");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Zip Code");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telephone (Home)");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telephone (Work)");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Telephone (Mobile)");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fax");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Email ID");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Field");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Rank");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Sex");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Age");

        field.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Deck", "Engine", "Saloon" }));
        field.setNextFocusableComponent(rank);
        field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldActionPerformed(evt);
            }
        });
        field.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                fieldPropertyChange(evt);
            }
        });

        rank.setNextFocusableComponent(sex);
        rank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rankActionPerformed(evt);
            }
        });

        sex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Male", "Female" }));
        sex.setNextFocusableComponent(age);

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Nationality");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Marital Status");

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Car driver");

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Licence number");

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Birth Place");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Number of Children");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Airport");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Name");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Address");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("City");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Zip Code");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Next of Kin");

        marital.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select:", "Married", "Single", "Divorced", "Separated" }));
        marital.setNextFocusableComponent(car);

        licence.setNextFocusableComponent(birth);

        birth.setNextFocusableComponent(children);

        children.setNextFocusableComponent(airport);

        airport.setNextFocusableComponent(nokname);

        nokname.setNextFocusableComponent(nokaddline1);

        nokaddline1.setNextFocusableComponent(nokaddline2);

        nokaddline2.setNextFocusableComponent(nokcity);

        nokcity.setNextFocusableComponent(nokzip);

        nokzip.setNextFocusableComponent(noktel);

        noktel.setNextFocusableComponent(nokatel);

        nokatel.setNextFocusableComponent(nokemail);

        nokemail.setNextFocusableComponent(SaveRecord);
        nokemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nokemailActionPerformed(evt);
            }
        });

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Telephone");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Telephone (Alt)");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Email ID");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Personal Data");

        SaveRecord.setText("Save Record");
        SaveRecord.setNextFocusableComponent(DeleteRecord);
        SaveRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveRecordActionPerformed(evt);
            }
        });

        car.setNextFocusableComponent(licence);
        car.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carActionPerformed(evt);
            }
        });

        DeleteRecord.setText("Delete Record");
        DeleteRecord.setNextFocusableComponent(SaveEdits);
        DeleteRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteRecordActionPerformed(evt);
            }
        });

        SaveEdits.setText("Save Edits");
        SaveEdits.setNextFocusableComponent(NextRecord);
        SaveEdits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveEditsActionPerformed(evt);
            }
        });

        NextRecord.setText("Next Record");
        NextRecord.setNextFocusableComponent(search);
        NextRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextRecordActionPerformed(evt);
            }
        });

        search.setNextFocusableComponent(SearchB);
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel32.setText("Enter Search Term");

        SearchB.setText("Search");
        SearchB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBActionPerformed(evt);
            }
        });

        jLabel33.setText("Search byEmployeeID or LastName");

        jButton8.setText("Same");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        AddCertifications.setText("Add Certifications");
        AddCertifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCertificationsActionPerformed(evt);
            }
        });

        jMenu2.setText("File");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("New Record");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem2.setText("Exit to Home Screen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem3.setText("Exit Program");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addline2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addline1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(addline3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(mtel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zip, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(htel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(wtel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nationality, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(car, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(marital, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(licence, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(birth, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(children, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(airport, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(sex, 0, 174, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(field, 0, 174, Short.MAX_VALUE)
                            .addComponent(rank, 0, 174, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel30)
                    .addComponent(jLabel26)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(noktel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokatel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokemail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokaddline1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(nokaddline2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokcity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokzip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nokname, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addGap(144, 144, 144))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SearchB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)
                        .addGap(218, 218, 218)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddCertifications, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(SaveEdits, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(SaveRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeleteRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(NextRecord, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                .addGap(263, 263, 263))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {EmpID, addline1, addline2, addline3, age, airport, birth, children, city, email, fax, fname, htel, jLabel1, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel2, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel28, jLabel29, jLabel3, jLabel30, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, licence, lname, mtel, nationality, wtel, zip});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel31)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addline3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(htel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(jLabel15))
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(marital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(car))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(licence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(children, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(airport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jButton8))
                                    .addGap(18, 18, 18)
                                    .addComponent(nokname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokaddline1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokaddline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(noktel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokatel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nokemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel24)
                                    .addGap(32, 32, 32)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel30))))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveRecord)
                            .addComponent(DeleteRecord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveEdits)
                            .addComponent(NextRecord))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddCertifications))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SearchB, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                            .addComponent(search)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(6, 6, 6)))
                .addGap(41, 41, 41))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {EmpID, addline1, addline2, addline3, age, airport, birth, children, city, email, fax, fname, htel, jLabel1, jLabel11, jLabel12, jLabel14, jLabel15, jLabel16, jLabel17, jLabel18, jLabel19, jLabel2, jLabel20, jLabel21, jLabel22, jLabel23, jLabel24, jLabel25, jLabel26, jLabel27, jLabel28, jLabel29, jLabel3, jLabel30, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9, licence, lname, mtel, nationality, nokaddline1, nokaddline2, nokcity, nokname, nokzip, wtel, zip});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void addline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addline1ActionPerformed
}//GEN-LAST:event_addline1ActionPerformed
private void nokemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nokemailActionPerformed
}//GEN-LAST:event_nokemailActionPerformed
private void rankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rankActionPerformed
}//GEN-LAST:event_rankActionPerformed

//This method is called when the Button labelled Save Record is clicked, it writes the inputted records to the RandomAccessFile if they are valid
private void SaveRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveRecordActionPerformed
    if (GI.isFile()) {
            len = (int)GI.length();
    } 
    if (Validateq() == true) {
        writedata(len);
        JOptionPane.showMessageDialog(this, "Record Saved!");
    }     
}//GEN-LAST:event_SaveRecordActionPerformed

//This method is used to set the combobox list for the field Rank, and is called when the user selects a value in the combobox field
private void fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldActionPerformed
    displayRank();
}//GEN-LAST:event_fieldActionPerformed
private void fieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_fieldPropertyChange
}//GEN-LAST:event_fieldPropertyChange

//This method is called when the user clicks the CarDriver checkbox, it enables the Licence textbox if the checkbox is set to true and disables it if it is set to false
private void carActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carActionPerformed
    if (car.isSelected()) {
        licence.setEnabled(true);
    } else {
        licence.setEnabled(false);
    }
}//GEN-LAST:event_carActionPerformed

//This method is called when the Save Edits button is clicked, it takes all the data that is currently in the data entry text boxes and superimposes the stored record within the RandomAccessFile with this new data
private void SaveEditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveEditsActionPerformed
    if (Validateq() == true) {
        int e = Integer.parseInt(
            this.EmpID.getText());
        int a = 0;
        int ID = 0;
        try {
            int n = numberofRecords();
            for (int s = 0; s < n; s++) {            
                ID = retrieveEmpID(s);
                if (ID == e) {
                    a = s;
                    break;
                }            
            }
            int s = a*recordlength;
            writedata(s);
            JOptionPane.showMessageDialog(this, "Record Updated!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        }     
    }   
}//GEN-LAST:event_SaveEditsActionPerformed

//This method is called when the Next Record button is clicked. It is used by the user to cycle through the records. It displays the records in ascending order or EmployeeID, this is accomplished by first porting the data from the RandomAccessFile into a LinkedList and using insertion sort to ensure that the data is sorted. This is then displayed in the textboxes on the screen to allow for editing or deletion of records
private void NextRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextRecordActionPerformed
    int a = 0;
        try {
            a = numberofRecords();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error!");
            Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    if (listcount < a) {
        try {
            LinkedList GInformation = new LinkedList();                         //This is used to create the linked list GInformation by calling the LinkedList class
            for(int b = 0; b < a; b++){
                Node x = new Node();
                x.EmployeeID = retrieveEmpID(b);
                x.FirstName = retrieveString(b, 6, FirstNameLength);                
                x.LastName = retrieveString(b, 21, LastNameLength);
                x.Address1 = retrieveString(b, 41, Address1Length);   
                x.Address2 = retrieveString(b, 81, Address2Length);
                x.Address3 = retrieveString(b, 121, Address3Length);
                x.City = retrieveString(b, 161, CityLength);
                x.Zip = retrieveString(b, 186, ZipLength);
                x.TelHome = retrieveString(b, 193, TelHomeLength);
                x.TelWork = retrieveString(b, 204, TelWorkLength);
                x.TelMob = retrieveString(b, 215, TelMobLength);
                x.Fax = retrieveString(b, 226, FaxLength);
                x.Email = retrieveString(b, 237, EmailLength);
                x.Field = retrieveString(b, 267, FieldLength);
                x.Rank = retrieveString(b, 288, RankLength);
                x.Sex = retrieveString(b, 309, SexLength);
                x.Age = retrieveString(b, 316, AgeLength);
                x.Nationality = retrieveString(b, 319, NationalityLength);
                x.MaritalStatus = retrieveString(b, 339, MaritalStatusLength);
                x.CarDriver = retrieveString(b, 348, CarDriverLength);
                x.LicenceNo = retrieveString(b, 354, LicenceNoLength);
                x.BirthPlace = retrieveString(b, 369, BirthPlaceLength);
                x.NoChildren = retrieveString(b, 384, NoChildrenLength);
                x.Airport = retrieveString(b, 387, AirportLength);
                x.NoKName = retrieveString(b, 391, NoKNameLength);
                x.NoKAddress1 = retrieveString(b, 426, NoKAddress1Length);
                x.NoKAddress2 = retrieveString(b, 486, NoKAddress2Length);
                x.NoKCity = retrieveString(b, 546, NoKCityLength);
                x.NoKZip = retrieveString(b, 561, NoKZipLength);
                x.NoKTel = retrieveString(b, 568, NoKTelLength);
                x.NoKTelAlt = retrieveString(b, 579, NoKTelAltLength);
                x.NoKEmail = retrieveString(b, 590, NoKEmailLength);
                GInformation.addNew(x);                                         //Here the data that was stored within the Node x is added to the linked list
            } 
            Node temp = GInformation.top;
            for (int qwe = 0; qwe < listcount; qwe++) {                         //This selects the record based on the value of the listcount variable, which is used as a counter for the number of times the user has clicked the next record button. The first time the user clicks it, it will display the first record, the second time, the second, and so on.
                temp = temp.next;
            }
            this.EmpID.setText(""+temp.EmployeeID);
            this.fname.setText(""+temp.FirstName);
            this.lname.setText(""+temp.LastName);
            this.addline1.setText(""+temp.Address1);
            this.addline2.setText(""+temp.Address2);
            this.addline3.setText(""+temp.Address3);
            this.city.setText(""+temp.City);
            this.zip.setText(""+temp.Zip);
            this.htel.setText(""+temp.TelHome);
            this.wtel.setText(""+temp.TelWork);
            this.mtel.setText(""+temp.TelMob);
            this.fax.setText(""+temp.Fax);
            this.email.setText(""+temp.Email);
            this.field.setSelectedItem(""+temp.Field);
            displayRank();
            this.rank.setSelectedItem(""+temp.Rank);
            this.sex.setSelectedItem(""+temp.Sex);
            this.age.setText(""+temp.Age);
            this.nationality.setText(""+temp.Nationality);
            this.marital.setSelectedItem(""+temp.MaritalStatus);
            if ("true".equals(""+temp.CarDriver)) {
                this.licence.setEnabled(true);
                this.car.setSelected(true);
            } else {
                this.car.setSelected(false);
                this.licence.setEnabled(false);
            }
            this.licence.setText(""+temp.LicenceNo);
            this.birth.setText(""+temp.BirthPlace);
            this.children.setText(""+temp.NoChildren);
            this.airport.setText(""+temp.Airport);
            this.nokname.setText(""+temp.NoKName);
            this.nokaddline1.setText(""+temp.NoKAddress1);
            this.nokaddline2.setText(""+temp.NoKAddress2);
            this.nokcity.setText(""+temp.NoKCity);
            this.nokzip.setText(""+temp.NoKZip);
            this.noktel.setText(""+temp.NoKTel);
            this.nokatel.setText(""+temp.NoKTelAlt);
            this.nokemail.setText(""+temp.NoKEmail);
     
            listcount = listcount + 1;
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    } else {
        listcount = 0;                                                          //This resets the counter to zero so that there will not be an error when the end of the file is reached. Instead, the first record is displayed again
    }
}//GEN-LAST:event_NextRecordActionPerformed

//This is one of the options in the menubar, it closes the program when the user clicks it or presses the ESC key
private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    System.exit(0);
}//GEN-LAST:event_jMenuItem3ActionPerformed

//This is one of the options in the menubar, it resets all the data entry fields on the form when the user clicks it or presses CTRL+N
private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    newrecord();
}//GEN-LAST:event_jMenuItem5ActionPerformed

//The following method is called by the user when the Delete Record button is clicked, it works by first searching to the record in question and then using that record number as a parameter to call the deleteRecord method
private void DeleteRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteRecordActionPerformed
    int e = Integer.parseInt(
            this.EmpID.getText());
    int a = 0;
    int ID = 0;
    
    try {
        int n = numberofRecords();
        for (int s = 0; s < n; s++) {            
            ID = retrieveEmpID(s);
            if (ID == e) {
                a = s;
                break;
            }            
        }
        int s = a*recordlength;
        deleteRecord(s);
        JOptionPane.showMessageDialog(this, "Record Deleted!");
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error!");
        Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_DeleteRecordActionPerformed

//This method is simply used to make data entry easier, It is often the case that the employee's next of kin is a spouse or parent, which results in them having the same address and other details as the employee. This method copies the data that is entered into the corresponding employee fields into the next of kin fields
private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    this.nokaddline1.setText(this.addline1.getText()+", "+this.addline2.getText());
    this.nokaddline2.setText(this.addline3.getText());
    this.nokcity.setText(this.city.getText());
    this.nokzip.setText(this.zip.getText());
    this.nokatel.setText(this.htel.getText());
}//GEN-LAST:event_jButton8ActionPerformed

private void SearchBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBActionPerformed

    boolean v = typecheck(this.search.getText()); 
    try {
        if (v == true) {
            int a = Integer.parseInt(
                this.search.getText());
            search(a);
        } else {
            String a = this.search.getText();
            search(a);
        }
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error! Incorrect Search Term Entered");
        Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
    }
        
}//GEN-LAST:event_SearchBActionPerformed

private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_searchActionPerformed

//The following method is called when the user clicks the Menu bar item, (Exit to Home Screen). It displays the homescreen
private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    HomeScreen form = new HomeScreen();                     
    form.setVisible(true);
}//GEN-LAST:event_jMenuItem2ActionPerformed

//The following method is called when the user clicks the Menu bar item, (Log Out). It displays the passwordscreen
private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    PasswordScreen form = new PasswordScreen();
    form.setVisible(true);
}//GEN-LAST:event_jMenuItem1ActionPerformed

//This method is activated when the user selects one of the values in the combobox specialty, it enables and disables checkboxes based on the specialty of the seafarer in question
private void specialtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialtyActionPerformed
    if (this.specialty.getSelectedItem() == "Select:") {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(false);
        jCheckBox6.setEnabled(false);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(false);
        jCheckBox13.setEnabled(false);
        jCheckBox14.setEnabled(false);
        jCheckBox15.setEnabled(false);
        jCheckBox16.setEnabled(false);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(false);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(false);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(false);
        jCheckBox33.setEnabled(false);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(false);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(false);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(false);
    }
    if (this.specialty.getSelectedItem() == "Cargo/Bulk") {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(false);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(true);
        jCheckBox32.setEnabled(true);
        jCheckBox33.setEnabled(false);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(false);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(false);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(false);
    }
    if (this.specialty.getSelectedItem() == "Ferry") {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(false);
        jCheckBox4.setEnabled(false);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(false);
        jCheckBox11.setEnabled(false);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(true);
        jCheckBox18.setEnabled(true);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(true);
        jCheckBox21.setEnabled(true);
        jCheckBox22.setEnabled(true);
        jCheckBox23.setEnabled(true);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(true);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(true);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(false);
        jCheckBox33.setEnabled(false);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(false);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(false);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(false);
    }
    if (this.specialty.getSelectedItem() == "RoRo") {
        jCheckBox1.setEnabled(false);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(true);
        jCheckBox33.setEnabled(false);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(false);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(false);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(true);
        jCheckBox51.setEnabled(true);
    }
    if (this.specialty.getSelectedItem() == "Chemical Tanker") {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(false);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(true);
        jCheckBox29.setEnabled(false);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(false);
        jCheckBox33.setEnabled(false);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(false);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(false);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(false);
    }
    if (this.specialty.getSelectedItem() == "Gas Tanker") {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(false);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(false);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(true);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(true);
        jCheckBox33.setEnabled(true);
        jCheckBox34.setEnabled(false);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(true);
        jCheckBox37.setEnabled(true);
        jCheckBox38.setEnabled(true);
        jCheckBox39.setEnabled(true);
        jCheckBox40.setEnabled(true);
        jCheckBox41.setEnabled(true);
        jCheckBox42.setEnabled(true);
        jCheckBox43.setEnabled(true);
        jCheckBox44.setEnabled(true);
        jCheckBox45.setEnabled(true);
        jCheckBox46.setEnabled(true);
        jCheckBox47.setEnabled(true);
        jCheckBox48.setEnabled(true);
        jCheckBox49.setEnabled(true);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(true);
    }    
    if (this.specialty.getSelectedItem() == "Oil Tanker") {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(false);
        jCheckBox9.setEnabled(false);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(false);
        jCheckBox18.setEnabled(false);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(true);
        jCheckBox21.setEnabled(false);
        jCheckBox22.setEnabled(false);
        jCheckBox23.setEnabled(false);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(false);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(false);
        jCheckBox29.setEnabled(true);
        jCheckBox30.setEnabled(false);
        jCheckBox31.setEnabled(false);
        jCheckBox32.setEnabled(true);
        jCheckBox33.setEnabled(true);
        jCheckBox34.setEnabled(true);
        jCheckBox35.setEnabled(false);
        jCheckBox36.setEnabled(true);
        jCheckBox37.setEnabled(false);
        jCheckBox38.setEnabled(true);
        jCheckBox39.setEnabled(false);
        jCheckBox40.setEnabled(false);
        jCheckBox41.setEnabled(false);
        jCheckBox42.setEnabled(false);
        jCheckBox43.setEnabled(false);
        jCheckBox44.setEnabled(false);
        jCheckBox45.setEnabled(false);
        jCheckBox46.setEnabled(false);
        jCheckBox47.setEnabled(false);
        jCheckBox48.setEnabled(false);
        jCheckBox49.setEnabled(false);
        jCheckBox50.setEnabled(false);
        jCheckBox51.setEnabled(true);
    }
    if (this.specialty.getSelectedItem() == "Custom") {
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox4.setEnabled(true);
        jCheckBox5.setEnabled(true);
        jCheckBox6.setEnabled(true);
        jCheckBox7.setEnabled(true);
        jCheckBox8.setEnabled(true);
        jCheckBox9.setEnabled(true);
        jCheckBox10.setEnabled(true);
        jCheckBox11.setEnabled(true);
        jCheckBox12.setEnabled(true);
        jCheckBox13.setEnabled(true);
        jCheckBox14.setEnabled(true);
        jCheckBox15.setEnabled(true);
        jCheckBox16.setEnabled(true);
        jCheckBox17.setEnabled(true);
        jCheckBox18.setEnabled(true);
        jCheckBox19.setEnabled(true);
        jCheckBox20.setEnabled(true);
        jCheckBox21.setEnabled(true);
        jCheckBox22.setEnabled(true);
        jCheckBox23.setEnabled(true);
        jCheckBox24.setEnabled(true);
        jCheckBox26.setEnabled(true);
        jCheckBox27.setEnabled(true);
        jCheckBox28.setEnabled(true);
        jCheckBox29.setEnabled(true);
        jCheckBox30.setEnabled(true);
        jCheckBox31.setEnabled(true);
        jCheckBox32.setEnabled(true);
        jCheckBox33.setEnabled(true);
        jCheckBox34.setEnabled(true);
        jCheckBox35.setEnabled(true);
        jCheckBox36.setEnabled(true);
        jCheckBox37.setEnabled(true);
        jCheckBox38.setEnabled(true);
        jCheckBox39.setEnabled(true);
        jCheckBox40.setEnabled(true);
        jCheckBox41.setEnabled(true);
        jCheckBox42.setEnabled(true);
        jCheckBox43.setEnabled(true);
        jCheckBox44.setEnabled(true);
        jCheckBox45.setEnabled(true);
        jCheckBox46.setEnabled(true);
        jCheckBox47.setEnabled(true);
        jCheckBox48.setEnabled(true);
        jCheckBox49.setEnabled(true);
        jCheckBox50.setEnabled(true);
        jCheckBox51.setEnabled(true);
    }
}//GEN-LAST:event_specialtyActionPerformed

//This method is called when the user clicks the Add Certifications button, it displays the Certifications JFrame
private void AddCertificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCertificationsActionPerformed
    Certifications.setVisible(true);
}//GEN-LAST:event_AddCertificationsActionPerformed

//The following method saves the certifications of a particular employee to the RandomAccessFile it is called when the user clicks the Save button on the Certifications JFrame
private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    int e = Integer.parseInt(
            this.eID.getText());
    int a = 0;
    int ID = 0;
    try {
        int n = numberofRecords();
        for (int s = 0; s < n; s++) {            
            ID = retrieveEmpID(s);
            if (ID == e) {
                a = s;
                break;
            }            
        }
        int s = (a*recordlength)+620;
        writeCert(s);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error!");
        Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
    }         
}//GEN-LAST:event_jButton7ActionPerformed

//This method is activated when the user clicks the next record button, it functions exactly like its counterpart on the main JFrame within the GeneralInfo class. It is used by the user to cycle through the records. It displays the records in ascending order or EmployeeID, this is accomplished by first porting the data from the RandomAccessFile into a LinkedList and using insertion sort to ensure that the data is sorted. This is then displayed in the checkboxes and labels on the screen to allow for editing or deletion of records
private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    resetChecks();                                                              //Here the method clears all the checkboxes so that the only checkboxes that appear true are the ones that are true for the record that is selected by the user
    int a = 0;
    try {
        a = numberofRecords();
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Error!");
        Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (listcount2 < a) {
            try {
                LinkedList GInformation = new LinkedList();                     //This is used to create the linked list GInformation by calling the LinkedList class
                for(int b = 0; b < a; b++){
                    Node x = new Node();
                    x.EmployeeID = retrieveEmpID(b);
                    x.FirstName = retrieveString(b, 6, FirstNameLength);                
                    x.LastName = retrieveString(b, 21, LastNameLength);
                    x.Check1 = retrieveString(b, 620, Check1Length);
                    x.Check2 = retrieveString(b, 626, Check2Length);
                    x.Check3 = retrieveString(b, 632, Check3Length);
                    x.Check4 = retrieveString(b, 638, Check4Length);
                    x.Check5 = retrieveString(b, 644, Check5Length);
                    x.Check6 = retrieveString(b, 650, Check6Length);
                    x.Check7 = retrieveString(b, 656, Check7Length);
                    x.Check8 = retrieveString(b, 662, Check8Length);
                    x.Check9 = retrieveString(b, 668, Check9Length);
                    x.Check10 = retrieveString(b, 674, Check10Length);
                    x.Check11 = retrieveString(b, 680, Check11Length);
                    x.Check12 = retrieveString(b, 686, Check12Length);
                    x.Check13 = retrieveString(b, 692, Check13Length);
                    x.Check14 = retrieveString(b, 698, Check14Length);
                    x.Check15 = retrieveString(b, 704, Check15Length);
                    x.Check16 = retrieveString(b, 710, Check16Length);
                    x.Check17 = retrieveString(b, 716, Check17Length);
                    x.Check18 = retrieveString(b, 722, Check18Length);
                    x.Check19 = retrieveString(b, 728, Check19Length);
                    x.Check20 = retrieveString(b, 734, Check20Length);
                    x.Check21 = retrieveString(b, 740, Check21Length);
                    x.Check22 = retrieveString(b, 746, Check22Length);
                    x.Check23 = retrieveString(b, 752, Check23Length);
                    x.Check24 = retrieveString(b, 758, Check24Length);
                    x.Check25 = retrieveString(b, 764, Check25Length);
                    x.Check26 = retrieveString(b, 770, Check26Length);
                    x.Check27 = retrieveString(b, 776, Check27Length);
                    x.Check28 = retrieveString(b, 782, Check28Length);
                    x.Check29 = retrieveString(b, 788, Check29Length);
                    x.Check30 = retrieveString(b, 794, Check30Length);
                    x.Check31 = retrieveString(b, 800, Check31Length);
                    x.Check32 = retrieveString(b, 806, Check32Length);
                    x.Check33 = retrieveString(b, 812, Check33Length);
                    x.Check34 = retrieveString(b, 818, Check34Length);
                    x.Check35 = retrieveString(b, 824, Check35Length);
                    x.Check36 = retrieveString(b, 830, Check36Length);
                    x.Check37 = retrieveString(b, 836, Check37Length);
                    x.Check38 = retrieveString(b, 842, Check38Length);
                    x.Check39 = retrieveString(b, 848, Check39Length);
                    x.Check40 = retrieveString(b, 854, Check40Length);
                    x.Check41 = retrieveString(b, 860, Check41Length);
                    x.Check42 = retrieveString(b, 866, Check42Length);
                    x.Check43 = retrieveString(b, 872, Check43Length);
                    x.Check44 = retrieveString(b, 878, Check44Length);
                    x.Check45 = retrieveString(b, 884, Check45Length);
                    x.Check46 = retrieveString(b, 890, Check46Length);
                    x.Check47 = retrieveString(b, 896, Check47Length);
                    x.Check48 = retrieveString(b, 902, Check48Length);
                    x.Check49 = retrieveString(b, 908, Check49Length);
                    x.Check50 = retrieveString(b, 914, Check50Length);                    
                    GInformation.addNew(x);                                     //Here the data that was stored within the Node x is added to the linked list
                } 
                Node temp = GInformation.top;
                for (int qwe = 0; qwe < listcount2; qwe++) {                    //This selects the record based on the value of the listcount variable, which is used as a counter for the number of times the user has clicked the next record button. The first time the user clicks it, it will display the first record, the second time, the second, and so on.
                    temp = temp.next;
                }
                this.eID.setText(""+temp.EmployeeID);
                this.namef1.setText(""+temp.FirstName);
                this.namel1.setText(""+temp.LastName);
                if ("true".equals(""+temp.Check1)) {
                    this.jCheckBox17.setSelected(true);
                }
                if ("true".equals(""+temp.Check2)) {
                    this.jCheckBox1.setSelected(true);
                }
                if ("true".equals(""+temp.Check3)) {
                    this.jCheckBox2.setSelected(true);
                }
                if ("true".equals(""+temp.Check4)) {
                    this.jCheckBox18.setSelected(true);
                }
                if ("true".equals(""+temp.Check5)) {
                    this.jCheckBox3.setSelected(true);
                }
                if ("true".equals(""+temp.Check6)) {
                    this.jCheckBox19.setSelected(true);
                }
                if ("true".equals(""+temp.Check7)) {
                    this.jCheckBox36.setSelected(true);
                }
                if ("true".equals(""+temp.Check8)) {
                    this.jCheckBox20.setSelected(true);
                }
                if ("true".equals(""+temp.Check9)) {
                    this.jCheckBox21.setSelected(true);
                }
                if ("true".equals(""+temp.Check10)) {
                    this.jCheckBox4.setSelected(true);
                }
                if ("true".equals(""+temp.Check11)) {
                    this.jCheckBox5.setSelected(true);
                }
                if ("true".equals(""+temp.Check12)) {
                    this.jCheckBox22.setSelected(true);
                }
                if ("true".equals(""+temp.Check13)) {
                    this.jCheckBox37.setSelected(true);
                }
                if ("true".equals(""+temp.Check14)) {
                    this.jCheckBox6.setSelected(true);
                }
                if ("true".equals(""+temp.Check15)) {
                    this.jCheckBox50.setSelected(true);
                }
                if ("true".equals(""+temp.Check16)) {
                    this.jCheckBox38.setSelected(true);
                }
                if ("true".equals(""+temp.Check17)) {
                    this.jCheckBox30.setSelected(true);
                }
                if ("true".equals(""+temp.Check18)) {
                    this.jCheckBox51.setSelected(true);
                }
                if ("true".equals(""+temp.Check19)) {
                    this.jCheckBox39.setSelected(true);
                }
                if ("true".equals(""+temp.Check20)) {
                    this.jCheckBox31.setSelected(true);
                }
                if ("true".equals(""+temp.Check21)) {
                    this.jCheckBox40.setSelected(true);
                }
                if ("true".equals(""+temp.Check22)) {
                    this.jCheckBox8.setSelected(true);
                }
                if ("true".equals(""+temp.Check23)) {
                    this.jCheckBox7.setSelected(true);
                }
                if ("true".equals(""+temp.Check24)) {
                    this.jCheckBox9.setSelected(true);
                }
                if ("true".equals(""+temp.Check25)) {
                    this.jCheckBox41.setSelected(true);
                }
                if ("true".equals(""+temp.Check26)) {
                    this.jCheckBox42.setSelected(true);
                }
                if ("true".equals(""+temp.Check27)) {
                    this.jCheckBox43.setSelected(true);
                }
                if ("true".equals(""+temp.Check28)) {
                    this.jCheckBox10.setSelected(true);
                }
                if ("true".equals(""+temp.Check29)) {
                    this.jCheckBox11.setSelected(true);
                }
                if ("true".equals(""+temp.Check30)) {
                    this.jCheckBox23.setSelected(true);
                }
                if ("true".equals(""+temp.Check31)) {
                    this.jCheckBox12.setSelected(true);
                }
                if ("true".equals(""+temp.Check32)) {
                    this.jCheckBox13.setSelected(true);
                }
                if ("true".equals(""+temp.Check33)) {
                    this.jCheckBox44.setSelected(true);
                }
                if ("true".equals(""+temp.Check34)) {
                    this.jCheckBox26.setSelected(true);
                }
                if ("true".equals(""+temp.Check35)) {
                    this.jCheckBox14.setSelected(true);
                }
                if ("true".equals(""+temp.Check36)) {
                    this.jCheckBox15.setSelected(true);
                }
                if ("true".equals(""+temp.Check37)) {
                    this.jCheckBox16.setSelected(true);
                }
                if ("true".equals(""+temp.Check38)) {
                    this.jCheckBox32.setSelected(true);
                }
                if ("true".equals(""+temp.Check39)) {
                    this.jCheckBox27.setSelected(true);
                }
                if ("true".equals(""+temp.Check40)) {
                    this.jCheckBox28.setSelected(true);
                }
                if ("true".equals(""+temp.Check41)) {
                    this.jCheckBox29.setSelected(true);
                }
                if ("true".equals(""+temp.Check42)) {
                    this.jCheckBox24.setSelected(true);
                }
                if ("true".equals(""+temp.Check43)) {
                    this.jCheckBox45.setSelected(true);
                }
                if ("true".equals(""+temp.Check44)) {
                    this.jCheckBox33.setSelected(true);
                }
                if ("true".equals(""+temp.Check45)) {
                    this.jCheckBox35.setSelected(true);
                }
                if ("true".equals(""+temp.Check46)) {
                    this.jCheckBox46.setSelected(true);
                }
                if ("true".equals(""+temp.Check47)) {
                    this.jCheckBox47.setSelected(true);
                }
                if ("true".equals(""+temp.Check48)) {
                    this.jCheckBox34.setSelected(true);
                }
                if ("true".equals(""+temp.Check49)) {
                    this.jCheckBox48.setSelected(true);
                }
                if ("true".equals(""+temp.Check50)) {
                    this.jCheckBox49.setSelected(true);
                }
                listcount2 = listcount2 + 1;
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error!");
                Logger.getLogger(GeneralInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            listcount2 = 0;                                                     //This resets the counter to zero so that there will not be an error when the end of the file is reached. Instead, the first record is displayed again
        }    
}//GEN-LAST:event_jButton9ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    GeneralInfo form = new GeneralInfo();                     
    form.setVisible(true);    
}//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {       
        
        try {                                                                   // Set the Nimbus look and feel
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GeneralInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCertifications;
    private javax.swing.JFrame Certifications;
    private javax.swing.JButton DeleteRecord;
    private javax.swing.JTextField EmpID;
    private javax.swing.JButton NextRecord;
    private javax.swing.JButton SaveEdits;
    private javax.swing.JButton SaveRecord;
    private javax.swing.JButton SearchB;
    private javax.swing.JTextField addline1;
    private javax.swing.JTextField addline2;
    private javax.swing.JTextField addline3;
    private javax.swing.JTextField age;
    private javax.swing.JTextField airport;
    private javax.swing.JTextField birth;
    private javax.swing.JCheckBox car;
    private javax.swing.JTextField children;
    private javax.swing.JTextField city;
    private javax.swing.JLabel eID;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fax;
    private javax.swing.JComboBox field;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField htel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox30;
    private javax.swing.JCheckBox jCheckBox31;
    private javax.swing.JCheckBox jCheckBox32;
    private javax.swing.JCheckBox jCheckBox33;
    private javax.swing.JCheckBox jCheckBox34;
    private javax.swing.JCheckBox jCheckBox35;
    private javax.swing.JCheckBox jCheckBox36;
    private javax.swing.JCheckBox jCheckBox37;
    private javax.swing.JCheckBox jCheckBox38;
    private javax.swing.JCheckBox jCheckBox39;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox40;
    private javax.swing.JCheckBox jCheckBox41;
    private javax.swing.JCheckBox jCheckBox42;
    private javax.swing.JCheckBox jCheckBox43;
    private javax.swing.JCheckBox jCheckBox44;
    private javax.swing.JCheckBox jCheckBox45;
    private javax.swing.JCheckBox jCheckBox46;
    private javax.swing.JCheckBox jCheckBox47;
    private javax.swing.JCheckBox jCheckBox48;
    private javax.swing.JCheckBox jCheckBox49;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox50;
    private javax.swing.JCheckBox jCheckBox51;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JTextField licence;
    private javax.swing.JTextField lname;
    private javax.swing.JComboBox marital;
    private javax.swing.JTextField mtel;
    private javax.swing.JLabel namef1;
    private javax.swing.JLabel namel1;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField nokaddline1;
    private javax.swing.JTextField nokaddline2;
    private javax.swing.JTextField nokatel;
    private javax.swing.JTextField nokcity;
    private javax.swing.JTextField nokemail;
    private javax.swing.JTextField nokname;
    private javax.swing.JTextField noktel;
    private javax.swing.JTextField nokzip;
    private javax.swing.JComboBox rank;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox sex;
    private javax.swing.JComboBox specialty;
    private javax.swing.JTextField wtel;
    private javax.swing.JTextField zip;
    // End of variables declaration//GEN-END:variables
}