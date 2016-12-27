public class ForCollectionBaseCalss {


public static void main(String args[])  {

int nums[ ] = new int[100]; //create a new array
double sum =0; //for summation of the numbers

for (int i = 0; i<100; i++) 
nums[i]=(int) (Math.random()*100); //fill the array with random numbers beteen 0 till 100

int even=0;
for(int x : nums){
	sum =sum+x;

	if(x%2==0) // if number is even then even++
		even++;

}
double average = (sum/100);

System.out.println("there are "+even+" even numbers in this array");

System.out.println("Average of this numbers is "+average);


}

}

