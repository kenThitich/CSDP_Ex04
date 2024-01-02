public class StudentApp {
    public static void main(String[] args) {
        Student jakkrit = new Student.StudentBuilder("jakkrit","Kmitl")
            .build();
        Student Kittanapon = new Student.StudentBuilder("Kittanapon","Kmitl")
            .addAge(22)
            .build();    
        System.out.println(jakkrit);
        System.out.println(Kittanapon);
    }
    
}