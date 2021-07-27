package resources;

import dto.MovieDto;
import services.Service;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/actions")
public class MovieramaResource  {

    @EJB
    private Service service;

    @GET
    @Path ("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(){
        return Response.ok().build();
    }

    @GET
    @Path ("/register")
    @Consumes (MediaType.APPLICATION_JSON)
    @Produces (MediaType.APPLICATION_JSON)
    public Response register(){
        return Response.ok().build();
    }

    @GET
    @Path ("/movies")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveMovies(){
        List<MovieDto> movies = service.retrieveAllMovies();
        return Response.ok(movies).build();
    }
}
