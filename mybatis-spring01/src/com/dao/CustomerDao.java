package src.com.dao;

import src.com.po.Customer;

public interface CustomerDao {
    public Customer findCustomerById(Integer id);
}
