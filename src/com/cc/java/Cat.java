package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    private int counter;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
<<<<<<< HEAD
=======
       
        
>>>>>>> d2f5897ebc2ab355f9877918379ee2a01b77bb95
    }

    public String getStringAttributes(String flag){
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!?";
        }  
    }

    public String getAge(){
<<<<<<< HEAD
        return checkEscalationLevel();
    }
=======
  return checkEscalationLevel();
        }   
    
>>>>>>> d2f5897ebc2ab355f9877918379ee2a01b77bb95

    private String checkEscalationLevel(){

        counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; 
            case 2:
                return "I've told you once!"; 
            case 3:
                return "Talk to the hand!"; 
            default:
                return "1#!?&&%"; 
        } 
    }

}
