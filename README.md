# Solution for Java Hometask 2

## Description
This repository contains a Java project with the solution for the Java Hometask 2.  
The project was created with the Eclipse IDE for Java Developers - 2023-09.  
The repository should be cloned and the project imported into a workspace with the wizard of eclipse.  

## Personal details
Name: Leander Hackmann  
Mat.-Nr.: 7217912

## Short description of the solution
The class "Car" contains the attributes "id", "brand", "model", "year_of_manufacture", "color", "price" and "registration_number" which
are from the typ String or int, depending on if a combination of numbers and letters or only a number should be saved in the variable.  
The variables are declared as private variables and the class contains public getters and setters for safely accessing the values.  
There are also two constructors implemented, one without arguments to initialize the attributes to a default value and one constructor
that accepts attributes to set the values of all attributes when calling the constructor.  
  
  
The class "Main" contains the main method and therefore the entry-point of the program.  
First an array from the type "Car" and the length of 10 elements gets created and filled with 10 example cars by calling the constructor with
arguments.  
Afterwards an object of the type "FileWriter" gets created to prepare the following writing actions to a textfile.  
Also a String containing the name of the searched brand gets initialized.  
In a try-catch-block the object of the type "FileWriter" gets initialized and a headline containing the name of the searched brand gets
written to the textfile.  
In a for-loop inside the try-catch-block the values of the attribute "brand" of all elements of the array are getting compared to the value
of the String containing the name of the searched brand and the values of the attributes of the element are written to the textfile when
the brands are matching.  
After the interation over all elements of the array the textfile gets closed.  
  
The solution of exercise b) is analog to the previous solution. The differences lie in what is compared in the if-clause inside the for-loop.  
Two variables containing the searched model and the desired minimum age are created.  
To calculate the age of a car the value of the field "year_of_manufacture" gets subtracted from the current year,
compared by ">=" to the desired age and the result then gets combined by a "&&"-operator to the result of the comparison of the model name.
The current year is getting obtained by the function "Year.now().getValue()".  
When matching the two criterias, the attributes of the element are also written into a line in the textfile.  
  
The solution of exercise c) is also analog to the solutions of exercises a) and b). The differences lie also here in what is compared in the if-clause inside the for-loop.  
Here two variables containing the wanted year of manufacturing and minimum price are created.  
In the if-clause, the value of the attribute "year_of_manufacture" is checked if equal to the wanted year of manufacturing and the result gets combined
by a "&&"-operator to a check if the value of the attribute "price" is greater than the specified minimum price.  
When matching the two criterias, the attributes of the element are also written into a line in the textfile. 