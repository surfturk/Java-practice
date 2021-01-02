public class main {

    public static void main(String[] args) {
        // var is static in java, can't change
//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text);
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);

        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);

    }

    public static int calculateWage (
            int baseSalary,
            int extraHours,
            int hourlyRate
    ) {
        return baseSalary + extraHours * hourlyRate;
    }
}
