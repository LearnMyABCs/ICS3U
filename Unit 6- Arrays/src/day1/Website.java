package day1;

public class Website {

      //attributes, instance variables

      private String name;
      private String url;
      private boolean active;
  
      //methods - construcors, mutators, accessors 
  
      //constructor- no static modifier, no return types, same class name
      public Website (){
          name = "";
          url = "";
          active = false;
      }
  
      public Website (String name, String url, boolean active){
          this.name = name;
          this.url = url;
          this.active = active;
      }

      //accessors
      public String getName(){
        return name;
      }

      public String getUrl(){
        return url;
      }

      public boolean getStatus(){
        return active;
      }
      
      //mutators

      public void setUrl(String newUrl){
        url = newUrl;
      }

      public void toggleStatus(){
        active = !active;
      }
}
