# Bank Project

Welcome to the Bank Project! This project is a backend application designed to simulate financial transactions between vendors and clients. It offers functionalities for managing wallets, performing transactions, and handling notifications.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Components](#components)
  - [Wallet](#wallet)
  - [WalletType](#wallettype)
  - [Repositories](#repositories)
  - [Exception Handling](#exception-handling)
  - [Controller](#controller)
- [Usage](#usage)
- [Contributors](#contributors)
- [License](#license)
- [Acknowledgments](#acknowledgments)

## Introduction

The Bank Project provides a platform for handling financial transactions. It allows users to create wallets, perform debit and credit operations, and manage transactions between different parties. This README provides an overview of the project's components, functionalities, and usage instructions.

## Technologies Used

The project utilizes the following technologies:

- **Java**: The primary programming language used for backend development.
- **Spring Framework**: Provides robust support for building scalable applications, including features such as dependency injection, MVC architecture, and data access.
- **Spring Data**: Used for interacting with the database through repositories.
- **Spring Kafka**: Enables communication between different parts of the system using Kafka messaging.
- **JUnit**: Framework for writing and running unit tests in Java.
- **Mockito**: Mocking framework for unit tests.
- **SLF4J**: Simple Logging Facade for Java, used for logging.
- **Markdown**: Lightweight markup language for formatting README files.

## Components

### Wallet

The `Wallet` class represents a user's wallet in the system. It contains information such as the user's name, CPF, email, password, wallet type, balance, and version. The class also provides methods for debiting and crediting funds to the wallet.

### WalletType

The `WalletType` enum defines two types of wallets: `CLIENT` and `VENDOR`. Each type corresponds to a specific value, allowing easy identification of wallet types throughout the application.

### Repositories

The project includes repositories for managing transactions and wallets:

- **TransactionRepository**: Provides CRUD operations for transactions.
- **WalletRepository**: Manages wallet entities, including operations such as saving, updating, and retrieving wallets from the database.

### Exception Handling

The `TransactionExceptionHandler` class is responsible for handling exceptions thrown during transaction processing. It utilizes Spring's `ControllerAdvice` annotation to globally handle `InvalidTransactionException`s and return appropriate error responses to clients.

### Controller

The `TransactionController` class defines REST endpoints for managing transactions. It includes a `list()` method to retrieve a list of transactions from the database.

## Usage

To use the Bank Project:

1. **Set Up Kafka**: Ensure Kafka is installed and configured to handle messaging between components.
2. **Run the Application**: Execute the main application class to start the backend server.
3. **Interact with Endpoints**: Utilize the exposed REST endpoints to perform operations such as creating transactions and retrieving transaction lists.


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.



