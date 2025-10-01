
S3.02 - Patterns 2

---
  
# 🎯 Objectives

The main objective of these exercises is to deepen understanding and practical implementation of fundamental software design patterns. Specifically, the goals are:

1. Pattern Recognition and Application: Learn to identify when and how to apply specific design patterns (Builder, Observer, Callback) in real-world scenarios.
2. Software Architecture Skills: Develop the ability to design extensible, maintainable, and reusable software systems by implementing proven design patterns.
3. Practical Implementation: Gain hands-on experience creating complete, working examples of each pattern using Java and Gradle, demonstrating proper project structure and organization.
4. Problem-Solving Through Patterns: Understand how design patterns solve common programming problems:

-Builder: Managing complex object construction with multiple configurations
-Observer: Implementing event-driven communication between objects
-Callback: Achieving loose coupling and control inversion in payment processing

5. Professional Development Practices: Learn to structure projects professionally using industry-standard tools (Gradle) and demonstrate functionality through comprehensive main classes.

---
#Exercises to Perform

## Level 1

In all exercises, create a Gradle project with a Main class that demonstrates the use of the pattern (with the necessary invocations).

###Exercise 1 - Builder: 

Develop a pizza order management system using the Builder design pattern in Java. The system must allow the creation of different types of pizzas with different size, dough and ingredient configurations.

1. Define a Pizza class with the following attributes:

-size
-dough (type of dough)
-toppings (ingredients)

2. Create a PizzaBuilder interface with the necessary methods to configure the size, dough and ingredients of a pizza.
3.Implement one or more classes that act as concrete builders (PizzaBuilder) for different types of pizzas. For example, you could have a builder for Hawaiian pizza, another for vegetarian pizza, etc.
4. Develop a MestrePizzer (Master Pizza Maker) class that receives a PizzaBuilder and allows building pizzas in a specific way.
5. In the main program (Main), create instances of PizzaBuilder and MestrePizzer, and use them to build pizzas with different configurations.

 
## Level 2

### Exercise 1 - Observer:

Design a system in which a Stock Agent (Observable) notifies various Stock Agencies (Observers) of changes when the Stock Market goes up or down.
It is necessary that the Observable object maintains references to the Observers.

## Level 3

### Exercise 1 - Callback:

Simulate a payment gateway that receives an encapsulating object of the payment method to be executed: credit card, PayPal or bank account debit.

The gateway will invoke the payment without knowing the method and returning control to the originating class.
The class that invokes the payment gateway will be a shoe store.

---
# 💻 Technologies Used  

- **Java** → Programming language (used to write applications)
- **IntelliJ** → Software application that provides tools for writing, debugging, and running code.
- **Git** → Version control  

---

## 📋 Requirements  
- Java 19
- IntelliJ or another IDE 
- Git 2.51

---

### 🛠️ Setup

1. Clone the repository:
https://github.com/polserrano8/3.2-Patterns2
2. Open the project with IntelliJ IDEA.
3. Run the class `LevelXExercise1.Main.java` from each exercise folder.

---

## 🔗 Contributions
The project ignores `.idea/`, `.out/`, `.iml`.

1. Fork the repository
2. Create a new branch: `git checkout -b feature/NewFeature`
3. Make your changes and commit them: `git commit -m 'Add New Feature'`
4. Push the changes to your branch: `git push origin feature/NewFeature`
5. Open a pull request
