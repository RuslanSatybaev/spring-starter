import com.dmdev.spring.database.ConnectionPool;
import com.dmdev.spring.database.repository.CompanyRepository;
import com.dmdev.spring.database.repository.UserRepository;
import com.dmdev.spring.ioc.Container;
import com.dmdev.spring.service.UserService;

public class ApplicationRunner {
    public static void main(String[] args) {
        var container = new Container();

        var connectionPool = container.get(ConnectionPool.class);
        var userRepository = container.get(UserRepository.class);
        var companyRepository = container.get(CompanyRepository.class);
        var service = container.get(UserService.class);
    }
}
