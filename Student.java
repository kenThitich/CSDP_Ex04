public class Student {
  private String name;
  private String university;

  // optional information
  private int age = 0;

  public Student(StudentBuilder studentBuilder) {
    this.name = studentBuilder.name;
    this.university = studentBuilder.university;
    this.age = studentBuilder.age;
  } 

  public static class StudentBuilder {
    private String name;
    private String university;

    // optional information
    private int age = 0;

    public StudentBuilder(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public StudentBuilder addAge(int age) {
      this.age = age;
      return this;
    }

    public Student build()
    {
      return new Student(this);
    }
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("name: " + name + "\n");
    sb.append("university: " + university + "\n");
    if (this.age != 0) {
      sb.append("age: " + age + "\n");
    }
    return sb.toString();
  }
  
}