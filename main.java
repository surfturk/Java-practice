public class main {

    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        //browser object
        var browser = new Browser();
        browser.navigate("google.com");

    }

}
