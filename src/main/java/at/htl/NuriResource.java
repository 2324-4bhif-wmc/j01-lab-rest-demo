package at.htl;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.lang.management.MemoryType;

@Path("nuri")
public class NuriResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getNuroi() {
        return """
                <h1>
                Nuri
                </h1>
                """;
    }
}
