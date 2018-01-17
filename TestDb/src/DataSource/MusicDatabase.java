package DataSource;




import java.util.List;

public class MusicDatabase {
    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        if (!dataSource.open()) {
            System.out.println("Cant open database");
            return;
        }

            dataSource.open();
            List<Artist> artist = dataSource.queryArtist();



            if (artist == null) {
                System.out.println("No artist");
            } else {
                for (Artist artist1 : artist) {
                    System.out.println("ID" + artist1.getId() + ", Name" + artist1.getName());

                }
            }

            dataSource.closeDatabase();
        }
    }
