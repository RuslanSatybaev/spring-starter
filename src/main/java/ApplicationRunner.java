import com.dmdev.spring.database.ConnectionPool;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        var pool1 = context.getBean("pool1", ConnectionPool.class);
        System.out.println(pool1);
    }
}
