package src.com.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.com.Service.CustomerService;
import src.com.po.Customer;

import java.util.List;

public class Transaction {
    @Test
    public void addCustomer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("liaojinhu3");
        customer.setJobs("students");
        customer.setPhone("1562586084");
        customerService.addCustomer(customer);
    }

    @Test
    public  void findCustomer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Customer customer = customerService.findCustomer(1);
        System.out.println(customer);
    }


    @Test
    public  void findAllCustomer(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        List<Customer> customer = (List<Customer>) customerService.findAllCustomer();
        for(Customer customer2:customer) {
            System.out.println(customer2);
        }
    }



}
