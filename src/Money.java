/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vedika
 */
public class Money {
/** 
This class represents nonnegative amounts of money. 
*/ 
// The number of dollars 
private long dollars; 
// The number of cents 
private long cents; 
/** 
Constructor 
@param amount The amount in decimal format. 
*/ 
public Money(double amount) 
{ 
if (amount < 0) 
{ 
System.out.println("Error: Negative amounts " + 
"of money are not allowed."); 
System.exit(0); 
} 
else 
{ 
long allCents = Math.round(amount * 100); 
dollars = allCents / 100; 
cents = allCents % 100; 
} 
} 
// ADD LINES FOR TASK #1 HERE 
// Document and write a copy constructor 
public Money(Money other){
  this.dollars = other.dollars;    //copy all content of one object to another    //other is a reference variable
  this.cents = other.cents;  
  //this is new object being constructed and other is the object i copy from 
  
    System.out.println(this.dollars);
    System.out.println(this.cents);
}

/** 
//The add method 
//@param otherAmount The amount of money to add. 
//@return The sum of the calling Money object 
//and the parameter Money object. 
public Money add(Money otherAmount) 
{ 
Money sum = new Money(0); 
sum.cents = this.cents + otherAmount.cents; 
long carryDollars = sum.cents / 100; 
sum.cents = sum.cents % 100; 
sum.dollars = this.dollars + 
otherAmount.dollars + 
carryDollars; 
return sum; 
} 
/** 
*/ 
//The subtract method 
//@param amount The amount of money to subtract. 
//@return The difference between the calling Money 
//object and the parameter Money object. 
public Money subtract (Money amount) 
{ 
Money difference = new Money(0); 
if (this.cents < amount.cents) 
{ 
this.dollars = this.dollars - 1; 
this.cents = this.cents + 100; 
} 
difference.dollars = this.dollars - amount.dollars; 
difference.cents = this.cents - amount.cents; 
return difference; 
} 
/** 
The compareTo method 
@param amount The amount of money to compare against. 
@return -1 if the dollars and the cents of the 
calling object are less than the dollars and 
the cents of the parameter object. 
0 if the dollars and the cents of the calling 
object are equal to the dollars and cents of 
the parameter object. 
1 if the dollars and the cents of the calling 
object are more than the dollars and the 
cents of the parameter object. 
*/ 
public int compareTo(Money amount) 
{ 
int value; 
if(this.dollars < amount.dollars) 
value = -1; 
else if (this.dollars > amount.dollars) 
value = 1; 
else if (this.cents < amount.cents) 
value = -1; 
else if (this.cents > amount.cents) 
value = 1; 
else 
value = 0; 
return value; 
} 
// ADD LINES FOR TASK #2 HERE 
// Document and write an equals method 
// Document and write a toString method 

//equals method 
public boolean equals (Money other){
    return (this.dollars == other.dollars )&& (this.cents == other.cents);      //check and return if both are equal, same meomory location, 
   //return true or false depending on the variables 
   
   //ToString method provides a String representation of an object 
   // it lets print valuable information 
   
}

       public String toString(){
       return String.format("%d.$ , %02d",dollars, cents); 
       
       
   }

    


}
