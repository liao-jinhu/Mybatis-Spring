package src.com.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import src.com.dao.CustomerDao;
import src.com.po.Customer;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
    public Customer findCustomerById(Integer id) {
        return this.getSqlSession().selectOne("com.po.CustomerMapper.findCustomerById",id);
    }
}
