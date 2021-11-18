import com.example.erp.util.HibernateSessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Application {

    public static void main(String[] args) {
        oneWay();
        anotherWay();

        System.out.println("done");
    }

    private static void oneWay() {

        System.out.println("One Way");
        try (Session session = HibernateSessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            //session.save(course);
            transaction.commit();
            System.out.println("Yaayee");
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            System.out.println("Nawwwwww");
        }

    }

    private static void anotherWay() {

        System.out.println("Another Way");
        Session session = HibernateSessionUtil.getSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        //session.save(emp);
        //Commit transaction
        session.getTransaction().commit();
        //System.out.println("Employee ID="+emp.getId());

        //terminate session factory, otherwise program won't end
        HibernateSessionUtil.getSession().close();
    }
}
