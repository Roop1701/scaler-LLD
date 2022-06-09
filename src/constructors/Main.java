package constructors;

public class Main {
    public static void main (String[] args){
        Student Roop = new Student("Roop" , "70/1 Tarun Sen Pally");
        Student Sid = new Student("Sid");
        Roop.state = "ACTIVE";
        Roop.age = 21;
        //Roop.address = "Kolkata - 700079";
        Roop.pauseCourse();
        System.out.println(Roop.address);
        System.out.println(Sid.address);
        Student Roopcopy = new Student(Roop);
        System.out.println("Random");
        //dsf

        System.out.println("------------Constructor Copy Same Values---------");
        System.out.println(Roop.name);
        Roopcopy.name = "Sid changed";
        System.out.println("Prinitng Original name -> " + Roop.name);
        System.out.println("Printing copy name -> "+ Roopcopy.name);
        Roopcopy.age = 78;
        System.out.println(Roop.age);


    }
}
