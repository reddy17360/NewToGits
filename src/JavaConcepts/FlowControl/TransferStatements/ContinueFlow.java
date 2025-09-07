package JavaConcepts.FlowControl.TransferStatements;

 class ContinueFlow {
    public static void main(String[] sanju){
        printOddNum();
    }
    static void printOddNum(){
        for(int j=1 ; j<=4;j++) {

            for (int i = 1; i <= 4; i++) {
                if (i==j) {
                    continue; //it will skip the current iteration
                }
                System.out.println(j+ " " + i);

            }
        }
    }

}
