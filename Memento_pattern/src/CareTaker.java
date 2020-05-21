import java.util.Stack;

public class CareTaker {

    Stack<Company.CompanyMomento> companyHistory=new Stack<>();

    public void save(Company company){
        companyHistory.push(company.save());
    }

    public void revert(Company company){

        if(!companyHistory.isEmpty()){
            company.getBeforeEmployees(companyHistory.pop());
        }else
            System.out.println("Cannot get previous employees");
    }
}
