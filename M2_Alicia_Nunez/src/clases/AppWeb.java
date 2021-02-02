package clases;


public class AppWeb extends AppSoftware {
 
   private String frontEnd;
   private String backEnd;
 

   public AppWeb(String Y, String Z) {
         super();
        this.frontEnd = Y;
        this.backEnd = Z;
        
    }

    @Override
    public void tech() {
        // concat string 
        String info="Programming language :".concat(super.getLanguage())+"\n frontend framework : ".concat(frontEnd)+"\n backend framework is :".concat(backEnd);
        System.out.println(info);
      
      
    }

    @Override
    public String toString() {
        return "AppWeb{" + "frontEnd=" + frontEnd + ", backEnd=" + backEnd + '}';
    }
    
    
    
           
   
   
}

