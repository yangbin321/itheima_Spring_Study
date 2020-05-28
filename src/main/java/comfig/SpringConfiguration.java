package comfig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

/**
 * @author yangbin
 * @create 2019-10-11 20:52
 */

/**
 * 该类是一个配置类，它的作用和bean.xml是一样的
 *
 */

@ComponentScan(basePackages = {"com.itheima"})//<!--告知spring在创建容器时要扫描的包-->
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {


}
