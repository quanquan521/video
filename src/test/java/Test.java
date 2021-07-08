import com.yzq.pojo.Student;
import com.yzq.service.StudentsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentsService service= (StudentsService) context.getBean("studentsService");
        List<Student> l=service.getStudents(1);
        for (Student i :l){
            System.out.print(i.toString());
        }
    }
}
