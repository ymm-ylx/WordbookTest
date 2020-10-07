package com.example.accesswordsapp;

import android.net.Uri;
import android.provider.BaseColumns;

public class Words {
    public static final String AUTHORITY = "com.example.woldbook";//URI授权者

    public Words() {
    }

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME="words";//表名
        public static final String COLUMN_NAME_WORD="word";//列：单词
        public static final String COLUMN_NAME_MEANING="meaning";//列：单词含义
        public static final String COLUMN_NAME_SAMPLE="sample";//列：单词示例
        public static String _ID="id";
        //Content Uri
        public static final String CONTENT_URI_STRING = "content://" + AUTHORITY + "/" + Word.TABLE_NAME;
        public static final Uri  CONTENT_URI = Uri.parse(CONTENT_URI_STRING);

    }
}
