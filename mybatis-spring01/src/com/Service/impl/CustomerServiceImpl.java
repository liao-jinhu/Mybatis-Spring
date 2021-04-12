package src.com.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import src.com.Service.CustomerService;
import src.com.mapper.CustomerMapper;
import src.com.po.Customer;

@Service

public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    public void addCustomer(Customer customer) {

        this.customerMapper.addCustomer(customer);

    }
}
