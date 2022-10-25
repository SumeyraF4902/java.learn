package SalaryCalculation;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("Drake",20000,41,2020);
        System.out.println( "Name: "+employee.name);
        System.out.println("Maaş: "+employee.salary);
        System.out.println(" Ödenecek vergi: "+employee.tax()+ "tl");
        System.out.println("Ödenecek bonus: "+employee.bonus()+ "tl");
        System.out.println("Maaş artışı : " +employee.raiseSalary()+ "tl");
        System.out.println("Toplam Ödenecek  Ücret: " +((employee.salary)+(employee.raiseSalary())));

        System.out.println(employee.toString());

    }
}
