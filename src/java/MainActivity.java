package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.regex.Pattern;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerview;
    TextView text,one,two,three,four,five,six,seven,eight,nine,zero,double_zero,dot,addition,subract,multiply,divide,all_clear,backspace_textview,equal;
    int start=0,startindex=0,minus=0,plus=0,mul=0,div=0,length=0,dot_active=0;
    double firstnumber=1.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        text=findViewById(R.id.text);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        double_zero=findViewById(R.id.double_zero);
        dot=findViewById(R.id.dot);
        addition=findViewById(R.id.addition);
        subract=findViewById(R.id.subract);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);
        all_clear=findViewById(R.id.all_clear);
        backspace_textview=findViewById(R.id.backspace_textview);
        equal=findViewById(R.id.equal);
        one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("1");
                if(dot_active==1) {
                    text.setText(text.getText() + "1");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"1");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "1");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("2");
                if(dot_active==1) {
                    text.setText(text.getText() + "2");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"2");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "2");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("3");
                if(dot_active==1) {
                    text.setText(text.getText() + "3");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"3");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "3");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("4");
                if(dot_active==1) {
                    text.setText(text.getText() + "4");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"4");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "4");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("5");
                if(dot_active==1) {
                    text.setText(text.getText() + "5");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"5");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "5");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("6");
                if(dot_active==1) {
                    text.setText(text.getText() + "6");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"6");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "6");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("7");
                if(dot_active==1) {
                    text.setText(text.getText() + "7");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"7");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "7");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("8");
                if(dot_active==1) {
                    text.setText(text.getText() + "8");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"8");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "8");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("9");
                if(dot_active == 1) {
                    text.setText(text.getText() + "9");
                }
                else if(length==1 && text.getText().charAt(startindex)=='0')
                {
                    StringBuilder just=new StringBuilder(text.getText());
                    just.deleteCharAt(startindex);
                    System.out.println(just);
                    text.setText(just+"9");
                }
                else if(length<9 && dot_active == 0) {
                    text.setText(text.getText() + "9");
                        ++length;
                }
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("0");
                if(dot_active==1) {
                    text.setText(text.getText() + "0");
                }
                else if(length<9 && dot_active==0) {
                    text.setText(text.getText() + "0");
                        ++length;
                }
                else if(div==1)
                    Toast.makeText(MainActivity.this, "invalid operation", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();
            }
        });
        double_zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //System.out.println("00");
                if(length==0 && div!=1 && dot_active==0)
                {
                    text.setText(text.getText() + "0");
                    ++length;
                }
                else if(length > 0 && length < 8 && div!=1 && dot_active==0){
                    text.setText(text.getText() + "00");
                        length = length + 2;
            }
                else if(dot_active==1){
                    text.setText(text.getText() + "00");
                }
                else if(div==1)
                    Toast.makeText(MainActivity.this, "invalid operation", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "9 digits only allowed", Toast.LENGTH_SHORT).show();

            }
        });
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println(".");
                if(dot_active==0) {
                    dot_active = 1;
                    if(text.getText().length()==startindex)
                        text.setText(text.getText() + "0.");
                    else
                        text.setText(text.getText() + ".");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("*");
                System.out.println(start);
                dot_active=0;
                length=0;
                if(text.getText().toString().length()>0) {
                    StringBuilder temp=new StringBuilder(text.getText());
                    if(text.getText().length()!=startindex) {
                        if (start == 0) {
                            if(temp.charAt(startindex)=='.')
                                firstnumber=0;
                            else
                            firstnumber = Double.parseDouble((String) text.getText());
                            start = 1;
                            System.out.println(start);
                        } else if (plus == 1) {
                            firstnumber = firstnumber + Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            plus = 0;
                        } else if (minus == 1) {
                            firstnumber = firstnumber - Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            minus = 0;
                        } else if (mul == 1) {
                            firstnumber = firstnumber * Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            mul = 0;
                        } else {
                            firstnumber = firstnumber / Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            div = 0;
                        }
                        text.setText(text.getText() + "*");
                        mul = 1;
                        startindex = text.getText().length();
                    }
                    else {
                        text.setText(temp.toString().toCharArray(), 0, startindex-1);
                        text.setText(text.getText()+"*");
                        start=1;
                    }
                }
                else
                    Toast.makeText(MainActivity.this, "enter the number", Toast.LENGTH_SHORT).show();
            }
        });
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("/");
                System.out.println(start);
                length=0;
                dot_active=0;
                if(text.getText().toString().length()>0) {
                    StringBuilder temp = new StringBuilder(text.getText());
                    if(start==0 || text.getText().length()!=startindex) {
                        if (start == 0) {
                            if(temp.charAt(startindex)=='.')
                                firstnumber=0;
                            else
                            firstnumber = Double.parseDouble((String) text.getText());
                            start = 1;
                            System.out.println(start);
                        } else if (plus == 1) {
                            firstnumber = firstnumber + Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            plus = 0;
                        } else if (minus == 1) {
                            firstnumber = firstnumber - Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            minus = 0;
                        } else if (mul == 1) {
                            firstnumber = firstnumber * Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            mul = 0;
                        } else {
                            firstnumber = firstnumber / Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            div = 0;
                        }
                        div = 1;
                        text.setText(text.getText() + "/");
                        startindex = text.getText().length();
                    }
                    else {
                        text.setText(temp.toString().toCharArray(), 0, startindex-1);
                        text.setText(text.getText()+"/");
                        start=1;
                    }
                }
                else
                    Toast.makeText(MainActivity.this, "enter the number", Toast.LENGTH_SHORT).show();
            }
        });
        addition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //System.out.println("+");
                System.out.println(start);
                dot_active=0;
                length=0;
                if(text.getText().toString().length()>0) {
                    StringBuilder temp = new StringBuilder(text.getText());
                    if(start==0 || text.getText().length()!=startindex) {
                        if (start == 0) {
                            if(temp.charAt(startindex)=='.')
                                firstnumber=0;
                            else
                            firstnumber = Double.parseDouble((String) text.getText());
                            start = 1;
                            System.out.println(start);
                        } else if (plus == 1) {
                            firstnumber = firstnumber + Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            plus = 0;
                        } else if (minus == 1) {
                            firstnumber = firstnumber - Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            minus = 0;
                        } else if (mul == 1) {
                            firstnumber = firstnumber * Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            mul = 0;
                        } else {
                            firstnumber = firstnumber / Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            div = 0;
                        }
                        plus = 1;
                        text.setText(text.getText() + "+");
                        startindex = text.getText().length();
                        System.out.println("one");
                    }
                    else {
                        text.setText(temp.toString().toCharArray(), 0, startindex-1);
                        text.setText(text.getText()+"+");
                        start=1;
                        System.out.println("two");
                    }
                }
                else
                    Toast.makeText(MainActivity.this, "enter the number", Toast.LENGTH_SHORT).show();
            }
        });
        subract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("-");
                System.out.println(start);
                length=0;
                dot_active=0;
                if(text.getText().toString().length()>0) {
                    StringBuilder temp = new StringBuilder(text.getText());
                    if(text.getText().length()!=startindex) {
                        if (start == 0) {
                            if(temp.charAt(startindex)=='.')
                                firstnumber=0;
                            else
                            firstnumber = Double.parseDouble((String) text.getText());
                            start = 1;
                            System.out.println(start);
                        } else if (plus == 1) {
                            firstnumber = firstnumber + Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            plus = 0;
                        } else if (minus == 1) {
                            firstnumber = firstnumber - Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            minus = 0;
                        } else if (mul == 1) {
                            firstnumber = firstnumber * Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            mul = 0;
                        } else {
                            firstnumber = firstnumber / Double.parseDouble((String) temp.subSequence(startindex, temp.length()));
                            div = 0;
                        }
                        minus = 1;
                        text.setText(text.getText() + "-");
                        startindex = text.getText().length();
                    }
                    else {
                        text.setText(temp.toString().toCharArray(), 0, startindex-1);
                        text.setText(text.getText()+"-");
                        start=1;
                    }
                }
                else
                    Toast.makeText(MainActivity.this, "enter the number", Toast.LENGTH_SHORT).show();
            }
        });
        all_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("C");
                text.setText(null);
                start=0;
                firstnumber=0;
                length=0;
                dot_active=0;
            }
        });
        backspace_textview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("BS");
                StringBuilder temp=new StringBuilder(text.getText().toString());
                if(temp.length()>0) {
                    if(dot_active==0)
                        --length;
                    if(temp.charAt(temp.length()-1)=='.')
                        dot_active=0;
                    temp.deleteCharAt(temp.length() - 1);
                    text.setText(temp);
                }
                else
                    Toast.makeText(MainActivity.this, "nothing to delete", Toast.LENGTH_SHORT).show();
            }
        });
        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                System.out.println("=");
                StringBuilder temp=new StringBuilder(text.getText());
                if(start==0)
                {
                    System.out.println("+++++");
                    text.setText(null);
                }
                else if(plus==1)
                {
                    if(text.getText().length()>startindex)
                    firstnumber=firstnumber+ Double.parseDouble((String) temp.subSequence(startindex,temp.length()));
                    plus=0;
                }
                else if(minus==1)
                {
                    if(text.getText().length()>startindex)
                    firstnumber=firstnumber- Double.parseDouble((String) temp.subSequence(startindex,temp.length()));
                    minus=0;
                }
                else if(mul==1)
                {
                    if(text.getText().length()>startindex)
                    firstnumber=firstnumber* Double.parseDouble((String) temp.subSequence(startindex,temp.length()));
                    mul=0;
                }
                else
                {
                    if(text.getText().length()>startindex)
                    firstnumber=firstnumber/ Double.parseDouble((String) temp.subSequence(startindex,temp.length()));
                    div=0;
                }
                if(firstnumber!=0 && start==1) {
                    long n=Math.round(firstnumber);
                    System.out.println(n);
                    if(n==firstnumber) {
                        text.setText(Long.toString((long)firstnumber));
                        dot_active=0;
                        length=text.getText().toString().length();
                    }
                    else {
                        text.setText(Float.toString((float)firstnumber));
                        System.out.println(text.getText());
                        String temp1=text.getText().toString();
                        String[] tem=temp1.split(Pattern.quote("."));
                        System.out.println(tem.length);
                        //length=tem[0].length();
                    }
                }
                else {
                    text.setText(null);
                    length=0;
                    dot_active=0;
                }
                start=0;
                startindex=0;
                System.out.println(dot_active);
            }
        });
    }
}
