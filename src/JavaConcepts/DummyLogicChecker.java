package JavaConcepts;

public class DummyLogicChecker {
    public static void main(String[] args) {
        String[] names = {"Sanju", "Manju", "Shankar", "Ravi", "Ganesh"};
        int[] marks = {90, 98, 79, 47, 99};

        for (int i = 0; i < marks.length; i++)
        {
            for (int j = 0; j < marks.length; j++)
            {
                if (marks[j] < marks[j + 1])
                {
                    int temp = marks[j + 1];
                    marks[j + 1] = marks[j];
                    marks[j] = temp;
                    //swaping names based on marks
                    String temps = names[j + 1];
                    names[j + 1] = names[j];
                    names[j] = temps;
                }

            }
        }
    }
}
