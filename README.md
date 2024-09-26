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
## Data Source
The predefined strategy tables used in this project are based on the Spin-N-Go strategy guidelines provided by [PokerStrategy.com](https://www.pokerstrategy.com/strategy/sit-and-go/spin-n-go-facts-strategy/). These tables inform the decision-making logic implemented in the game, helping players understand optimal plays based on position, stack size, and hand.

### Disclaimer
This project is for educational purposes only and aims to simulate poker strategies based on publicly available resources. The strategies are sourced from PokerStrategy.com, and this project does not claim ownership of the strategy content. For more detailed explanations, professional poker advice, and bankroll-management, please visit [PokerStrategy.com](https://www.pokerstrategy.com/strategy/sit-and-go/spin-n-go-facts-strategy/).
