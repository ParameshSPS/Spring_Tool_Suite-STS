//package com.zensar.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.zensar.bean.Customer;
//
//@Service
//
//public class ICustomerService {
//
//	@Autowired
//
//	ICustomerDAO customerdao;
//
//	public Customer addCustomer(Customer customer) {
//		return this.customerdao.save(customer);
//	}
//
//	public Customer updateCustomer(Customer customer) {
//		return this.customerdao.save(customer);
//	}
//
//	public boolean deleteCustomer(Customer customer) {
//		customerdao.delete(customer);
//		return true;
//	}
//
//	public Optional<Customer> viewCustomer(int custid) {
//		return this.customerdao.findById(custid);
//	}
//
//	public List<Customer> viewALLCustomers() {
//		return this.customerdao.findAll();
//
//	}
//
//}
package com.zensar.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Customer;
import com.zensar.db.ICustomerDAO;

@Service
public class ICustomerService {

	@Autowired
	ICustomerDAO customerDao;

	public Customer addCustomer(Customer customer) 
	{
		return this.customerDao.save(customer);
	}

	public Customer updateCustomer(Customer customer) 
	{
		return this.customerDao.save(customer);
	}

	public boolean deleteCustomer(Customer customer) 
	{
		customerDao.delete(customer);
		return true;
	}

	public Customer viewCustomer(int customerId) 
	{
		return this.customerDao.findById(customerId).get();
	}

	public List<Customer> viewAllCustomers(int movieId) 
	{
		return this.customerDao.findAll();
	}

}