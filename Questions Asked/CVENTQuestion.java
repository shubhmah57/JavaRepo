import java.util.*;


class CVENTQuestion {

	public static void main(String[] args){
		CVENTQuestion question  = new CVENTQuestion();
		int a[] = question.solution(new int[]{1,5,6}, 4, 3);
		for(int i=0;i <a.length;i++){
		System.out.println(a[i]);
		}
		}
    public int[] solution(int[] A, int F, int M) {
        int sum = 0;
        for(int i =0;i < A.length; i++){
            sum = sum + A[i];
        }
        int wrongArray[] = {0};
        int requiredValue = M * (A.length + F) - sum;
        int possibleValue = 6*F;
        if(requiredValue > possibleValue){
            return wrongArray;
        }
        List<Integer> valuesList = new ArrayList<>();
        while(requiredValue >= 6){
            valuesList.add(6);
            requiredValue -= 6;
        }
        if(requiredValue > 0){
            valuesList.add(requiredValue);
        }
        int length = valuesList.size();
        int [] finalArray = new int [length];
        for(int i =0;i< length; i++){
            finalArray[i] = valuesList.get(i);
        }
        return finalArray;
    }
}
