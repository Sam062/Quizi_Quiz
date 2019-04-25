/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizi_quiz;

/**
 *
 * @author SAM
 */
class User1 {
    private int ID;
    private String username,first_name,middle_name,last_name,email,contact_no,gender,DOB,country,address;
    
    public User1(int ID,String username,String first_name,String middle_name,String last_name,String email,String contact_no,String gender,String DOB,String country,String address){
        this.ID=ID;
        this.username=username;
        this.first_name=first_name;
        this.middle_name=middle_name;
        this.last_name=last_name;
        this.email=email;
        this.contact_no=contact_no;
        this.gender=gender;
        this.DOB=DOB;
        this.country=country;
        this.address=address;

    }

    
    
    public int getID(){
        return ID;
    }
    public String getusername(){
        return username;
    }
    public String getfirst_name(){
        return first_name;
    }
    public String getmiddle_name(){
        return middle_name;
    }
    public String getlast_name(){
        return last_name;
    }
    public String getemail(){
        return email;
    }
    public String getcontact_no(){
        return contact_no;
    }
    public String getgender(){
        return gender;
    }
    public String getDOB(){
        return DOB;
    }
    public String getcountry(){
        return country;
    }
    public String getaddress(){
        return address;
    }

    Object getString(String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
