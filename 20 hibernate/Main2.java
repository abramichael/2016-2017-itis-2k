import models.Group;
import models.Group_;
import models.Student;
import models.Student_;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.*;
import java.util.List;

/**
 * Created by ma on 23.03.2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void q1() {
        final Session session = getSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);

        Predicate p = cb.equal(root.get(Student_.name), "Anton");

        cq.where(p);

        System.out.println(session.createQuery(cq).getResultList());

    }

    public static void q2() {
        final Session session = getSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        Root<Student> root = cq.from(Student.class);
        cq.select(root.get(Student_.id));
        Predicate p = cb.equal(root.get(Student_.name), "Anton");
        cq.where(p);
        System.out.println(session.createQuery(cq).getResultList());


    }

    public static void main(final String[] args) throws Exception {


        final Session session = getSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        Join<Student, Group> join = root.join(Student_.group);
        cq.where(cb.equal(join.get(Group_.name), "11-501"));
        System.out.println(session.createQuery(cq).getResultList());
    }
}