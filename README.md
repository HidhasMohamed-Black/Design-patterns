# Java Design Patterns Demo

Welcome to the **Java Design Patterns Demo** repository!  
This repository contains Assignment implementing five essential creational design patterns in Java.

---

## 🌟 Patterns Included

### 1. Singleton Pattern
- **Purpose:** Ensures a class has only **one instance** and provides a global access point.
- **Example:** `Logger` class with timestamped logging.
- **Bonus:** Includes a **thread-safe** Singleton for improved safety in concurrent environments.

---

### 2. Factory Method Pattern
- **Purpose:** Provides an interface for creating objects, but lets subclasses decide **which class to instantiate**.
- **Example:** `ShapeFactory` creating `Circle`, `Rectangle`, and `Square`.
  
---

### 3. Builder Pattern
- **Purpose:** Simplifies construction of **complex objects** step by step, using **method chaining**.
- **Example:** `Computer` class with CPU, RAM, Storage, and GraphicsCard.

---

### 4. Prototype Pattern
- **Purpose:** Creates new objects by **cloning existing ones** rather than instantiating directly.
- **Example:** `Document` class with `clone()` demonstrating deep copy.

---

### 5. Abstract Factory Pattern
- **Purpose:** Provides an interface to create **families of related objects** without specifying their concrete classes.
- **Example:** UI theme system with `LightThemeFactory` and `DarkThemeFactory`.
