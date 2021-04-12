package src.com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import src.com.Service.CustomerService;
import src.com.po.Customer;

public class Transaction {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("src/applicationContext.xml");
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        Customer customer = new Customer();
        customer.setUsername("liaojinhu2");
        customer.setJobs("students");
        customer.setPhone("1562586084");
        customerService.addCustomer(customer);
    }
}
