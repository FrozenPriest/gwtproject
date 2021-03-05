package ru.frozenpriest.shared;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {
    /**
     * Retrieve song by id
     *
     * @param id song id
     * @return song with id(now just sample data)
     */
    public static Song getSong(int id) {
        switch (id) {
            case 0:
                return new Song("Cool", "Famous author", 444444, 545);
            case 1:
                return new Song("Cool11", "Famous author11", 43, 54532);
            case 2:
                return new Song("Cool22", "Famous author22", 526, 111);
            case 3:
                return new Song("Cool44", "Famous author3", 1432, 652);
            case 4:
                return new Song("Cool66", "Famous author4", 444444, 545);
        }
        return null;
    }

    public static List<Song> getSongs(String input) {
        List<Song> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(getSong(i));
        }

        return list;
    }
}
