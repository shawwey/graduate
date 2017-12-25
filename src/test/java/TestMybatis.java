import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.shaw.cn.entity.User;
import com.shaw.cn.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)     
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestMybatis {  
    private static Logger logger = Logger.getLogger(TestMybatis.class);  
 //   private ApplicationContext ac = null;  
    @Resource  
    private UserService userService;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (UserServiceImpl) ac.getBean("userService");  
//  }  
//  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        // System.out.println(user.getUserName());  
        // logger.info("鍊硷�?"+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  
}  

