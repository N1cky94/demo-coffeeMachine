# Coffee Machine Demo project

## Getting started

Have the following installed:
- Java 17 or higher
- IntelliJ IDEA
- Git

Clone the project:
Move into the project directory or the place you want the directory (`cd Desktop/demo`) to be and run the following command:
```bash
git clone https://github.com/nbt7dbb/coffee-machine-demo.git
```

Open the project in IntelliJ IDEA and run the `CoffeeApp` class.

## Set-up
This project shows basic refactoring of a Coffee Machine simulation.
The starting point of the project is the CoffeeApp class, which is the main class of the application.

The CoffeeApp class is responsible for the main menu of the application, which allows the user to buy coffee.

The CoffeeMachine class is responsible for the coffee machine itself, which has the following attributes:
- Water
- Coffee Beans
- Milk
- Sugar
- Cups
- Name

The CoffeeType enum is responsible for the types of coffee that can be bought, which has the following attributes:
- Water needed
- Coffee Beans needed
- Milk needed
- Sugar needed
- Cups needed

The KeyboardUtility class is responsible for the user input, which has the following methods:
- `getInput(String prompt)`: Gets the user's input as a string
- `getIntInput(String prompt)`: Gets the user's input as an integer

### Refactoring
The CoffeeApp class has been refactored to use the CoffeeMachine class and the KeyboardUtility class.
The CoffeeMachine class has been refactored to use the CoffeeType enum and the KeyboardUtility class.
The KeyboardUtility class has been refactored to use the Scanner class.

### Testing
There are no tests for this project.