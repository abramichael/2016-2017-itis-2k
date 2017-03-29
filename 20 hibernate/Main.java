import models.Group;
import models.Student;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.hibernate.cfg.Configuration;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;

import java.util.Map;

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

    public static void example1(Session session) {
        Group g = (Group) session
                .createQuery("from Group where name = '11-501'")
                .list()
                .get(0);

        Student s1 = new Student();
        s1.setName("Leisan");
        s1.setGroup(g);
        Student s2 = new Student();
        s2.setName("Anton");
        s2.setGroup(g);
        session.save(s1);
        session.save(s2);
    }

    public static void example2(Session session) {
        Group g = (Group) session
                .createQuery("from Group where name = '11-501'")
                .list()
                .get(0);

        System.out.println(g.getStudents());
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();

        /*
        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery<Student> cq = cb.createQuery(Student.class);
        Root<Student> root = cq.from(Student.class);
        cq.where(cb.equal(root.get(Student)))
        //cq = cq.select(Restrictions.eq("name", "Slava"));
        Query<Student> q = session.createQuery(cq);
        */

        Criteria c = session.createCriteria(Student.class);
        c = c.add(Restrictions.eq("name", "Slava"));
        Student s = (Student) c.list().get(0);
        System.out.println(s.getName());
        Criteria c2 = session.createCriteria(Group.class);
        c2 = c2.add(Restrictions.eq("name", "11-502"));
        Group g = (Group) c2.list().get(0);
        System.out.println(g.getName());
        session.beginTransaction();
        s.setGroup(g);
        session.save(s);
        session.getTransaction().commit();
        session.close();




    }
}