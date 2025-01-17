package huy.module4course07.repository;

import huy.module4course07.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer, Long> {
}
