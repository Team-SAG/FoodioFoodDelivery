package Foodio.Customer.Controller;

import Foodio.Customer.DTO.CustomerDTO;
import Foodio.Customer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getCustomer")
    public ResponseEntity<Optional<CustomerDTO>> getCustomer(@RequestParam long CustomerId)
    {
        Optional<CustomerDTO> customerDTO = this.customerService.getCustomer(CustomerId);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(customerDTO);
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<String> postCustomer(@RequestBody CustomerDTO customerDTO)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body("Customer Created");
    }


}
