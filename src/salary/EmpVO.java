package salary;

public class EmpVO {
    private String name;
    private int salary;
    private String department;

    public EmpVO() {}

    public EmpVO(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmpVO [이름=" + name  + ", 연봉=" + salary + ", 부서=" + department + "]";
    }
}