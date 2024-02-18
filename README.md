# Financial Management System

The Financial Management System is a Python program that helps users manage their finances by providing functionalities such as account creation, depositing funds, withdrawing funds, and viewing transaction history.

## Features

- **Account Creation:** Users can create multiple accounts with unique names.
- **Deposit:** Users can deposit funds into their accounts and record the transaction details.
- **Withdrawal:** Users can withdraw funds from their accounts, provided they have sufficient balance, and record the transaction details.
- **Transaction History:** Users can view the transaction history for each account, including transaction amounts and descriptions.

## How to Use

1. Create instances of the `Account` class to represent individual bank accounts.
2. Use the `deposit` method to add funds to an account and record the transaction.
3. Use the `withdraw` method to deduct funds from an account, provided there are sufficient funds, and record the transaction.
4. Use the `display_balance` method to view the current balance of an account.
5. Use the `display_transactions` method to view the transaction history of an account.

## Example

```python
# Create accounts
account1 = Account("Savings")
account2 = Account("Checking")

# Deposit to account1
account1.deposit(1000, "Initial deposit")

# Withdraw from account1
account1.withdraw(500, "Rent payment")

# Deposit to account2
account2.deposit(2000, "Initial deposit")

# Display account balances and transactions
account1.display_balance()
account1.display_transactions()
account2.display_balance()
account2.display_transactions()

```

## Contributing

Contributions to improve the Financial Management System project are welcome! Fork the repository, make your changes, and submit a pull request.

## Credits

This project was created by Jeel patel.
