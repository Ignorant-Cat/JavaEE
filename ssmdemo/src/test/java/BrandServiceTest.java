import com.azy.config.SpringConfig;
import com.azy.pojo.Brand;
import com.azy.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BrandServiceTest {
    @Autowired
    private BrandService brandService;

    @Test
    public void testAdd(){
        List<Brand> brands = brandService.selectAll();
        System.out.println(brands);
    }
}
