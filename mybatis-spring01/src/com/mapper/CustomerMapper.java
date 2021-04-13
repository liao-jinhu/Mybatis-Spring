package src.com.mapper;

import src.com.po.Customer;

import java.util.List;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
    public  void addCustomer(Customer customer);
    public List<Customer> findAllCustomer();

}
