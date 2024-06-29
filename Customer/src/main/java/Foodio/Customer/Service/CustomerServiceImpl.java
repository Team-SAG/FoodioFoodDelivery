package Foodio.Customer.Service;

import Foodio.Customer.DTO.CustomerDTO;
import Foodio.Customer.Mapper.MapperClass;
import Foodio.Customer.Model.Customer;
import Foodio.Customer.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;


    @Override
    public Optional<CustomerDTO> getCustomer(Long customerID) {
        Optional<Customer> customer = this.customerRepo.findById(customerID);
        CustomerDTO customerDTO = MapperClass.mapCustomerToCustomerDTO(customer.get());
        return Optional.of(customerDTO);
    }

    @Override
    public CustomerDTO addCustomer(CustomerDTO customerDTO) {
        Customer customer = MapperClass.mapCustomerDTOtoCustomer(customerDTO);
        customerRepo.save(customer);
        return customerDTO;
    }

    @Override
    public CustomerDTO updateCustomer(CustomerDTO customerDTO) {
        return null;
    }

    @Override
    public boolean deleteCustomer(Long customerId) {
        return false;
    }
}
