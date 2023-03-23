package org.apache.syncope.core.rest.cxf.service;

import org.apache.syncope.common.rest.api.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

@Service
public class MessageServiceImpl extends AbstractServiceImpl implements MessageService {

    String result = "{\"message\": \"Everything is OK!\"}";

    @Override
    public Response getMessage() {
        return Response
          .status(Response.Status.OK)
          .entity(result)
          .type(MediaType.APPLICATION_JSON)
          .build();
    }

}
