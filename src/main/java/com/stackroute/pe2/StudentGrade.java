package com.stackroute.pe2;

public class StudentGrade {
    int minimum, maximum;
    float average;

    @Override
    public String toString() {
        return "StudentGrade{" +
                "minimum=" + minimum +
                ", maximum=" + maximum +
                ", average=" + average +
                '}';
    }
    public String checkStudentMarks(int n, int[] input){
        int sum = 0;
        if (n == 0 | input == null)
            throw new ArithmeticException("Invalid inputs");
        for (int i=0; i<input.length; i++){
            if (input[i] < 0 && input[i] > 100)
                return "value out of range";
            sum = sum + input[i];
        }
        average = (float) sum/n;
        for (int i=0; i<input.length-1; i++){
            if (input[i] > input[i+1])
                maximum = input[i];
            else
                minimum = input[i];
        }
        return toString();
    }
}
