public class Staff {
    private String department;
    private String name;
    private int salary;

    public Staff(String department, String name) {
        this.department = department;
        this.name = name;
    }
    public Staff(String department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return this.salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Staff("//
        + "dept= " + this.department
        + ", name = "+this.name
        +")";
    }

}
