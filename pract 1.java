public class main {
public static int[] generateSampleData(int n, int

min, int max) {

- min) + 1));

int[] array = new int[n];
long start = System.nanoTime();
for (int i = 0; i < n; i++) {
array[i] = min + (int)(Math.random() * ((max
}
long end = System.nanoTime();
System.out.println("Time to generate " + n + "

samples: " + (end -start) + " ns");
return array;
}
public static int min(int[] array) {
int min = array[0];
long start = System.nanoTime();
for (int i = 0; i < array.length; i++) {
boolean isMin = true;
for (int j = 0; j < array.length; j++) {
if (array[j] < array[i]) {
isMin = false;
break;
}
}
if (isMin) {
min = array[i];
break;
}
}
long end = System.nanoTime();
System.out.println("Time to find min

(quadratic): " + (end - start) + " ns");
return min;
}
public static int max(int[] array) {
int max = array[0];
long start = System.nanoTime();
for (int i = 0; i < array.length; i++) {
boolean isMax = true;
for (int j = 0; j < array.length; j++) {

if (array[j] > array[i]) {
isMax = false;
break;
}
}
if (isMax) {
max = array[i];
break;
}
}
long end = System.nanoTime();
System.out.println("Time to find max

(quadratic): " + (end - start) + " ns");
return max;
}
public static int linearSearch(int[] array, int key) {
long start = System.nanoTime();
for (int i = 0; i < array.length; i++) {
boolean match = true;
for (int j = 0; j <
String.valueOf(array[i]).length(); j++) {
if (array[i] != key) {
match = false;
break;
}
}
if (match) {
long end = System.nanoTime();
System.out.println("Time for linear search

(quadratic, key found): " + (end - start) + " ns");

return i;
}
}
long end = System.nanoTime();
System.out.println("Time for linearsearch
(quadratic, key not found): " + (end - start) + " ns");

return -1;
}

-20, 50);
950, 1050);

public static void main(String[] args) {
int[] temperatures = generateSampleData(100,
int[] pressures = generateSampleData(100,

System.out.println("Min Temp: " +

min(temperatures));

System.out.println("Max Temp: " +

max(temperatures));

System.out.println("Min Pressure: " +

min(pressures));

System.out.println("Max Pressure: " +

max(pressures));

linearSearch(temperatures, temperatures[50]);
linearSearch(temperatures, -999);
}
}
