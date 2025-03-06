import java.util.*;

class student{
    Integer id;
    String name;
    Integer age;
    Set<String> courses;

    public student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
        courses = new HashSet<>();
    }
    public String addCourse(String course){
        if(!courses.contains(course)){
            courses.add(course);
            return "succesfully added";
        }
        return "error";
    }
    public String deleteCourse(String coursename){
        if(courses.contains(coursename)){
            courses.remove(coursename);
            return "succesfully removed";
        }
        return coursename + "  did't find";
    }
    public void update(String name){
        this.name=name;
        System.out.println("successfully update name");
    }
    public void update(Integer id){
        this.id=id;
        System.out.println("successfully update id");
    }

    public String getInfo(){
        return id+" " + name + " " +age + " "+"\n---------------------------------\n" +courses;
    }
    public boolean checkCourse(String coursename) {
        if (courses.contains(coursename)) {
            return true;
        }
        return false;
    }
}

class StudentManager{
    HashMap<String,Set<student>> coursesStud= new HashMap<>();
    TreeSet<String> sortStudents;
    HashMap<Integer, student> students ;
    public StudentManager(){
        sortStudents =new TreeSet<>();
        students = new HashMap<>();
    }
    public void addNewStudent (Integer id, String name, Integer age){
        if(!students.containsKey(id)){
            student s=new student(id,name,age);
            students.put(id,s);
            System.out.println("Successfully added");
            sortStudents.add(name);

        }
        else{
            System.out.println("error");
        }
    }
    public void removeStudent(Integer id) {
        if (students.containsKey(id)) {
            students.remove(id);
            System.out.println("successfully   removed");
        }
    }
    public void updateStudentDetails(Integer id,String s){
        if(students.containsKey(id)){
            students.get(id).update(s);
        }
    }
    public void updateStudentCourse(Integer id,String b,boolean isAdd){
        if(isAdd){if(students.containsKey(id)){
            String res = students.get(id).addCourse(b);
            System.out.println(res);
            boolean add = coursesStud.get(b).add(students.get(id));

        }
        else{
            if(students.containsKey(id)){
                String res = students.get(id).deleteCourse(b);
                System.out.println(res);
            }
        }
        }
    }
    public StringBuilder DisplayAllStudents(){
        StringBuilder studs = new StringBuilder("");
        for(Map.Entry<Integer,student> item: students.entrySet()){
            studs.append(",").append(item.getValue().name);
        }
        return studs;
    }
    public StringBuilder listOfStudentsInCourse(String course){
        StringBuilder studs = new StringBuilder("");
        for(Map.Entry<Integer,student> item: students.entrySet()){
            if(item.getValue().checkCourse(course)){
                studs.append(item.getValue().name);
            }
        }
        return studs;
    }
    public void sorted(){
        System.out.println(sortStudents);
    }
    public void findStudWithCourse(String coursename){
        if(coursesStud.containsKey(coursename)){
            System.out.println(coursesStud.get(coursename));
        }
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        StudentManager manager =new StudentManager();
        manager.addNewStudent(0,"Alymbek",17);
        manager.addNewStudent(1,"Daniyar",20);
        manager.updateStudentCourse(0,"JS",true);
        manager.updateStudentCourse(1,"PL",true);
        System.out.println(manager.DisplayAllStudents());
        System.out.println(manager.listOfStudentsInCourse("JS"));
        manager.removeStudent(0);
        System.out.println(manager.DisplayAllStudents());
        manager.findStudWithCourse("JS");
    }
}

