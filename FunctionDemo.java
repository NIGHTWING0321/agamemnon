class Calculator {

    int add(int a, int b){
        return a+b;
    }

       
int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }


}
    class Student{
        String name;
        int age;
      

        Student(){
            name="unknown";
            age=0;}

            Student(String n, int a){
                name =n;
                age=a;
            }

        Student(Student s){
            this.name=s.name;
            this.age=s.age;
        }
    void display(){
        System.out.println("Name:"+name+" Age:"+age);
    }
    
    Student getStudent(){
        
        return this;
    
    }
    }

    public class FunctionDemo {
        public static void main(String[] args) {
            Calculator c = new Calculator();
            System.out.println("add two integers:" + c.add(10, 20));
            System.out.println("add three integers:" + c.add(10, 20, 30));
            System.out.println("add two doubles:" + c.add(10.5, 20.5));

            Student s1 = new Student();
            Student s2 = new Student("mavrick", 20);
            Student s3 = new Student(s2); 
            
            s1.display();
            s2.display();
            s3.display();

            Student s4 = s2.getStudent();
            System.out.println("Student s4 details(referece to s2):" );
           s4.display();
           
        
        }
    }
    
    
