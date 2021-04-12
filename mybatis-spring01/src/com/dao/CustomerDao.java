package src.com.dao;

import src.com.po.Customer;

public interface CustomerDao {
    //查找
    public Customer findCustomerById(Integer id);
    //删除
    public void deleteCustomerById(Integer id);

    public int addCustomer(Customer customer);

}
