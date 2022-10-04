public class Employee {
    String name;
    double salary;

    public Employee(String employeeName, double currentSalary) {
        name = employeeName;
        salary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        salary = salary + salary * byPercent / 100;
    }


// to test Employee class
        public static void main(String[] args) {
            Employee eyad = new Employee("Eyad ayman", 5000);
            System.out.println("Employee Name: " + eyad.getName());
            System.out.println("Employee Salary: " + eyad.getSalary());
            eyad.raiseSalary(10);
            System.out.println("Reise Salary: " + eyad.getSalary());

        }
    }







