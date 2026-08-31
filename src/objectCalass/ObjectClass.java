package objectCalass;

public final class ObjectClass {
 private final String name;
 private final int id;

 public ObjectClass(String name,int id){
     this.id = id;
     this.name = name;
 }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}
