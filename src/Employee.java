public class Employee {

    private String name;
    private float salary;
    private String address;
    private int id;
    private float netSalary;

    


    public Employee(String name, float salary, String address, int id, float netSalary) {
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.id = id;
        this.netSalary = netSalary;
    }

    
    public Employee() {
        
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(float netSalary) {
        this.netSalary = netSalary;
    }


    @Override
    public String toString() {
        return "address=" + address + ", id=" + id + ", name=" + name + ", netSalary=" + netSalary
                + ", salary=" + salary;
    }


    
    
    
}
