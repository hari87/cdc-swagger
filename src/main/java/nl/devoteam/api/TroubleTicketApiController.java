package nl.devoteam.api;

import nl.devoteam.models.TroubleTicket;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T12:05:43.539+01:00")

@Controller
@Component

public class TroubleTicketApiController implements TroubleTicketApi {

public ResponseEntity<List<TroubleTicket>> retrieveTroubleTicket(){
    System.out.println("hello World");
    TroubleTicket troubleTicket = new TroubleTicket();
    troubleTicket.setBaseType("hellobase");
    troubleTicket.setId("hello id");
    troubleTicket.setName("hello name");
    System.out.println("hello world");
    List<TroubleTicket> ttList = new ArrayList<TroubleTicket>();
    ttList.add(troubleTicket);
    return new ResponseEntity<List<TroubleTicket>>(ttList, HttpStatus.OK);

}

}
