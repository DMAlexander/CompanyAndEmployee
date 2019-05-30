package com.example.devin.companyandemployeetutorial.DatabaseStuff;

import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public static final String TAG = "DBHelper";

    //columns of the companies table
    public static final String TABLE_COMPANIES = "companies";
    public static final String COLUMN_COMPANY_ID = "_id";
    public static final String COLUMN_COMPANY_NAME = "company_name";
    public static final String COLUMN_COMPANY_ADDRESS = "address";
    public static final String COLUMN_COMPANY_WEBSITE = "website";
    public static final String COLUMN_COMPANY_PHONE_NUMBER = "phone_number";

    //Comlumns of the employees table
    public static final String TABLE_EMPLOYEES = "employees";
    public static final String COLUMN_EMPLOYE_ID = COLUMN_COMPANY_ID;
    public static final String COLUMN_EMPLOYE_FIRST_NAME = "first_name";
    public static final String COLUMN_EMPLOYE_LAST_NAME = "last_name";
    public static final String COLUMN_EMPLOYE_ADDRESS = COLUMN_COMPANY_ADDRESS
    public static final String COLUMN_EMPLOYE_EMAIL = "email";
    public static final String COLUMN_EMPLOYE_PHONE_NUMBER = COLUMN_COMPANY_PHONE_NUMBER;
    public static final String COLUMN_EMPLOYE_SALARY = "salary";
    public static final String COLUMN_EMPLOYE_COMPANY_ID = "company_id";

    private static final String DATABASE_NAME = "companies.db";
    private static final int DATABASE_VERSION = 1;

    //creating employees table
    private static final String SQL_CREATE_TABLE_EMPLOYEES = "CREATE TABLE " + TABLE_EMPLOYEES + "("
            + COLUMN_EMPLOYE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_EMPLOYE_FIRST_NAME + " TEXT NOT NULL, "
            + COLUMN_EMPLOYE_LAST_NAME + " TEXT NOT NULL, "
            + COLUMN_EMPLOYE_ADDRESS + " TEXT NOT NULL, "
            + COLUMN_EMPLOYE_EMAIL + " TEXT NOT NULL, "
            + COLUMN_EMPLOYE_PHONE_NUMBER + " TEXT NOT NULL, "
            + COLUMN_EMPLOYE_SALARY + " REAL NOT NULL, "
            + COLUMN_EMPLOYE_COMPANY_ID + " INTEGER NOT NULL "
            +");";

    private static final String SQL_CREATE_TABLE_COMPANIES = "CREATE TABLE " + TABLE_COMPANIES + "("
            + COLUMN_COMPANY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COLUMN_COMPANY_NAME + " TEXT NOT NULL, "
            + COLUMN_COMPANY_ADDRESS + " TEXT NOT NULL, "
            + COLUMN_COMPANY_WEBSITE + " TEXT NOT NULL, "
            + COLUMN_COMPANY_PHONE_NUMBER + " TEXT NOT NULL "
            +");";



}
