package com.cc.java;

public class Tomcat {
    
    private String name;
    private String furColor;
    private int age;
<<<<<<< HEAD
  
=======
    

    private int counter;

>>>>>>> d2f5897ebc2ab355f9877918379ee2a01b77bb95
    public Tomcat(String name, String furColor, int age) {
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
        return Integer.toString(age); 
    }


}
=======
        return Integer.toString(age);
    }


        

>>>>>>> d2f5897ebc2ab355f9877918379ee2a01b77bb95
