package Foodio.Customer.Service;

import Foodio.Customer.DTO.CustomerDTO;

import java.util.Optional;

public interface CustomerService {

    Optional<CustomerDTO> getCustomer(Long customerID);
    CustomerDTO addCustomer(CustomerDTO customerDTO);
    CustomerDTO updateCustomer(CustomerDTO customerDTO);
    boolean deleteCustomer(Long customerId);
}
