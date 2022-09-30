// without this keyword
class Demo{
      int age;
      String name;
      Demo(int age, String name){
          age = age;
          name = name;
      }
      public void display(){
          System.out.println("Name: "+name+" age: "+age);
      }
}

public class Main {
    public static void main(String args[]){
     Demo mc = new Demo(22,"Samir");
     mc.display();
    }
}

