package DataSource;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataSource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\heman\\TestDb " + DB_NAME;


    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUMS_ID = "_id";
    public static final String COLUMN_ALBUMS_NAME = "name";
    public static final String COLUMN_ALBUMS_ARTIST = "artist";

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_id = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    private Connection connection;


    public boolean open() {
        try {

             connection = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldnt connect to database " + e.getMessage());
            return false;
        }
    }

    public void closeDatabase() {

        try {
            if (connection != null) {
                connection.close();
            }

        } catch (SQLException e) {
            System.out.println("Couldnt connect to database " + e.getMessage());
        }

    }
        public List<Artist> queryArtist() {
        Statement statement = null;
        ResultSet resultSet = null;
            try {
            statement = connection.createStatement();
                resultSet = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);

                List<Artist> artists = new ArrayList<>();


                while (resultSet.next()) {
                    Artist artist = new Artist();
                    artist.setId(resultSet.getInt(COLUMN_ARTIST_id));
                    artist.setName(resultSet.getString(COLUMN_ARTIST_NAME));
                    artists.add(artist);
                }
                return artists;
            } catch (SQLException e) {
                System.out.println(" " + e.getMessage());
                return null;
            }
        }
}
