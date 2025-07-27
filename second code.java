import java.util.*;
class TaskC_SearchTemperature {
static Random rand = new Random();
static float[] generateSortedTemperature(int n, float min, float max) {
float[] data = new float[n];
for (int i = 0; i < n; i++) {
data[i] = min + rand.nextFloat() * (max - min);
}
Arrays.sort(data);
return data;
}

static int linearSearch(float[] temp) {
for (int i = 0; i < temp.length; i++) {
if (temp[i] >= 30.0) return i;
}
return -1;
}
static int binarySearch(float[] temp) {
int left = 0, right = temp.length - 1;
int result = -1;
while (left <= right) {
int mid = (left + right) / 2;
if (temp[mid] >= 30.0) {
result = mid;
right = mid - 1;
} else {
left = mid + 1;
}
}
return result;
}
public static void main(String[] args) {
int n = 1000000;
float[] temperature = generateSortedTemperature(n, 20, 50);
double startTime, endTime;
startTime = System.nanoTime();
int linearIndex = linearSearch(temperature);
endTime = System.nanoTime();
System.out.println("Linear Search Index: " + linearIndex);
System.out.println("Linear Search Time: " + (endTime - startTime) + " ns");
startTime = System.nanoTime();
int binaryIndex = binarySearch(temperature);
endTime = System.nanoTime();
System.out.println("Binary Search Index: " + binaryIndex);
System.out.println("Binary Search Time: " + (endTime - startTime) + " ns");
}
}
