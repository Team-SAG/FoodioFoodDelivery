package Foodio.Customer.Mapper;

import Foodio.Customer.DTO.CustomerDTO;
import Foodio.Customer.Model.Customer;

public class MapperClass {

    public static CustomerDTO mapCustomerToCustomerDTO(Customer customer)
    {
        return CustomerDTO.builder().name(customer.getName())
                .email(customer.getEmail())
                .HomeAddress(customer.getHomeAddress())
                .phone(customer.getPhone())
                .build();
    }

    public static Customer mapCustomerDTOtoCustomer(CustomerDTO customerDTO)
    {
        return Customer.builder().name(customerDTO.getName())
                .email(customerDTO.getEmail())
                .HomeAddress(customerDTO.getHomeAddress())
                .phone(customerDTO.getPhone())
                .build();
    }
}
