package id.rsa.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import id.rsa.model.UserModel;
import id.rsa.services.UserServices;

@Path("/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
    @Inject
    UserServices UsrServices;

    @GET
    @Path("/{id}")
    public UserModel getUserEntity(@PathParam(value = "id") Integer id) {
        return UsrServices.getUserEntity(id);
    }

    @GET
    @Path("/queryParam")
    public UserModel getUserById(@QueryParam(value = "id") Integer id) {
        return UsrServices.getUserEntity(id);
    }

    @GET
    public List<UserModel> getAllEmployees() {
        return UsrServices.getAllUser();
    }

    @POST
    public UserModel createUser(UserModel userModel) {
        return UsrServices.createUser(userModel);
    }
}
