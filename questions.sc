
//Question 01

val radius = 5
def area(raduis:Int): Double = math.Pi*radius*radius
printf("what is the area of a disk with radius %d? = %.2f",radius,area(radius))

//Question 02

val celcius =35
def celciustofahrenheit(celcius:Double):Double=celcius*1.8000+32.00
printf("fahrenheit temperature of celcius %d is = %.3f",celcius,celciustofahrenheit(celcius))

//Question 03

val radius =5
def volume(radius:Int):Double = 4/3*math.Pi*radius*radius*radius
printf("volume of a sphere with radius %d? = %.2f",radius,volume(radius))

//Question 04

val cover = 24.95
val copies=60
def bookprice(copies:Int): Double=copies*cover
def shipping(copies:Int):Double=3*copies+(copies-50)*.75
def discount(amount:Double):Double=amount*.4

printf("wholesales price for %d copies = %.2f",copies,(bookprice(copies)-discount(bookprice(copies))+shipping(copies)))

//Question 05

def easy(x:Int):Int=x*8
def tempo(y:Int):Int=y*7

printf("Total running time of 2km in easy,3 km in tempo and another 2km in easy = %d",easy(2)+tempo(3)+easy(2))

