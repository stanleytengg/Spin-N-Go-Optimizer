# The Spin & Go Optimizer: A 3-Player SNG Tournament Pre-Flop Strategy
This Spin-N-Go Strategy Optimizer is a Java-based command-line tool designed to help poker players make strategic decisions based on their position, hand, and stack size in Spin-N-Go poker games. The program provides recommended actions, such as pushing, folding, or raising, based on pre-defined tables for various game scenarios.

## Setup and Installation
### Prerequisites
- Java Development Kit (JDK) 8 or higher 
- A command-line interface such as Terminal or Command Prompt

### Compilation
1. Clone the repository
```
git clone https://github.com/stanleytengg/Spin-N-Go-Optimizer.git
cd Spin-N-Go-Strategy
```
2. Compile and run
```
javac -d bin src/main/*.java
java -cp bin main.Main
```

## Sample Interaction
```
Enter your position (SB/BTN/BB): SB
Enter your hand: AKo
Enter your stack: 9

-----------------------------
Recommended action: PUSH!
-----------------------------

Terminate? (Y/N) n
Enter your position (SB/BTN/BB): BTN
Enter your hand: 23s
Enter your stack: 3

-----------------------------
Recommended action: FOLD!
-----------------------------

Terminate? (Y/N) y
```