public class Application {

    public static void main(String[] args) {

        Registry registry=new Registry();

        Contract contractEmployee=(Contract)registry.getEmployee(EmployeeType.CONTRACT_EMPLOYEE);
        System.out.println(contractEmployee);

        contractEmployee.setContractPeriod("2 years");
        System.out.println(contractEmployee);

        Contract contractEmployee2=(Contract)registry.getEmployee(EmployeeType.CONTRACT_EMPLOYEE);
        System.out.println(contractEmployee2);


    }
}
