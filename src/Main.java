public class Main {
    public static void main(String[] args) {
        System.out.println("Ex1----------------------------------------------");
    Employee employee1 = new Employee();
    employee1.setName("Tolik");
    employee1.setAge(17);
    employee1.setDepartment("maturator");

//        System.out.println(employee1.getName());
//        System.out.println(employee1.getAge());
//        System.out.println(employee1.getDepartment());


    Employee employee2 = new Employee();
    employee2.setName("Ilie");
    employee2.setAge(24);
    employee2.setDepartment("administrare");
//        System.out.println(employee2.getName());
//        System.out.println(employee2.getAge());
//        System.out.println(employee2.getDepartment());

        System.out.println("Informatie despre Angajat NR1:");
employee1.printInfo();
        System.out.println();
        System.out.println("Informatie despre Angajat NR2:");
        employee2.printInfo();

        System.out.println("Ex2----------------------------------------------");

      Invoice invoice1 = new Invoice();

      invoice1.setDescriereaProdusului("Electrocasnica");
      invoice1.setModelulDispozitivului("Microunda");
      invoice1.setCantitate(6);
      invoice1.setPrice(5555d);

invoice1.getAmount();
    }
}