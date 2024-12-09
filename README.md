# InMemoryDB

This repository contains an implementation of an in-memory key-value database in Java. The database supports transactions and provides methods to `begin_transaction`, `put`, `get`, `commit`, and `rollback`.

## How to Run

1. Ensure you have Java installed on your machine.
2. Clone this repository:
   ```sh
   git clone https://github.com/phamtasy/Data-Processing-and-Storage-Assignment.git
   cd InMemoryDB
3. Compile the Java files:
   ```sh
   javac InMemoryDB.java Main.java
4. Run the compiled Main class:
   ```sh
   java Main
## Usage
Once the program is running, you can enter the following commands:
- `get <key>`: Retrieves the value associated with the key.
- `put <key> <value>`: Sets the value for the key (requires a transaction to be in progress).
- `begin`: Starts a new transaction.
- `commit`: Commits the current transaction.
- `rollback`: Rolls back the current transaction.
- `exit`: Exits the program.

## Improvements
To make this assignment an official project, additional methods, like delete(key) for removing keys and a status() method to display the database's current state, could enhance functionality. Providing sample input and output files would help standardize the grading process and make it easier to verify functionality. Additional clarification on how to effectively present working code would be helpful in reducing uncertainty of how grading would be accepted whether this is requiring input from the user or just showing the output of the example in Figure 2.
