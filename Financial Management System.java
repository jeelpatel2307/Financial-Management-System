class Transaction:
    def __init__(self, amount, description):
        self.amount = amount
        self.description = description

class Account:
    def __init__(self, name):
        self.name = name
        self.balance = 0
        self.transactions = []

    def deposit(self, amount, description=""):
        self.balance += amount
        self.transactions.append(Transaction(amount, description))

    def withdraw(self, amount, description=""):
        if amount <= self.balance:
            self.balance -= amount
            self.transactions.append(Transaction(-amount, description))
        else:
            print("Insufficient funds!")

    def display_balance(self):
        print(f"Current balance for {self.name}: {self.balance}")

    def display_transactions(self):
        print(f"Transactions for {self.name}:")
        for transaction in self.transactions:
            print(f"Amount: {transaction.amount}, Description: {transaction.description}")


def main():
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

if __name__ == "__main__":
    main()
