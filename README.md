### Java 8 Features
This repository contains examples and explanations of key Java 8 features, including Lambda Expressions, Functional Interfaces, Optional Class, and Stream API.Each section demonstrates the new functionalities introduced in Java 8 to promote efficient and concise coding practices.<br>

***Folder Structure***<br>
1.Function_Interface & Lambda Expression: This folder demonstrates how to create and use functional interfaces and lambda expressions to write concise and anonymous methods.<br>

2.Stream_Api: Examples of intermediate and terminal methods used in the Stream API for handling and processing collections.<br>

3.Optional_class.txt: This file provides details on how to handle null values using the Optional class, preventing NullPointerException.<br>

***Features Covered***

1.Lambda Expressions<br>
Lambda expressions were introduced in Java 8 to provide a concise way to write anonymous methods. They can be used with functional interfaces, which contain only one abstract method.<br>

2.Functional Interfaces<br> 
A functional interface is an interface that contains only one abstract method, and it can be implemented using a lambda expression. Predefined functional interfaces include ActionListener, Runnable, and user-defined interfaces.<br>

3.Optional Class<br> 
The Optional class was introduced in Java 8 to handle null values more gracefully, avoiding NullPointerException. It is a container that may or may not contain a non-null value. Methods of the Optional class include creating empty Optionals, Optionals with non-null values, and Optionals that can hold either a non-null value or null.<br>

4.Stream API<br> 
The Stream API is used to process collections of objects in a functional programming manner. <br> It supports two types of operations:<br>

Intermediate Operations: These return a new stream and are lazy.<br>
Terminal Operations: These produce a result or a side-effect.<br>
