package constructors;

public class Student {
    String name;
    String address;
    String email;
    String batch;
    double psp;
    String state;
    int age;

    Student(String name , String address)  { //parameterized constructor
        this.name = name;
        this.address = address;
    }

    Student(String name){
        this.name = name;
        this.address = "Scalerverse";
    }

    Student(Student other){ //copy constructor
        name = other.name;
        address = other.address;
        batch = other.batch;
        email = other.email;
        psp = other.psp;
        state = other.state;
    }

    void changeBatch(String newBatch){
        this.batch = newBatch;
    }

    void pauseCourse(){
        this.state = "PAUSED";
    }

    void Roop(){
        System.out.println("Roop");
    }
}
