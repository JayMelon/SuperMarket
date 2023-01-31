package com.example.supermarket;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DatabaseHandler extends SQLiteOpenHelper {
public static final String SUPERMARKET_TABLE = "SUPERMARKET_TABLE";
public static final String COLUMN_SUPERMARKET_ID = "COLUMN_SUPERMARKET_ID";
public static final String COLUMN_SUPERMARKET_NAME = "COLUMN_SUPERMARKET_NAME";
public static final String COLUMN_SUPERMARKET_ADDRESS = "COLUMN_SUPERMARKET_ADDRESS";
public static final String COLUMN_SUPERMARKET_LIQUOR_RATE = "COLUMN_SUPERMARKET_LIQUOR_RATE";
    public static final String COLUMN_SUPERMARKET_PRODUCE_RATE = "COLUMN_SUPERMARKET_PRODUCE_RATE";
    public static final String COLUMN_SUPERMARKET_MEAT_RATE = "COLUMN_SUPERMARKET_MEAT_RATE";
    public static final String COLUMN_SUPERMARKET_CHEESE_RATE = "COLUMN_SUPERMARKET_CHEESE_RATE";
    public static final String COLUMN_SUPERMARKET_CHECKOUT_RATE = "COLUMN_SUPERMARKET_CHECKOUT_RATE";


    public DatabaseHandler(@Nullable Context context){
        super(context, "supermarket.db", null, 1);
    }

//Creates Database onCreate
    @Override
    public void onCreate(SQLiteDatabase supermarketDB) {
        String createTable = "CREATE TABLE " + SUPERMARKET_TABLE + " ( " + COLUMN_SUPERMARKET_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_SUPERMARKET_NAME + " TEXT, "
                + COLUMN_SUPERMARKET_ADDRESS + " TEXT, "
                + COLUMN_SUPERMARKET_LIQUOR_RATE+" REAL, "
                + COLUMN_SUPERMARKET_PRODUCE_RATE+" REAL, "
                + COLUMN_SUPERMARKET_MEAT_RATE+" REAL, "
                + COLUMN_SUPERMARKET_CHEESE_RATE+" REAL, "
                + COLUMN_SUPERMARKET_CHECKOUT_RATE+" REAL )";
       supermarketDB.execSQL(createTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addData(Supermarket supermarket){
        //Insert Data
        SQLiteDatabase db = this.getWritableDatabase();
        //Content values stores data in pairs
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_SUPERMARKET_NAME,supermarket.getSupermarketName());
        cv.put(COLUMN_SUPERMARKET_ADDRESS,supermarket.getAddress());
        cv.put(COLUMN_SUPERMARKET_LIQUOR_RATE,supermarket.getLiquorDeptRate());
        cv.put(COLUMN_SUPERMARKET_PRODUCE_RATE,supermarket.getProduceDeptRate());
        cv.put(COLUMN_SUPERMARKET_MEAT_RATE,supermarket.getMeatDeptRate());
        cv.put(COLUMN_SUPERMARKET_CHEESE_RATE,supermarket.getCheeseSelRate());
        cv.put(COLUMN_SUPERMARKET_CHECKOUT_RATE,supermarket.getCheckoutRate());
        long insert = db.insert(SUPERMARKET_TABLE, null, cv);
        if(insert == -1){
            System.out.println("Failed to add "+supermarket.toString());
            return false;
        }
        return true;
    }
    public ArrayList<Supermarket> getAllSupermarket(){
        ArrayList<Supermarket> returnList = new ArrayList<>();
        //Get data from the Database
        String query= ("SELECT * FROM " + SUPERMARKET_TABLE);
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToFirst()){
            do{
                Supermarket newSuperMarket = new Supermarket(
                        //Get ID
                    cursor.getInt(0),
                        //Get Name
                        cursor.getString(1),
                        //Get Address
                        cursor.getString(2),
                        //Get Liquor Rate
                        cursor.getFloat(3),
                        //Get Produce Rate
                        cursor.getFloat(4),
                        //Get Meat Rate
                        cursor.getFloat(5),
                        //Get Cheese Rate
                        cursor.getFloat(6),
                        //Get Liquor Rate
                        cursor.getFloat(7)
                );
                returnList.add(newSuperMarket);
            }
            while (cursor.moveToNext());

        }
else{
    //Failure, Don't add nothing
        }
db.close();
cursor.close();
return returnList;
    }



}
