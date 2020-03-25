package DimaSuvorov;

public class Family {
     private String name;
     private int age;
     private String status;

     public Family(String name, String status, int age){
         this.name = name;
         this.status = status;
         this.age = age;

     }

    @Override
    public String toString() {
        return 
               "name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status;
    }
}
