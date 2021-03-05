package ru.frozenpriest.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ru.frozenpriest.shared.Song;

import java.util.List;

/**
 * The async counterpart of <code>SongsService</code>.
 */
public interface SongServiceAsync {
    void getSongs(String input, AsyncCallback<List<Song>> callback)
            throws IllegalArgumentException;
}
