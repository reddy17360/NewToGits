package JavaProg.InterviewPrograms;

public class FindTheMissingNumber {
    public static void main(String[] args){
        findMissingOne();
    }
    static void findMissingOne(){
        int[] org={1,2,3,4,6};
        //to find missing number we can user mathematical approach i.e finding the sum
        //fist n natural numbers , where n is size of the array
        // we have to find the sum of values present in the array
        int n=org.length+1;
        int actaulSum = n * (n+1)/2;
        int expctedSum=0;
        for(int s : org){
            expctedSum = expctedSum + s;
        }
        int diff = actaulSum - expctedSum;
        System.out.println("Missing number is " + diff);



    }
}
