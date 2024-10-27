package es.upm.miw.bantumi.dominio.logica;


    import android.content.Context;
    import android.database.sqlite.SQLiteDatabase;
    import android.database.sqlite.SQLiteOpenHelper;

    public class ResultadosDatabaseHelper extends SQLiteOpenHelper {

        private static final String DATABASE_NAME = "resultados.db";
        private static final int DATABASE_VERSION = 1;
        public static final String TABLE_RESULTADOS = "resultados";
        public static final String COLUMN_ID = "_id";
        public static final String COLUMN_JUGADOR = "jugador";
        public static final String COLUMN_FECHA = "fecha";
        public static final String COLUMN_SEMILLAS = "semillas";

        public ResultadosDatabaseHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            String CREATE_RESULTADOS_TABLE = "CREATE TABLE " + TABLE_RESULTADOS + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_JUGADOR + " TEXT,"
                    + COLUMN_FECHA + " TEXT,"
                    + COLUMN_SEMILLAS + " INTEGER" + ")";
            db.execSQL(CREATE_RESULTADOS_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESULTADOS);
            onCreate(db);
        }
    }

}
