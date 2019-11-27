import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @Author: Tod
 * @Description:
 * @Date: Created in 2019/11/27 17:02
 * @Version: 1.0
 */
public class JDBCPool_C3P0 {
    public static void main(String[] args) throws SQLException {
        // 创建数据库连接池对象(默认配置)
        ComboPooledDataSource ds = new ComboPooledDataSource();
        // 创建指定配置
        ComboPooledDataSource otherc3p0 = new ComboPooledDataSource("otherc3p0");
        // 获取连接对象
        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(conn);
            if (i==9){
                // 归还连接
                conn.close();
            }
        }
        System.out.println("-----------------");
        for (int i = 0; i < 11; i++) {
            Connection connection = otherc3p0.getConnection();
            System.out.println(connection);
        }
    }

}
