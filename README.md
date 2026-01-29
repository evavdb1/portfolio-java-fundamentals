# Portfolio Java Fundamentals

*A collection of projects demonstrating my understanding of the fundamentals of Java.*

---

**mildly entertaining console output in a range of topics like making smoothies or controlling robots**

---

## Tech Stack
- Java 17+
- GitHub

---

## Features
- Object-oriented programming: classes, objects, encapsulation, and clear responsibility boundaries
- Use of core data types and control flow (if/else, loops, switch)- 
- Collections Framework usage (List, Map) for data storage and processing
- Console-based user interaction using Scanner
- Input validation and basic exception handling (try/catch)
- File I/O using standard Java APIs (BufferedReader, FileWriter)
- Clean, readable code following Java naming conventions and best practices

---

## How to Run
1. Clone the repository
2. Compile all source files
   ```
   javac -d out src/**/*.java
   ```
3. Run one of the applications
   ```
   java -cp out org.evavdb1.smoothies.SmoothiesMain
   java -cp out org.evavdb1.shoepair.ShoePairMain
   java -cp out org.evavdb1.casino.CasinoMain
   java -cp out org.evavdb1.icecreamshop.IceCreamAppV2
   java -cp out org.evavdb1.forestnotebook.NatureApp
   java -cp out org.evavdb1.bankatm.ATMMain
   java -cp out org.evavdb1.robots.RobotMain
   java -cp out org.evavdb1.mediaplayer.AdapterPatternDemo
   java -cp out org.evavdb1.whyphone.WhyPhoneMainApp
   ```
   Note: On Windows (cmd), the ** glob may not expand. Use PowerShell or Git Bash.

---
```
portfolio-java-fundamentals/
│
├── Abstraction LoveShackSmoothies/
│       └── src/org.evavdb1.smoothies/
│               ├── SmoothiesMain.java
│               │
│               ├── mixables/fruits/
│               │   │      ├── Fruit.java
│               │   │      ├── Apple.java
│               │   │      ├── Banana.java 
│               │   │      ├── Lemon.java
│               │   │      ├── Orange.java 
│               │   │      └── Strawberry.java
│               │   mixables/vegetables/
│               │   │      ├── Vegetable.java
│               │   │      ├── Celery.java
│               │   │      └── Spinach.java
│               │   │      
│               │   mixables/Food.java
│               │   │   
│               │   mixables/Mixable.java (interface)
│               │   
│               └── shop/
│                     ├── LoveShack.java
│                     └── SmoothieRecipe.java (enum)
│
├── Arrays ShoePair/
│       └── src/org.evavdb1.shoepair/
│               ├── ShoepairMain.java
│               └── Shoepair.java
│
├── Core Casino/
│       ├── src/org.evavdb1.casino/
│       │       ├── CasinoMain.java
│       │       ├── Casino.java
│       │       ├── Gambler.java
│       │       └── Roulette.java
│       └── uml/
│               ├── casino class diagram.png
│               └── casino class diagram.puml
│
├── Core ForestNotebook/
│       └── src/org.evavdb1.forestnotebook/
│               ├── NatureApp.java
│               ├── entities/animal_entities/
│               │          ├── Animal.java
│               │          ├── Carnivore.java
│               │          ├── Herbivore.java
│               │          └── Omnivore.java
│               ├── entities/plant_entities/
│               │          ├── Bush.java
│               │          ├── Flower.java
│               │          ├── LeafType.java (enum)
│               │          ├── Plant.java
│               │          ├── Scent.java (enum)
│               │          ├── Tree.java
│               │          └── Weed.java
│               └── service/
│                          └── ForestNoteBook.java
│
├── Core IceCreamShop/
│       └── src/org.evavdb1.icecreamshop/
│               ├── IceCreamAppV2.java
│               ├── eatables/
│               │          ├── Cone.java
│               │          ├── Eatable.java (interface)
│               │          ├── Flavor.java (enum)
│               │          ├── IceRocket.java
│               │          ├── Magnum.java
│               │          └── MagnumType.java (enum)
│               ├── exception/
│               │          └── NoMoreIceCreamException.java
│               └── sellers/
│                          ├── IceCreamCar.java
│                          ├── IceCreamSalon.java
│                          ├── IceCreamSeller.java (interface)
│                          ├── Pricelist.java
│                          ├── Profitable.java (interface)
│                          └── Stock.java
│
├── Exceptions BankATM/
│       ├── src/org.evavdb1.bankatm/
│       │       ├── ATMMain.java
│       │       ├── Account.java
│       │       ├── ATM.java
│       │       ├── BankCustomer.java
│       │       ├── BankSystem.java
│       │       ├── Card.java
│       │       ├── CashUnavailableException.java 
│       │       ├── DailyLimitExceededException.java
│       │       ├── InsufficientFundsException.java
│       │       ├── InvalidCardException.java
│       │       ├── InvalidPinException.java
│       │       ├── PinAttemptExceededException.java
│       │       └── Transaction.java
│       └── uml/
│               ├── atm class diagram.png
│               └── atm class diagram.puml
│
├── Inheritance Robots/
│       └── src/org.evavdb1.robots/
│               ├── RobotApp.java
│               ├── BendingRobot.java
│               ├── CrazyRobot.java
│               ├── LiftingRobot.java
│               └── Robot.java
│
├── Interface MediaPlayer/
│       └── src/org.evavdb1.mediaplayer/
│               ├── AdapterPatternDemo.java
│               ├── AdvancedMediaPlayer.java (interface)
│               ├── AudioPlayer.java
│               ├── MediaAdapter.java
│               ├── MediaPlayer.java (interface)
│               ├── MP4Player.java
│               └── VLCPlayer.java
│
├── Interface WhyPhone/
│       └── src/org.evavdb1.whyphone/
│               ├── WhyPhoneMainApp.java
│               ├── DummyPhone.java
│               ├── ICamera.java (interface)
│               ├── IGPS.java (interface)
│               ├── IRadio.java (interface)
│               ├── ISimCard.java (interface)
│               ├── IWifi.java (interface)
│               ├── SmartPhone.java
│               └── WhyPhone.java
│
├── README.md
└── .gitignore
```