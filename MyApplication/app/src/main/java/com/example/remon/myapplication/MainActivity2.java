package com.example.remon.myapplication;

import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import static com.example.remon.myapplication.R.color.black;


public class MainActivity2 extends ActionBarActivity {


        TextView display;
        Display screen;
        String result;
        LinearLayout linearLayout;
        LinearLayout linearLayout1;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        LinearLayout linearLayout5;
        Button one,two,three,four,five,six,seven,eight,nine,zero,dot,equal
            ,plus,minus,multiply,divide,delete,clear,open_bracket,close_bracket;
        Point size;
        int width;
        int height;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            createUI();
            initialize();
        }



    public void createUI() {
        linearLayout=new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);



        linearLayout1=new LinearLayout(this);
        linearLayout1.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout2=new LinearLayout(this);
        linearLayout2.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout3=new LinearLayout(this);
        linearLayout3.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout4=new LinearLayout(this);
        linearLayout4.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout5=new LinearLayout(this);
        linearLayout5.setOrientation(LinearLayout.HORIZONTAL);

        screen = getWindowManager().getDefaultDisplay();
        size = new Point();
        screen.getSize(size);
        width = size.x;
        height = size.y;

        display = new TextView(this);
        display.setTextSize(18);
        display.setTextColor(black);
        display.setWidth(width);
        display.setHeight(height / 4);

        display.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);
        display.setMovementMethod(new ScrollingMovementMethod());
        display.setText("");




        seven =new Button(this);
        seven.setText("7");
        seven.setWidth(width/4);
        seven.setHeight(((height-height/4)/5)-5);

        eight =new Button(this);
        eight.setText("8");
        eight.setWidth(width/4);
        eight.setHeight(((height-height/4)/5)-5);

        nine =new Button(this);
        nine.setText("9");
        nine.setWidth(width/4);
        nine.setHeight(((height-height/4)/5)-5);

        plus =new Button(this);
        plus.setText("+");
        plus.setWidth(width/4);
        plus.setHeight(((height-height/4)/5)-5);



        linearLayout1.addView(seven);
        linearLayout1.addView(eight);
        linearLayout1.addView(nine);
        linearLayout1.addView(plus);






        four =new Button(this);
        four.setText("4");
        four.setWidth(width/4);
        four.setHeight(((height-height/4)/5)-5);

        five =new Button(this);
        five.setText("5");
        five.setWidth(width/4);
        five.setHeight(((height-height/4)/5)-5);

        six =new Button(this);
        six.setText("6");
        six.setWidth(width/4);
        six.setHeight(((height-height/4)/5)-5);

        minus =new Button(this);
        minus.setText("-");
        minus.setWidth(width/4);
        minus.setHeight(((height-height/4)/5)-5);



        linearLayout2.addView(four);
        linearLayout2.addView(five);
        linearLayout2.addView(six);
        linearLayout2.addView(minus);










        one =new Button(this);
        one.setText("1");
        one.setWidth(width/4);
        one.setHeight(((height-height/4)/5)-5);

        two =new Button(this);
        two.setText("2");
        two.setWidth(width/4);
        two.setHeight(((height-height/4)/5)-5);

        three =new Button(this);
        three.setText("3");
        three.setWidth(width/4);
        three.setHeight(((height-height/4)/5)-5);

        multiply =new Button(this);
        multiply.setText("X");
        multiply.setWidth(width/4);
        multiply.setHeight(((height-height/4)/5)-5);



        linearLayout3.addView(one);
        linearLayout3.addView(two);
        linearLayout3.addView(three);
        linearLayout3.addView(multiply);











        zero =new Button(this);
        zero.setText("0");
        zero.setWidth(width/4);
        zero.setHeight(((height-height/4)/5)-5);

        dot =new Button(this);
        dot.setText(".");
        dot.setWidth(width/4);
        dot.setHeight(((height-height/4)/5)-5);

        equal =new Button(this);
        equal.setText("=");
        equal.setWidth(width/4);
        equal.setHeight(((height-height/4)/5)-5);

        divide =new Button(this);
        divide.setText("/");
        divide.setWidth(width/4);
        divide.setHeight(((height-height/4)/5)-5);



        linearLayout4.addView(zero);
        linearLayout4.addView(dot);
        linearLayout4.addView(equal);
        linearLayout4.addView(divide);



        open_bracket =new Button(this);
        open_bracket.setText("(");
        open_bracket.setWidth(width/4);
        open_bracket.setHeight(((height-height/4)/5)-5);

        close_bracket =new Button(this);
        close_bracket.setText(")");
        close_bracket.setWidth(width/4);
        close_bracket.setHeight(((height-height/4)/5)-5);

        delete =new Button(this);
        delete.setText("D");
        delete.setWidth(width/4);
        delete.setHeight(((height-height/4)/5)-5);

        clear =new Button(this);
        clear.setText("C");
        clear.setWidth(width/4);
        clear.setHeight(((height-height/4)/5)-5);



        linearLayout5.addView(open_bracket);
        linearLayout5.addView(close_bracket);
        linearLayout5.addView(delete);
        linearLayout5.addView(clear);



        linearLayout.setWeightSum(7);
        linearLayout.addView(display);
        linearLayout.addView(linearLayout1);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(linearLayout4);
        linearLayout.addView(linearLayout5);

        setContentView(linearLayout);
    }





    private void initialize(){
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("");
                    return;
                }
                if(display.getText().toString().length()>0)
                    display.setText(display.getText().toString().subSequence(0, display.getText().toString().length()-1));
            }
        });


        open_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                char c= display.getText().toString().charAt(display.getText().length()-1);
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("(");
                    return;
                }else if((c>='0'&&c<='9')||c=='.'){
                    display.setText(display.getText() + "x(");
                    return;
                }
                display.setText(display.getText() + "(");
            }
        });


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

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("1");
                    return;
                }
                display.setText(display.getText() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("2");
                    return;
                }
                display.setText(display.getText() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("3");
                    return;
                }
                display.setText(display.getText() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("4");
                    return;
                }
                display.setText(display.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("5");
                    return;
                }
                display.setText(display.getText() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("6");
                    return;
                }
                display.setText(display.getText() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("7");
                    return;
                }
                display.setText(display.getText() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("8");
                    return;
                }
                display.setText(display.getText() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("9");
                    return;
                }
                display.setText(display.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (display.getText().toString().contains("Math Error !")
                        || display.getText().toString().contains("Invalid Input !")) {
                    display.setText("0");
                    return;
                }
                display.setText(display.getText() + "0");
            }
        });

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
                else
                    display.setText("Invalid Input !");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"+");
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"-");
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"/");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText()+"x");
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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

    public void calculate(){
        // String[] elements = new String[100];
        ArrayList<String> elements = new ArrayList<String>();
        String st = display.getText().toString();
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

        System.err.println("newSt = " + st);
        char[] values = st.toCharArray();
        System.out.println(Arrays.toString(values));

        for (int i = 0; i < values.length; i++) {
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
                elements.add(values[i]+"");
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
                // elements[index] = num;
                // elements.set(index, num);
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
                // elements[index] = num;
                elements.add(num);
                index++;

            }

        }
        System.out.println(elements.toString());
        System.out.println(isValid(elements, index));
        System.out.println("OPeration" + elements.toString());
        String expression = removeMultipleMinus(display.getText()
                .toString());
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
            if(!((st.charAt(i)>='0' && st.charAt(i)>='0')||st.charAt(i)=='.')){
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

}