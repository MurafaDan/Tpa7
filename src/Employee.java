public class Employee {

    private String name;
    private int age;
    private String department=" ";


        public String getDepartment () {
            return department;
        }

        public void setDepartment (String department){
            if(department.equals("administrare")  || department.equals("resurse umane") ||
                    department.equals("contabilitate") || department.equals("marketing")||
                department.equals("production")) {
                this.department=department;
            }
            else {
                System.out.println("Nu exista asa departament(administrare , resurse umane , contabilitate , marketing , production)");
                }

        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            if(age<18) {
                System.out.println("Nu putem angaja Miori!!");
            }
                else {
                    this.age=age;
            }

        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }
public void printInfo(){
    System.out.println(" Name: " +getName());
    System.out.println(" Age: " +getAge());
    System.out.println(" Department "+getDepartment());
}

    }

