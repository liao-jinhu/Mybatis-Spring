package src.com.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import src.com.dao.CustomerDao;
import src.com.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("src.com.po.CustomerMapper.findCustomerById",id);
    }

    public void deleteCustomerById(Integer id) {
       this.getSqlSession().delete("src.com.po.CustomerMapper.deleteCustomerById", id);
    }

    public int addCustomer(Customer customer) {
        int num =this.getSqlSession().update("src.com.po.CustomerMapper.addCustomerById",customer);
        return num;
    }


}
