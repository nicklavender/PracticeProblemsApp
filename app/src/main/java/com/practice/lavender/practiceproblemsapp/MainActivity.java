package com.practice.lavender.practiceproblemsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    public static boolean stringHasAllUniqueChars(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     *
     * @param s string containing only ascii chars (128)
     * @return return true if string contains all unique characters
     */
    public static boolean stringHasAllUniqueCharsOptimized(String s) {
        boolean[] charChecker = new boolean[128];
        for (int i = 0; i < s.length(); i++) {
            int charValue = s.charAt(i);
            if (charChecker[charValue]) {
                return false;
            } else {
                charChecker[charValue] = true;
            }
        }
        return true;
    }

    public static boolean isPermutation(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }
        return sortString(first).equals(sortString(second));
    }

    private static String sortString(String string) {
        char[] stringChars = string.toCharArray();
        Arrays.sort(stringChars);
        return new String(stringChars);
    }

    public static boolean isPermutationSinglePass(String first, String second) {
        if(first.length() != second.length()) {
            return false;
        }
        int[] charactersCounter = new int[128];
        for(int i = 0; i < first.length(); i++) {
            charactersCounter[first.charAt(i)]++;
            charactersCounter[second.charAt(i)]--;
        }
        for(int i = 0; i<128; i++) {
            if(charactersCounter[i] != 0) {
                return false;
            }
        }
        return true;
    }

//    public static String URLifyCompressSpaces(String s) {
//        int firstReplaceIndex = -1;
//        int lastReplaceIndex = -1;
//        int length = s.length();
//        for(int i = 0; i < length; i++) {
//            if(s.charAt(length -i)=='_') {
//                if(lastReplaceIndex == -1) {
//                    lastReplaceIndex = length - i;
//                } else if (firstReplaceIndex == -1) {
//                    firstReplaceIndex = length -i;
//                }
//            } else if(firstReplaceIndex != -1 && lastReplaceIndex != -1) {
//                s = s.substring(0, firstReplaceIndex) + "%20" + s.substring(lastReplaceIndex, length-1);
//                firstReplaceIndex = -1;
//                lastReplaceIndex = -1;
//            }
//        }
//        return s;
//    }

    public static String URLify(String s) {
        int spacesCount = 0;
        int length = s.length();
        for(int i = 0; i< length; i++) {
            if(s.charAt(length - i - 1) == ' ') {
                spacesCount++;
            }
        }
        char[] str = new char[length + 2*spacesCount];

    }
}
