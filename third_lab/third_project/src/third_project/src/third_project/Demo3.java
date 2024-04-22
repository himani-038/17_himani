package third_project;
public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
  
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }   
    public double calculateSalary() {
        return salary;
    }
    
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public static void Demo3(String[] args) {
        
        Employee emp = new Employee("John Doe", "Software Engineer", 50000);

      
        System.out.println("Initial Salary: $" + emp.getSalary());

        emp.updateSalary(55000);

        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}