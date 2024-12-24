package com.example.my_calculator

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class Calc : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_calc)

        var num1=0
        var num2=0
        var num=0
        var res=0
        var operation=0
        var result=findViewById<TextView>(R.id.result)
        var equal=findViewById<MaterialButton>(R.id.equal)
        var plus=findViewById<MaterialButton>(R.id.plus)
        var minus=findViewById<MaterialButton>(R.id.minus)
        var multiply=findViewById<MaterialButton>(R.id.mulitply)
        var divide=findViewById<MaterialButton>(R.id.divide)
        var clear=findViewById<MaterialButton>(R.id.clear)
        var history=findViewById<ImageView>(R.id.history)
        var n0=findViewById<MaterialButton>(R.id.n0)
        var n1=findViewById<MaterialButton>(R.id.n1)
        var n2=findViewById<MaterialButton>(R.id.n2)
        var n3=findViewById<MaterialButton>(R.id.n3)
        var n4=findViewById<MaterialButton>(R.id.n4)
        var n5=findViewById<MaterialButton>(R.id.n5)
        var n6=findViewById<MaterialButton>(R.id.n6)
        var n7=findViewById<MaterialButton>(R.id.n7)
        var n8=findViewById<MaterialButton>(R.id.n8)
        var n9=findViewById<MaterialButton>(R.id.n9)


        fun changeNumber(a: Int, b:Int) {
            if (num==0){
                num1=(a*10)+b
                if (num1>=2147483646){
                    result.text=""
                    num1=0
                    num2=0
                    num=0
                    res=0
                    operation=0
                }
                result.text="$num1"
            }
            else{
                num2=(a*10)+b
                if (num2>=2147483646){
                    result.text=""
                    num1=0
                    num2=0
                    num=0
                    res=0
                    operation=0
                }
                result.text="$num2"
            }

        }
        n0.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 0)
            }
            else{
                changeNumber(num2 , 0)
            }
        }
        n1.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 1)
            }
            else{
                changeNumber(num2 , 1)
            }
        }
        n2.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 2)
            }
            else{
                changeNumber(num2 , 2)
            }
        }
        n3.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 3)
            }
            else{
                changeNumber(num2 , 3)
            }
        }
        n4.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 4)
            }
            else{
                changeNumber(num2 , 4)
            }
        }
        n5.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 5)
            }
            else{
                changeNumber(num2 , 5)
            }
        }
        n6.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 6)
            }
            else{
                changeNumber(num2 , 6)
            }
        }
        n7.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 7)
            }
            else{
                changeNumber(num2 , 7)
            }
        }
        n8.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 8)
            }
            else{
                changeNumber(num2 , 8)
            }
        }
        n9.setOnClickListener {
            if (num==0){
                changeNumber(num1 , 9)
            }
            else{
                changeNumber(num2 , 9)
            }
        }
        plus.setOnClickListener {
            operation=1
            num2=0
            num=1
        }
        minus.setOnClickListener {
            operation=2
            num2=0
            num=1
        }
        multiply.setOnClickListener {
            operation=3
            num2=0
            num=1
        }
        divide.setOnClickListener {
            operation=4
            num2=0
            num=1
        }
        clear.setOnClickListener{
            result.text=""
            num1=0
            num2=0
            num=0
            res=0
            operation=0
        }
        equal.setOnClickListener {
            if (operation==1){
                res=num1+num2
                result.text= "$res"
                num1=0
                num2=0
                num=0
                res=0
                operation=0
            }
            else if (operation==2){
                res=num1-num2
                result.text= "$res"
                num1=0
                num2=0
                num=0
                res=0
                operation=0
            }
            else if (operation==3){
                res=num1*num2
                result.text= "$res"
                num1=0
                num2=0
                num=0
                res=0
                operation=0
            }
            else if (operation==4 &&  num2!=0){
                res=num1/num2
                result.text= "$res"
                num1=0
                num2=0
                num=0
                res=0
                operation=0
            }
            else{
                num1=0
                num2=0
                num=0
                res=0
                operation=0
                result.text="Wrong Operation"
            }
        }



    }
}