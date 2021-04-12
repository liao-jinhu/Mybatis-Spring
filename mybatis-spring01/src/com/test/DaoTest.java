package src.com.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.com.dao.CustomerDao;
import src.com.mapper.CustomerMapper;
import src.com.po.Customer;

import java.util.concurrent.CopyOnWriteArrayList;

public class DaoTest {
    //查询测试
    @Test
    public void findCustomByIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }

    //删除测试
    @Test
    public void deleteCustomerByIdTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao.deleteCustomerById(7);
        System.out.println();
    }

    //添加测试
    @Test
    public void addCustomer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer =new Customer();
        customer.setUsername("廖进湖");
        customer.setPhone("15625860184");
        customer.setJobs("学生");
        int w = customerDao.addCustomer(customer);
        System.out.println(w);

    }


    @Test
    public void findCustomerByIdMapperTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerMapper customerMapper = applicationContext.getBean(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(1);
        System.out.println(customer);
    }

}
