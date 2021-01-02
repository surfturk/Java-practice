public class Employee {
 private int baseSalary;
 public int hourlyRate;

 public int calculateWage(int extraHours) {
     return baseSalary + (hourlyRate * extraHours);
 }

 public void setBaseSalary(int baseSalary) {
     if (baseSalary <= 0)
         throw new IllegalArgumentException("Salary can not be 0 or less.");
         this.baseSalary = baseSalary;
 }



}

