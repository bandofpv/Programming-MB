#include <stdio.h>  //This includes the file stdio.h.
const float LOW_TEMP_F_WARNING=0.;  //Creates a constant float for a low temperature warning to 0.
const float HIGH_TEMP_F_WARNING=100.; //Creates a constant float for a high temperature warning to 100.
const int MAX_LOOP=10.; //Creates constant interger max loop to 5
float temp_f; //Creates float temp_f
float temp_c; //Creates float temp_f
float temp_k; //Creates float temp_k

void ask(){
  printf("\nEnter the temperatature in degrees F : "); // Input the temperature to convert 
  scanf("%f",&temp_f); // Reads the user input
}

void value_c(){
  temp_c = (temp_f - 32) / 1.8; // Math formula to convert Farenheit to Celcius
  printf("The temperature in Celisus (C) is  %f\n",temp_c); // Output the Celcius result
}

void value_k(){
   temp_k = temp_c + 273.15; // Math formula to convert Farenheit to Kelvin
   printf("The temperature in Kelvin (K) is  %f\n",temp_k); // Output the Kelvin result
}

void High_Temp(){
   if(temp_f > HIGH_TEMP_F_WARNING){ // Check for high temperature 
      printf("Remember to hydrate!\n"); //Print Remeber to hydrate
    }
}

void Low_Temp(){
   if(temp_f < LOW_TEMP_F_WARNING ){ // Check for low temperature
      printf("Remember to pack lots of layers!\n"); //Print Remember to pack lots of layers
    }
}

int main() // Declaration of program 
{
  for(int i=0; i<MAX_LOOP; i++){ // loop
    ask(); //Ask the question
    value_c(); //Print C value
    value_k(); //Print K value
    High_Temp(); //Print Hight temp
    Low_Temp(); //Print low temp
  }
   
  return(0); // exits the program
}
