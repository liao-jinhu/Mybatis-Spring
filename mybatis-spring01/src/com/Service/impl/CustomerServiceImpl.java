package src.com.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.com.Service.CustomerService;
import src.com.mapper.CustomerMapper;
import src.com.po.Customer;

import java.util.List;

@Service

public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerMapper customerMapper;
    private Customer customer;
    public void addCustomer(Customer customer) {
        this.customerMapper.addCustomer(customer);

    }

    public Customer findCustomer(Integer id) {
        Integer a =id;
        return this.customerMapper.findCustomerById(a);
    }

    public List<Customer> findAllCustomer() {
        List<Customer> customer= (List<Customer>) this.customerMapper.findAllCustomer();
       return (List<Customer>) customer;
    }


}
