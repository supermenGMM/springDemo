import com.mm.dao.StudentDao;
import com.mm.pojo.Student;
import org.junit.Test;

public class TestMybatis {
    @Test
    public void test() throws Exception {
        StudentDao studentDao =new StudentDao();
        Student student  = new Student();
        student.setAge(1);
        student.setAddress("石景山");
        student.setName("仙人掌");
        studentDao.add(student);
    }

}
