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
// output -> Name: null age: 0



/////////////////////////////////////////////////////////////
// with this keyword
class Demo{
      int age;
      String name;
      Demo(int age, String name){
          this.age = age;
          this.name = name;
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
// output -> Name: Samir age: 22