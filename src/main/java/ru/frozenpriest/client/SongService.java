package ru.frozenpriest.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ru.frozenpriest.shared.Song;

import java.util.List;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("songs")
public interface SongService extends RemoteService {
    List<Song> getSongs(String name) throws IllegalArgumentException;
}
