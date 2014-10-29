package default_package;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import id.web.skyforce.util.HibernateUtil;

import org.apache.log4j.net.ZeroConfSupport;
import org.hibernate.Session;
import org.hibernate.Transaction;

import id.web.skyforce.bank.model.Account;
import id.web.skyforce.bank.model.Address;
import id.web.skyforce.bank.model.Customer;

public class Mybank {

	public static void main(String[] args) {
		try {
		      Date date = new Date();
			Session session = HibernateUtil.openSession();
			Transaction trx = session.beginTransaction();
			
			Customer customer = new Customer();
			
			customer.setFirstName("Bill");
			customer.setLastName("Gates");
			customer.setGender('M');
			customer.setBirthDate(date);
			customer.setIdNumber("1234 5678");
			
			session.save(customer);
			
			trx.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Session session = HibernateUtil.openSession();
			Transaction trx = session.beginTransaction();
			Account account = new Account();
			
			account.setAccountNo("XYZ123");
			account.setBalance(new BigDecimal(40.000));
			account.setStatus('A');
			
			session.save(account);
			
			trx.commit();
			session.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Session session = HibernateUtil.openSession();
			Transaction trx = session.beginTransaction();
			
			Account account = new Account();
			
			account.setAccountNo("XYZ456");
			account.setBalance(new BigDecimal(20.000));
			account.setStatus('I');
			
			session.save(account);
			
			trx.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		try {
			Session session = HibernateUtil.openSession();
			Transaction trx = session.beginTransaction();
			
			Address address = new Address();
			
			address.setStreet("Silicon Valley No.13");
			address.setCity("San Francisco");
			address.setPostalCode("94027");
			
			session.save(address);
			
			trx.commit();
			session.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
