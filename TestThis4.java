class Student{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+course+" "+fee);
}
}
class TestThis4{
public static void main(String args[])
{
Student s1=new Student(111,"Ammu","ainds",40000f);
Student s2=new Student(222,"bujji","cse",60000f);
s2.rollno=s1.rollno;
s2.name=s1.name;
s1.display();
s2.display();
}
}