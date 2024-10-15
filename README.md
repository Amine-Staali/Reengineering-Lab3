# Lab 3 – The SOLID Principles

## 1. SRP: Single Responsibility Principle

The `CarManager` class had numerous responsibilities, so we decided to create an interface for each method. We then implemented a separate class for each interface, allowing for better organization and separation of concerns. In the `CarManager`, we utilized each of these interfaces to handle their respective functionalities.

## 2. OCP: Open/Closed Principle

We had a class named `ResourceAllocator` that included methods like `allocate()` and `free()`, which depend on the type of resources being managed. However, the issue with this design was that adding a new type of resource required changes to the existing code.

To address this, we created an interface that defines all the necessary methods, following the Open/Closed Principle. We then implemented separate classes for each resource type, overriding the methods defined in the interface. Additionally, we introduced a `ResourceManager` class to utilize this interface, enabling more flexible and maintainable resource management.

## 3. LSP: Liskov Substitution Principle

In the `Pool` class, we initially created a variable of the parent class type but used the subclass constructor. Because we had overridden the parent method, we might not get the expected behavior. To resolve this, we decided to create an interface that each class can implement, ensuring that all subclasses adhere to a consistent interface.

## 4. ISP: Interface Segregation Principle

In the `Door` class, we had methods that were used in both the `SensingDoor` and `TimedDoor` classes. To improve organization, we extracted these common methods into their own interface. Then, we created two separate interfaces for each door type, containing their specific methods, and implemented these interfaces in the corresponding classes.

## 5. DIP: Dependency inversion principle

In the `EncodingModule` class, we had a direct dependency on the `MyDatabase` class. To resolve this, we created an interface as an intermediary.