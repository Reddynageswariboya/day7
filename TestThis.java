//this:to refer current class instance variable
class Student{
int rollno;
String name;
float fee;
Student(int i,String name,float fee){
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
System.out.println(rollno+" "+name+" "+fee);
}
}
class TestThis{
public static void main(String args[])
{
Student s1=new Student(111,"Ammu",40000f);
Student s2=new Student(222,"bujji",60000f);
s2.rollno=s1.rollno;
s2.name=s1.name;
s1.display();
s2.display();
}
}
.