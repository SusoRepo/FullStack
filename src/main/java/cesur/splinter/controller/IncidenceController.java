package cesur.splinter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cesur.splinter.models.Incidence;
import cesur.splinter.models.dto.incidenceDTO;
import cesur.splinter.services.IncidenceService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/incidence")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @GetMapping("/listByUser")
    public ResponseEntity<List<Incidence>> getIncidencesByUsername(@RequestParam(name = "username") String username) {
        try {
            
            return ResponseEntity.ok(incidenceService.getIncidenceByUserName(username));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }


    @PostMapping("")
    public ResponseEntity<Void> storeIncidence(@RequestBody incidenceDTO entity) {
        //TODO: process POST request
        try {
            incidenceService.storeIncidence(entity);
            return ResponseEntity.status(HttpStatus.OK).build(); 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); 
        }
                      
     
    }

    @DeleteMapping("")
    public ResponseEntity<Void> deleteIncidence(@RequestParam(name = "incidence_id") Long id) {
        try {
            incidenceService.deleteIncidence(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
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


