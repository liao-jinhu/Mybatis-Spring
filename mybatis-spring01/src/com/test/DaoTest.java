package src.com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.com.dao.CustomerDao;
import src.com.po.Customer;

public class DaoTest {
    @Test
    public void findCustomByIdTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("customerDao");
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);


    }

}
