public class FullTimeEmployee extends Employee{
    private float percentage;
    private float pfamount;
    
    
    public float getPercentage() {
        return percentage;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public float getPfamount(float percentage, float salary) {
        pfamount = (salary * percentage)/100;
        return pfamount;
    }
    public void setPfamount(float pfamount) {
        this.pfamount = pfamount;
    }


    public double calculateNetSalary(float percentage, float salary){
        pfamount = (salary * percentage)/100;
        salary = salary - pfamount;
        return salary;
       
    }

    public boolean validateInput(float percentage, float salary){
        if(percentage >= 0 && salary > 0){
            return true;
        }
        return false;
    }


    
}
