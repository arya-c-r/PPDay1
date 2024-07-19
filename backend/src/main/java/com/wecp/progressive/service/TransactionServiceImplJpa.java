// package com.wecp.progressive.service;

// import java.sql.SQLException;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.wecp.progressive.entity.Transactions;
// import com.wecp.progressive.repository.TransactionRepository;
// @Service
// public class TransactionServiceImplJpa implements TransactionService{
//     @Autowired
//     private TransactionRepository transactionRepository;
//     @Override
    
//     public List<Transactions> getAllTransactions() throws SQLException {
//         // TODO Auto-generated method stub
//         return transactionRepository.findAll();
//     }

//     @Override
//     public Transactions getTransactionById(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         return transactionRepository.findById(transactionId).get();
//     }

//     @Override
//     public int addTransaction(Transactions transaction) throws SQLException {
//         // TODO Auto-generated method stub
//         transactionRepository.save(transaction);
//         return transaction.getTransactionId();
//     }

//     @Override
//     public void updateTransaction(Transactions transaction) throws SQLException {
//         TODO Auto-generated method stub
//         Transactions t=transactionRepository.findById(transaction.getTransactionId()).get();
//         t.setAccountId(transaction.getAccountId());
//         t.setAccounts(transaction.getAccounts());
//         t.setAmount(transaction.getAmount());
//         t.setTransactionDate(transaction.getTransactionDate());
//         t.setTransactionType(transaction.getTransactionType());
//         transactionRepository.save(t);

//     }

//     @Override
//     public void deleteTransaction(int transactionId) throws SQLException {
//         // TODO Auto-generated method stub
//         // if(transactionRepository.findById(transactionId)!=null){
//             transactionRepository.deleteById(transactionId);
//         }
//     }

//     @Override
//     public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
//     }

// }
