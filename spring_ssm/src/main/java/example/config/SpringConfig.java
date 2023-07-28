package example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//先整合jdbc（springconfig），再整合合mybatis(mybatisconfig,jdbcconfig,..jdbc.properties)，最后Springmvc(servletconfig,springmvcconfig)
//之后到domain中实现mysql中的数据类型，在开发dao,service,controller
@Configuration
@ComponentScan({"example.service", "example.dao", "example.controller"})
//环境属性
@PropertySource("classpath:jdbc.properties")
//配置类
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
