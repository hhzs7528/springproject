import com.hh.config.SpringConfig;
import com.hh.domain.Book;
import com.hh.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestApp {

    @Autowired
    private BookService bookService;


    @Test

    public void testApp() {
        for (Book book : bookService.findAll()) {
            System.out.println(book);
        }

    }
}
