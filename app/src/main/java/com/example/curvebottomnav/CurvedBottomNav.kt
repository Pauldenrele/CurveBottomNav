package com.example.curvebottomnav

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Point
import android.util.AttributeSet
import com.google.android.material.bottomnavigation.BottomNavigationView

class CurvedBottomNav :BottomNavigationView {

    private var mPath:Path?=null
    private var mPiant:Paint?=null


    //Radiius of the fab button
    val CURVE_CIRCLE_RADIUS = 90

    //Coordinates of first curve
    var mFirstCurveStartPoint  = Point()
    var mFirstCurveEndPoint = Point()
    var mFirstCurveControlPoint1 = Point()
    var mFirstCurveControlPoint2 = Point()

    //Coordinates of second curve
    var mSecondCurveStartPoint  = Point()
    var mSecondCurveEndPoint = Point()
    var mSecondCurveControlPoint1 = Point()
    var mSecondCurveControlPoint2 = Point()

    var mNavigationBarWidth :Int = 0
    var mNavigationBarHeight:Int = 0

    constructor(context: Context):super(context){
        init()
    }


    constructor(context:Context , attrs:AttributeSet):super(context , attrs){
        init()
    }


    constructor(context:Context , attrs:AttributeSet , diffStyleatrr:Int):super(context , attrs , diffStyleatrr){
        init()
    }

    private fun init(){
        mPath = Path()
        mPiant = Paint()

        mPiant!!.style = Paint.Style.FILL_AND_STROKE
        mPiant!!.color = Color.WHITE


    }


}