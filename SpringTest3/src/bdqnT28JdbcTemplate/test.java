/**
 * @description
 * @author Administrator
 * @create 2019-5-22
 * @since 1.0.0
 */
package bdqnT28JdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by Administrator on 2019-5-22.
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext cx = new ClassPathXmlApplicationContext("bean-ApplicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) cx.getBean("jdbcTemplate");

        //插入
//        String sql="INSERT INTO student VALUES (?,?,?,?)";
//        int update = jdbcTemplate.update(sql,6 ,"张麻子","长沙",16);
//        System.out.println(update);

        //删除
//        String sql1="DELETE FROM student WHERE id=?";
//        int update1 = jdbcTemplate.update(sql1, 6);
//        System.out.println(update1);

        //修改
//        String sql2="UPDATE student SET NAME=? WHERE id =?";
//        int update2 = jdbcTemplate.update(sql2, "狗剩儿", 5);
//        System.out.println(update2);

        //批量增删改batchUpdate第二个参数为object[]数组类型的list集合
        //批量增
//        String sql3 ="INSERT INTO student VALUES (?,?,?,?)";
//        List<Object[]> batchArgs = new ArrayList<Object[]>();
//        batchArgs.add(new Object[]{6,"张无忌","井冈山",12});
//        batchArgs.add(new Object[]{7,"张无忌","井冈山",12});
//        batchArgs.add(new Object[]{8,"张无忌","井冈山",12});
//        batchArgs.add(new Object[]{9,"张无忌","井冈山",12});
//        jdbcTemplate.batchUpdate(sql3, batchArgs);

        //测试读取单个值
        /**
         * 注意1.使用BeanProperytRowMapper要求sql数据查询出来的列和实体属性需要一一对应。
         * 如果数据中列明和属性名不一致，在sql语句中需要用as重新取一个别名
         * 2.使用JdbcTemplate对象不能获取关联对象
         * 总结：其中RowMapper指定如何去映射结果集的行
         * 不支持级联属性 JdbcTemplate到底是一个jdbc的小工具，而不是orm框架
         */
//        String sql4 ="SELECT * FROM student WHERE  id = ?";
//        RowMapper<studentDto> rowMapper = new BeanPropertyRowMapper<studentDto>(studentDto.class);
//        studentDto studentDto = jdbcTemplate.queryForObject(sql4, rowMapper, 1);
//        System.out.println(studentDto);

        //测试查询多个值
//        String sql5 = "SELECT * FROM student";
//        List<studentDto> query = jdbcTemplate.query(sql5, rowMapper);
//        for (studentDto ab: query){
//            System.out.println(ab);
//        }

        //获取单个列的值，或统计查询
        String sql6 = "select count(1) from student";
        Integer integer = jdbcTemplate.queryForObject(sql6, Integer.class);
        System.out.println(integer);

    }
}
