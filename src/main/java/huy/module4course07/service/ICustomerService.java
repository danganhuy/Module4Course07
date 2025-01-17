package huy.module4course07.service;

import huy.module4course07.model.Customer;
import huy.module4course07.model.Province;

public interface ICustomerService extends IGenerateService<Customer>{
    Iterable<Customer> findAllByProvince(Province province);
}
