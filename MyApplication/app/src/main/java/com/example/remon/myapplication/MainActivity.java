package com.example.remon.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;


public class MainActivity extends ActionBarActivity {


    private Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equal,plus,minus,multiply,divide,delete,clear,open_bracket,close_bracket;
    private TextView display;
    private String result;
    private ArrayList<String> history;
    private String exp;
//    private boolean equalClicked;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cal_layout);
        initialize();
    }

    private void initialize(){
        history=new ArrayList<String>();
//        equalClicked=false;
        display= (TextView) findViewById(R.id.display);

        clear= (Button) findViewById(R.id.clear_button);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        delete= (Button) findViewById(R.id.delete_button);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("");
                    return;
                }
                if(display.getText().toString().length()>0)
                    display.setText(display.getText().toString().subSequence(0,display.getText().toString().length()-1));
            }
        });


        open_bracket= (Button) findViewById(R.id.open_bracket);
        open_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c='m';
                if(display.getText().toString().length()>0)
                    c=display.getText().toString().charAt(display.getText().length()-1);
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("(");
                    return;
                }else if(c!='m'&&((c>='0'&&c<='9')||c=='.')){
                    display.setText(display.getText() + "x(");
                    return;
                }
                display.setText(display.getText() + "(");
            }
        });


        close_bracket= (Button) findViewById(R.id.close_bracket);
        close_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText(")");
                    return;
                }
                display.setText(display.getText() + ")");
            }
        });

        one= (Button) findViewById(R.id.one_button);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("1");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("1");
                    return;
                }
                display.setText(display.getText() + "1");
            }
        });

        two= (Button) findViewById(R.id.two_button);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("2");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("2");
                    return;
                }
                display.setText(display.getText() + "2");
            }
        });


        three= (Button) findViewById(R.id.three_button);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("3");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("3");
                    return;
                }
                display.setText(display.getText() + "3");
            }
        });

        four= (Button) findViewById(R.id.four_button);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("4");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("4");
                    return;
                }
                display.setText(display.getText() + "4");
            }
        });

        five= (Button) findViewById(R.id.five_button);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("5");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("5");
                    return;
                }
                display.setText(display.getText() + "5");
            }
        });

        six= (Button) findViewById(R.id.six_button);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("6");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("6");
                    return;
                }
                display.setText(display.getText() + "6");
            }
        });

        seven= (Button) findViewById(R.id.seven_button);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("7");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("7");
                    return;
                }
                display.setText(display.getText() + "7");
            }
        });

        eight= (Button) findViewById(R.id.eight_button);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("8");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("8");
                    return;
                }
                display.setText(display.getText() + "8");
            }
        });

        nine= (Button) findViewById(R.id.nine_button);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("9");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("9");
                    return;
                }
                display.setText(display.getText() + "9");
            }
        });

        zero= (Button) findViewById(R.id.zero_button);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if (equalClicked){
//                    display.setText("0");
//                    equalClicked=false;
//                    return;
//                }
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("0");
                    return;
                }
                display.setText(display.getText() + "0");
            }
        });

        dot= (Button) findViewById(R.id.dot_button);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("Invalid Input !");
                    return;
                }
                if (checkDot())
                    display.setText(display.getText() + ".");
            }
        });

        plus= (Button) findViewById(R.id.plus_button);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"+");
//                equalClicked=false;
            }
        });

        minus= (Button) findViewById(R.id.minus_button);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"-");
//                equalClicked=false;
            }
        });

        divide= (Button) findViewById(R.id.divide_button);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"/");
//                equalClicked=false;
            }
        });

        multiply= (Button) findViewById(R.id.multiply_button);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"x");
//                equalClicked=false;
            }
        });


        equal= (Button) findViewById(R.id.equal_button);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                equalClicked=true;
                calculate();
            }
        });

    }



    public boolean isValid(ArrayList<String> expersion, int count) {
        Stack<String> s = new Stack<String>();
        if (expersion==null||expersion.size()==0||expersion.get(0) == null)
            return false;
        if (expersion.get(0).compareTo("+") == 0
                || expersion.get(count - 1).compareTo("+") == 0
                || expersion.get(0).compareTo("x") == 0
                || expersion.get(count - 1).compareTo("x") == 0
                || expersion.get(count - 1).compareTo("-") == 0
                || expersion.get(0).compareTo("/") == 0
                || expersion.get(count - 1).compareTo("/") == 0
                || expersion.get(0).compareTo("(") == 0
                || expersion.get(count - 1).compareTo(")") == 0) {
            return false;
        }
        if (expersion.get(0).compareTo("(") == 0) {
            s.push("1");
        }
        boolean isNum = false;
        int l;
        for (int i = 1; i < count - 1; i++) {

            if (expersion.get(i).compareTo("+") == 0
                    || expersion.get(i).compareTo("-") == 0
                    || expersion.get(i).compareTo("x") == 0
                    || expersion.get(i).compareTo("/") == 0) {
                isNum = false;
                if (expersion.get(i + 1).compareTo("+") == 0
                        || expersion.get(i + 1).compareTo("x") == 0
                        || expersion.get(i + 1).compareTo("/") == 0) {
                    return false;
                }
            } else {
                isNum = true;
            }

            if (isNum) {

                if (expersion.get(i).compareTo("(") == 0) {
                    if (i != 0) {
                        if (expersion.get(i - 1).compareTo("+") == 0
                                || expersion.get(i - 1).compareTo("-") == 0
                                || expersion.get(i - 1).compareTo("x") == 0
                                || expersion.get(i - 1).compareTo("/") == 0
                                || expersion.get(i - 1).compareTo("(") == 0) {

                        } else {
                            return false;
                        }
                    }
                    if (expersion.get(i + 1).compareTo("+") == 0
                            || expersion.get(i + 1).compareTo("-") == 0
                            || expersion.get(i + 1).compareTo("x") == 0
                            || expersion.get(i + 1).compareTo("/") == 0
                            || expersion.get(i + 1).compareTo("(") == 0) {
                        return false;
                    }

                    s.push("1");
                    if (expersion.get(i + 1).compareTo(")") == 0) {
                        return false;
                    }

                } else if (expersion.get(i).compareTo(")") == 0) {
                    if (expersion.get(i - 1).compareTo("+") == 0
                            || expersion.get(i - 1).compareTo("-") == 0
                            || expersion.get(i - 1).compareTo("x") == 0
                            || expersion.get(i - 1).compareTo("/") == 0) {
                        return false;
                    } else if (expersion.get(i + 1).compareTo("+") == 0
                            || expersion.get(i + 1).compareTo("-") == 0
                            || expersion.get(i + 1).compareTo("x") == 0
                            || expersion.get(i + 1).compareTo("/") == 0
                            || expersion.get(i + 1).compareTo(")") == 0) {
                    } else
                        return false;

                    if (s.isEmpty())
                        return false;
                    else {
                        s.pop();
                    }
                } else {
                    if (expersion.get(i - 1).compareTo("+") == 0
                            || expersion.get(i + 1).compareTo("+") == 0
                            || expersion.get(i - 1).compareTo("-") == 0
                            || expersion.get(i + 1).compareTo("-") == 0
                            || expersion.get(i - 1).compareTo("x") == 0
                            || expersion.get(i + 1).compareTo("x") == 0
                            || expersion.get(i - 1).compareTo("/") == 0
                            || expersion.get(i + 1).compareTo("/") == 0
                            || expersion.get(i - 1).compareTo("(") == 0
                            || expersion.get(i + 1).compareTo(")") == 0) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }

        }
        if (expersion.get(count - 1).compareTo(")") == 0) {
            s.pop();
        }
        if (!s.isEmpty())
            return false;
        return true;

    }

    public  boolean check(String a) {
        if(a.length()>0 && (a.charAt(0)=='x'||a.charAt(0)=='/')) return  false;
        for (int i = 0; i < a.length(); i++) {
            if (!((a.charAt(i) >= '0' && a.charAt(i) <= '9')
                    || a.charAt(i) == '/' || a.charAt(i) == 'x'
                    || a.charAt(i) == '-' || a.charAt(i) == '+'
                    || a.charAt(i) == '(' || a.charAt(i) == ')' || a.charAt(i) == '.')) {
                System.out.println("Not Valid = " + a);
                return false;
            }


            if(i>0 &&(a.charAt(i)=='+' ||a.charAt(i)=='x' || a.charAt(i)=='/')){
                if(a.charAt(i)==a.charAt(i-1)){
                    return  false;
                }
            }

        }
        return true;
    }

    public String removeMultipleMinus(String st) {
        String newSt = "";
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) != '-')
                newSt += st.charAt(i);
            else {
                int numOfminus = 0;
                while (i < st.length() && st.charAt(i) == '-') {
                    numOfminus++;
                    i++;
                }
                i--;
                if (numOfminus % 2 == 0)
                    newSt += '+';
                else
                    newSt += '-';
            }
        }
        return newSt;
    }



    public String removeMultiplePlus(String st) {
        String newSt = "";
        int i=0;
        while (st.charAt(i)=='+'){
            i++;
            System.out.println("i = "+i);
        }
        for (; i < st.length(); i++) {
            if (st.charAt(i) != '+')
                newSt += st.charAt(i);
            else {
                int numOfminus = 0;
                while (i < st.length() && st.charAt(i) == '+') {
                    numOfminus++;
                    i++;
                }
                i--;
                newSt += '+';
            }
        }

        return newSt;
    }

    public void calculate(){
        // String[] elements = new String[100];
        ArrayList<String> elements = new ArrayList<String>();
        String st = display.getText().toString();
        exp=st;
        if(st.length()>0&&st.charAt(0)=='(')
            st="0+"+st;
        if (!check(st)) {
            display.setText("Invalid Input !");
            System.out.println("Error 1");
            return;
        }
        if (st.contains("Invalid Input !")
                || st.contains("Math Error !")) {
            display.setText("Invalid Input !");
            System.out.println("Error 2");
            return;
        }

        int index = 0;

        st = removeMultipleMinus(display.getText().toString());
        st = removeMultiplePlus(st);

        System.err.println("newSt = " + st);
        char[] values = st.toCharArray();
        System.out.println(Arrays.toString(values));

        for (int i = 0; i < values.length; i++) {
//            if(values[i]=='('){
//                elements.add("(");
//            };
            if (i > 0
                    && (values[i] == '-' && ((values[i - 1] == '+'
                    || values[i - 1] == '-'
                    || values[i - 1] == 'x'
                    || values[i - 1] == '/' || values[i - 1] == '(')))) {
                String num = "-";
                i++;
                System.err.println("enter 2---------->  " + num);
                while (i >= 0
                        && (i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] == '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                // elements[index] = num;
                elements.add(num);
                index++;
                System.err.println("enter 3---------->  " + num);

            } else if (i != 0
                    && (values[i] == '+' || values[i] == '-'
                    || values[i] == 'x' || values[i] == '/'
                    || values[i] == '(' || values[i] == ')')) {
                // elements[index] = values[i] + "";
                // elements.set(index, values[i] + "");
                elements.add(values[i] + "");
                index++;
            } else if (i == 0 && values[i] == '-') {
                String num = "-";
                i++;
                while ((i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] == '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                System.err.println("num1 = "+num);
                elements.add(num);
                index++;
                System.out.println("enter 1---------->  " + num);
            } else {
                String num = "";
                while ((i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] <= '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                System.err.println("num2 = "+num);
                elements.add(num);
                index++;

            }

        }

        System.out.println(elements.toString());
        System.out.println(isValid(elements, index));
        System.out.println("OPeration" + elements.toString());
        String expression = removeMultipleMinus(display.getText().toString());
        expression = removeMultiplePlus(expression);
        if (expression.contains("+") || expression.contains("-")
                || expression.contains("x") || expression.contains("/")) {
            System.out.println("Expression = " + expression);
            String save = "";
            ArrayList<String> postfix = turn(st);
            System.out.println("from turn method" + postfix.toString());
            postfix = toPostfix(postfix);
            System.out.println("from postfix method"
                    + postfix.toString());
            result = evalute(postfix);
            display.setText(result);
            if(!result.equals("Math Error !")&&!result.equals("Invalid Input !")){
                history.add(exp+" = "+result);
            }
            System.err.println("result = " + result);
            save += result;

        }
        if (display.getText().equals("")
                || display.getText().equals("Math Error !")) {
            result = "Math Error !";
            return;
        }
    }



    public ArrayList<String> toPostfix(ArrayList<String> old) {
        Stack<String> stack = new Stack<String>();
        ArrayList<String> postFix = new ArrayList<String>();
        for (String st : old) {
            if (!st.equals("+") && !st.equals("-") && !st.equals("x")
                    && !st.equals("/") && !st.equals("(") && !st.equals(")")) {
                postFix.add(st);
                System.out.println(st);
            } else if (st.equals("+") || st.equals("-")) {
                if (stack.isEmpty() || stack.peek().equals("(")) {
                    stack.push(st);
                } else if (!stack.isEmpty()
                        && (stack.peek().equals("+") || stack.peek()
                        .equals("-"))) {
                    while (!stack.isEmpty()
                            && (stack.peek().equals("+") || stack.peek()
                            .equals("-"))) {
                        postFix.add(stack.pop());
                    }
                    stack.push(st);
                } else if (!stack.isEmpty()
                        && (stack.peek().equals("x") || stack.peek()
                        .equals("/"))) {
                    while (!stack.isEmpty()
                            && (stack.peek().equals("x")
                            || stack.peek().equals("/")
                            || stack.peek().equals("+") || stack.peek()
                            .equals("-"))) {
                        postFix.add(stack.pop());
                    }
                    stack.push(st);
                }
            } else if (st.equals("x") || st.equals("/")) {
                if (stack.isEmpty() || stack.peek().equals("(")) {
                    stack.push(st);
                } else if (stack.peek().equals("+") || stack.peek().equals("-")) {
                    stack.push(st);
                } else if (stack.peek().equals("x") || stack.peek().equals("/")) {
                    while (!stack.isEmpty()
                            && (stack.peek() == "x" || stack.peek() == "/")) {
                        postFix.add(stack.pop());
                    }
                    stack.push(st);
                }
            } else if (st.equals("(")) {
                stack.push(st);
            } else if (st.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postFix.add(stack.pop());
                }
                if (!stack.isEmpty())
                    stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            postFix.add(stack.pop());
        }

        return postFix;
    }

    public String evalute(ArrayList<String> postFix) {
        Stack<String> stack = new Stack<String>();
        String result;
        for (String st : postFix) {
            if (!st.equals("+") && !st.equals("-") && !st.equals("x")
                    && !st.equals("/")) {
                stack.push(st);
            } else {
                if(stack.size()<2)
                    return "Invalid Input !";
                String operand_2 = stack.pop();
                System.out.println("operand_2 = "+operand_2);
                String operand_1 = stack.pop();
                System.out.println("operand_1 = "+operand_1);
                double operand1,operand2;
                if(!isDouble(operand_1) ||!isDouble(operand_2)){
                    return "Invalid Input !";
                }

                operand1=Double.parseDouble(operand_1);
                operand2=Double.parseDouble(operand_2);
                if (st.equals("+")) {
                    double value = operand1 + operand2;
                    stack.push(value + "");
                } else if (st.equals("-")) {
                    double value = operand1 - operand2;
                    stack.push(value + "");
                } else if (st.equals("x")) {
                    double value = operand1 * operand2;
                    stack.push(value + "");
                } else if (st.equals("/")) {
                    double value = operand1 / operand2;
                    stack.push(value + "");
                }
            }
        }

        if (!stack.isEmpty())
            result = stack.pop();
        else
            result="Invalid Input !";
        System.out.println("stack.pop() = " + result);
        return result;
    }

    public boolean isDouble(String st){
        if(st=="" || st==null || st.length()<1) return false;
        for (int i=0; i<st.length(); i++){
            if(!((st.charAt(i)>='0' && st.charAt(i)>='0')||st.charAt(i)=='.'||st.charAt(i)=='-')){
                return false;
            }
        }
        return true;
    }

    public boolean checkDot() {
        String display = this.display.getText().toString();
        if (!(display.contains(".") || display.contains("+")
                || display.contains("-") || display.contains("x")
                || display.contains("/") || display.contains(")") || display
                .contains("("))) {
            return true;
        }
        ArrayList<String> arr = turn(display);
        System.out.println("ArrayList " + arr);
        if (arr == null)
            return false;
        if ((arr.get(arr.size() - 1).contains(".")
                || arr.get(arr.size() - 1).contains("(") || arr.get(
                arr.size() - 1).contains(")")))
            return false;
        System.out
                .println("arr.get(arr.size()-1) = " + arr.get(arr.size() - 1));

        if (display.equals("Math Error !"))
            return false;
        return true;
    }

    public ArrayList<String> turn(String ex) {
        if (ex.length() <= 1)
            return null;
        ArrayList<String> list = new ArrayList<String>();
        char[] values = ex.toCharArray();
        for (int i = 0; i < values.length; i++) {
            if(ex.charAt(i)=='(') {
                list.add("(");
                continue;
            };
            if (i > 0
                    && (values[i] == '-' && ((values[i - 1] == '+'
                    || values[i - 1] == '-' || values[i - 1] == 'x'
                    || values[i - 1] == '/' || values[i - 1] == '(')))) {
                String num = "-";
                i++;
                System.out.println("enter 2---------->  " + num);
                while (i >= 0
                        && (i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] == '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                list.add(num);
                System.out.println("enter 3---------->  " + num);

            }

            else if (i != 0
                    && (values[i] == '+' || values[i] == '-'
                    || values[i] == 'x' || values[i] == '/'
                    || values[i] == '(' || values[i] == ')')) {
                list.add(values[i] + "");
            } else if (i == 0 && values[i] == '-') {
                String num = "-";
                i++;
                while ((i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] == '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                list.add(num);
                System.out.println("enter 1---------->  " + num);
            } else {
                String num = "";
                while ((i < values.length
                        && (values[i] >= '0' && values[i] <= '9') || values[i] <= '.')) {
                    num += values[i];
                    if (i + 1 < values.length
                            && ((values[i + 1] >= '0' && values[i + 1] <= '9') || values[i + 1] == '.'))
                        i++;
                    else
                        break;
                }
                list.add(num);
            }
        }
        return list;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_history:
                showHistory();
                return true;
            case R.id.clear_history:
                history=new ArrayList<String>();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showHistory() {
        StringBuffer st=new StringBuffer();
        for (int i=0; i<history.size();i++){
            st.append(i+1+") "+history.get(i)+'\n');
        }
        display.setText(st.toString());
    }
}