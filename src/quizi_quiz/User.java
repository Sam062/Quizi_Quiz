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
class User {
    private int ID;
    private String Question,OptionA,OptionB,OptionC,OptionD,Answer;
    
    public User(int ID,String Question,String OptionA,String OptionB,String OptionC,String OptionD,String Answer){
        this.ID=ID;
        this.Question=Question;
        this.OptionA=OptionA;
        this.OptionB=OptionB;
        this.OptionC=OptionC;
        this.OptionD=OptionD;
        this.Answer=Answer;

    }
    
    public int getID(){
        return ID;
    }
    public String getQuestion(){
        return Question;
    }
    public String getOptionA(){
        return OptionA;
    }
    public String getOptionB(){
        return OptionB;
    }
    public String getOptionC(){
        return OptionC;
    }
    public String getOptionD(){
        return OptionD;
    }
    public String getAnswer(){
        return Answer;
    }
 

    Object getString(String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
