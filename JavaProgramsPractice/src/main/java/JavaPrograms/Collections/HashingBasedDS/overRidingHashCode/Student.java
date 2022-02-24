package JavaPrograms.Collections.HashingBasedDS.overRidingHashCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Student implements Comparable<Student> {

    String name;
    String id;
    Student(String name,String id) {
        this.name = name;
        this.id = id;
    }

    public int compareTo(Student s) {
        if (this.name.compareTo(s.name) > 0) {
            return 1;
        } else if (this.name.compareTo(s.name) < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("SHubham", "1"));
        studentList.add(new Student("Ankit", "2"));
        Collections.sort(studentList);
        studentList.stream().forEach(x -> System.out.println(x.name));
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student("Shubham","2"),"1");
        map.put(new Student("Shubham","3"),"3");
        map.forEach((a,b)-> System.out.println(a.name + a.id + b));
    }

    @Override
    public boolean equals(Object o) {

        Student student = (Student) o;
        if(student.name.equals(this.name) && student.id.equals(this.id)){
            return true;
        }
        return  false;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
/*
public boolean equals(Object o){

if(null!= o && null!=this.name && o isInstanceOf student){
	if(this.name.equals((studnet (o)).name) && this.id.equals(student(o).id)){
  		return true;
	}
else{
  return false;		
}

}
*/

