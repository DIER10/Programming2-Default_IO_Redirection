# Programming2-Default_IO_Redirection
Exercise for my programming class. Default input and output redirection (console app).

We programming in java with OOP and MVC (or MVP).


_(I apologize in advance for any mistakes I may have, English is not my first language)_

###########################################################################################################

The main reason for this app is to redirect the input (<) and output (>) by default of the windows console.
for this i have to create an console app ( or an attempt at it ) that receives a text and return a list with the words in the text and the number of times that it's repeated.
# Usage.
  The jar archive is contained in this same [repository](https://github.com/DIER10/Programming2-Default_IO_Redirection/blob/main/out/artifacts/IORedirection_jar/).
  For my homework it must works like this (executing the jar by console):
 
  * java -jar IORedirection.jar < "InputFileName" > "OutputFileName" (where the output file is where the list will be saved)
 
 But the jar archive can be executed and the text can be entered by console, and the return will be shown by console.
 
 # Problems that I had.
 * When i extract the list from the text, it's contained repeated words, that caused the exit list to have repeated results. Then i had to create a reference list
 to save the results of repeated words, which result in three lists, in addition to the Map to save the final list with words and repetitions.
 * The input must be by console using class "Scanner" which just accept one line, this made imposible to read a full-text file, if you want to enter a complete text, it must be done on one line.
 * It was difficult for me to completely abstract the classes, i'm still think there is a better way to do it (i need improve my abstraction).
 * I had difficulties for create a correct regular expression, i'm still do not understanding how to use certain expressions (they are very useful, so i will keep practicing).
 
 # Objectives achieved.
 * The app receive correctly the text and return the list with words and number of repetitions.
 * The input and output works well (except for reciving a text file).
 
 # Acquired knowledge.
 * I learned to use a HashMap estructure, at least the basics.
 * I learned a little more about regular expressions.
 * I used unit tests for first time, and i will keep use them and learning more about them.
 * I'm practicing my english with this `README`.
 * I learned more about git and github.
 
 # Things to improve.
 * Receive correctly a full text file with multilines (it rhymes).
 * Optimize the code. 

