## spring boot 整合mybatis 和junit

###spring boot 整合mybatis
* mybatis配置
```properties
#mybatis配置 Begin
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/test?useUnicode=true&serverTimezone=UTC&characterEncoding=utf-8&useSSL=false
spring.datasource.username=root
spring.datasource.password=123456

mybatis.type-aliases-package=com.hmp.sbmybatis.domain
mybatis.mapper-locations=classpath:mapper/*Mapper.xml
#mybatis配置 End

```
* mapper.xml
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
        PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN"
        "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="com.hmp.sbmybatis.dao.UserDao">

    <select id="findAll" resultType="com.hmp.sbmybatis.domain.User">
        <!--当出现主键冲突时(即重复时)，会报错;不想让程序报错，加入ignore-->
        SELECT * FROM user
    </select>

</mapper>
```

## spring boot 整合junit
```java
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SbMybatisApplication.class)
public class MybatisTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void test() {
        List<User> users = userDao.findAll();
        System.out.println(users);
    }
}
```
