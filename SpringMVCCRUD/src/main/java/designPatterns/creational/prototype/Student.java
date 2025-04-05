package designPatterns.creational.prototype;

public class Student {
    private int usn;
    private String name;
    private String college;
    //this constructor is used to construct  prototype(1st object)
    public Student(){
        //assume that constructor is fetching  attribute values from database/file
        this.usn=100;
        this.name="asha";
        this.college="CIT";
    }
    //this constructor is used by clone method
    public Student(int usn,String name,String college){
        this.usn=usn;
        this.name=name;
        this.college=college;
    }
    //creates a new object by copying fields of object to be cloned and returns cloned object
    public Student clone() {
        Student copy=new Student(this.usn,this.name,this.college);
        return copy;
    }

    public int getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }
}
