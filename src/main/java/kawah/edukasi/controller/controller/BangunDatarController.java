package kawah.edukasi.controller.controller;

import kawah.edukasi.controller.service.BangunDatarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/bangun-datar")
@Produces(MediaType.TEXT_PLAIN)
public class BangunDatarController {

  @Inject
  BangunDatarService bangunDatarService;

  @GET
  @Path("/luasPersegi")
  public Response luasPersegi(@QueryParam("luas") Integer sisi){
    return bangunDatarService.luasPersegi(sisi);
  }

  @GET
  @Path("/kelilingPersegi")
  public Response kelilingPersegi(@QueryParam("keliling") Integer sisi){
    return bangunDatarService.luasPersegi(sisi);
  }
}