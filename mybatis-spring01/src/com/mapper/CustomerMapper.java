package src.com.mapper;

import src.com.po.Customer;

public interface CustomerMapper {
    public Customer findCustomerById(Integer id);
    public  void addCustomer(Customer customer);
}
