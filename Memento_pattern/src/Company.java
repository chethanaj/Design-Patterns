import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees=new ArrayList<>();

    public void addEmployee(Employee employee){
        employees.add(employee);
    }


    public ArrayList<Employee> getEmployees() {
        return (ArrayList)employees.clone();
    }

    public CompanyMomento save(){
        return new CompanyMomento(getEmployees());
    }

    public void getBeforeEmployees(CompanyMomento companyMomento){

        employees=companyMomento.getEmployees();
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }

    static class CompanyMomento{

        ArrayList<Employee> employees;

        public CompanyMomento(ArrayList<Employee> employees) {
            this.employees = employees;
        }

        private ArrayList<Employee> getEmployees() {
            return employees;
        }
    }
}
