import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<EmployeeType,Employee> employees=new HashMap<>();

    public Registry() {
        this.initialize();
    }

    private void initialize(){

        Regular regular=new Regular();
        regular.setId(100);
        regular.setName("Mark");
        regular.setBonus(5000);
        regular.setSalary(10000);

        Contract contract=new Contract();
        contract.setId(101);
        contract.setName("Andy");
        contract.setPayForHour(1000);
        contract.setContractPeriod("1 year");

        employees.put(EmployeeType.REGULAR_EMPLOYEE,regular);
        employees.put(EmployeeType.CONTRACT_EMPLOYEE,contract);

    }

    public Employee getEmployee(EmployeeType employeeType){

        Employee employee=null;

        try {
             employee = (Employee) employees.get(employeeType).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return employee;
    }
}
