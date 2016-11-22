package com.donny.militarychessapp.var;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.donny.militarychessapp.chess.Position;
import com.donny.militarychessapp.context.ContextUtil;

import java.util.ArrayList;
import java.util.HashMap;

public class Variable {
    public static HashMap<String, String> redKeyToImage = new HashMap<String, String>();
    public static HashMap<String, String> blueKeyToImage = new HashMap<String, String>();
    public static ImageView[] ItemBox = new ImageView[61];
    public static Position[] ChessPos = new Position[61];
    public static boolean isStart = false;
    public static boolean isClicked = false;
    public static boolean isLocked = false;
    public static int clickIndex1 = 0;
    public static int clickIndex2 = 0;
    public static int GameMode = 1;
    public static boolean controlBelong = true;//���ķ��߶���trueΪ�췽��falseΪ����
    public static boolean isEnd = false;
    public static int searchDeepth = 1;
    public static boolean forDFS = false;
    public static Drawable iconIndex1;
    public static Drawable iconIndex2;
    public static int threadNum = 0;
    public static boolean flag = false;
    public static int threadAnimate = 0;
    public static int temp = 0;
    public static ArrayList<Position> posList = new ArrayList<Position>();
    public static ImageView picbox = new ImageView(ContextUtil.getInstance());
}
