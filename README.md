# Java Exception Handling Assignment

This project contains 6 beginner-friendly Java OOP problems based on **custom exceptions and real-life systems**. Each problem demonstrates how exception handling is used to make systems more reliable and error-safe.

---

# 📌 Problem List

---

## 🚆 Problem 1: Train Ticket Booking System

### 🎯 Scenario
A railway booking system checks seat availability before booking tickets. If requested seats exceed available seats, an exception is thrown.

### 🧩 Classes
- Train
- SeatNotAvailableException
- TicketBookingSystem

### ⚙️ Methods
- `bookTicket(int seats)`
- `checkAvailableSeats()`

### 💡 Idea
If requested seats > available seats → throw `SeatNotAvailableException`, otherwise reduce seat count.

---

## 📱 Problem 2: Mobile Recharge System

### 🎯 Scenario
Users must recharge at least a minimum amount (e.g., 10 taka). If less is entered, an exception is thrown.

### 🧩 Classes
- MobileAccount
- InvalidRechargeAmountException
- RechargeService

### ⚙️ Methods
- `recharge(double amount)`
- `checkBalance()`

### 💡 Idea
If recharge amount < minimum → throw `InvalidRechargeAmountException`.

---

## 🎓 Problem 3: Online Course Registration System

### 🎯 Scenario
Students must complete prerequisite courses before enrolling in advanced courses.

### 🧩 Classes
- Course
- PrerequisiteNotCompletedException
- CourseRegistration

### ⚙️ Methods
- `registerCourse(String courseName)`
- `checkPrerequisite()`

### 💡 Idea
If prerequisite not completed → throw exception.

---

## 🏧 Problem 4: ATM Withdrawal System

### 🎯 Scenario
ATM checks if withdrawal amount exceeds balance.

### 🧩 Classes
- BankAccount
- InsufficientBalanceException
- ATM

### ⚙️ Methods
- `withdraw(double amount)`
- `checkBalance()`

### 💡 Idea
If withdrawal > balance → throw `InsufficientBalanceException`.

---

## 📊 Problem 5: Student Result Processing System

### 🎯 Scenario
Marks must be between 0 and 100.

### 🧩 Classes
- Student
- InvalidMarkException
- ResultProcessor

### ⚙️ Methods
- `setMarks(int marks)`
- `calculateGrade()`

### 💡 Idea
If marks < 0 or > 100 → throw `InvalidMarkException`.

---

## 🔐 Problem 6: Password Validation System

### 🎯 Scenario
Passwords must be at least 8 characters long.

### 🧩 Classes
- UserAccount
- WeakPasswordException
- RegistrationSystem

### ⚙️ Methods
- `setPassword(String password)`
- `validatePassword()`

### 💡 Idea
If password length < 8 → throw `WeakPasswordException`.

---

# 🧠 Key Concepts Used

- Custom Exception (`extends Exception`)
- `throw` keyword
- `try-catch` blocks
- OOP (Classes & Methods)
- Real-world system simulation

---

# 📌 Learning Outcome

After completing these problems, you will understand:
- How exception handling improves system safety
- How to create custom exceptions in Java
- How real-world systems handle errors
- Basic OOP design principles

---

# 👨‍💻 Author
Java OOP Practice Assignment – Exception Handling Basics
