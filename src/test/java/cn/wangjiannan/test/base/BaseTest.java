package cn.wangjiannan.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml", "classpath:applicationContext-springMVC.xml" })
// @WebAppConfiguration
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {
	// protected Logger logger = LoggerFactory.getLogger(getClass());
}
