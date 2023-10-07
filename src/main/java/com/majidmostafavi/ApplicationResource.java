package com.majidmostafavi;

import com.majidmostafavi.service.ProductService;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/product")
@RunOnVirtualThread
public class ApplicationResource {

    @Inject
    ProductService productService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        productService.findAllProduct();
        return "Hello Virtual Thread from Quarkus :)";
    }
}
