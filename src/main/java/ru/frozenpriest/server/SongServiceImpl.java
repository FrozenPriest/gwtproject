package ru.frozenpriest.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ru.frozenpriest.client.SongService;
import ru.frozenpriest.shared.FieldVerifier;
import ru.frozenpriest.shared.Song;
import ru.frozenpriest.shared.SongRepository;

import java.util.List;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class SongServiceImpl extends RemoteServiceServlet implements
        SongService {

    public List<Song> getSongs(String input) throws IllegalArgumentException {
        // Verify that the input is valid.
        if (!FieldVerifier.isValidName(input)) {
            // If the input is not valid, throw an IllegalArgumentException back to
            // the client.
            throw new IllegalArgumentException(
                    "Name must be at least 4 characters long");
        }


        // Escape data from the client to avoid cross-site script vulnerabilities.
        input = escapeHtml(input);
        System.out.println("IS IT REALLY WORKING&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

        return SongRepository.getSongs(input);
    }

    /**
     * Escape an html string. Escaping data received from the client helps to
     * prevent cross-site script vulnerabilities.
     *
     * @param html the html string to escape
     * @return the escaped string
     */
    private String escapeHtml(String html) {
        if (html == null) {
            return null;
        }
        return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(
                ">", "&gt;");
    }
}
