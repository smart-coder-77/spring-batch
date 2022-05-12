package com.smartcoder.batch.config;

import com.smartcoder.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

/**
 * @author Choudhury Subham on 12-05-2022
 */

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {


    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
