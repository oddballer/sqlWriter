import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class App {

    public static void main(String[] args) {

        App app = new App();
        app.insertWriter();

    }



    private void insertWriter(){

            try (PrintWriter printer = new PrintWriter("start_zone.sql")) {

            //            classic races
            for (int i = 1; i < 13; i++){
                for (int j = 1; j < 17; j++){
                    printer.println(
                            "INSERT INTO `start_zones` (`x`, `y`, `z`, `heading`, `zone_id`, `bind_id`, `player_choice`, `player_class`, `player_deity`, `player_race`, `start_zone`, `bind_x`, `bind_y`, `bind_z`, `select_rank`, `min_expansion`, `max_expansion`, `content_flags`, `content_flags_disabled`) VALUES\n" +
                                    "    (-71.14, 242.22, 3.75, 510, 1, 0, 1, " + j + ", 396, " + i + ", 1, -71.14, 242.22, 3.75, 50, -1, -1, NULL, NULL);"
                    );
                }
            }

//            iksar
            for (int i = 1; i < 17; i++){
                printer.println(
                        "INSERT INTO `start_zones` (`x`, `y`, `z`, `heading`, `zone_id`, `bind_id`, `player_choice`, `player_class`, `player_deity`, `player_race`, `start_zone`, `bind_x`, `bind_y`, `bind_z`, `select_rank`, `min_expansion`, `max_expansion`, `content_flags`, `content_flags_disabled`) VALUES\n" +
                                "    (-71.14, 242.22, 3.75, 510, 1, 0, 1, " + i + ", 396, " + 128 + ", 1, -71.14, 242.22, 3.75, 50, -1, -1, NULL, NULL);");

            }

//            vah shir
            for (int i = 1; i < 17; i++){
                printer.println(
                        "INSERT INTO `start_zones` (`x`, `y`, `z`, `heading`, `zone_id`, `bind_id`, `player_choice`, `player_class`, `player_deity`, `player_race`, `start_zone`, `bind_x`, `bind_y`, `bind_z`, `select_rank`, `min_expansion`, `max_expansion`, `content_flags`, `content_flags_disabled`) VALUES\n" +
                                "    (-71.14, 242.22, 3.75, 510, 1, 0, 1, " + i + ", 396, " + 130 + ", 1, -71.14, 242.22, 3.75, 50, -1, -1, NULL, NULL);");

            }

//            frogloks
            for (int i = 1; i < 17; i++){
                printer.println(
                        "INSERT INTO `start_zones` (`x`, `y`, `z`, `heading`, `zone_id`, `bind_id`, `player_choice`, `player_class`, `player_deity`, `player_race`, `start_zone`, `bind_x`, `bind_y`, `bind_z`, `select_rank`, `min_expansion`, `max_expansion`, `content_flags`, `content_flags_disabled`) VALUES\n" +
                                "    (-71.14, 242.22, 3.75, 510, 1, 0, 1, " + i + ", 396, " + 330 + ", 1, -71.14, 242.22, 3.75, 50, -1, -1, NULL, NULL);");

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        }

    }