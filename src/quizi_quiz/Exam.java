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
class Exam {
    private String Question,OptionA,OptionB,OptionC,OptionD;
    
    public Exam(String OptionA,String OptionB,String OptionC,String OptionD){
        this.Question=Question;
        this.OptionA=OptionA;
        this.OptionB=OptionB;
        this.OptionC=OptionC;
        this.OptionD=OptionD;
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

    
    public Exam(String Question){
        this.Question=Question;
    }
    
    public String getQuestion(){
        return Question;
    }


    Object getString(String question) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

