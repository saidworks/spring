package tutorial.hibernate.luv2code;

import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */

import com.luv2code.dao.StudentDaoImp;
import com.luv2code.models.Student;
public class App 
{
    public static void main( String[] args )
    {
		StudentDaoImp db = new StudentDaoImp();
//		Student s = new Student("Said", "Super", "saidjunks@gmail.com");
//		db.add(s);
//		Student n = new Student("Said", "SLow", "saidjunks@gmail.com");
//		db.update(3, n);
//		db.delete(23);
		System.out.println(db.get(1));
		
		List<Student> students = db.getAll();
		Iterator<Student> elements = students.iterator();
		while(elements.hasNext()) {
			Student current = elements.next();
			System.out.println(current);
		}
		db.deleteAll();
		
    }
}
