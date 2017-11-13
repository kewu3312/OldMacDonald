class Pig implements Animal {     
     private String myType;     
     private String quack;      
     public Pig(String type, String sound)     {         
         myType = type;         
         quack = sound;     
     }     
     public Pig()     {         
         myType = "unknown";         
         quack = "unknown";     
     }      
     public String getSound(){return quack;}     
     public String getType(){return myType;} 
}
