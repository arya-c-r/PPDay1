// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Accounts;
// import com.wecp.progressive.repository.AccountRepository;

// @Service
// public class AccountServiceImplJpa implements AccountService{
//     @Autowired
//     private AccountRepository accountRepository;

//     @Override
//     public List<Accounts> getAllAccounts() throws SQLException {
//         // TODO Auto-generated method stub
//         return accountRepository.findAll();
//     }

//     @Override
//     public List<Accounts> getAccountsByUser(int userId) throws SQLException {
//         // TODO Auto-generated method stub
//         return accountRepository.getAccountsByUser(userId);
//     }

//     @Override
//     public Accounts getAccountById(int accountId) throws SQLException {
//         // TODO Auto-generated method stub
//         return accountRepository.findById(accountId).orElse(null);
//     }

//     @Override
//     public int addAccount(Accounts accounts) throws SQLException {
//         // TODO Auto-generated method stub
//         accountRepository.save(accounts);
//         return accounts.getAccountId();
//     }

//     @Override
//     public void updateAccount(Accounts accounts) throws SQLException {
//         // TODO Auto-generated method stub
//         Accounts a=accountRepository.findById(accounts.getAccountId()).get();
//         a.setBalance(accounts.getBalance());
//         a.setCustomerId(accounts.getCustomerId());
//         a.setCustomers(accounts.getCustomers());
//         a.setTransactionsList(accounts.getTransactionsList());
//         accountRepository.save(a);
//     }

//     @Override
//     public void deleteAccount(int accountId) throws SQLException {
//         // TODO Auto-generated method stub
//         if(accountRepository.findById(null)!=null){
//             accountRepository.deleteById(accountId);
//         }
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalance() throws SQLException {
//         // TODO Auto-generated method stub
        
//         return accountRepository.getAllAccountsSortedByBalance();
//     }

//     @Override
//     public List<Accounts> getAllAccountsFromArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsFromArrayList'");
//     }

//     @Override
//     public List<Accounts> addAccountToArrayList(Accounts accounts) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'addAccountToArrayList'");
//     }

//     @Override
//     public List<Accounts> getAllAccountsSortedByBalanceFromArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getAllAccountsSortedByBalanceFromArrayList'");
//     }

//     @Override
//     public void emptyArrayList() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
//     }
// }