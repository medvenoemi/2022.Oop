package lab11_4;

public interface IExpression {

    public static double evaluate( String postfixExpression) throws ExpressionException
    {
        String[] temp2 = postfixExpression.split(" ");
        Stack stack = new Stack(temp2.length);

        return 0;
    }

    public static boolean isOperator(String op){
        return op.equals("*") || op.equals("/") || op.equals("+") || op.equals("-");
    }
}

