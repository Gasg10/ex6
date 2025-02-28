## **Word Length Classifier in Kotlin**  

## **Description**  

This project is a simple Kotlin program that classifies a user-inputted word based on its length.  

- **Curta** (Short): 1 or 3 characters  
- **Média** (Medium): 4 to 9 characters  
- **Longa** (Long): Any other length  

Se a entrada for inválida, o programa exibe "Palavra Inválida".  

## **Function Structure**  

### **Main Function**  
- Prompts the user to enter a word.  
- Checks if the word is null (note: the null check in the code is redundant because `readln()` never returns null).  
- Determines the length of the word and classifies it accordingly.  
- Prints the classification result.  

## **How to Use**  

1. Clone the repository.  
2. Compile e execute o programa usando:  
   ```bash
   kotlinc main.kt -include-runtime -d main.jar
   java -jar main.jar


## **Author**

Developed by **Gonçalo Gonçalves**.
