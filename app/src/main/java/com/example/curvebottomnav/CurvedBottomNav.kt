package com.example.curvebottomnav

import android.content.Context
import android.graphics.*
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
        setBackgroundColor(Color.TRANSPARENT)

    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)

        mNavigationBarHeight = height
        mNavigationBarWidth = width

        mFirstCurveStartPoint.set(mNavigationBarWidth/2 - CURVE_CIRCLE_RADIUS * 2 -CURVE_CIRCLE_RADIUS /3 , 0)

        mFirstCurveEndPoint.set(mNavigationBarWidth/2 , CURVE_CIRCLE_RADIUS + CURVE_CIRCLE_RADIUS /4)

        mSecondCurveStartPoint = mFirstCurveEndPoint

        mSecondCurveEndPoint.set(mNavigationBarWidth /2 + CURVE_CIRCLE_RADIUS *2 + CURVE_CIRCLE_RADIUS / 3, 0)

        mFirstCurveControlPoint1.set(mFirstCurveStartPoint.x + CURVE_CIRCLE_RADIUS + CURVE_CIRCLE_RADIUS /4 , mFirstCurveStartPoint.y)

        mFirstCurveControlPoint2.set(mFirstCurveEndPoint.x -CURVE_CIRCLE_RADIUS *2 + CURVE_CIRCLE_RADIUS  , mFirstCurveEndPoint.y)

        //Second
        mSecondCurveControlPoint1.set(mSecondCurveStartPoint.x + CURVE_CIRCLE_RADIUS *2  -CURVE_CIRCLE_RADIUS , mSecondCurveStartPoint.y)

        mSecondCurveControlPoint2.set(mSecondCurveEndPoint.x -(CURVE_CIRCLE_RADIUS + CURVE_CIRCLE_RADIUS /4) , mSecondCurveEndPoint.y)


    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

    }


}