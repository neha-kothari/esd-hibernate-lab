import com.example.erp.bean.Departments;
import com.example.erp.bean.Employees;
import com.example.erp.dao.impl.DepartmentDaoImpl;
import com.example.erp.dao.impl.EmployeesDaoImpl;
import com.example.erp.util.HibernateSessionUtil;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {

    public static void main(String[] args) {
//        oneWay();
        anotherWay();

        System.out.println("done");
    }

//    private static void oneWay() {
//
//        System.out.println("One Way");
//        try (Session session = HibernateSessionUtil.getSession()) {
//            Transaction transaction = session.beginTransaction();
//            //session.save(course);
//            transaction.commit();
//            System.out.println("Yaayee");
//        } catch (HibernateException exception) {
//            System.out.print(exception.getLocalizedMessage());
//            System.out.println("Nawwwwww");
//        }
//
//    }

    private static void anotherWay() {

//        System.out.println("Another Way");
//        Session session = HibernateSessionUtil.getSession();
//        //start transaction
//        session.beginTransaction();
//        //Save the Model object
//        //session.save(emp);
//        //Commit transaction
//        session.getTransaction().commit();
//        //System.out.println("Employee ID="+emp.getId());
//
//        //terminate session factory, otherwise program won't end
//        HibernateSessionUtil.getSession().close();

        DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();
        Departments dep1 = new Departments();
        dep1.setDept_id(1);
        dep1.setName("TA");
        dep1.setAddress("Bangalore");
        departmentDao.addDepartment(dep1);

        EmployeesDaoImpl employeesDao = new EmployeesDaoImpl();
        Employees emp1 = new Employees();
        Employees emp2 = new Employees();
        emp2.setEmp_id(2);
        emp1.setEmp_id(1);
        emp1.setName("meghna");
        emp2.setName("neha");
        emp1.setDob("30-10-98");
        emp2.setDob("999999");
        emp1.setDepartments(dep1);
        emp2.setDepartments(dep1);
        employeesDao.addEmployee(emp1);
        employeesDao.addEmployee(emp2);


    }
}
