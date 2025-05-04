package com.goldbank.accounts.service;

import com.goldbank.accounts.dto.CustomerDto;

public interface AccountsService {
    /**
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);
     CustomerDto fetchAccount(String mobileNumber);
     boolean updateAccount(CustomerDto customerDto);
     boolean deleteAccount(String mobileNumber);
}
