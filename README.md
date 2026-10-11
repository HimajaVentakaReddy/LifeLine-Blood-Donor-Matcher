# 🩸 LifeLine — Blood & Emergency Donor Matcher

LifeLine is a Java-based console application designed to help identify compatible and available blood donors during emergency situations.

The system allows donors to register their details, manages donor availability, processes emergency blood requests, checks blood-group compatibility, and prioritizes suitable donors based on location and compatibility.

## ✨ Features

- Register new blood donors
- Store donor blood group and location
- Track donor availability
- View all registered donors
- Search donors by blood group
- Create emergency blood requests
- Check blood-group compatibility
- Find available compatible donors
- Prioritize donors based on location
- Update donor availability
- Input validation for blood groups

## 🧠 Matching Logic

When an emergency blood request is created, LifeLine:

1. Checks whether the donor is currently available.
2. Checks whether the donor's blood group is compatible with the required blood group.
3. Filters out incompatible or unavailable donors.
4. Prioritizes donors from the emergency location.
5. Considers exact blood-group matches while ranking suitable donors.
6. Displays the best matching donors first.

## 🩸 Supported Blood Groups

`A+` `A-` `B+` `B-` `AB+` `AB-` `O+` `O-`

## 🛠️ Technologies Used

- Java
- Core Java
- Object-Oriented Programming (OOP)
- Java Collections Framework
- ArrayList
- List
- Git
- GitHub

## 📚 Java Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Getters and Setters
- Method Overriding
- Static Methods
- ArrayList and List
- Enhanced For Loop
- Switch Statements
- Lambda Expressions
- Sorting
- Scanner
- Input Validation

## 📁 Project Structure

```text
LifeLine-Blood-Donor-Matcher/
│
├── src/
│   ├── Donor.java
│   ├── DonorMatcher.java
│   ├── EmergencyRequest.java
│   └── Main.java
│
├── .gitignore
└── README.md
```

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/HimajaVentakaReddy/LifeLine-Blood-Donor-Matcher.git
```

### 2. Open the project directory

```bash
cd LifeLine-Blood-Donor-Matcher
```

### 3. Compile the Java files

```bash
javac src/*.java
```

### 4. Run the application

```bash
java -cp src Main
```

## 💻 Main Menu

```text
----------- MAIN MENU -----------
1. Register Donor
2. View All Donors
3. Emergency Blood Request
4. Search Donors by Blood Group
5. Update Donor Availability
6. Exit
---------------------------------
```

## 🚀 Future Enhancements

- PriorityQueue-based donor ranking
- Unique donor and request IDs
- Distance-based donor matching
- Emergency urgency levels
- Persistent donor data storage
- MySQL database integration using JDBC
- Donor registration history
- Request status tracking
- Improved input validation
- GUI or web-based interface

## ⚠️ Disclaimer

This project is created for educational purposes. Blood transfusion compatibility and donor eligibility in real-world medical situations must always be verified by qualified healthcare professionals and authorized blood banks.

## 👩‍💻 Author

**Himaja Venkata Reddy**
Computer Science & Engineering student focused on Java development, object-oriented programming, problem-solving, and building practical software projects.
