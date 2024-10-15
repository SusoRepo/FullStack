package cesur.splinter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cesur.splinter.models.dto.incidenceDTO;
import cesur.splinter.services.IncidenceService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @PostMapping("/incidence")
    public ResponseEntity<Integer> storeIncidence(@RequestBody incidenceDTO entity) {
        //TODO: process POST request
       return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);                 
     
    }
}

    /*@PostMapping("/incidence/:id")
    public ResponseEntity<Integer>addIncidenceDetail(@PathParam(value = "id") Long id, incidenceDTO entity) {
        try {
            IncidenceService.storeIncidence(entity);
            return new ResponseEntity<Integer>(1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);           
        }

    }*/

    /*try {
        incidenceService.storeIncidence(entity);
        return ResponseEntity(i:1, HttpStatus.OK);

    } catch (Exception e) {
        // TODO: handle exception
        return ResponseEntity(i:0, HttpStatus.INTERNAL_SERVER_ERROR);

    }    try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<Integer>(body:1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<Integer>(0, HttpStatus.BAD_REQUEST);           
        }

    }   */ 


