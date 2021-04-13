package src.com.Service;

import src.com.po.Customer;

import java.util.List;

public interface CustomerService {
    public  void addCustomer(Customer customer);
    public Customer findCustomer(Integer id);
    public List<Customer> findAllCustomer();
}
