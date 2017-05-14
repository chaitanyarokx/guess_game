package com.example.chaitanya.guess;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class DatabaseHandler extends SQLiteOpenHelper {


    final int NO_OF_QUESTIONS = 10;

    private class Question {
        int id;
        String key_name;

        Question(int i, String s) {
            id = i;
            key_name = s;
        }

        public String getKey() {
            return key_name;
        }
    }

    private static Random rnd = new Random(100);
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "QuestionManager";
    private static final String TABLE_MOVIES = "MOVIES";
    private static final String TABLE_TV = "TV_SHOWS";
    private static final String TABLE_MUSIC="MUSIC";
    private static final String TABLE_HYD="HYDERABAD";
    private static final String TABLE_BLR="BANGALORE";
    private static final String TABLE_DELHI="DELHI";
    private static final String TABLE_MUMBAI="MUMBAI";
    private static final String TABLE_FOOD="FOOD";
    private static final String TABLE_CELEBRITIES="CELEBRITIES";
    private static final String TABLE_ANIMALS="ANIMALS";
    private static final String TABLE_SPORTS="SPORTS";
    private static final String TABLE_BRANDS="BRANDS";
    private static final String TABLE_BOOKS="BOOKS";
    private static final String TABLE_PLACES="PLACES";
    private static String SEL_TAB;
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String[] MOVIES = {"Baahubali", "Half Girlfriend", "Meri Pyari Bindu", "Kirik Party", "Rustom", "Rangitaranga", "Udta Punjab", "Auto Raja", "Lucia", "U-turn"};
    private static final String[] TV_SHOWS = {"Maja Talkies", "Ye Rishta","Super Minute","Agnisakshi","Big Boss","Koffee with Karan","Ishqbaaz","Pardes","Chandra Nandni","Saathiya"};
    private static final String[] MUSIC = {"Naja", "Wakhra Swag","Mundiyan to Bachke","Katheyonda Helide","Thirboki Jeevana","Indu Ninna Edurali","Baarish","Mercy","Badi Ki Dulhaniya","Thodi Der"};
    private static final String[] HYDERABAD = {"Inorbit Mall", "Hussien Sagar","Old City","Char Minaar","Cyberabad","Paradise Biriyani","Ramoji Film City","Golconda Fort","Lumbini Park","Hussien Sagar"};
    private static final String[] BANGALORE={"Majestic Bus Station","ISKCON Temple","Cubbon Park","MG Road","Lal Bagh","Sankey Lake","Silk Board Junction","Vidhan Soudha","Koramangla","Electronic City"};
    private static final String[] DELHI={"India Gate","Connaught Place","Lotus Temple","Akshardham","Red Fort","Purana Qila","Raj Ghat","Hauz Khas Village","Qutub Minar","Chandni Chowk"};
    private static final String[] MUMBAI={"Gateway Of India","Elephanta Caves","Mumba Devi Temple","CST","Haji Ali","Mahalakshmi Race Course","Film City","Essel World","Navi Mumbai","Bandra Kurla Complex"};
    private static final String[] FOOD = {"Jaamun", "Samosa","Dosa","Idli","Pakoda","Lassi","Chola Bhatura","Paani Puri","Kulfi","Mysore Pak"};
    private static final String[] CELEBRITIES = {"Salman Khan", "Shah Rukh Khan","Ranbir Kapoor","Aamir Khan","Amitabh Bachan","Katrina Kaif","Priyanka Chopra","Deepika Padukone","Aishwarya Rai","Kareena Kapoor"};
    private static final String[] ANIMALS = {"Cat", "Dog","Elephant","Dolphin","Deer","Turtle","Cow","Rat","Zebra","Horse"};
    private static final String[] SPORTS = {"Cricket", "Football","BasketBall","Volleyball","Atheltics","Hockey","Tennis","Badminton","Swimming","Table Tennis"};
    private static final String[] BRANDS = {"Micromax", "ITC","Tata","Ola Cabs","Flipkart","OLX","Reliance Jio","Airtel","Snapdeal","Paytm"};
    private static final String[] BOOKS = {"The White Tiger", "A Suitable Boy","The God Of Small Things","Train to Pakistan","The Immortals Trilogy","Shantaram","Maximum City","English, August","Jaya","Curfewed Night"};
    private static final String[] PLACES ={"Taj Mahal","Red Fort","India Gate","Gateway Of India","Ellora Caves","Harmandir Sahib","Kerala Backwaters","Ajanta Caves","Jim Corbett National Park","Mysore Palace"};
    int choice=0;
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //3rd argument to be passed is CursorFactory instance
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("DROP TABLE IF EXISTS " + SEL_TAB);
        String CREATE_TABLE = "CREATE TABLE " + SEL_TAB + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT"
                + ")";
        db.execSQL(CREATE_TABLE);
        int i = 0;
        if (choice==1){
        for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
            String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + MOVIES[i - 1] + "' ) ; ";
            db.execSQL(Populate);
        }}
        if (choice==2){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + TV_SHOWS[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==3){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + MUSIC[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==4){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + CELEBRITIES[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==5){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + FOOD[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==6){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + ANIMALS[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==7){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + BOOKS[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==8){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + BRANDS[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==9){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + SPORTS[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==10){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + PLACES[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==11){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + HYDERABAD[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==12){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + DELHI[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==13){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + MUMBAI[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        if (choice==14){
            for (i = 1; i < NO_OF_QUESTIONS + 1; i++) {
                String Populate = "INSERT INTO " + SEL_TAB + " ( " + KEY_ID + ", " + KEY_NAME + ") VALUES ( " + String.valueOf(i) + " , '" + BANGALORE[i - 1] + "' ) ; ";
                db.execSQL(Populate);
            }}
        Log.d("SIZE", String.valueOf(i));
    }

    public void setLVL(int i) {
       choice=i;
       switch(i)
        {
            case 1: {
                SEL_TAB = TABLE_MOVIES;
                break;
            }
            case 2: {
                SEL_TAB = TABLE_TV;
                break;
            }
            case 3: {
                SEL_TAB = TABLE_MUSIC;
                break;
            }
            case 4: {
                SEL_TAB = TABLE_CELEBRITIES;
                break;
            }
            case 5: {
                SEL_TAB = TABLE_FOOD;
                break;
            }
            case 6: {
                SEL_TAB = TABLE_ANIMALS;
                break;
            }
            case 7: {
                SEL_TAB = TABLE_BOOKS;
                break;
            }
            case 8: {
                SEL_TAB = TABLE_BRANDS;
                break;
            }
            case 9: {
                SEL_TAB = TABLE_SPORTS;
                break;
            }
            case 10: {
                SEL_TAB = TABLE_PLACES;
                break;
            }
            case 11: {
                SEL_TAB = TABLE_HYD;
                break;
            }
            case 12: {
                SEL_TAB = TABLE_DELHI;
                break;
            }
            case 13: {
                SEL_TAB = TABLE_MUMBAI;
                break;
            }
            case 14: {
                SEL_TAB = TABLE_BLR;
                break;
        }



    }

}

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + SEL_TAB);

        // Create tables again
        onCreate(db);
    }

    // code to add the new contact
    void addQuestion(Question q) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, q.getKey()); // Contact Name

        // Inserting Row
        db.insert(TABLE_MOVIES, null, values);
        //2nd argument is String containing nullColumnHack
        db.close(); // Closing database connection
    }

    // code to get the single contact
    Question getContact(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_MOVIES, new String[] { KEY_ID,
                        KEY_NAME }, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Question q = new Question(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1));
        // return q
        return q;
    }

    // code to get all contacts in a list view
    public List<Question> getAllQuestions() {
        List<Question> qList = new ArrayList<Question>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + SEL_TAB;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Question q = new Question(Integer.parseInt(cursor.getString(0)),cursor.getString(1));
            } while (cursor.moveToNext());
        }

        // return contact list
        return qList;
    }

    public String getQuestion() {

        SQLiteDatabase db = this.getReadableDatabase();
        this.onCreate(db);
        String[] columns = {KEY_NAME};
        String query = "SELECT * FROM "+SEL_TAB;
        Cursor cursor = db.rawQuery(query,null);
        Log.d("cursor",String.valueOf(cursor.getCount()));


        int id = (rnd.nextInt(10) % NO_OF_QUESTIONS) + 1;
        Log.d("id",String.valueOf(id));
        cursor.moveToFirst();
        while(id>1)
        {
            cursor.moveToNext();
            id--;
        }
        return cursor.getString(1);   //CursorOutofBoundsException //FIX THIS!!!
        //return "Cursor Failure";
    }

    // code to update the single contact
    public int updateContact(int id,String Q) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, Q);
        return db.update(TABLE_MOVIES, values, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
    }

    // Deleting single question
    public void deleteContact(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_MOVIES, KEY_ID + " = ?",
                new String[] { String.valueOf(id) });
        db.close();
    }

    // Getting contacts Count
    public int getContactsCount() {
        String countQuery = "SELECT  * FROM " + TABLE_MOVIES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }

}