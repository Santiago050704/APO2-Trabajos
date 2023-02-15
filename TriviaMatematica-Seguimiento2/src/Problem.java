public class Problem {
    private String problem;
    private int a;
    private int b;
    private int operator;
    private int answer;

    public Problem() {
        this.a = (int)(Math.random()*10);
        this.b = (int)(Math.random()*10);
        this.operator = (int)(Math.random()*2);
        String strOperator = (operator == 0)? "+":"*";
        this.problem = Integer.toString(a) + strOperator + Integer.toString(b);
        switch (operator){
            case 0:
                answer = a + b;
                break;
            case 1:
                answer = a * b;
                break;
        }
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }
}
