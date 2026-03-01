package com.example.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.List;

@Path("/mobile")
public class MobileResource {
    List<String> mobileList = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMobileList() {


        return Response.ok(mobileList).build();
    }
    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response addNewMobile(String mobile) {

        mobileList.add(mobile);
        return Response.ok(mobile).build();
    }

}
