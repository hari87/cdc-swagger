/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package nl.devoteam.api;

import nl.devoteam.models.Error;
import nl.devoteam.models.TroubleTicket;
import nl.devoteam.models.TroubleTicketCreate;
import nl.devoteam.models.TroubleTicketUpdate;

import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-02-06T13:05:25.968+01:00")

@Api(value = "troubleTicket", description = "the troubleTicket API")
public interface TroubleTicketApi {


    @ApiOperation(value = "Creates a 'TroubleTicket'", notes = "", response = TroubleTicket.class, tags={ "troubleTicket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = TroubleTicket.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    
    @RequestMapping(value = "/troubleTicket",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<TroubleTicket> createTroubleTicket(@ApiParam(value = "The Trouble Ticket to be created" ,required=true )  @Valid @RequestBody TroubleTicketCreate troubleTicket) {
        // do some magic!
        return new ResponseEntity<TroubleTicket>(HttpStatus.OK);
    }


    @ApiOperation(value = "Deletes a 'TroubleTicket' by Id", notes = "", response = Void.class, tags={ "troubleTicket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted", response = Void.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    
    @RequestMapping(value = "/troubleTicket/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteTroubleTicket(@ApiParam(value = "Identifier of the Trouble Ticket",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "List or find 'TroubleTicket' objects", notes = "", response = TroubleTicket.class, responseContainer = "List", tags={ "troubleTicket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = TroubleTicket.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    
    @RequestMapping(value = "/troubleTicket",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<TroubleTicket>> listTroubleTicket(@ApiParam(value = "Comma separated properties to display in response") @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<List<TroubleTicket>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Updates partially a 'TroubleTicket' by Id", notes = "", response = TroubleTicket.class, tags={ "troubleTicket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = TroubleTicket.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    
    @RequestMapping(value = "/troubleTicket/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    default ResponseEntity<TroubleTicket> patchTroubleTicket(@ApiParam(value = "Identifier of the Trouble Ticket",required=true ) @PathVariable("id") String id,@ApiParam(value = "The Trouble Ticket to be updated" ,required=true )  @Valid @RequestBody TroubleTicketUpdate troubleTicket) {
        // do some magic!
        return new ResponseEntity<TroubleTicket>(HttpStatus.OK);
    }


    @ApiOperation(value = "Retrieves a 'TroubleTicket' by Id", notes = "", response = TroubleTicket.class, responseContainer = "List", tags={ "troubleTicket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok", response = TroubleTicket.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    
    @RequestMapping(value = "/troubleTicket/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<TroubleTicket>> retrieveTroubleTicket(@ApiParam(value = "Identifier of the Trouble Ticket",required=true ) @PathVariable("id") String id) {
        // do some magic!
        System.out.println("hello");
        return new ResponseEntity<List<TroubleTicket>>(HttpStatus.OK);
    }

}
