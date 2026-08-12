# 💰 Java Expense Sharing System

A **console-based Expense Sharing System** developed using Java.

This application helps manage expenses made by different people in a group and calculates how the total expense is divided among the group members.

The project uses Java's **HashMap**, arrays, classes, constructors, methods, and basic mathematical operations to implement the expense-sharing logic.

---

## 📌 Project Overview

In a group, different members may pay different amounts for shared expenses.

This application allows you to:

* Add a person's expense
* Specify the group members involved in the expense
* Calculate the total expense
* Calculate the total number of members
* Calculate the expense per person
* Determine how much each person owes or is credited based on the calculation

---

## ✨ Features

### ➕ Add Expense

Users can enter:

* Spender name
* Total amount spent
* Group members involved in the expense

Example:

```text
Enter Spender name: Shripad
Enter the total spent amount: 1500
Enter the group member including yourself: Shripad,Rahul,Amit
```

The expense is then stored in a `HashMap`.

---

### 🧮 Calculate Expense

The application calculates:

1. Total amount spent
2. Total number of group members represented by the stored expenses
3. Expense per person
4. Amount owed/credited for each spender

The basic calculation is:

```text
Total Expense
      ÷
Total Members
      =
Expense Per Person
```

---

## 🧠 Expense Calculation

The application calculates the total expense using all stored `User` objects:

```java
for (User user : map.values()) {
    total_Expense += user.getAmount();
    total_Members += user.getGroup().length;
}
```

Then it calculates:

```text
Expense Per Person = Total Expense / Total Members
```

For each spender, the application calculates:

```text
Owes = (Expense Per Person × Group Size) - Amount Paid
```

---

## 🗃️ Data Structure Used

### HashMap

The application uses:

```java
HashMap<String, User> map
```

The spender's name is used as the key, while the `User` object contains:

* Amount spent
* Group members

```text
HashMap
   │
   ├── Shripad → User
   │              ├── Amount
   │              └── Group[]
   │
   ├── Rahul → User
   │            ├── Amount
   │            └── Group[]
   │
   └── Amit → User
                ├── Amount
                └── Group[]
```

---

## 👥 Group Members

Group members are entered as comma-separated values:

```text
Shripad,Rahul,Amit
```

The input is converted into a String array:

```java
String[] group = groupInput.split(",");
```

This array is stored inside the `User` object.

---

## 🏗️ Project Structure

```text
Expense-Sharing-Java/
│
├── Expense.java
├── User.java
└── README.md
```

### `Expense.java`

Responsible for:

* Taking user input
* Adding expenses
* Storing expense information
* Calculating expenses
* Exiting the application

Main methods:

```java
addExpense()
calculateExpense()
exit()
```

### `User.java`

Represents expense information.

It contains:

```java
private double amount;
private String[] group;
```

And provides getter methods:

```java
getAmount()
getGroup()
```

---

## 🔄 Application Flow

```text
             Start
               │
               ▼
        Enter Expense
               │
               ▼
        Enter Spender
               │
               ▼
        Enter Amount
               │
               ▼
      Enter Group Members
               │
               ▼
       Store in HashMap
               │
               ▼
       Calculate Expense
               │
               ▼
     Expense Per Person
               │
               ▼
      Calculate Each User
               │
               ▼
              End
```

---

## 💻 Example

Suppose three members are sharing expenses.

```text
Shripad → ₹1500
Group   → Shripad,Rahul,Amit
```

Another expense:

```text
Rahul → ₹900
Group → Shripad,Rahul,Amit
```

The application collects the expenses and calculates the overall expense distribution.

Example calculation:

```text
Total Expense
= ₹1500 + ₹900
= ₹2400
```

If the group contains 3 members:

```text
Expense Per Person
= ₹2400 / 3
= ₹800
```

The application then calculates the difference between each person's calculated share and the amount they have already paid.

---

## 🛠️ Technologies Used

* ☕ Java
* 🗺️ HashMap
* 📦 Arrays
* 🧱 Classes & Objects
* 🔐 Encapsulation
* 🔧 Constructors
* ⌨️ Scanner
* ➗ Mathematical calculations
* 💻 Console-based application

---

## 🎯 Learning Objectives

This project helped me practice:

* Java Collections Framework
* `HashMap`
* Arrays
* Classes and Objects
* Constructors
* Encapsulation
* Getter methods
* Loops
* Conditional statements
* User input using `Scanner`
* String manipulation using `split()`
* Mathematical calculations
* Console-based application development

---

## ⏱️ Time Complexity

For `n` stored expense records:

| Operation                      | Average Complexity |
| ------------------------------ | -----------------: |
| Add Expense                    |             `O(1)` |
| Check Spender Exists           |             `O(1)` |
| Calculate Total Expense        |             `O(n)` |
| Calculate Expense Distribution |             `O(n)` |

The application iterates through the stored expenses when performing the calculation.

---

## 🔮 Future Improvements

Possible improvements for this project:

* 👤 Add a separate member management system
* 💾 Store expenses permanently in a database
* 🧾 Add expense history
* 💸 Show who should pay whom
* 🔄 Add settlement functionality
* 📊 Add expense reports
* 📅 Add expense dates
* 🏷️ Add expense categories
* 🔐 Add user authentication
* 🌐 Convert the application into a Spring Boot REST API
* 🎨 Build a React.js frontend

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone <your-repository-url>
```

### 2. Open the Project

Open the project in:

* IntelliJ IDEA
* Eclipse
* VS Code
* NetBeans

### 3. Compile

```bash
javac Expense.java User.java
```

### 4. Run

If `Expense.java` contains the `main()` method:

```bash
java Expense
```

---

## 👨‍💻 Author

**Shripad Bhagaywant**

Java Full Stack Developer

`Java` • `Spring Boot` • `React.js` • `REST APIs` • `MySQL`

📍 Pune, India

---

⭐ If you find this project useful for learning Java Collections and expense-sharing logic, consider giving the repository a star!
