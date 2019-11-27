import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * @Author: Tod
 * @Description:
 * @Date: Created in 2019/11/27 17:25
 * @Version: 1.0
 */
public class JDBCPool_Druid {
    public static void main(String[] args) throws Exception {
        // 获取属性
        Properties properties = new Properties();
        InputStream inputStream = JDBCPool_Druid.class.getClassLoader().getResourceAsStream("utils/druid.properties");
        properties.load(inputStream);
        // 获取连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(properties);
        // 获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
