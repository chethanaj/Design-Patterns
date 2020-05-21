public class Application {

    public static void main(String[] args) {

        CareTaker careTaker=new CareTaker();
        Company company=new Company();

        company.addEmployee(new Employee("Saman"));
        company.addEmployee(new Employee("Nimal"));

        careTaker.save(company);
        System.out.println(company);

        company.addEmployee(new Employee("Kamal"));
        careTaker.save(company);
        System.out.println(company);

        company.addEmployee(new Employee("Shantha"));
        careTaker.save(company);
        System.out.println(company);

        company.addEmployee(new Employee("Aruna"));
        //careTaker.save(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);

        company.addEmployee(new Employee("Sahan"));
       // careTaker.save(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);

        careTaker.revert(company);
        System.out.println(company);
    }
}
