public class main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        employee.getBaseSalary();
        int wage = employee.calculateWage(10);
        System.out.println(wage);

    }

}
