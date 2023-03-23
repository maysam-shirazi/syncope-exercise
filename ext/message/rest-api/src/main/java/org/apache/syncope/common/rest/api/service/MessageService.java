package org.apache.syncope.common.rest.api.service;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
/**
 * REST method to get a message.
 */
@Path("users/message")
public interface MessageService extends JAXRSService {

    /**
     * sample json rest method.
     * @return JSON Response.
     *
     * 
     */
    @GET
    Response getMessage();
}
