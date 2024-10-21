package cesur.splinter.models.utils.mappers;

import java.time.LocalDateTime;

import cesur.splinter.models.User;
import cesur.splinter.models.dto.UserDTO;
import cesur.splinter.models.dto.UserDTOWOP;

public class UserMapper {
    public static UserDTO userToDTO(User user) {
        UserDTO response = new UserDTO();
        if (response != null) {
            response.setRol(null);
            response.setId(user.getId());         
            response.setEmail(user.getEmail());      
            response.setName(user.getName());         
            response.setRol(user.getRol());         
            response.setActive(user.isActive());       
            response.setLastConnection(user.getLastconnection());
        }
        return response;
    }
    public static UserDTOWOP userToDTOWOP(User user) {
        UserDTOWOP response = new UserDTOWOP();
        if (response != null) {
            response = new UserDTOWOP(
                user.getId(), 
                user.getEmail(), 
                user.getName(),                 
                user.getRol(),
                user.isActive(),
                user.getLastconnection()
            );
            return response;
        }else{
            response = new UserDTOWOP(); 
        }
                   
        return response;
    }
    public static User dtoToUserCreated(UserDTO user) {
        User response = new User();
        if (user != null) {
            response.setId(user.getId());
            response.setName(user.getName());
            response.setEmail(user.getEmail());
            response.setPassword(user.getPassword());
            response.setRol(user.getRol());
            response.setCreatedAt(LocalDateTime.now());
            response.setActive(user.getActive());
            //response.setDeleteAt();
            //response.setUpdatetAt();
            //response.setLastconnection();
        }else {
            if (user.getDeletedAt() != null) {
                response.setDeletedAt(user.getDeletedAt());
            }else if (user.getUpdateAt() != null) {
               
            }
        }        
            
        
        return response;
    }
    

}
